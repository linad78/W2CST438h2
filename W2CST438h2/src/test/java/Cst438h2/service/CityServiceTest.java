package Cst438h2.service;
 
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import Cst438h2.domain.City;
import Cst438h2.domain.CityInfo;
import Cst438h2.domain.CityRepository;
import Cst438h2.domain.Country;
import Cst438h2.domain.CountryRepository;
import Cst438h2.domain.TempAndTime;
 
@SpringBootTest
public class CityServiceTest {

	@MockBean
	private WeatherService weatherService;
	
	@Autowired
	private CityService cityService;
	
	@MockBean
	private CityRepository cityRepository;
	
	@MockBean
	private CountryRepository countryRepository;

	
	@Test
	public void contextLoads() {
	}


	@Test
	public void testCityFound() throws Exception {
		
			
			        Country country = new Country("TST", "Test");
					City city = new City(1, "TestCity","TST", "DistrictTest",  100000);
					List<City> cities = new ArrayList<City>();
					cities.add(city);
					
					given(weatherService.getTempAndTime("TestCity")).willReturn(new TempAndTime(0, 0, 0));
					
					given(cityRepository.findByName("TestCity")).willReturn(cities);
		
					City cityResult = cityService.getCityInfo("TestCity");
					CityInfo cityResult1 =new CityInfo(1,"TestCity","TST", "DistrictTest",  null, 100000, 0, null);
					
					assertThat(cityResult1).isEqualTo(cityResult1);
					
				}
		// TODO 
	
	
	@Test 
	public void  testCityNotFound() {
		
		// TODO 
		Country country = new Country("TST", "Test");
		City city = new City(1, "TestCity","TST", "DistrictTest",  100000);
		List<City> cities = new ArrayList<City>();
		cities.add(city);
		
		given(weatherService.getTempAndTime("TestCity")).willReturn(new TempAndTime(0, 0, 0));
		
		given(cityRepository.findByName("TestCity")).willReturn(cities);
		City cityResult = cityService.getCityInfo("TestCity");
		CityInfo cityResult1 =  null;
		
		assertThat(cityResult1).isEqualTo(cityResult1);
		
	}
	
	@Test 
	public void  testCityMultiple() {
		// TODO 
		
	}

}
