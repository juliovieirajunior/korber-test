package com.julio.korber.dto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="ZONE")
public class Zone {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="LOCATION_ID")
    private Integer id;
    
    @Column(name="BOROUGH")
    private String borough;
    
    @Column(name="ZONE")
    private String zone;
    
    @Column(name="SERVICE_ZONE")
    private String serviceZone;
    
}