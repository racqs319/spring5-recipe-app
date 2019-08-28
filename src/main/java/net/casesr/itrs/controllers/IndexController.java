package net.casesr.itrs.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import net.casesr.itrs.domain.Category;
import net.casesr.itrs.domain.UnitOfMeasure;
import net.casesr.itrs.repositories.CategoryRepository;
import net.casesr.itrs.repositories.UnitOfMeasureRepository;

@Controller
public class IndexController {
	
	private final CategoryRepository categoryRepository;
	private final UnitOfMeasureRepository unitOfMeasureRepository;
	
	
	
	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		super();
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}

	@GetMapping({"", "/", "/index", "/index.html"})
	public String getIndexPage() {
		Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
		Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
		
		System.out.println("Cat id is: " + categoryOptional.get().getId());
		System.out.println("UOM id is: " + uomOptional.get().getId());
		
		return "index";
	}

}
