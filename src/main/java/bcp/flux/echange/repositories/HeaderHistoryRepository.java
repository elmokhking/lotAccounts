package bcp.flux.echange.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import bcp.flux.echange.model.HeaderHistory;


public interface HeaderHistoryRepository extends JpaRepository<HeaderHistory, Long>{

}
