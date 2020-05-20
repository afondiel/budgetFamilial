package com.iti.budgetFamilial.classesMetier;
import java.util.*;

public class Depense 
{
	//Définition des attributs
	
	private float     montantDepense;
	private String    poste;							//Poste == Catégorie
	private Date    dateDepense;
	private int       jour;
	private int		  heure;
	private int       mois;
	private int       annee;
	public static int cntdate;
	Depense uneDepense;
	static List <Depense>    arrayListDepense = new ArrayList<Depense>(); 
	/////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////// DEFINITIONS DES CLASSES ///////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////
	
	public Depense()			   							//Constructeur Dépense vide
	{

	}
	public Depense(float montantDepense)			   		//Constructeur Dépense avec le montant
	{
		this.montantDepense = montantDepense;
		this.dateDepense    = dateDepense;
	}
	public Depense(float montantDepense, String poste)		//Constructeur Dépense montant+poste
	{
		this.montantDepense = montantDepense;
		this.poste = poste;									//catégorie de la dépense	
	}
	
	//GETTER DU JOUR & MOIS& L'ANNEE DE LA DEPENSE
	public void getDateDepense(){
		GregorianCalendar date = new GregorianCalendar();
		//heure = date.getTime();
		jour  = date.get(Calendar.DAY_OF_WEEK);
		jour+=13;
		mois  = date.get(Calendar.MONTH);
		mois+=1;
		annee = date.get(Calendar.YEAR);
		
	}
	public void setNewDepense(Depense uneDepense){
		if (!arrayListDepense.contains(uneDepense))arrayListDepense.add(uneDepense);
	}
	public List <Depense> getSommeDepense()
	{
		return arrayListDepense;
	}
	
	//METRE A JOUR LA DEPENSE
	public void updDepense(Depense uneDepense)
	{		
		//uneDepense      = null;
		this.uneDepense = uneDepense;
	}
	
	//SUPRIMMER UNE DEPENSE
	public void delDepense(Depense uneDepense)
	{
		int i;
		if(uneDepense!=null){
			for(i=0;i<arrayListDepense.size();i++){
				arrayListDepense.remove(uneDepense);	
			}
		}
		
		else System.out.println("###### ERROR Liste vide ####### " +uneDepense);
	}
	
	@Override
	public String toString(){
		String s = new String();
			s+=this.montantDepense+"\n";
			s+=this.jour + "/"+this.mois + "/"+this.annee+"\n";
		 return s;
	}

}
