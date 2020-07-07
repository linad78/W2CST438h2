package Cst438h2.controller;

import com.fasterxml.jackson.databind.ObjectMapper;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import Cst438h2.domain.City;
import Cst438h2.domain.CityInfo;
import Cst438h2.domain.Country;
import Cst438h2.service.CityService;

@RunWith(SpringRunner.class)
@WebMvcTest(CityRestController.class)
public class CityRestControllerTest {

	@MockBean
	private CityService cityService;

	@Autowired
	
	private MockMvc mvc;

	// This object will be magically initialized by the initFields method below.
	private JacksonTester<CityInfo> json;

	@Before
	public void setup() {
		JacksonTester.initFields(this, new ObjectMapper());
	}
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void getCityInfo() throws Exception {
		
		       
				City cityInfo = new City(1, "TestCity","TST", "DistrictTest", 100000, 0, 0, null);
				

				
				given(cityService.getCityInfo("TestCity")).willReturn(cityInfo);
				
				

				
				MockHttpServletResponse response = mvc.perform(get("/api/cities/TestCity"))
						.andReturn().getResponse();
						

			
				assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
				
				CityInfo cityResult = json.parseObject(response.getContentAsString());
				
				
				
			    
				assertThat(cityResult).isEqualTo(cityResult);
				
			}

		}
