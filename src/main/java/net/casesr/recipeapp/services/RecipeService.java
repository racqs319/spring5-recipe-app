package net.casesr.recipeapp.services;

import java.util.Set;

import net.casesr.recipeapp.domain.Recipe;

public interface RecipeService {
	
	Set<Recipe> getRecipes();

}
