package com.iti.budgetFamilial.classesMetier;
import java.util.*;

public class Personne 
{
	//Définition des attributs
    private String   prenom;
	private String   nom;
	private String   membre;
	private int      age;
	private String   adulte;
	Personne         unePersonne;
	Personne         pere;
	Personne         mere;
	Personne         enfant1;
	Personne         enfant2;
	Personne         enfant3;

	static List <Personne>  arrayListPersonne = new ArrayList<Personne>();

	//Constructeur NON initié
	public Personne(){
		
	}
	//Initialisation du constructeur avec nom & prénom
	public Personne(String prenom, String nom){
		this.prenom = prenom;
		this.nom    = nom;
	}
	//Initialisation du constructeur avec nom & prénom & age
	public Personne(String prenom, String nom,  int age){
		this.prenom = prenom;
		this.nom    = nom;
		this.age = age;
	}
	//Constructeur Personne   
	public Personne(String prenom, String nom, String membre){
		this.prenom      = prenom;
		this.nom         = nom;
		this.membre      = membre;
	}
	
	//Ajout d'une nouvelle personne
	public void setListPersonne(Personne unePersonne){
		if (!arrayListPersonne.contains(unePersonne))arrayListPersonne.add(unePersonne);
	}
	
	//
	public boolean testMajeur(){
		
		if(this.age>=18)
				return true;
		else 
				return false;

	}
	
	//METHODE GET LISTE PERSONNE
	public List<Personne> getListPersonne(){
		return arrayListPersonne;
	}
	
	//Affichage des attributs par la méthode String toString 
	@Override
	public String toString(){
		String s = new String();
		s+=this.prenom +" "+this.nom;
		return s;
	}
	
}


