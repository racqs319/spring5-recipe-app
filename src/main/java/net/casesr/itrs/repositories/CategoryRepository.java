package net.casesr.itrs.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import net.casesr.itrs.domain.Category;

public interface CategoryRepository extends CrudRepository<Category,Long> {
	
	Optional<Category> findByDescription(String description);

}
