package com.carWasher.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.carWasher.dao.jpa.CarWasherRepository;
import com.carWasher.model.Car;

@RestController
///Añadirle endpoint al que pertenece toda esta clase
@RequestMapping("/carWasherController")
public class CarWasherController {

	
	@Autowired
	private CarWasherRepository repository;
	///Añadirle  endpoint al que pertenece el metodo, se suma con el global de la clase
	@RequestMapping("/cacheBustingTest")
	public ModelAndView cacheBustinTest() {
		ModelAndView modelAndView = new ModelAndView();
		//Va a la vista llamada cache test y la retorna
		modelAndView.setViewName("cacheBustingTest");

		return modelAndView;
	}
	
	
	@RequestMapping("/car/{id}")
	public Car getCar(@PathVariable int id) {
		return repository.getCar(id);
	}
	
	
	@RequestMapping("/cars")
	public List<Car> getCars() {
		return repository.getCars();
	}

}
