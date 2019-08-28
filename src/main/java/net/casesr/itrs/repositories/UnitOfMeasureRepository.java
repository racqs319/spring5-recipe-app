package net.casesr.itrs.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import net.casesr.itrs.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
	
	Optional<UnitOfMeasure> findByDescription(String description);

}
