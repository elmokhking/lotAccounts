package bcp.flux.echange.services;

import java.util.List;

import org.springframework.stereotype.Service;
import bcp.flux.echange.model.Header;
import bcp.flux.echange.repositories.HeaderRepository;
import bcp.flux.echange.services.HeaderService;

@Service
public class HeaderServiceImpl implements HeaderService {

	HeaderRepository headerRepository;
	HeaderServiceImpl(HeaderRepository headerRepository) {
		super();
		this.headerRepository = headerRepository;
	}

	@Override
	public List<Header> findAll() {
		return headerRepository.findAll();
	}

	@Override
	public Header save(Header h) {
		
		return headerRepository.save(h);
	}
	
	

}
