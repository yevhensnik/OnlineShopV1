package shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.domain.CarBrand;
import shop.service.CarBrandModelService;
import shop.service.CarBrandService;

@Controller
public class CarBrandController {
	@Autowired
	private CarBrandService carBrandService;
	
	@Autowired
	private CarBrandModelService carBrandModelService;
	
	@RequestMapping(value = "/showAllCarBrands", method = RequestMethod.GET)
	public String showAllShowpieces(Model model) {
		model.addAttribute("carbrands", carBrandService.getAllCarBrands());
		model.addAttribute("carbrandmodels", carBrandModelService.getAllCarBrandModels());
		return "carbrand/show-carbrand";
	}

	@RequestMapping(value = "/createCarBrand", method = RequestMethod.GET)
	public String createShowpiece(Model model) {
		model.addAttribute("carbrand", new CarBrand());
		model.addAttribute("carbrandmodels", carBrandModelService.getAllCarBrandModels());
		return "carbrand/new-carbrand";
	}

	@RequestMapping(value = "/createCarBrand", method = RequestMethod.POST)
	public String createShowpiece(@RequestParam("name") String name,
			@RequestParam("brandModelId") Long brandModelId) {
		CarBrand carBrand = new CarBrand(name);
		carBrand.setCarBrandModel(carBrandModelService.findOneById(brandModelId));
		carBrandService.saveCarBrand(carBrand);
		return "redirect:/showAllCarBrands?message=true";
	}

	@RequestMapping(value = "/deleteCarBrand", method = RequestMethod.GET)
	public String deleteShowpiece(@RequestParam("checkbox") Long[] id) {
		for (Long long1 : id) {
			carBrandService.deleteCarBrand(long1);
		}
		return "redirect:/showAllCarBrands?delete=true";
	}

	@RequestMapping(value = "/editCarBrand/{id}", method = RequestMethod.GET)
	public String editSchedule(@PathVariable("id") Long id, Model model) {
		model.addAttribute("carbrand", carBrandService.findOneById(id));
		model.addAttribute("carbrandmodels", carBrandModelService.getAllCarBrandModels());
		return "carbrand/showCarBrandPerUpdate";
	}
	
	@RequestMapping(value = "/editCarBrand", method = RequestMethod.POST)
	public String editSchedule(@ModelAttribute("carbrand") CarBrand carBrand, @RequestParam("carbrandmodelId") Long carbrandmodelId,
			 Model model) {
		carBrand.setCarBrandModel(carBrandModelService.findOneById(carbrandmodelId));
		carBrandService.updateCarBrand(carBrand);
		return "redirect:/showAllCarBrands?msg=true";
	}
}
