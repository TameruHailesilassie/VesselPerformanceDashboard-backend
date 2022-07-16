package com.enerva.vesseledashboard.models;

import java.math.BigDecimal;
import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Table1 {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "VesselReportID", nullable = false)
    private Integer vesselReportID;

    @Column(name = "\"Vessel Name\"", length = 256)
    private String vesselName;

    @Column(name = "\"Report closing Date\"")
    private Instant reportClosingDate;

    @Column(name = "\"Report type\"", length = 256)
    private String reportType;

    @Column(name = "\"Report period\"", precision = 30, scale = 10)
    private BigDecimal reportPeriod;

    @Column(name = "\"Mean Druaght\"", precision = 30, scale = 10)
    private BigDecimal meanDruaght;

    @Column(name = "Beaufort_force", precision = 30, scale = 10)
    private BigDecimal beaufortForce;

    @Column(name = "\"Wave Height\"", precision = 30, scale = 10)
    private BigDecimal waveHeight;

    @Column(name = "\"Logged Speed\"", precision = 30, scale = 10)
    private BigDecimal loggedSpeed;

    @Column(name = "\"Observed Speed\"", precision = 30, scale = 10)
    private BigDecimal observedSpeed;

    @Column(name = "\"ME cons./24h (HFO)\"", precision = 30, scale = 10)
    private BigDecimal mECons24hHFO;

    @Column(name = "\"ME cons./24h (MGO)\"", precision = 30, scale = 10)
    private BigDecimal mECons24hMGO;

    @Column(name = "\"Total ME cons./24h\"", precision = 30, scale = 10)
    private BigDecimal totalMECons24h;

    @Column(name = "\"AE cons./24h (HFO)\"", precision = 30, scale = 10)
    private BigDecimal aECons24hHFO;

    @Column(name = "\"AE cons./24h (MGO)\"", precision = 30, scale = 10)
    private BigDecimal aECons24hMGO;

    @Column(name = "\"Total AE cons./24h\"", precision = 30, scale = 10)
    private BigDecimal totalAECons24h;

    @Column(name = "\"Blr cons./24h (HFO)\"", precision = 30, scale = 10)
    private BigDecimal blrCons24hHFO;

    @Column(name = "\"Blr cons./24h (MGO)\"", precision = 30, scale = 10)
    private BigDecimal blrCons24hMGO;

    @Column(name = "\"Total Blr. Cons./24h\"", precision = 30, scale = 10)
    private BigDecimal totalBlrCons24h;

    @Column(name = "\"Total Cons. /24h(HFO)\"", precision = 30, scale = 10)
    private BigDecimal totalCons24hHFO;

    @Column(name = "\"Total Cons. /24h(MGO)\"", precision = 30, scale = 10)
    private BigDecimal totalCons24hMGO;

    @Column(name = "RPM", precision = 30, scale = 10)
    private BigDecimal rpm;

    @Column(name = "\"% RPM\"", precision = 30, scale = 10)
    private BigDecimal Rpm;

    @Column(name = "\"ME Rhrs\"", precision = 30, scale = 10)
    private BigDecimal mERhrs;

    @Column(name = "\"ME Reported Power (kW)\"", precision = 30, scale = 10)
    private BigDecimal mEReportedPowerKW;

    @Column(name = "\"%MCR\"", precision = 30, scale = 10)
    private BigDecimal Mcr;

    @Column(name = "\"ME SFOC\"", precision = 30, scale = 10)
    private BigDecimal meSfoc;

    @Column(name = "\"AE% MCR\"", precision = 30, scale = 10)
    private BigDecimal aeMcr;

    @Column(name = "\"AE LOAD\"", precision = 30, scale = 10)
    private BigDecimal aeLoad;

    @Column(name = "\"No. of A.E in use\"", precision = 30, scale = 10)
    private BigDecimal noOfAEInUse;

    @Column(name = "\"ME SLOC\"", precision = 30, scale = 10)
    private BigDecimal meSloc;

    @Column(name = "\"Current\"", precision = 30, scale = 10)
    private BigDecimal current;

    @Column(name = "\"Week no.\"")
    private Integer weekNo;

    @Column(name = "\"Year\"")
    private Integer year;

    @Column(name = "\"Month\"", length = 3)
    private String month;

    @Column(name = "\"Week number\"", length = 16)
    private String weekNumber;

    @Column(name = "\"Port peroid\"", precision = 30, scale = 10)
    private BigDecimal portPeroid;

    @Column(name = "\"Sea Period\"", precision = 30, scale = 10)
    private BigDecimal seaPeriod;

    @Column(name = "Mileage", precision = 30, scale = 10)
    private BigDecimal mileage;

    @Column(name = "\"Load Condition\"", length = 16)
    private String loadCondition;

    @Column(name = "\"Propeller True Slip%\"", precision = 30, scale = 10)
    private BigDecimal propellerTrueSlip;

    @Column(name = "\"Propeller Apparent Slip%\"", precision = 30, scale = 10)
    private BigDecimal propellerApparentSlip;

    @Column(name = "\"ME Power based on Fuel\"", precision = 30, scale = 10)
    private BigDecimal mEPowerBasedOnFuel;

    @Column(name = "\"ME Power more than 50% MCR\"", length = 16)
    private String mEPowerMoreThan50MCR;

    @Column(name = "\"Report period more than 4 hours?\"", length = 16)
    private String reportPeriodMoreThan4Hours;

    @Column(name = "\"Voyage Number\"", length = 256)
    private String voyageNumber;

    @Column(name = "\"Manoeuvring / Port / Sea\"", length = 128)
    private String manoeuvringPortSea;

    @Column(name = "\"Sea Water Temperature\"", precision = 30, scale = 10)
    private BigDecimal seaWaterTemperature;

    @Column(name = "\"Engine Room Temperature\"", precision = 30, scale = 10)
    private BigDecimal engineRoomTemperature;

    @Column(name = "\"ECA Status\"", length = 256)
    private String eCAStatus;

    @Column(name = "\"Port Limit status\"", length = 256)
    private String portLimitStatus;

    @Column(name = "\"EU Voyage?\"", length = 256)
    private String eUVoyage;

    @Column(name = "\"Total HFO cons. (Method A)\"", precision = 29, scale = 18)
    private BigDecimal totalHFOConsMethodA;

    @Column(name = "\"Total LSHFO cons. (Method A)\"", precision = 29, scale = 18)
    private BigDecimal totalLSHFOConsMethodA;

    @Column(name = "\"Total MGO Cons. (Method A)\"", precision = 29, scale = 18)
    private BigDecimal totalMGOConsMethodA;

    @Column(name = "\"Total HFO Consumed (Method B)\"", precision = 29, scale = 18)
    private BigDecimal totalHFOConsumedMethodB;

    @Column(name = "\"Total LSHFO Consumed (Method B)\"", precision = 29, scale = 18)
    private BigDecimal totalLSHFOConsumedMethodB;

    @Column(name = "\"Total MGO consumed (Method B)\"", precision = 29, scale = 18)
    private BigDecimal totalMGOConsumedMethodB;

    @Column(name = "\"Total HFO Consumed (Method C)\"", precision = 29, scale = 18)
    private BigDecimal totalHFOConsumedMethodC;

    @Column(name = "\"Total MGO Consumed (Method C)\"", precision = 29, scale = 18)
    private BigDecimal totalMGOConsumedMethodC;

    @Column(name = "\"EU Voyage Status\"", length = 256)
    private String eUVoyageStatus;

    @Column(name = "Distance", length = 256)
    private String distance;

    @Column(name = "\"Time\"", length = 256)
    private String time;

    @Column(name = "\"Report Starting Date (UTC)\"", length = 256)
    private String reportStartingDateUTC;

    @Column(name = "\"Report closing Date(UTC)\"", length = 256)
    private String reportClosingDateUTC;

    @Column(name = "\"Transport Work\"", precision = 29)
    private BigDecimal transportWork;

    @Column(name = "\"Current less than 0.5 knots\"", length = 256)
    private String currentLessThan05Knots;

    @Column(name = "Latitude", precision = 30, scale = 10)
    private BigDecimal latitude;

    @Column(name = "Longitude", precision = 30, scale = 10)
    private BigDecimal longitude;

    @Column(name = "\"Vessel Manager\"", length = 256)
    private String vesselManager;

    @Column(name = "\"Fleet Group\"", length = 256)
    private String fleetGroup;

    @Column(name = "\"Masters Name\"", length = 256)
    private String mastersName;

    @Column(name = "\"Chief Engineers Name\"", length = 256)
    private String chiefEngineersName;

    @Column(name = "\"Reported value for Propeller curve\"", precision = 30, scale = 10)
    private BigDecimal reportedValueForPropellerCurve;

    @Column(name = "\"Light run value for this point\"", precision = 30, scale = 10)
    private BigDecimal lightRunValueForThisPoint;

    @Column(name = "\"% Excess power as compared to light run\"", precision = 30, scale = 10)
    private BigDecimal ExcessPowerAsComparedToLightRun;

    @Column(name = "\"Does the vessel have a torsionmeter?\"", length = 256)
    private String doesTheVesselHaveATorsionmeter;

    @Column(name = "\"Can burn HFO on A.E\"", length = 256)
    private String canBurnHFOOnAE;

    @Column(name = "\"Employment status\"", length = 256)
    private String employmentStatus;

    @Column(name = "\"Instructed Speed\"", precision = 30, scale = 10)
    private BigDecimal instructedSpeed;

    @Column(name = "\"CLO Cons.\"", precision = 30, scale = 10)
    private BigDecimal cLOCons;

    @Column(name = "\"Expected CLO Cons.\"", precision = 30, scale = 10)
    private BigDecimal expectedCLOCons;

    @Column(name = "\"ME kWh\"", precision = 30, scale = 10)
    private BigDecimal mEKWh;

    @Column(name = "\"Reported M.E MGO Consumption\"", precision = 30, scale = 10)
    private BigDecimal reportedMEMGOConsumption;

    @Column(name = "\"Reported A.E MGO Consumption\"", precision = 30, scale = 10)
    private BigDecimal reportedAEMGOConsumption;

    @Column(name = "\"Reported Boiler MGO Consumption\"", precision = 30, scale = 10)
    private BigDecimal reportedBoilerMGOConsumption;

    @Column(name = "\"Reported total HFO cons.\"", precision = 30, scale = 10)
    private BigDecimal reportedTotalHFOCons;

    @Column(name = "\"Reported Total MGO cons.\"", precision = 30, scale = 10)
    private BigDecimal reportedTotalMGOCons;

    @Column(name = "\"Sister Class\"", length = 256)
    private String sisterClass;

    @Column(name = "\"Cargo Carried\"", precision = 30, scale = 10)
    private BigDecimal cargoCarried;

    @Column(name = "Comments", length = 4000)
    private String comments;

    @Column(name = "Current_Position_At_Sea_Port_Name", length = 256)
    private String currentPositionAtSeaPortName;

    @Column(name = "\"Emission Factor HSHFO\"", precision = 30, scale = 10)
    private BigDecimal emissionFactorHSHFO;

    @Column(name = "\"Emission Factor LSHFO\"", precision = 30, scale = 10)
    private BigDecimal emissionFactorLSHFO;

    @Column(name = "\"Emission Factor LSMGO\"", precision = 30, scale = 10)
    private BigDecimal emissionFactorLSMGO;

    @Column(name = "\"Engine Speed\"", precision = 30, scale = 10)
    private BigDecimal engineSpeed;

    @Column(name = "\"Excess M.E Cons.\"", precision = 30, scale = 10)
    private BigDecimal excessMECons;

    @Column(name = "\"HFO Cons. on A.E\"", precision = 30, scale = 10)
    private BigDecimal hFOConsOnAE;

    @Column(name = "\"HFO Cons. on M.E\"", precision = 30, scale = 10)
    private BigDecimal hFOConsOnME;

    @Column(name = "\"HFO Cons. on Blr\"", precision = 30, scale = 10)
    private BigDecimal hFOConsOnBlr;

    @Column(name = "\"MGO Cons. on A.E\"", precision = 30, scale = 10)
    private BigDecimal mGOConsOnAE;

    @Column(name = "\"MGO Cons. on M.E\"", precision = 30, scale = 10)
    private BigDecimal mGOConsOnME;

    @Column(name = "\"MGO Cons. on Blr\"", precision = 30, scale = 10)
    private BigDecimal mGOConsOnBlr;

    @Column(name = "\"Reported CLO cons. (ltrs)\"", precision = 30, scale = 10)
    private BigDecimal reportedCLOConsLtrs;

    @Column(name = "\"Reported M.E Power\"", precision = 30, scale = 10)
    private BigDecimal reportedMEPower;

    @Column(name = "\"Time @ Sea\"", length = 16)
    private String timeSea;

    @Column(name = "\"Total A.E Cons.\"", precision = 30, scale = 10)
    private BigDecimal totalAECons;

    @Column(name = "\"Total Boiler Cons.\"", precision = 30, scale = 10)
    private BigDecimal totalBoilerCons;

    @Column(name = "\"Total M.E Cons.\"", precision = 30, scale = 10)
    private BigDecimal totalMECons;

    @Column(name = "\"Total Observed Distance\"", precision = 30, scale = 10)
    private BigDecimal totalObservedDistance;

    @Column(name = "\"Sister Sub Category\"", length = 256)
    private String sisterSubCategory;

    @Column(name = "\"Ae Target\"", precision = 29, scale = 18)
    private BigDecimal aeTarget;

    @Column(name = "\"Blr Target\"", precision = 29, scale = 18)
    private BigDecimal blrTarget;

    @Column(name = "\"Ae Baseline\"", precision = 29, scale = 18)
    private BigDecimal aeBaseline;

    @Column(name = "\"Blr Baseline\"", precision = 29, scale = 18)
    private BigDecimal blrBaseline;

    @Column(name = "\"BlrMGO Baseline\"", precision = 29, scale = 10)
    private BigDecimal blrMGOBaseline;

    @Column(name = "\"Actual SFOC\"", precision = 29, scale = 10)
    private BigDecimal actualSFOC;

    @Column(name = "\"Expected SFOC\"", precision = 29, scale = 10)
    private BigDecimal expectedSFOC;

    @Column(name = "\"Excess SFOC\"", precision = 29, scale = 10)
    private BigDecimal excessSFOC;

    @Column(name = "\"Excess due to M.E SFOC\"", precision = 29, scale = 10)
    private BigDecimal excessDueToMESFOC;

    @Column(name = "\"Baseline Excess Power %\"", precision = 29, scale = 16)
    private BigDecimal baselineExcessPower;

    @Column(name = "\"Baseline SFOC\"", precision = 29, scale = 16)
    private BigDecimal baselineSFOC;

    @Column(name = "\"Baseline SCOC\"", precision = 29, scale = 16)
    private BigDecimal baselineSCOC;

    @Column(name = "\"IMO Number\"")
    private Integer iMONumber;

    @Column(name = "EmailId", length = 256)
    private String emailId;

    @Column(name = "\"CLO Saving\"", precision = 29, scale = 10)
    private BigDecimal cLOSaving;

    @Column(name = "\"SFOC Saving\"", precision = 29, scale = 10)
    private BigDecimal sFOCSaving;

    @Column(name = "\"A.E Saving\"", precision = 29, scale = 18)
    private BigDecimal aESaving;

    @Column(name = "\"Blr Saving\"", precision = 29, scale = 18)
    private BigDecimal blrSaving;

    @Column(name = "\"BLR MGO Saving\"", precision = 29, scale = 18)
    private BigDecimal bLRMGOSaving;

    @Column(name = "\"S%\"", precision = 29, scale = 10)
    private BigDecimal s;

    @Column(name = "\"Report Subcategory\"", length = 256)
    private String reportSubcategory;

    @Column(name = "\"M.E NOx emission (kg)\"", precision = 29, scale = 10)
    private BigDecimal mENOxEmissionKg;

    @Column(name = "\"A.E NOx Emission (kg)\"", precision = 29, scale = 10)
    private BigDecimal aENOxEmissionKg;

    @Column(name = "\"Boiler NOx Emission (kg)\"", precision = 29, scale = 10)
    private BigDecimal boilerNOxEmissionKg;

    @Column(name = "\"Total NOx Emission (kg)\"", precision = 29, scale = 10)
    private BigDecimal totalNOxEmissionKg;

    @Column(name = "\"CO2 Emission (MT)\"", precision = 29, scale = 10)
    private BigDecimal cO2EmissionMT;

    @Column(name = "\"Sox (kg)\"", precision = 29, scale = 10)
    private BigDecimal soxKg;

    @Column(name = "DWT", precision = 29, scale = 10)
    private BigDecimal dwt;

    @Column(name = "\"Excess A.E Cons.\"", precision = 29, scale = 10)
    private BigDecimal excessAECons;

    @Column(name = "\"Excess Boiler Cons.\"", precision = 29, scale = 10)
    private BigDecimal excessBoilerCons;

    @Column(name = "\"ETA Next Port\"")
    private Instant eTANextPort;

    @Column(name = "\"CLO Cons Status\"", length = 1024)
    private String cLOConsStatus;

    @Column(name = "TC_Status", length = 32)
    private String tcStatus;

    @Column(name = "VeemsReportId", length = 32)
    private String veemsReportId;

    @Column(name = "Calculated_Power_Basis_GPS_Speed_B4_Clng_Curve", precision = 29, scale = 10)
    private BigDecimal calculatedPowerBasisGpsSpeedB4ClngCurve;

    @Column(name = "Calculated_Power_Basis_Log_Speed_B4_Clng_Curve", precision = 29, scale = 10)
    private BigDecimal calculatedPowerBasisLogSpeedB4ClngCurve;

    @Column(name = "SFOC_Based_On_GPS_Speed_B4_Clng", precision = 29, scale = 10)
    private BigDecimal sfocBasedOnGpsSpeedB4Clng;

    @Column(name = "SFOC_Based_On_Log_Speed_B4_Clng", precision = 29, scale = 10)
    private BigDecimal sfocBasedOnLogSpeedB4Clng;

    @Column(name = "Excess_Cons_As_Compared_To_Baseline_B4_Cleaning_GPS_Speed", precision = 29, scale = 10)
    private BigDecimal excessConsAsComparedToBaselineB4CleaningGpsSpeed;

    @Column(name = "Excess_Cons_As_Compared_To_Baseline_B4_Cleaning_Log_Speed", precision = 29, scale = 10)
    private BigDecimal excessConsAsComparedToBaselineB4CleaningLogSpeed;

    @Column(name = "Months_Since_last_Docking", precision = 8, scale = 2)
    private BigDecimal monthsSinceLastDocking;

    @Column(name = "Months_Since_last_Hull_Cleaning", precision = 8, scale = 2)
    private BigDecimal monthsSinceLastHullCleaning;

    @Column(name = "Hull_Paint", length = 256)
    private String hullPaint;

    @Column(name = "New_Transport_Work", precision = 29, scale = 10)
    private BigDecimal newTransportWork;

    @Column(name = "Heavy_Run_Line", precision = 29, scale = 10)
    private BigDecimal heavyRunLine;

    @Column(name = "Torque_Speed_Limit_Line", precision = 29, scale = 10)
    private BigDecimal torqueSpeedLimitLine;

    @Column(name = "Overload_Limit_Line", precision = 29, scale = 10)
    private BigDecimal overloadLimitLine;

    @Column(name = "CII_2019_Baseline", precision = 29, scale = 10)
    private BigDecimal cii2019Baseline;

    @Column(name = "CII_Target_Value", precision = 29, scale = 10)
    private BigDecimal ciiTargetValue;

}