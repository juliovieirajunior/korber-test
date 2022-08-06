package com.julio.korber.dto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="TRIP_RECORD")
public class TripRecord {
	
	@Id
	@Column(name="TRIP_RECORD_ID")
	private String tripRecordId;
	
	@Column(name="VENDOR_ID")
	private String vendorId;

	@Column(name="PICKUP_DATETIME")
	private String pickupDatetime;

	@Column(name="DROPOFF_DATETIME")
	private String dropoffDatetime;

	@Column(name="PASSENGER_COUNT")
	private String passangerCount;

	@Column(name="TRIP_DISTANCE")
	private String tripDistance;

	@Column(name="PU_LOCATION_ID")
	private String puLocationId;

	@Column(name="DO_LOCATION_ID")
	private String doLocationId;

	@Column(name="RATE_CODE_ID")
	private String rateCodeId;

	@Column(name="STORE_AND_FWD_FLAG")
	private String storeFlag;

	@Column(name="PAYMENT_TYPE")
	private String paymentType;

	@Column(name="FARE_AMOUNT")
	private String fareAmount;

	@Column(name="EXTRA")
	private String extra;

	@Column(name="MTA_TAX")
	private String mtaTax;

	@Column(name="IMPROVEMENT_SURCHARGE")
	private String improvementSurcharge;

	@Column(name="TIP_AMOUNT")
	private String tipAmount;

	@Column(name="TOLLS_AMOUNT")
	private String tollsAmount;

	@Column(name="TOTAL_AMOUNT")
	private String totalAmount;

	@Column(name="CONGESTION_SURCHARGE")
	private String congestionSurcharge;

	@Column(name="AIRPORT_FEE")
	private String airportFee;

	@Column(name="TRIP_TYPE")
	private String tripType;
}
