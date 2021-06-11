package com.evalJava;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "salarie")
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private int id;
	
	@Column(name = "nom", nullable = true, unique = false, length = 50)
	private String nom;
	
	@Column(name = "prenom", nullable = false, unique = false, length = 50)
	private String prenom;
	
	@Column(name = "salaire", nullable = true, unique = false, length = 50)
	private String salaire;
	
	@Column(name = "experience", nullable = true, unique = false, length = 200)
	private String experience;
	
	@ManyToOne
	private Client client;
	
	

	public salarie() {
		super();
	}

	public Produit(String marque, String reference, String dateAchat, double prix, String designation) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
		this.experience = experience;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String nom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	

}

