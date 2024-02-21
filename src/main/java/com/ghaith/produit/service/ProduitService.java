package com.ghaith.produit.service;

import java.util.List;

import com.ghaith.produit.entities.Categorie;
import com.ghaith.produit.entities.Produit;

public interface ProduitService {
	Produit saveProduit(Produit p);
	Produit UpdateProduit(Produit p);
	void deleteProduit(Produit p);
	void deleteProduitById(Long id);
	Produit getProduit(Long id);
	List<Produit> getAllProduits();
	List<Produit> findByNomProduit(String nom);
	List<Produit> findByNomProduitContains(String nom);
	List<Produit> findByNomPrix(String nom,Double prix);
	List<Produit> findByCategorie(Categorie categorie);
	List<Produit> findByCategorieIdCat(Long id);
	List<Produit> findByOrderByNomProduitAsc();
	List<Produit> trierProduitsNomsPrix();


}
