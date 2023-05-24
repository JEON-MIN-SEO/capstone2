package com.testlast.boardlast.repository;

import com.testlast.boardlast.entity.FridgeItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FridgeItemRepository extends JpaRepository<FridgeItem, Long> {
}
