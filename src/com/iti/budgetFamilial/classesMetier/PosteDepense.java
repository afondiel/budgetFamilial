package com.iti.budgetFamilial.classesMetier;
import java.util.*;

public class PosteDepense 
{
	//Définition des attributs
	private String  nomPoste;
	private int     jour;
	private int		heure;
	private int     mois;
	private int     annee;
	PosteDepense    unPoste;
	static List <PosteDepense> arrayGetListPoste = new ArrayList<PosteDepense>(); 
	
	/////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////// DEFINITIONS DES CLASSES ///////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////
	

	public PosteDepense(){} 							//Constructeur PosteDepense VIDE 
	
	public PosteDepense(String nomPoste){ 				//Constructeur PosteDepense
		this.nomPoste = nomPoste; 
	}
	//NOUVEAU POSTE
	public void setNewPoste(PosteDepense unPoste){
		if(unPoste!=null){
			arrayGetListPoste.add(unPoste);
		}
		else System.out.println("###### ERROR ######## La Liste"+arrayGetListPoste+" est vide"+unPoste);
			
	}	
	
	//RECUPPERATION DU NOUVEAU POSTE 
	public List <PosteDepense> getListPoste(){
		return arrayGetListPoste;
	}
	//
	public void updPoste(PosteDepense unPoste)
	{
		this.unPoste = unPoste;
	}
	
	//SUPRESSION DUN POSTE
	public void delPoste(PosteDepense unPoste)
	{
		int i;
		for(i=0;i<arrayGetListPoste.size();i++){
			arrayGetListPoste.remove(unPoste);
		}
		
	}
	//GETTER DE DATE
	public void getDatePoste(){
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
		 s+=this.jour + "/"+this.mois + "/"+this.annee+"\n" 
			+this.nomPoste+"\n";
		return s;
	}
	
}
