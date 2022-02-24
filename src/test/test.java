package test;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import dao.ProduitDAO;
import entite.I_Produit;
import entite.Produit;
import oracleBD.Oracle;

public class test {

	public static void main(String[] args) 
	{
		ProduitDAO d = new ProduitDAO();
		List<I_Produit> l = new ArrayList<>();
		l = d.getAllProduits();
		
		for (I_Produit i_Produit : l) 
		{
			System.out.println(i_Produit.toString());
		}
		

	}

}
