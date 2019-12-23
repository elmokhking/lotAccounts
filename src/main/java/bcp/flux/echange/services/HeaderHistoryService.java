package bcp.flux.echange.services;

import bcp.flux.echange.model.HeaderHistory;

public interface HeaderHistoryService {

	HeaderHistory find(Long id);
	
	HeaderHistory save(HeaderHistory h);
}
