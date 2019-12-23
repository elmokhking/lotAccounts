package bcp.flux.echange.services;

import org.springframework.stereotype.Service;

import bcp.flux.echange.model.HeaderHistory;
import bcp.flux.echange.repositories.HeaderHistoryRepository;


@Service
public class HeaderHistoryServiceImpl implements HeaderHistoryService{

		HeaderHistoryRepository headerHistoryRepository;
		HeaderHistoryServiceImpl(HeaderHistoryRepository headerHistoryRepository) {
			super();
			this.headerHistoryRepository = headerHistoryRepository;
		}
		@Override
		public HeaderHistory find(Long id) {
			return headerHistoryRepository.findById(id).get();
		}
		@Override
		public HeaderHistory save(HeaderHistory h) {
			
			return headerHistoryRepository.save(h);
		}
		
		
		
		
		
}
