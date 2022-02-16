
package com.coronatracker.controller;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.coronatracker.entity.CovidData;
import com.coronatracker.repository.CovidDataRepository;

@Scope(value = "session")
@Component(value = "covidDataController")
@ELBeanName(value = "covidDataController")
@Join(path = "/coviddata", to = "/coviddata/coviddata-form.jsf")
public class CovidDataController {
	@Autowired
	private CovidDataRepository covidDataRepository;

	private CovidData covidData = new CovidData();
	
	public String save(CovidData covidData) {
		covidDataRepository.save(covidData);
		covidData = new CovidData();
		return "/coviddata/coviddata-form.xhtml?faces-redirect=true";
	}
	
	public CovidData getCovidData() {
		return covidData;
	}
}
