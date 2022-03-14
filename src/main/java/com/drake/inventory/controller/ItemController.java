package com.drake.inventory.controller;

import com.drake.inventory.dto.DepositRequest;
import com.drake.inventory.dto.RetrievalRequest;
import com.drake.inventory.item.Item;
import com.drake.inventory.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@RestController
public class ItemController {
    @Autowired
    ItemService itemService;

    @PostMapping("/items/deposit")
    public void deposit(@RequestBody DepositRequest request) {
        itemService.depositItem(request);
    }

    @PostMapping("/items/retrieve")
    public void retrieve(@RequestBody RetrievalRequest request) {
        itemService.retrieveItem(request);
    }

    @GetMapping("/items")
    public List<Item> getAllItems() {
        return itemService.findAllItemList();
    }

    @GetMapping("/items/{account}")
    public List<Item> getItemsFromAccount(@PathVariable String account) {

        List<Item> allItem = itemService.findAllItemList();
        return allItem.stream().filter(i -> i.getOwnerWalletAddress().toLowerCase(Locale.ROOT).equals(account.toLowerCase(Locale.ROOT)))
                .collect(Collectors.toList());
    }
}
