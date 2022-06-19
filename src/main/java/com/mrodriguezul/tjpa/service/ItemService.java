package com.mrodriguezul.tjpa.service;

import java.util.List;

import com.mrodriguezul.tjpa.model.Item;

public interface ItemService {
	List<Item> obtenerItems();
	List<String> getTitles(Double rating);
}
