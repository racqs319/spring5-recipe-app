package net.casesr.itrs.repositories;

import org.springframework.data.repository.CrudRepository;

import net.casesr.itrs.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
