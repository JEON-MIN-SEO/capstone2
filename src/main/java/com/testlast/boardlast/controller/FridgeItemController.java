package com.testlast.boardlast.controller;

import com.testlast.boardlast.entity.FridgeItem;
import com.testlast.boardlast.repository.FridgeItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;


import java.util.List;

@RestController
@RequestMapping("/fridge-items")
public class FridgeItemController {
    private final FridgeItemRepository fridgeItemRepository;

    @Autowired
    public FridgeItemController(FridgeItemRepository fridgeItemRepository) {
        this.fridgeItemRepository = fridgeItemRepository;
    }

    @PostMapping(consumes = "application/json")
    public FridgeItem addItem(@RequestBody FridgeItem fridgeItem) {
        return fridgeItemRepository.save(fridgeItem);
    }

    @GetMapping
    public String getIndexPage() {
        return "index";
    }
}
