package hello.livre;

import hello.Utilisateur;

public class Livre {
	private String titre;
	private String resume;
	private int nombrePage;
	private int minimumPage = 4;
	
	



	/**
	 * Constructeur d'une classe Java
	 * Porte le nom de la classe
	 */
		
	public Livre() {
		System.out.println("Je suis le constructeur du livre");
	}
	
	
	
	public Livre(String titre, String resume, int nombrePage) {
		this.titre = titre;
		this.resume = resume;
		this.nombrePage = nombrePage;
	}
	
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public int getNombrePage() {
		return nombrePage;
	}
	public void setNombrePage(int nombrePage) {
		this.nombrePage = nombrePage;
	}
	
	
	public String titre() {
		return this.titre;
	}
	public String resume() {
		return this.resume;
	}
	public int nombrePage() {
		return this.nombrePage;
	}
	
	
	
	public Livre titre(String titre) {
		this.titre = titre;
		return this;
	}
	public Livre resume(String resume) {
		this.resume = resume;
		return this;
	}
	public Livre nombrePage(int nombrePage) {
		this.nombrePage = nombrePage;
		return this;
	}
		

}
