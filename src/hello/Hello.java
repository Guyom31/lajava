package hello;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import hello.livre.Auteur;
import hello.livre.Livre;

public class Hello {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		
		/**
		 * Creation de differents utilisateurs
		 */
		
		Utilisateur moi = new Loueur();
		moi.setNom("Tartempion");
		moi.setPrenom("Daniel");
		moi.setNumAdherent("487516");
		
		System.out.println("Utilisateur : " + moi.getNom());
		
		Utilisateur lui = new Loueur("Bond", "James", "007");
		System.out.println("Nom : " + lui.getNom());
		System.out.println("Prenom : " + lui.getPrenom());
		System.out.println("NumAdherent : " + lui.getNumAdherent());
		
		Utilisateur alien = new Loueur("E.T", "Telephone maison", "666666");
		System.out.println("Nom : " + alien.getNom());
		System.out.println("Prenom : " + alien.getPrenom());
		System.out.println("NumAdherent : " + alien.getNumAdherent());
		
		/**
		 * Creation d'un livre
		 */
		
		Livre leLivre = new Livre();
		leLivre.setTitre("starTrek");
		leLivre.setResume("bliblabliblablou");
		leLivre.setNombrePage(256);
		
		Livre lautreLivre = new Livre();
		lautreLivre.setTitre("lesMiserables");
		lautreLivre.setResume("erratum desde parini anum teck");
		lautreLivre.setNombrePage(1256);
		
		System.out.println("Livre : " + leLivre.getTitre() + " " + leLivre.getResume() + " " + leLivre.getNombrePage());
		System.out.println("Livre : " + lautreLivre.getTitre() + " " + lautreLivre.getResume() + " " + lautreLivre.getNombrePage());
		
		
		/**
		 * Auteurs
		 */
		
		String pattern = "yyyy-mm-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = simpleDateFormat.parse("2020-01-02");
		Auteur hugo = Auteur.getAuteur("Hugo", "Victor", simpleDateFormat.parse("1802-15-01"));
		if (hugo==null) {
			System.out.println("instanciation impossible");
		}
		else {
			System.out.println("Auteur" + hugo.getNom());
		}
		
		
	}

}
