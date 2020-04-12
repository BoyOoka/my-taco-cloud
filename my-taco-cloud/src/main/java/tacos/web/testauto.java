package tacos.web;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import lombok.extern.slf4j.Slf4j;
import tacos.Ingredient;
import tacos.data.IngredientRepository;
import tacos.data.TacoRepository;



@Slf4j
@RestController
@RequestMapping("/test")
@SessionAttributes("order")
public class testauto {
	
	@Autowired
	IngredientRepository in;
	
	
	
	@GetMapping
	public String test() {
		List<Ingredient> ingredients = new ArrayList<>();
		in.findAll().forEach(i -> ingredients.add(i));
		log.info("-------" + ingredients);
		return "ok";
	}
}
