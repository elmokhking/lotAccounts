package bcp.flux.echange.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Compte {
		
	@Id
	private Long c01_Identifiant_Ligne;
	
	private String z01_Type_Enregistrement;
	
	private String c02_Code_Declarant;
	
	private String c03_Code_Localite_Agence;
	
	private String c04_Guichet_Agence;
	
	private String c05_RIB;
	
	private String c06_Type_Compte;
	
	private String c07_Devise_Compte;
	
	private String c08_Intitule_Compte;
	
	private Long c09_Date_Ouverture;

	private String c10_Statut_Compte;
	
	private Long c11_Date_Statut;
	
	

	public String getZ01_Type_Enregistrement() {
		return z01_Type_Enregistrement;
	}

	public void setZ01_Type_Enregistrement(String z01_Type_Enregistrement) {
		this.z01_Type_Enregistrement = z01_Type_Enregistrement;
	}

	public Long getC01_Identifiant_Ligne() {
		return c01_Identifiant_Ligne;
	}

	public void setC01_Identifiant_Ligne(Long c01_Identifiant_Ligne) {
		this.c01_Identifiant_Ligne = c01_Identifiant_Ligne;
	}

	public String getC02_Code_Declarant() {
		return c02_Code_Declarant;
	}

	public void setC02_Code_Declarant(String c02_Code_Declarant) {
		this.c02_Code_Declarant = c02_Code_Declarant;
	}

	public String getC03_Code_Localite_Agence() {
		return c03_Code_Localite_Agence;
	}

	public void setC03_Code_Localite_Agence(String c03_Code_Localite_Agence) {
		this.c03_Code_Localite_Agence = c03_Code_Localite_Agence;
	}

	public String getC04_Guichet_Agence() {
		return c04_Guichet_Agence;
	}

	public void setC04_Guichet_Agence(String c04_Guichet_Agence) {
		this.c04_Guichet_Agence = c04_Guichet_Agence;
	}

	public String getC05_RIB() {
		return c05_RIB;
	}

	public void setC05_RIB(String c05_RIB) {
		this.c05_RIB = c05_RIB;
	}

	public String getC06_Type_Compte() {
		return c06_Type_Compte;
	}

	public void setC06_Type_Compte(String c06_Type_Compte) {
		this.c06_Type_Compte = c06_Type_Compte;
	}

	public String getC07_Devise_Compte() {
		return c07_Devise_Compte;
	}

	public void setC07_Devise_Compte(String c07_Devise_Compte) {
		this.c07_Devise_Compte = c07_Devise_Compte;
	}

	public String getC08_Intitule_Compte() {
		return c08_Intitule_Compte;
	}

	public void setC08_Intitule_Compte(String c08_Intitule_Compte) {
		this.c08_Intitule_Compte = c08_Intitule_Compte;
	}

	public Long getC09_Date_Ouverture() {
		return c09_Date_Ouverture;
	}

	public void setC09_Date_Ouverture(Long c09_Date_Ouverture) {
		this.c09_Date_Ouverture = c09_Date_Ouverture;
	}

	public String getC10_Statut_Compte() {
		return c10_Statut_Compte;
	}

	public void setC10_Statut_Compte(String c10_Statut_Compte) {
		this.c10_Statut_Compte = c10_Statut_Compte;
	}

	public Long getC11_Date_Statut() {
		return c11_Date_Statut;
	}

	public void setC11_Date_Statut(Long c11_Date_Statut) {
		this.c11_Date_Statut = c11_Date_Statut;
	}

}
