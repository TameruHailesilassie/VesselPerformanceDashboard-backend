package com.enerva.vesseledashboard.repositories;

import com.enerva.vesseledashboard.models.VesselReportDatum;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VesselReportRepository extends JpaRepository<VesselReportDatum, Integer> {
}
