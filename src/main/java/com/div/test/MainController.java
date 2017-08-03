package com.div.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.div.test.model.Person;
import com.div.test.service.PersonService;

@Controller
public class MainController {
	
	@Autowired
    PersonService service;
	
	@RequestMapping(value = "/div", method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "helloPage";
	}

	@RequestMapping(value = "/addPerson", method = RequestMethod.GET)
	public String addPerson(ModelMap model) {
		model.addAttribute("person", new Person());
		return "addPerson";
	}
	
	@RequestMapping(value = "/savePerson", method = RequestMethod.POST)
	public @ResponseBody String addPerson(@ModelAttribute("person") Person person, ModelMap model) {
		System.out.println("result:"+person);
		List<Integer> personIds = service.getPersonIds();
		System.out.println(personIds);
		return "result";
	}
}
