package bcp.flux.echange.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class HeaderHistory {
	
	

	@Id
	private long id;
	
	private long Numero_Lot;
	
	
	@OneToMany(fetch=FetchType.LAZY)
	private List<Compte> comptes;
	
	 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getNumero_Lot() {
		return Numero_Lot;
	}

	public void setNumero_Lot(long numero_Lot) {
		Numero_Lot = numero_Lot;
	}

	public List<Compte> getComptes() {
		if(this.comptes==null) return new ArrayList<Compte>();
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	
}
