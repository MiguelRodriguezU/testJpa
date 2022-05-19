package com.mrodriguezul.tjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrodriguezul.tjpa.model.Item;
import com.mrodriguezul.tjpa.service.ItemService;

@RestController
@RequestMapping("/tjpa")
@CrossOrigin(origins = "*")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping(value = "/health")
	public String health(){
		return "it Works!";
	}
	
	@GetMapping(value = "/items")
	public List<Item> obtenerMentores(){
		return itemService.obtenerItems();
	}
	
	@GetMapping(value = "/titles/{rating}", produces = "application/json;charset=utf-8")
	public List<String> getTitles(@PathVariable Double rating){		
		//return List.of("item 1","item 2","item 3","item 4");
		return itemService.getTitles(rating);
	}

}
