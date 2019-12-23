package bcp.flux.echange.model;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity

public class Header {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long h01_Identifiant_Ligne;

	private String h02_Code_Declarant;
	
	private Long h03_Date_Arrete;
	
	private LocalDateTime h04_Date_Creation_Fichier;
	
	private Long h05_Numero_Lot;
	
	private Long h06_Numero_Version_Notice;
	
	private Long h07_Numero_Compte;
	
	private Long h08_Numero_Client;
	
	private Long h09_Numero_Liaison;
	
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<Compte> comptes;


	public Long getH01_Identifiant_Ligne() {
		return h01_Identifiant_Ligne;
	}


	public void setH01_Identifiant_Ligne(Long h01_Identifiant_Ligne) {
		this.h01_Identifiant_Ligne = h01_Identifiant_Ligne;
	}


	public String getH02_Code_Declarant() {
		return h02_Code_Declarant;
	}


	public void setH02_Code_Declarant(String h02_Code_Declarant) {
		this.h02_Code_Declarant = h02_Code_Declarant;
	}


	public Long getH03_Date_Arrete() {
		return h03_Date_Arrete;
	}


	public void setH03_Date_Arrete(Long h03_Date_Arrete) {
		this.h03_Date_Arrete = h03_Date_Arrete;
	}


	public LocalDateTime getH04_Date_Creation_Fichier() {
		return h04_Date_Creation_Fichier;
	}


	public void setH04_Date_Creation_Fichier(LocalDateTime h04_Date_Creation_Fichier) {
		this.h04_Date_Creation_Fichier = h04_Date_Creation_Fichier;
	}


	public Long getH05_Numero_Lot() {
		return h05_Numero_Lot;
	}


	public void setH05_Numero_Lot(Long h05_Numero_Lot) {
		this.h05_Numero_Lot = h05_Numero_Lot;
	}


	public Long getH06_Numero_Version_Notice() {
		return h06_Numero_Version_Notice;
	}


	public void setH06_Numero_Version_Notice(Long h06_Numero_Version_Notice) {
		this.h06_Numero_Version_Notice = h06_Numero_Version_Notice;
	}


	public Long getH07_Numero_Compte() {
		return h07_Numero_Compte;
	}


	public void setH07_Numero_Compte(Long h07_Numero_Compte) {
		this.h07_Numero_Compte = h07_Numero_Compte;
	}


	public Long getH08_Numero_Client() {
		return h08_Numero_Client;
	}


	public void setH08_Numero_Client(Long h08_Numero_Client) {
		this.h08_Numero_Client = h08_Numero_Client;
	}


	public Long getH09_Numero_Liaison() {
		return h09_Numero_Liaison;
	}


	public void setH09_Numero_Liaison(Long h09_Numero_Liaison) {
		this.h09_Numero_Liaison = h09_Numero_Liaison;
	}


	public List<Compte> getComptes() {
		return comptes;
	}


	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

}
