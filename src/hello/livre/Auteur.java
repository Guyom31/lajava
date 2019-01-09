package hello.livre;

import java.util.Date;

public class Auteur {
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private Auteur(String nom, String prenom, Date dateDeNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
	} 
	
	public static Auteur getAuteur(String nom, String prenom, Date dateDeNaissance) {
		Date today = new Date();
		if (dateDeNaissance.after(today)) {
			return null;
		}
		
		Auteur auteur = new Auteur(nom, prenom, dateDeNaissance);
		return auteur;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	

	

}
