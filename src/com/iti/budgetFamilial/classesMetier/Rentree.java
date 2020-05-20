package com.iti.budgetFamilial.classesMetier;
import java.text.*;
import java.util.*;

public class Rentree
{
	//Définition des attributs

	private float montantRentree;
	private Date dateReception;
	Rentree       uneRentree;
	private int   jour;
	private int   mois;
	private int   annee;
	private static List<Rentree> arrayListRentree = new ArrayList<Rentree>();
	
/////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// DEFINITIONS DES CLASSES ///////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
	
	//Constructeur non - initié
	public Rentree (){
		
	}
	
	//Constructeur Avec le montant
	public Rentree (float montantRentree){		
		this.montantRentree = montantRentree;
	}
	//
	public void setNewRentree(Rentree uneRentree)
	{	
		if(uneRentree!=null){
			arrayListRentree.add(uneRentree);
		}
		else{System.out.println("###### ERROR ######## La Liste"+arrayListRentree+" est vide"+uneRentree);}
	}
	public List<Rentree>getListRentree(){
		
		return arrayListRentree; 
	}
	//MISE A JOUR D'UNE NOUVELLE RENTREE D'aRGENT 
	public void updRentree(Rentree uneRentree)
	{
		this.uneRentree = uneRentree;
	}
	//SUPPRESSION D'UNE RENTREE
	public void delRentree(Rentree uneRentree)
	{
		arrayListRentree.remove(uneRentree);
	}
	
	public void setJour(int jour){
		if(jour<=31)this.jour = jour;
		
	}
	public void setMois(int mois){
		
		if(mois<=12)this.mois = mois;
		
	}
	public void setAnnee(int annee){
		
		this.annee = annee;
	}
	//GETTER DE DATE
	public void getDateReception(){
		 System.out.println(this.jour + "/"+this.mois + "/"+this.annee);
		
	}
	
	//CLASSE STRING2STRING
	@Override
	public String toString(){
		String s = new String();
		s+=this.montantRentree+"\n";
		return s;
	}
}
