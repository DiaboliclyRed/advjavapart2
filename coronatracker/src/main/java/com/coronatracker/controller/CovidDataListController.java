package com.coronatracker.controller;

import java.util.List;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.RequestAction;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.coronatracker.entity.CovidData;
import com.coronatracker.repository.CovidDataRepository;

@Scope(value = "session")
@Component(value = "listCovidDatas")
@ELBeanName(value = "listCovidDatas")
@Join(path = "/", to = "/coviddata/product-list.jsf")
public class CovidDataListController {
	@Autowired
	private CovidDataRepository covidDataRepository;

	private List<CovidData> covidDatas;

	@Deferred
	@RequestAction
	@IgnorePostback
	public void loadData() {
		covidDatas = covidDataRepository.findAll();
	}

	public List<CovidData> getCovidDatas() {
		return covidDatas;
	}

	public String delete(CovidData covidData) {
		covidDataRepository.delete(covidData);
		loadData();
		return null;
	}
}