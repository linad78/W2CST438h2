package Cst438h2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="city")
public class City {
	
	@Id
	private long id;
	private String name;
	@Column(name="countrycode")
	private String countryCode;
	private String district;
	private int population;
	
	
	public City(int i, String string, String string2, String string3, 
			Object object, int j, int k, Country country) {
		this(0, "name", "code", "district", 0);
	}

	//GEORGE: consider renaming the district variable "district" instead of "string", and population instead of "i"
	public City(long id, String name, String countryCode, String string, int i) { 
		super();
		this.id = id;
		this.name = name;
		this.countryCode = countryCode;
		this.district = string;
		this.population = i;

	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", countryCode=" + countryCode + ", district=" + district
				+ ", population=" + population 
				+ "]";
	}

	public void setWeather(Cst438h2.service.CityService cityService) {
		// TODO Auto-generated method stub
		
	}
}

/**
 * George's Comments
 * 
 * I'm not sure what the setWeather function is supposed to do, but there is no code, so 
 * right now it does nothing.
 * 
 * Please see in-line comments
 * 
 */
