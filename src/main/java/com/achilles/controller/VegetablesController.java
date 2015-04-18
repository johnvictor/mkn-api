package com.achilles.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.achilles.model.Vegetable;

@RestController
public class VegetablesController {

	@RequestMapping(value = "/get-vegetables")
	public @ResponseBody List<Vegetable> getVegetables() {
		
		List<Vegetable> vegetableList = new ArrayList<Vegetable>();
		
		Vegetable onion = new Vegetable();
		onion.setName("Onion");
		onion.setThumb_path("/onion.jpg");
		
		Vegetable carrot = new Vegetable();
		carrot.setName("Carrot");
		carrot.setThumb_path("/carrot.jpg");
		
		Vegetable brinjal = new Vegetable();
		brinjal.setName("Brinjal");
		brinjal.setThumb_path("/brinjal.jpg");
		
		vegetableList.add(onion);
		vegetableList.add(carrot);
		vegetableList.add(brinjal);
		
		return vegetableList;
	}
}
