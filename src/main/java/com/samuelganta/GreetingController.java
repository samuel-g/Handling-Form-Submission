package com.samuelganta;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/*In Spring’s approach to building web sites, 
 * HTTP requests are handled by a controller. 
 * These components are easily identified by 
 * the @Controller annotation. The GreetingController
 * below handles GET requests for /greeting by returning
 * the name of a View, in this case, "greeting". A View 
 * is responsible for rendering the HTML content:*/

@Controller
public class GreetingController {
	
	//The mapping annotations allows you to map 
	//HTTP requests to specific controller methods.
	
	
	
	@GetMapping("/") //it is specialized version of @RequestMapping annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.GET). 
	public String greetingForm(Model model) {
		model.addAttribute("greeting", new Greeting());
		return "greeting";
	}
	//model is used to hold the data
	
	//get for getting data
	//post for posting data
	//The greetingSubmit() method receives the Greeting 
	//object that was populated by the form. The Greeting
	//is a  @ModelAttribute so it is bound to the incoming form content,
	@PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }

}
