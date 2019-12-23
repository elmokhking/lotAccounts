package bcp.flux.echange.services;

import java.util.List;

import bcp.flux.echange.model.Header;

public interface HeaderService {

	public List<Header> findAll();
	
	public Header save(Header h);
}
