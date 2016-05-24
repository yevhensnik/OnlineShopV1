package shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.domain.CarBrandModel;
import shop.service.CarBrandModelService;

@Controller
public class CarSpecificationController {

	@Autowired
	private CarBrandModelService service;
	
	@RequestMapping(value = "/showAllCarBrandModels")
	public String getAllCarBrandModels(Model model){
		List<CarBrandModel> carBrandModels = service.getAllCarBrandModels();
		model.addAttribute("allCarBrandModels", carBrandModels);
		return "carBranModels-all";
	}
	
	@RequestMapping(value = "/createCarBrandModel")
	public String createCarBranModelPage(){
		return "newCarBrandModel";
	}
	
	@RequestMapping(value = "/showAllCarBrandModels", method = RequestMethod.POST)
	public String createCarBrandModel(@RequestParam(value = "name") String name){
		service.createCarBrandModel(name);
		return "redirect:/showAllCarBrandModels";
	}
		   
}
