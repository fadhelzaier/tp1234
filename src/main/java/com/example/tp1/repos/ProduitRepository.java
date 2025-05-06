package com.example.tp1.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tp1.Entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
	
}