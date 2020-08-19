package com.test.SmartyPants.bean;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.test.SmartyPants.modals.Country;
import com.test.SmartyPants.service.CountryService;

@Service
public class CountryServiceBean implements CountryService {

	private final String URL = "restcountries-v1.p.rapidapi.com";
	
	private final RestTemplate restTemplate;
	
	public CountryServiceBean(RestTemplateBuilder builder) {

			this.restTemplate = builder.build();
	}
	
	@Override
	public ResponseEntity<Country> getCountry(String name) {
		
		/* String country = CountryService. */
		if(name != null && name.trim().length() >0 ) {
			
		}
	
		ResponseEntity<Country> country = restTemplate.getForEntity(URL, Country.class, name);
	
		return country;
		
	
	}

}
