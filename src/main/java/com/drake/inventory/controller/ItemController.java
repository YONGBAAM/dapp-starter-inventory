package com.drake.inventory.controller;

import com.drake.inventory.dto.DepositRequest;
import com.drake.inventory.dto.RetrievalRequest;
import com.drake.inventory.item.Item;
import com.drake.inventory.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
