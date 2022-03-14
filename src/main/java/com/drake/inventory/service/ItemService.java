package com.drake.inventory.service;

import com.drake.inventory.Constants;
import com.drake.inventory.dto.DepositRequest;
import com.drake.inventory.dto.RetrievalRequest;
import com.drake.inventory.item.Item;
import com.drake.inventory.item.ItemNotFoundException;
import com.drake.inventory.item.ItemRepository;
import com.drake.inventory.item.PasswordNotEqualException;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
@Slf4j
public class ItemService {

    @Autowired
    private ItemRepository repository;

    @Autowired
    private ContractService contractService;

    public void depositItem(DepositRequest request) {
        repository.save(Item.from(request));

        // Real transfer is from frontend
    }

    public List<Item> findAllItemList() {
        return repository.findAll();
    }

    @SneakyThrows
    public void retrieveItem(RetrievalRequest request) {

        // retrieve item data
        Item item = repository.findById(request.getPostId())
                .orElseThrow(() -> new ItemNotFoundException(request.getPostId()));

        if (!item.getPassword().trim().equals(request.getPassword())) {
            throw new PasswordNotEqualException(request.getPostId());
        }

        if (!item.getOwnerWalletAddress().toLowerCase(Locale.ROOT).equals(request.getAddress().toLowerCase(Locale.ROOT))) {
            throw new RuntimeException("Please retrive from original address. OA: " + item.getOwnerWalletAddress());
        }

        String currentNftAddressOwner = contractService.findOwnerByNftId(item.getNftId()).toLowerCase(Locale.ROOT);
        if (!currentNftAddressOwner.equals(Constants.CHANGGO_ADDRESS.toLowerCase(Locale.ROOT))) {
//            repository.delete(item);// TODO: This need to be throw exception and handle in controller
            throw new RuntimeException("NFT not in CHANGGO id: " + item.getNftId() + " " + currentNftAddressOwner + " " + Constants.CHANGGO_ADDRESS);

        }


        contractService.fromChango(request.getAddress(), item.getNftId());
        repository.delete(item);
    }
}
