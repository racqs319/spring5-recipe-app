package net.casesr.itrs.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.casesr.itrs.domain.Category;
import net.casesr.itrs.domain.UnitOfMeasure;
import net.casesr.itrs.repositories.CategoryRepository;
import net.casesr.itrs.repositories.UnitOfMeasureRepository;
import net.casesr.itrs.services.RecipeService;

@Controller
public class IndexController {
	
	private final RecipeService recipeService;
	
	public IndexController(RecipeService recipeService) {
		super();
		this.recipeService = recipeService;
	}

	@GetMapping({"", "/", "/index", "/index.html"})
	public String getIndexPage(Model model) {
		model.addAttribute("recipes", recipeService.getRecipes());
		
		return "index";
	}

}
