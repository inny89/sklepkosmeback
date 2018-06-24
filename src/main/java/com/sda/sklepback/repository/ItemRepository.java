package com.sda.sklepback.repository;

import com.sda.sklepback.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
