package com.julio.korber.controller;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.julio.korber.service.TripRecordService;

import io.swagger.annotations.ApiOperation;

@RestController
class UploadDataController {
	
	@Autowired
	private TripRecordService tripRecordService;

	/**
	 * NOT WORKING
	 * This endpoint should be used to upload and store Yellow Taxi information data on database
	 * It should be 2 more for Green Taxi and Zones
	 * 
	 * @param entity
	 */
	@ApiOperation("NOT WORKING - Allows user to upload .csv file and store the data in database")
    @RequestMapping(value = "/upload/yellow", method = RequestMethod.POST, consumes = "application/octet-stream")
    @ResponseStatus(HttpStatus.CREATED)
    void storeAsset(RequestEntity<InputStream> entity) {
    	tripRecordService.uploadTaxiTrip(entity.getBody());
    }
}