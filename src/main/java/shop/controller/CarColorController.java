package shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shop.domain.CarColor;
import shop.service.CarColorService;

@Controller
public class CarColorController {

	@Autowired
	private CarColorService colorService;
	
	@RequestMapping(value = "/showAllCarColors", method = RequestMethod.GET)
	public String getAllCarColors(Model model){
		List<CarColor> carColors = colorService.getAllCarColors();
		model.addAttribute("allCarColors", carColors);
		return "carcolor/show-car-colors";
	}
	
	@RequestMapping(value = "/createColor", method = RequestMethod.GET)
	public String addColor(Model model) {
		model.addAttribute("color", new CarColor());
		return "carcolor/addNewColor";
	}
	
	@RequestMapping(value = "/saveColor", method = RequestMethod.POST)
	public String saveColorToDB(@ModelAttribute("color") CarColor carColor) {
		colorService.saveCarColor(carColor);
		return "redirect:/showAllCarColors?message=true";
	}
		   
}
