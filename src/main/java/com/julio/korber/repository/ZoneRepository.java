package com.julio.korber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.julio.korber.dto.entity.Zone;

@Repository
public interface ZoneRepository extends JpaRepository<Zone, Integer>{

}
