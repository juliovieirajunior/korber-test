package com.julio.korber.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.julio.korber.dto.entity.TripRecord;

public interface TripRecordRepository extends JpaRepository<TripRecord, Long>{

	/**
	 * 
	 * Fetch all Yellow Taxi trips using tripType field that is only used by Green Taxi trips 
	 */
	@Query("select tr from TripRecord tr WHERE tr.tripType IS NULL")
	public List<TripRecord> fetchYellowTrips();
	
}
