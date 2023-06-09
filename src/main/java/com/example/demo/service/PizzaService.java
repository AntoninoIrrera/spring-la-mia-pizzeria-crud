package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.intefaccia.PizzaRepo;
import com.example.demo.pojo.Pizza;

@Service
public class PizzaService {

	@Autowired
	private PizzaRepo pizzaRepo;
	
	
	public List<Pizza> findAll() {
		
		return pizzaRepo.findAll();
	}
	public Pizza save(Pizza pizza) {
		
		return pizzaRepo.save(pizza);
	}
	public Optional<Pizza> findById(int id) {
		
		return pizzaRepo.findById(id);
	}
	
	public List<Pizza> findByNome(String nome) {
		
		return pizzaRepo.findByNomeContaining(nome);
	}
	
	public void deletePizza(Pizza pizza){
		
		pizzaRepo.delete(pizza);
		
	}
}
