package hello.utilisateurs;

import java.util.ArrayList;

import hello.livre.Livre;
import hello.utilisateurs.interfaces.LoueurInterface;

public class Loueur extends Utilisateur implements LoueurInterface{
	private ArrayList<Livre> books;
	
	public Loueur() {
		this.books = new ArrayList<Livre>();
	}
	
	public String booksNumber() {
		String message = "Nombre de livres : ";
		message += this.books.size();
		return message;
	}
	

	/**
	 * Boucle sur la collection des livres
	 */

	public String listBooks() {
		String message = "Livres de la collection de " + this.nom + "\n";
		for (Livre livre : this.books) {
		message += livre.titre() + "\n";
		}
		return message;
		
	}
	
	@Override
	public Utilisateur addBook(Livre livre) {
		// TODO Auto-generated method stub
		if (!this.books.contains(livre)) {
			this.books.add(livre);
		}
			return null;
		
	}
		
		
	@Override
	public Utilisateur loan(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur calculeCotisation() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
