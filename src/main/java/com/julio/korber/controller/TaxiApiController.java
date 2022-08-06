package com.julio.korber.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.julio.korber.dto.entity.TripRecord;
import com.julio.korber.service.TripRecordService;

import io.swagger.annotations.ApiOperation;

@RestController
public class TaxiApiController {
	
	@Autowired
	private TripRecordService tripRecordService;
	
	@ApiOperation("NOT WORKING - Return a list of the first 5 zones order by number of total pickups or the number of total drop-offs")
	@PostMapping(value = "/top-zones")
	public ResponseEntity<List<TripRecord>> fetchTopZones(@RequestParam (required=true) String order) {
	    return ResponseEntity.ok(tripRecordService.fetchTopZones(order));	    
	}
	
	@ApiOperation("NOT WORKING - Return the sum of the pickups and drop-offs in just one zone and one date")
	@PostMapping(value = "/zone-trips")
	public ResponseEntity<List<TripRecord>> fetchZoneTrips(@RequestParam (required=true) Integer zone, @RequestParam (required=true) Date date) {
	    return ResponseEntity.ok(tripRecordService.fetchZoneTrips(zone, date));
	}
	
	@ApiOperation("NOT WORKING - Return data from the yellow trip file with pagination + filtering and multiple sort")
	@PostMapping(value = "/list-yellow")
	public ResponseEntity<List<TripRecord>> fetchYellowList() {
	    return ResponseEntity.ok(tripRecordService.fetchYellowTripList());
	}
	
}
