package com.drake.dappstarterinventory.service;

import com.drake.dappstarterinventory.dto.DepositRequest;
import com.drake.dappstarterinventory.dto.RetrievalRequest;
import com.drake.dappstarterinventory.item.Item;
import com.drake.dappstarterinventory.item.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository repository;


    public void depositItem(DepositRequest request) {
        repository.save(Item.from(request));

        // constract service transfer from owner -> changgo

    }

    public void retrieveItem(RetrievalRequest request) {

        // retrieve item data
        Optional<Item> item = repository.findById(request.getItemId());
//        item.map(x -> {}).orElseThrow();



        // constract service transfer from owner -> changgo

    }
}
