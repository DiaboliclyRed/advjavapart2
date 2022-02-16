
package com.coronatracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coronatracker.entity.CovidData;

public interface CovidDataRepository extends JpaRepository<CovidData, Long> {

}
