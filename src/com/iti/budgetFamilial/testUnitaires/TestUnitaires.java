package com.iti.budgetFamilial.testUnitaires;
import java.util.*;
import com.iti.budgetFamilial.classesMetier.*;

public class TestUnitaires{
	public int i=0;
	
///////////////////////////// DEFINITIONS DES CLASSES DE TESTS ///////////////////////////////
	
	//Test Rentree
	public void testRentree()
	{
		List<Rentree> listRentree = new ArrayList<Rentree>();
		
		Rentree Rentree1 = new Rentree();
		Rentree Rentree2 = new Rentree(30000);
		
		Rentree1.setNewRentree(Rentree2);	
		listRentree = Rentree1.getListRentree();
		//Rentree1.updRentree(Rentree1);
		//Rentree1.delRentree(Rentree1);
		Rentree1.setJour(2);
		Rentree1.setMois(32);
		Rentree1.setAnnee(2017);
		Rentree1.getDateReception();

		for(i=0;i<listRentree.size();i++){
			System.out.println(listRentree.get(i));
		}
		
	}
	
	//Test Personne
	public void testPersonne()
	{
		int i;
		List<Personne> listPersonne = new ArrayList<Personne>();
		
		Personne person1 = new Personne();
		Personne person2 = new Personne("Afonso", "DIELA", 18);
		//Personne person3 = new Personne("Heidi", "ZAÏTER");
		if(person1.testMajeur()==false)
			System.out.println("OK");

		person1.setListPersonne(person2);		
		//person1.setListPersonne(person3);	

		listPersonne = person1.getListPersonne();
		
		//System.out.println(person2);

		for(i=0;i<listPersonne.size();i++){
			System.out.println(listPersonne.get(i));
		}

	}
	//Test Origine
	public void testOrigine()
	{
		// {"salaire","locationAppart","gain d'un jeu", "héritage"};
		
		List<Origine> listeOrigine = new ArrayList<Origine>();
		
		Origine origine1 = new Origine();
		Origine origine2 = new Origine("salaire");	
		
		origine1.setNewOrigine(origine2);
		
		listeOrigine = origine1.getListOrigine();
		
		for(i=0;i<listeOrigine.size();i++){
			System.out.println(listeOrigine.get(i));
		}
		
		//origine1.getDateOrigine();						

	}
	
	public void testDepense(){
		int i;
		List<Depense> listDepense = new ArrayList<Depense>();
		Date date = new Date();

		//Instantiaton des plusieurs dépenses
		Depense dep1 = new Depense();
		Depense dep2 = new Depense(3000);
		//Depense dep3 = new Depense(4000);
		
		dep1.setNewDepense(dep2);
		//dep1.setNewDepense();
		
		listDepense = dep1.getSommeDepense();
		
		//System.out.println(person2);

		for(i=0;i<listDepense.size();i++){
			System.out.println(listDepense.get(i));
		}
		
		//dep1.getDateDepense();							//get Date

	}
	
	public void testPosteDepense()
	{
		//{"loyer", "achat de nourriture", "achat de vêtements","achat réparation", "achat de matériel meubles", "argent de poche pour les enfants", "voyages"};
		List <PosteDepense> arrayGetListPoste = new ArrayList<PosteDepense>(); 

		PosteDepense Poste1 = new PosteDepense("Loyer");
		PosteDepense Poste2 = new PosteDepense("Achat de nourritures");
		PosteDepense Poste3 = new PosteDepense("Voyages");
		
		Poste1.getDatePoste();		
		System.out.println(Poste1);
				
		for(i=0;i<arrayGetListPoste.size();i++){
			arrayGetListPoste = Poste1.getListPoste();										
			Poste1.updPoste(Poste2);	
			System.out.println("Liste Poste Depense : " + arrayGetListPoste.get(i));
		}
		
	
	}
	public void testBudgetPersonnel()
	{
	
	}

	public void testAffichageRevenu(){
		
	}

}

//https://openclassrooms.com/courses/les-tests-unitaires-en-java
