package com.mrodriguezul.tjpa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrodriguezul.tjpa.model.Item;
import com.mrodriguezul.tjpa.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	private ItemRepository repository;

	@Override
	public List<Item> obtenerItems() {
		return repository.findAll();
	}

	@Override
	public List<String> getTitles(Double rating) {
		//System.out.println("rating: "+rating);
		List<Item> lstItems = repository.findItemsWithAverageRatingLowerThan(rating);
		//System.out.println("cantidad: "+lstItems.size());
		ArrayList<String> lst = new ArrayList<>();
		//lst.
		
		//List<String> lstTitles = List.of("x");
		List<String> lstTitles = lstItems.stream().map(p->p.getTitulo()).collect(Collectors.toList());
		return lstTitles;
	}

}
