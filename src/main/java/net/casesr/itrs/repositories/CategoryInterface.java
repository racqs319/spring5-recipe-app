package net.casesr.itrs.repositories;

import org.springframework.data.repository.CrudRepository;

import net.casesr.itrs.domain.Category;

public interface CategoryInterface extends CrudRepository<Category,Long> {

}
