package com.ghaith.produit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.ghaith.produit.entities.Categorie;
import com.ghaith.produit.entities.Produit;

@SpringBootApplication
public class Produit1Application implements CommandLineRunner {
@Autowired
private RepositoryRestConfiguration repositoryRestConfigutation;
	public static void main(String[] args) {
		SpringApplication.run(Produit1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfigutation.exposeIdsFor(Produit.class,Categorie.class);
		
	}

}
