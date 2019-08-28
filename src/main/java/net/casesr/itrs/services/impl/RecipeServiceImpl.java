package net.casesr.itrs.services.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import net.casesr.itrs.domain.Recipe;
import net.casesr.itrs.repositories.RecipeRepository;
import net.casesr.itrs.services.RecipeService;

@Service
public class RecipeServiceImpl implements RecipeService {
	
	private final RecipeRepository recipeRepository;
	
	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		super();
		this.recipeRepository = recipeRepository;
	}
	@Override
	public Set<Recipe> getRecipes() {
		Set<Recipe> recipeSet = new HashSet<>();
		recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
		
		return recipeSet;
	}

}
