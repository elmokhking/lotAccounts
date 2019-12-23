package bcp.flux.echange.services;
import java.util.List;

import org.springframework.stereotype.Service;

import bcp.flux.echange.model.Compte;
import bcp.flux.echange.repositories.CompteRepository;

@Service
public class CompteServiceImpl implements CompteService {

	CompteRepository compteRepository;
	CompteServiceImpl(CompteRepository compteRepository) {
		super();
		this.compteRepository = compteRepository;
	}

	
	
	@Override
	public List<Compte> findAll() {
		
		return compteRepository.findAll();
	}
	
	
	
	

	
}
