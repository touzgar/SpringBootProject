package com.ghaith.produit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ghaith.produit.entities.Categorie;
import com.ghaith.produit.repos.CategorieRepository;
@RestController
@RequestMapping("/api/cat")
@CrossOrigin("*")
public class CategorieRestController {
@Autowired
CategorieRepository categorieRepository;
@RequestMapping(method =RequestMethod.GET)
public List<Categorie> getAllCategories(){
	return categorieRepository.findAll();
}
@RequestMapping(value = "/{id}",method =RequestMethod.GET)
public Categorie getProduitById(@PathVariable("id") Long id) {
	return categorieRepository.findById(id).get();
}
}
