package com.iti.budgetFamilial.classesMetier;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Origine 
{
	//Définition des attributs
	public String nomOrigine;
	Origine       uneOrigine;
	private int   jour;
	private int   mois;
	private int   annee;
	static List <Origine>    arrayListOrigine = new ArrayList<Origine>(); 

	
/////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// DEFINITIONS DES CLASSES ///////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////

	public Origine(){} 							    //Constructeur Origine VIDE 
	
	public Origine(String nomOrigine){ 				//Constructeur Origine
		this.nomOrigine = nomOrigine; 
	}
	//NOUVELLE CATEGORIE 
	public void setNewOrigine(Origine uneOrigine){
		if(uneOrigine!=null){
			arrayListOrigine.add(uneOrigine);
		}
		else System.out.println("###### ERROR ######## La Liste"+arrayListOrigine+" est vide"+uneOrigine);	
	}	
	//GETTER D'UNE NOUVELLE CATEGORIE
	public List <Origine> getListOrigine(){
		return arrayListOrigine;
	}
	//MISE A JOUR DE LA NOUVELLE CATERGORIES 
	public void updOrigine(Origine uneOrigine)
	{
		this.uneOrigine = uneOrigine;
	}
	
	//SUPPRESSION D'UNE RENTREE
	public void delOrigine(Origine uneOrigine)
	{
		arrayListOrigine.remove(uneOrigine);
	}
	//GETTER DE DATE
	public void getDateOrigine(){
		GregorianCalendar date = new GregorianCalendar();
		//heure = date.getTime();
		jour  = date.get(Calendar.DAY_OF_WEEK);
		jour+=13;
		mois  = date.get(Calendar.MONTH);
		mois+=1;
		annee = date.get(Calendar.YEAR);
	}
	//CLASSE STRING2STRING
	@Override
	public String toString(){
		String s = new String();
		
		s+=this.nomOrigine+"\n";
		s+=this.jour + "/"+this.mois + "/"+this.annee; 
		
		return s;
	}
	
}
