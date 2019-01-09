package hello;

abstract public class Utilisateur {
	protected String nom;
	protected String prenom;
	protected String numAdherent;
	
	/**
	 * Constructeur d'une classe Java
	 * Porte le nom de la classe
	 */
	public Utilisateur() {
		System.out.println("Je suis le constructeur Utilisateur");
	}
	
	public Utilisateur(String nom, String prenom, String numAdherent) {
		this.nom = nom;
		this.prenom = prenom;
		this.numAdherent = numAdherent;
	}
	
	
	
	public String getNom() {
		return nom;
	}
	public Utilisateur setNom(String nom) {
		this.nom = nom;
		return this;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNumAdherent() {
		return numAdherent;
	}
	public void setNumAdherent(String numAdherent) {
		this.numAdherent = numAdherent;
	}
	
	
	
	public String nom() {
		return this.nom;
	}
	public String prenom() {
		return this.prenom;
	}
	public String numAdherent() {
		return this.numAdherent;
	}
	
	
	
	public Utilisateur nom(String nom) {
		this.nom = nom;
		return this;
	}
	public Utilisateur prenom(String prenom) {
		this.prenom = prenom;
		return this;
	}
	public Utilisateur numAdherent(String numAdherent) {
		this.numAdherent = numAdherent;
		return this;
	}

}
