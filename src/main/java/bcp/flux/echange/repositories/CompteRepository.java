package bcp.flux.echange.repositories;
import bcp.flux.echange.model.Compte;


import org.springframework.data.jpa.repository.JpaRepository;


public interface CompteRepository extends JpaRepository<Compte, Long>{
	
	

}
