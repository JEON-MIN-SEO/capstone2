package com.testlast.boardlast.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "fridge_items")
public class FridgeItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
}
