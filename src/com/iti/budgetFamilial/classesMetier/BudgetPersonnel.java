package com.iti.budgetFamilial.classesMetier;
import java.util.*;

public class BudgetPersonnel 
{
	//Définition des attributs
	private float montantBudget;
	private Date  dateBudget;
	private int     jour;
	private int		heure;
	private int     mois;
	private int     annee;	
	BudgetPersonnel unBudget;
	static List <BudgetPersonnel> arrayListBudgetPerso= new ArrayList<BudgetPersonnel>(); 

 /*---------------------------------------------------------------------------/
 /* ///////////////////////////// DEFINITIONS DES CLASSES /////////////////////
 /*--------------------------------------------------------------------------*/
	
	//CONSTRUCTEUR BUDGET VIDE
	public BudgetPersonnel(){
		
	}
	//CONSTRUCTEUR BUDGETPERSO 

	public BudgetPersonnel(float montantBudget){
		this.montantBudget = montantBudget;
	}
	//
	public void setNewBudgetDepense(BudgetPersonnel unBudget)
	{
		arrayListBudgetPerso.add(unBudget);
	}
	
	//
	public void newBudgetExceptionnel(BudgetPersonnel unBudget)
	{	
		arrayListBudgetPerso.add(unBudget);
		
	}
	//
	public void updBudget(BudgetPersonnel unBudget)
	{
		 this.unBudget = unBudget;
	}
	//
	public void delBudget(BudgetPersonnel unBudget)
	{
		arrayListBudgetPerso.remove(unBudget);
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
			+this.montantBudget+"\n";
		return s;
	}

}
