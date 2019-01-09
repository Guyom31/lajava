package hello.utilisateurs;

import hello.livre.Livre;
import hello.utilisateurs.interfaces.EmprunteurInterface;
import hello.utilisateurs.interfaces.LoueurInterface;

public class EmprunteurLoueur extends Utilisateur implements LoueurInterface, EmprunteurInterface {

	@Override
	public Utilisateur cotisation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur createBookBorrowing(Loueur loueur, Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur returnBook(Loueur loueur, Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur addBook(Livre livre) {
		// TODO Auto-generated method stub
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
