package Cst438h2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import Cst438h2.domain.City;
import Cst438h2.domain.CityInfo;
import Cst438h2.service.CityService;

@Controller
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@GetMapping("/cities/{city}")
	public ResponseEntity<Cst438h2.domain.City> getWeather(@PathVariable("city") String cityName, Model model, CityInfo Null) {

		// TODO Your code goes here
		

		
			City city = cityService.getCityInfo(cityName);
			if ( city == null) {
				
				// city name not found.  Send 404 return code.
				return new ResponseEntity<City>( HttpStatus.NOT_FOUND);
				
				
			} else {
				
				
			   
				// return 200 status code (OK) and city information in JSON format
				return new ResponseEntity<City>(city, HttpStatus.OK);
			}
		}
	
}