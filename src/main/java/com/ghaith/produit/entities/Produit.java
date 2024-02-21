package com.ghaith.produit.entities;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Produit {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idProduit;
private String nomProduit;
private Double prixProduit;
private Date dateCreation;

@ManyToOne
@JsonIgnore
private Categorie categorie;

public Produit() {
	super();
	
}

public Produit(String nomProduit, Double prixProduit, Date dateCreation) {
	super();
	this.nomProduit = nomProduit;
	this.prixProduit = prixProduit;
	this.dateCreation = dateCreation;
}

public String getNomProduit() {
	return nomProduit;
}
public void setNomProduit(String nomProduit) {
	this.nomProduit = nomProduit;
}
public Long getIdProduit() {
	return idProduit;
}
public void setIdProduit(Long idProduit) {
	this.idProduit = idProduit;
}
public Double getPrixProduit() {
	return prixProduit;
}
public void setPrixProduit(Double prixProduit) {
	this.prixProduit = prixProduit;
}
public Date getDateCreation() {
	return dateCreation;
}
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}
@Override
public String toString() {
	return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", prixProduit=" + prixProduit
			+ ", dateCreation=" + dateCreation + "]";
}
public Categorie getCategorie() {
	return categorie;
}


public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}

}
