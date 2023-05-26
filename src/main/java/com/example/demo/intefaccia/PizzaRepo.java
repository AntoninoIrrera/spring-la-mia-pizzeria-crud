package com.example.demo.intefaccia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Pizza;

@Repository
public interface PizzaRepo extends JpaRepository<Pizza, Integer>{

}
