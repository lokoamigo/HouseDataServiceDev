package de.frantzen.houseDataService.dao;

import de.frantzen.houseDataService.model.Values;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ValuesRepository extends JpaRepository<Values, Integer> {

}
