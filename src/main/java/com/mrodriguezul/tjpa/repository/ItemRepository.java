package com.mrodriguezul.tjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mrodriguezul.tjpa.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{
	
	@Query(value = "select i.* from item i where ( select count(*) from review where iditem = i.iditem ) < ?1", nativeQuery = true)
	List<Item> findItemsWithAverageRatingLowerThan(Double rating);
}
