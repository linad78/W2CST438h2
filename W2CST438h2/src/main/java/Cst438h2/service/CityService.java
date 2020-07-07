package Cst438h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Cst438h2.domain.City;
import Cst438h2.domain.CityRepository;
import Cst438h2.domain.CountryRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository cityRepository;

	@Autowired
	private CountryRepository countryRepository;

	@Autowired
	private WeatherService weatherService;
	@Autowired
	private CityService cityService;

	public City getCityInfo(String cityName) {
		List<City> cityList = cityRepository.findByName(cityName);
		if (cityList.size() == 0)

			return null;
		else
			return cityList.get(0);

	}

	public CityRepository getCityRepository() {
		return cityRepository;
	}

	public void setCityRepository(CityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}

	public CountryRepository getCountryRepository() {
		return countryRepository;
	}

	public void setCountryRepository(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	public WeatherService getWeatherService() {
		return weatherService;
	}

	public void setWeatherService(WeatherService weatherService) {
		this.weatherService = weatherService;
	}

	public double getTemp() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setTemp(double tempF) {
		// TODO Auto-generated method stub

	}

	public CityService getCityService() {
		return getCityService();
	}

	public void setCityService(CityService cityService) {
		this.cityService = cityService;
	}
	public double GetTemp(long temp) {
		 return  temp = Math.round((WeatherService.getTemp() - 273.15) * 9.0/5.0 + 32.0); 
		  
	}
	
}
