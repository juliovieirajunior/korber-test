package com.julio.korber.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julio.korber.dto.entity.TripRecord;
import com.julio.korber.repository.TripRecordRepository;

@Service
public class TripRecordService {


	
	@Autowired
	private TripRecordRepository tripRepo;
	
	/**
	 * Fetch Top 5 Zones and order them by given parameter
	 */
	public List<TripRecord> fetchTopZones(String order) {
		return Collections.emptyList();
	}
	
	/**
	 * Fetch 
	 */
	public List<TripRecord> fetchZoneTrips(Integer zone, Date date){
		return Collections.emptyList();
	} 
	
	/**
	 * Fetch all Yellow Taxis Trips
	 */
	public List<TripRecord>fetchYellowTripList() {
		return tripRepo.fetchYellowTrips();
	}
	
	
	/**
	 * Reads .csv and save to Database
	 */
	public void uploadTaxiTrip(InputStream input) {
		
	    List<TripRecord> tripList = new ArrayList<TripRecord>();
		
	      try {
		      BufferedReader br = new BufferedReader(new InputStreamReader(input));
		      tripList = br.lines().map(mapToItem).collect(Collectors.toList());

			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    tripRepo.saveAll(tripList);

	}
	
	/**
	 * Aux function to map .csv value to TripRecordEntity
	 */
	private Function<String, TripRecord> mapToItem = (line) -> {
	  String[] trip = line.split(",");
	  TripRecord tripRecord = new TripRecord();
	  tripRecord.setVendorId(trip[0]);
	  tripRecord.setPickupDatetime(trip[1]);
	  tripRecord.setDropoffDatetime(trip[2]);
	  tripRecord.setPuLocationId(trip[5]);
	  tripRecord.setDoLocationId(trip[6]);
	  tripRecord.setTripType(trip[18]);
	  return tripRecord;
	};
	
	
	
}
