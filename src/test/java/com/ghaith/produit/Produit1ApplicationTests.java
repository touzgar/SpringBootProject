package com.ghaith.produit;



import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ghaith.produit.entities.Categorie;
import com.ghaith.produit.entities.Produit;
import com.ghaith.produit.repos.ProduitRepository;

@SpringBootTest
class Produit1ApplicationTests {
@Autowired
ProduitRepository produitRepository;

@Test
public void testfindByCategorie() {
	Categorie cat =new Categorie();
	cat.setIdCat(1L);
	List<Produit>prods = produitRepository.findByCategorie(cat);
	for(Produit p : prods) {
		System.out.println(p);
	}
}
@Test
public void testfindByCategorieIdCat() {
	List<Produit>prods = produitRepository.findByCategorieIdCat(1L);
	for(Produit p : prods) {
		System.out.println(p);
	}
	
}

}