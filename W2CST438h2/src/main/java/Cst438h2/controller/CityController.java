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
	
	/**Comments from George
	 * You should not be using a ResponseEntity here. The ResponseEntity is for the Rest
	 * Controller. This needs to be setup and tested similar to how we did HW1. When navigating
	 * to localhost:8080/cities/<city> you should be able to see the returned data. So, I could
	 *  not verify the other downstream modules are working through this controller.
	 * 
	 *  So, add two templates for the two conditions, data and no data returned, and then
	 *  change this method to something that will return data from the query. Here
	 *  is how I wrote mine:
	 *  
		public String getCityInfo(@PathVariable("city") String cityName, Model model) {
		
		CityInfo cityInfo = cityService.getCityInfo(cityName);
		
		if (cityInfo != null) {
			model.addAttribute("cityInfo", cityInfo);
			return "city_info";
		}
		else {
			model.addAttribute("time", new java.util.Date().toString());
			return "error";
		}
     } 
	 * 
	 */
	
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