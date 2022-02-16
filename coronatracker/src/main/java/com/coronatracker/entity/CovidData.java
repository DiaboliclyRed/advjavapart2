
package com.coronatracker.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CovidData")
public class CovidData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "iso_code")
	private String iso_code;
	
	@Column(name = "continent")
	private String continent;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "total_cases")
	private long total_cases;
	
	@Column(name = "new_cases")
	private long new_cases;
	
	@Column(name = "new_cases_smoothed")
	private float new_cases_smoothed;
	
	@Column(name = "total_deaths")
	private long total_deaths;
	
	@Column(name = "new_deaths")
	private long new_deaths;
	
	@Column(name = "new_deaths_smoothed")
	private float new_deaths_smoothed;
	
	@Column(name = "total_cases_per_million")
	private float total_cases_per_million;
	
	@Column(name = "new_cases_per_million")
	private float new_cases_per_million;
	
	@Column(name = "new_cases_smoothed_per_million")
	private float new_cases_smoothed_per_million;
	
	@Column(name = "total_deaths_per_million")
	private long total_deaths_per_million;
	
	@Column(name = "new_deaths_per_million")
	private long new_deaths_per_million;
	
	@Column(name = "new_deaths_smoothed_per_million")
	private long new_deaths_smoothed_per_million;
	
	@Column(name = "reproduction_rate")
	private float reproduction_rate;
	
	@Column(name = "icu_patients")
	private long icu_patients;
	
	@Column(name = "icu_patients_per_million")
	private float icu_patients_per_million;
	
	@Column(name = "hosp_patients")
	private long hosp_patients;
	
	@Column(name = "hosp_patients_per_million")
	private float hosp_patients_per_million;
	
	@Column(name = "weekly_icu_admissions")
	private long weekly_icu_admissions;
	
	@Column(name = "weekly_icu_admissions_per_million")
	private float weekly_icu_admissions_per_million;
	
	@Column(name = "weekly_hosp_admissions")
	private long weekly_hosp_admissions;
	
	@Column(name = "weekly_hosp_admissions_per_million")
	private float weekly_hosp_admissions_per_million;
	
	@Column(name = "new_tests")
	private long new_tests;
	
	@Column(name = "total_tests")
	private long total_tests;
	
	@Column(name = "total_tests_per_thousand")
	private float total_tests_per_thousand;
	
	@Column(name = "new_tests_per_thousand")
	private float new_tests_per_thousand;
	
	@Column(name = "new_tests_smoothed")
	private float new_tests_smoothed;
	
	@Column(name = "new_tests_smoothed_per_thousand")
	private float new_tests_smoothed_per_thousand;
	
	@Column(name = "positive_rate")
	private float positive_rate;
	
	@Column(name = "tests_per_case")
	private float tests_per_case;
	
	@Column(name = "tests_units")
	private float tests_units;
	
	@Column(name = "total_vaccinations")
	private long total_vaccinations;
	
	@Column(name = "people_vaccinated")
	private long people_vaccinated;
	
	@Column(name = "people_fully_vaccinated")
	private long people_fully_vaccinated;
	
	@Column(name = "total_boosters")
	private long total_boosters;
	
	@Column(name = "new_vaccinations")
	private long new_vaccinations;
	
	@Column(name = "new_vaccinations_smoothed")
	private float new_vaccinations_smoothed;
	
	@Column(name = "total_vaccinations_per_hundred")
	private float total_vaccinations_per_hundred;
	
	@Column(name = "people_vaccinated_per_hundred")
	private float people_vaccinated_per_hundred;
	
	@Column(name = "people_fully_vaccinated_per_hundred")
	private float people_fully_vaccinated_per_hundred;
	
	@Column(name = "total_boosters_per_hundred")
	private float total_boosters_per_hundred;
	
	@Column(name = "new_vaccinations_smoothed_per_million")
	private float new_vaccinations_smoothed_per_million;
	
	@Column(name = "new_people_vaccinated_smoothed")
	private float new_people_vaccinated_smoothed;
	
	@Column(name = "new_people_vaccinated_smoothed_per_hundred")
	private float new_people_vaccinated_smoothed_per_hundred;
	
	@Column(name = "stringency_index")
	private float stringency_index;
	
	@Column(name = "population")
	private long population;
	
	@Column(name = "population_density")
	private float population_density;
	
	@Column(name = "median_age")
	private float median_age;
	
	@Column(name = "aged_65_older")
	private float aged_65_older;
	
	@Column(name = "aged_70_older")
	private float aged_70_older;
	
	@Column(name = "gdp_per_capita")
	private float gdp_per_capita;
	
	@Column(name = "extreme_poverty")
	private float extreme_poverty;
	
	@Column(name = "cardiovasc_death_rate")
	private float cardiovasc_death_rate;
	
	@Column(name = "diabetes_prevalence")
	private float diabetes_prevalence;
	
	@Column(name = "female_smokers")
	private float female_smokers;
	
	@Column(name = "male_smokers")
	private float male_smokers;
	
	@Column(name = "handwashing_facilities")
	private float handwashing_facilities;
	
	@Column(name = "hospital_beds_per_thousand")
	private float hospital_beds_per_thousand;
	
	@Column(name = "life_expectancy")
	private float life_expectancy;
	
	@Column(name = "human_development_index")
	private float human_development_index;
	
	@Column(name = "excess_mortality_cumulative_absolute")
	private float excess_mortality_cumulative_absolute;
	
	@Column(name = "excess_mortality_cumulative")
	private float excess_mortality_cumulative;
	
	@Column(name = "excess_mortality")
	private float excess_mortality;
	
	@Column(name = "excess_mortality_cumulative_per_million")
	private float excess_mortality_cumulative_per_million;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIso_code() {
		return iso_code;
	}

	public void setIso_code(String iso_code) {
		this.iso_code = iso_code;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public long getTotal_cases() {
		return total_cases;
	}

	public void setTotal_cases(long total_cases) {
		this.total_cases = total_cases;
	}

	public long getNew_cases() {
		return new_cases;
	}

	public void setNew_cases(long new_cases) {
		this.new_cases = new_cases;
	}

	public float getNew_cases_smoothed() {
		return new_cases_smoothed;
	}

	public void setNew_cases_smoothed(float new_cases_smoothed) {
		this.new_cases_smoothed = new_cases_smoothed;
	}

	public long getTotal_deaths() {
		return total_deaths;
	}

	public void setTotal_deaths(long total_deaths) {
		this.total_deaths = total_deaths;
	}

	public long getNew_deaths() {
		return new_deaths;
	}

	public void setNew_deaths(long new_deaths) {
		this.new_deaths = new_deaths;
	}

	public float getNew_deaths_smoothed() {
		return new_deaths_smoothed;
	}

	public void setNew_deaths_smoothed(float new_deaths_smoothed) {
		this.new_deaths_smoothed = new_deaths_smoothed;
	}

	public float getTotal_cases_per_million() {
		return total_cases_per_million;
	}

	public void setTotal_cases_per_million(float total_cases_per_million) {
		this.total_cases_per_million = total_cases_per_million;
	}

	public float getNew_cases_per_million() {
		return new_cases_per_million;
	}

	public void setNew_cases_per_million(float new_cases_per_million) {
		this.new_cases_per_million = new_cases_per_million;
	}

	public float getNew_cases_smoothed_per_million() {
		return new_cases_smoothed_per_million;
	}

	public void setNew_cases_smoothed_per_million(float new_cases_smoothed_per_million) {
		this.new_cases_smoothed_per_million = new_cases_smoothed_per_million;
	}

	public long getTotal_deaths_per_million() {
		return total_deaths_per_million;
	}

	public void setTotal_deaths_per_million(long total_deaths_per_million) {
		this.total_deaths_per_million = total_deaths_per_million;
	}

	public long getNew_deaths_per_million() {
		return new_deaths_per_million;
	}

	public void setNew_deaths_per_million(long new_deaths_per_million) {
		this.new_deaths_per_million = new_deaths_per_million;
	}

	public long getNew_deaths_smoothed_per_million() {
		return new_deaths_smoothed_per_million;
	}

	public void setNew_deaths_smoothed_per_million(long new_deaths_smoothed_per_million) {
		this.new_deaths_smoothed_per_million = new_deaths_smoothed_per_million;
	}

	public float getReproduction_rate() {
		return reproduction_rate;
	}

	public void setReproduction_rate(float reproduction_rate) {
		this.reproduction_rate = reproduction_rate;
	}

	public long getIcu_patients() {
		return icu_patients;
	}

	public void setIcu_patients(long icu_patients) {
		this.icu_patients = icu_patients;
	}

	public float getIcu_patients_per_million() {
		return icu_patients_per_million;
	}

	public void setIcu_patients_per_million(float icu_patients_per_million) {
		this.icu_patients_per_million = icu_patients_per_million;
	}

	public long getHosp_patients() {
		return hosp_patients;
	}

	public void setHosp_patients(long hosp_patients) {
		this.hosp_patients = hosp_patients;
	}

	public float getHosp_patients_per_million() {
		return hosp_patients_per_million;
	}

	public void setHosp_patients_per_million(float hosp_patients_per_million) {
		this.hosp_patients_per_million = hosp_patients_per_million;
	}

	public long getWeekly_icu_admissions() {
		return weekly_icu_admissions;
	}

	public void setWeekly_icu_admissions(long weekly_icu_admissions) {
		this.weekly_icu_admissions = weekly_icu_admissions;
	}

	public float getWeekly_icu_admissions_per_million() {
		return weekly_icu_admissions_per_million;
	}

	public void setWeekly_icu_admissions_per_million(float weekly_icu_admissions_per_million) {
		this.weekly_icu_admissions_per_million = weekly_icu_admissions_per_million;
	}

	public long getWeekly_hosp_admissions() {
		return weekly_hosp_admissions;
	}

	public void setWeekly_hosp_admissions(long weekly_hosp_admissions) {
		this.weekly_hosp_admissions = weekly_hosp_admissions;
	}

	public float getWeekly_hosp_admissions_per_million() {
		return weekly_hosp_admissions_per_million;
	}

	public void setWeekly_hosp_admissions_per_million(float weekly_hosp_admissions_per_million) {
		this.weekly_hosp_admissions_per_million = weekly_hosp_admissions_per_million;
	}

	public long getNew_tests() {
		return new_tests;
	}

	public void setNew_tests(long new_tests) {
		this.new_tests = new_tests;
	}

	public long getTotal_tests() {
		return total_tests;
	}

	public void setTotal_tests(long total_tests) {
		this.total_tests = total_tests;
	}

	public float getTotal_tests_per_thousand() {
		return total_tests_per_thousand;
	}

	public void setTotal_tests_per_thousand(float total_tests_per_thousand) {
		this.total_tests_per_thousand = total_tests_per_thousand;
	}

	public float getNew_tests_per_thousand() {
		return new_tests_per_thousand;
	}

	public void setNew_tests_per_thousand(float new_tests_per_thousand) {
		this.new_tests_per_thousand = new_tests_per_thousand;
	}

	public float getNew_tests_smoothed() {
		return new_tests_smoothed;
	}

	public void setNew_tests_smoothed(float new_tests_smoothed) {
		this.new_tests_smoothed = new_tests_smoothed;
	}

	public float getNew_tests_smoothed_per_thousand() {
		return new_tests_smoothed_per_thousand;
	}

	public void setNew_tests_smoothed_per_thousand(float new_tests_smoothed_per_thousand) {
		this.new_tests_smoothed_per_thousand = new_tests_smoothed_per_thousand;
	}

	public float getPositive_rate() {
		return positive_rate;
	}

	public void setPositive_rate(float positive_rate) {
		this.positive_rate = positive_rate;
	}

	public float getTests_per_case() {
		return tests_per_case;
	}

	public void setTests_per_case(float tests_per_case) {
		this.tests_per_case = tests_per_case;
	}

	public float getTests_units() {
		return tests_units;
	}

	public void setTests_units(float tests_units) {
		this.tests_units = tests_units;
	}

	public long getTotal_vaccinations() {
		return total_vaccinations;
	}

	public void setTotal_vaccinations(long total_vaccinations) {
		this.total_vaccinations = total_vaccinations;
	}

	public long getPeople_vaccinated() {
		return people_vaccinated;
	}

	public void setPeople_vaccinated(long people_vaccinated) {
		this.people_vaccinated = people_vaccinated;
	}

	public long getPeople_fully_vaccinated() {
		return people_fully_vaccinated;
	}

	public void setPeople_fully_vaccinated(long people_fully_vaccinated) {
		this.people_fully_vaccinated = people_fully_vaccinated;
	}

	public long getTotal_boosters() {
		return total_boosters;
	}

	public void setTotal_boosters(long total_boosters) {
		this.total_boosters = total_boosters;
	}

	public long getNew_vaccinations() {
		return new_vaccinations;
	}

	public void setNew_vaccinations(long new_vaccinations) {
		this.new_vaccinations = new_vaccinations;
	}

	public float getNew_vaccinations_smoothed() {
		return new_vaccinations_smoothed;
	}

	public void setNew_vaccinations_smoothed(float new_vaccinations_smoothed) {
		this.new_vaccinations_smoothed = new_vaccinations_smoothed;
	}

	public float getTotal_vaccinations_per_hundred() {
		return total_vaccinations_per_hundred;
	}

	public void setTotal_vaccinations_per_hundred(float total_vaccinations_per_hundred) {
		this.total_vaccinations_per_hundred = total_vaccinations_per_hundred;
	}

	public float getPeople_vaccinated_per_hundred() {
		return people_vaccinated_per_hundred;
	}

	public void setPeople_vaccinated_per_hundred(float people_vaccinated_per_hundred) {
		this.people_vaccinated_per_hundred = people_vaccinated_per_hundred;
	}

	public float getPeople_fully_vaccinated_per_hundred() {
		return people_fully_vaccinated_per_hundred;
	}

	public void setPeople_fully_vaccinated_per_hundred(float people_fully_vaccinated_per_hundred) {
		this.people_fully_vaccinated_per_hundred = people_fully_vaccinated_per_hundred;
	}

	public float getTotal_boosters_per_hundred() {
		return total_boosters_per_hundred;
	}

	public void setTotal_boosters_per_hundred(float total_boosters_per_hundred) {
		this.total_boosters_per_hundred = total_boosters_per_hundred;
	}

	public float getNew_vaccinations_smoothed_per_million() {
		return new_vaccinations_smoothed_per_million;
	}

	public void setNew_vaccinations_smoothed_per_million(float new_vaccinations_smoothed_per_million) {
		this.new_vaccinations_smoothed_per_million = new_vaccinations_smoothed_per_million;
	}

	public float getNew_people_vaccinated_smoothed() {
		return new_people_vaccinated_smoothed;
	}

	public void setNew_people_vaccinated_smoothed(float new_people_vaccinated_smoothed) {
		this.new_people_vaccinated_smoothed = new_people_vaccinated_smoothed;
	}

	public float getNew_people_vaccinated_smoothed_per_hundred() {
		return new_people_vaccinated_smoothed_per_hundred;
	}

	public void setNew_people_vaccinated_smoothed_per_hundred(float new_people_vaccinated_smoothed_per_hundred) {
		this.new_people_vaccinated_smoothed_per_hundred = new_people_vaccinated_smoothed_per_hundred;
	}

	public float getStringency_index() {
		return stringency_index;
	}

	public void setStringency_index(float stringency_index) {
		this.stringency_index = stringency_index;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public float getPopulation_density() {
		return population_density;
	}

	public void setPopulation_density(float population_density) {
		this.population_density = population_density;
	}

	public float getMedian_age() {
		return median_age;
	}

	public void setMedian_age(float median_age) {
		this.median_age = median_age;
	}

	public float getAged_65_older() {
		return aged_65_older;
	}

	public void setAged_65_older(float aged_65_older) {
		this.aged_65_older = aged_65_older;
	}

	public float getAged_70_older() {
		return aged_70_older;
	}

	public void setAged_70_older(float aged_70_older) {
		this.aged_70_older = aged_70_older;
	}

	public float getGdp_per_capita() {
		return gdp_per_capita;
	}

	public void setGdp_per_capita(float gdp_per_capita) {
		this.gdp_per_capita = gdp_per_capita;
	}

	public float getExtreme_poverty() {
		return extreme_poverty;
	}

	public void setExtreme_poverty(float extreme_poverty) {
		this.extreme_poverty = extreme_poverty;
	}

	public float getCardiovasc_death_rate() {
		return cardiovasc_death_rate;
	}

	public void setCardiovasc_death_rate(float cardiovasc_death_rate) {
		this.cardiovasc_death_rate = cardiovasc_death_rate;
	}

	public float getDiabetes_prevalence() {
		return diabetes_prevalence;
	}

	public void setDiabetes_prevalence(float diabetes_prevalence) {
		this.diabetes_prevalence = diabetes_prevalence;
	}

	public float getFemale_smokers() {
		return female_smokers;
	}

	public void setFemale_smokers(float female_smokers) {
		this.female_smokers = female_smokers;
	}

	public float getMale_smokers() {
		return male_smokers;
	}

	public void setMale_smokers(float male_smokers) {
		this.male_smokers = male_smokers;
	}

	public float getHandwashing_facilities() {
		return handwashing_facilities;
	}

	public void setHandwashing_facilities(float handwashing_facilities) {
		this.handwashing_facilities = handwashing_facilities;
	}

	public float getHospital_beds_per_thousand() {
		return hospital_beds_per_thousand;
	}

	public void setHospital_beds_per_thousand(float hospital_beds_per_thousand) {
		this.hospital_beds_per_thousand = hospital_beds_per_thousand;
	}

	public float getLife_expectancy() {
		return life_expectancy;
	}

	public void setLife_expectancy(float life_expectancy) {
		this.life_expectancy = life_expectancy;
	}

	public float getHuman_development_index() {
		return human_development_index;
	}

	public void setHuman_development_index(float human_development_index) {
		this.human_development_index = human_development_index;
	}

	public float getExcess_mortality_cumulative_absolute() {
		return excess_mortality_cumulative_absolute;
	}

	public void setExcess_mortality_cumulative_absolute(float excess_mortality_cumulative_absolute) {
		this.excess_mortality_cumulative_absolute = excess_mortality_cumulative_absolute;
	}

	public float getExcess_mortality_cumulative() {
		return excess_mortality_cumulative;
	}

	public void setExcess_mortality_cumulative(float excess_mortality_cumulative) {
		this.excess_mortality_cumulative = excess_mortality_cumulative;
	}

	public float getExcess_mortality() {
		return excess_mortality;
	}

	public void setExcess_mortality(float excess_mortality) {
		this.excess_mortality = excess_mortality;
	}

	public float getExcess_mortality_cumulative_per_million() {
		return excess_mortality_cumulative_per_million;
	}

	public void setExcess_mortality_cumulative_per_million(float excess_mortality_cumulative_per_million) {
		this.excess_mortality_cumulative_per_million = excess_mortality_cumulative_per_million;
	}
}
