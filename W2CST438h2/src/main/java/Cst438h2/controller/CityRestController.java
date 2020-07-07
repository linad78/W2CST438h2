package Cst438h2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import Cst438h2.domain.*;
import Cst438h2.service.CityService;
import Cst438h2.service.WeatherService;
import Cst438h2.domain.CityInfo;
import Cst438h2.domain.TempAndTime;

@RestController
public class CityRestController {
	
	@Autowired
	private CityService cityService;
	
	@Autowired
	private Cst438h2.service.WeatherService weatherService;
	
	@GetMapping("/api/cities/{city}")
	public ResponseEntity<CityInfo> getWeather(@PathVariable("city") String cityName) {
		City city = cityService.getCityInfo(cityName);
		if (city == null) {
			return new ResponseEntity<CityInfo>(HttpStatus.NOT_FOUND);
			
		}else {
			TempAndTime tt =weatherService.getTempAndTime(cityName);
			
		return new ResponseEntity<CityInfo>(HttpStatus.OK);
	}
	
}
}
