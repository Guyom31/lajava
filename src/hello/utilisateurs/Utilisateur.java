package hello.utilisateurs;

public class Utilisateur {
	protected String nom;
	protected String prenom;
	protected String numAdherent;
	
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
	
	public String nom() {
		return this.nom;
	}
	
	public String prenom() {
		return this.prenom;
	}
	public String numAdherent() {
		return this.numAdherent;
		
	}

}
