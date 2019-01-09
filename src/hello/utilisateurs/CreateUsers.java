package hello.utilisateurs;

import hello.livre.Livre;

public class CreateUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utilisateur loueur = CreateUsers.createLoueur();
		Utilisateur emprunteur = CreateUsers.createEmprunteur();
		Utilisateur emprunteurLoueur = CreateUsers.createEmprunteurLoueur();

		if (loueur instanceof Loueur) {
			System.out.println(loueur.nom() + " est un loueur");
		}
		
		if (emprunteur instanceof Loueur) {
			System.out.println(emprunteur.nom() + " est un loueur");
		} else {
			System.out.println(emprunteur.nom() + " n'est pas un loueur");
		}
		
		if (emprunteurLoueur instanceof EmprunteurLoueur) {
			System.out.println(emprunteurLoueur.nom() + " est un emprunteur et un loueur");
		}
		
		Livre livre = new Livre();
		livre.setTitre("Les Misérables");
		livre.resume("Lila lalou lali");
		livre.nombrePage(1452);
		((Loueur) loueur).addBook(livre);
			System.out.println(((Loueur) loueur).listBooks());
		
	}
	
	
	
	private static Utilisateur createLoueur() {
		return new Utilisateur()
				.nom("Duboc")
				.prenom("Guillaume")
				.numAdherent("123456789");
				
	}
	
	
	private static Utilisateur createEmprunteur() {
		return new Emprunteur()
				.nom("Dudu")
				.prenom("Guigui")
				.numAdherent("987654321");
		
	}
				
	
	private static Utilisateur createEmprunteurLoueur() {
		return new EmprunteurLoueur()
				.nom("Didi")
				.prenom("Gugu")
				.numAdherent("172839456");
		
	}
	
	

}
