package bcp.flux.echange.controller;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bcp.flux.echange.model.Compte;
import bcp.flux.echange.model.Header;
import bcp.flux.echange.model.HeaderHistory;
import bcp.flux.echange.services.CompteService;
import bcp.flux.echange.services.HeaderHistoryService;
import bcp.flux.echange.services.HeaderService;


@RestController
public class HeaderController {



	HeaderService headerService;
	HeaderHistoryService headerHistoryService;
	CompteService compteService;

	
	
	
    
    
	public HeaderController(HeaderService headerService, HeaderHistoryService headerHistoryService,
			CompteService compteService) {
		super();
		this.headerService = headerService;
		this.headerHistoryService = headerHistoryService;
		this.compteService = compteService;
	}






	@RequestMapping("/header")
	private Header getHeader() {
		Header newHeader=new Header();
		ArrayList<Compte> listC=new ArrayList<>();
		List<Compte> comptes=compteService.findAll();
		HeaderHistory oldH=headerHistoryService.find(1L);
		List<Compte> oldcomptes=oldH.getComptes();
		for (Compte compte : oldcomptes) {
			if(comptes.contains(compte)) comptes.remove(compte);
		}
		
		if(comptes.size()==0) return null;
		Compte compteAtraite=comptes.get(0);
		listC.add(compteAtraite);
		oldcomptes.add(compteAtraite);
		oldH.setComptes(oldcomptes);
		newHeader.setComptes(listC);
		newHeader.setH04_Date_Creation_Fichier(LocalDateTime.now());
		newHeader.setH05_Numero_Lot(oldH.getNumero_Lot());
		oldH.setNumero_Lot(oldH.getNumero_Lot()+1);
		
		headerHistoryService.save(oldH);
		headerService.save(newHeader);
		
		return newHeader;
		
		
		
	}
	
}
