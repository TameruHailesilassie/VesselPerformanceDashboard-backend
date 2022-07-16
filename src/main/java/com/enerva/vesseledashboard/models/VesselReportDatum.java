package com.enerva.vesseledashboard.models;

import java.math.BigDecimal;
import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "VesselReportData")
public class VesselReportDatum {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Vessel_Name", length = 256)
    private String vesselName;

    @Column(name = "IMO_Number")
    private Integer imoNumber;

    @Column(name = "Masters_Name", length = 256)
    private String mastersName;

    @Column(name = "Chief_Engineers_Name", length = 256)
    private String chiefEngineersName;

    @Column(name = "ConcatData", length = 256)
    private String concatData;

    @Column(name = "Voyage_No", length = 256)
    private String voyageNo;

    @Column(name = "Current_report_starting_time")
    private Instant currentReportStartingTime;

    @Column(name = "Correction_to_get_UTC_Time_for_Report_starting_time")
    private Integer correctionToGetUtcTimeForReportStartingTime;

    @Column(name = "Current_report_closing_time")
    private Instant currentReportClosingTime;

    @Column(name = "Correction_to_get_UTC_Time_for_Report_closing_time")
    private Integer correctionToGetUtcTimeForReportClosingTime;

    @Column(name = "Report_Type", length = 256)
    private String reportType;

    @Column(name = "Report_Period", precision = 30, scale = 25)
    private BigDecimal reportPeriod;

    @Column(name = "Position_Latitude_Deg", precision = 30, scale = 10)
    private BigDecimal positionLatitudeDeg;

    @Column(name = "Position_Latitude_Min_Sec", precision = 30, scale = 10)
    private BigDecimal positionLatitudeMinSec;

    @Column(name = "Position_Latitude_NS", length = 8)
    private String positionLatitudeNs;

    @Column(name = "Position_Longitude_Deg", precision = 30, scale = 10)
    private BigDecimal positionLongitudeDeg;

    @Column(name = "Position_Longitude_Min_Sec", precision = 30, scale = 10)
    private BigDecimal positionLongitudeMinSec;

    @Column(name = "Position_Longitude_EW", length = 8)
    private String positionLongitudeEw;

    @Column(name = "Load_Condition", length = 256)
    private String loadCondition;

    @Column(name = "Mean_Draught_m", precision = 30, scale = 10)
    private BigDecimal meanDraughtM;

    @Column(name = "Employment_Type", length = 256)
    private String employmentType;

    @Column(name = "Next_Port", length = 256)
    private String nextPort;

    @Column(name = "Current_Position_At_Sea_Port_Name", length = 256)
    private String currentPositionAtSeaPortName;

    @Column(name = "EU_voyage_status", length = 256)
    private String euVoyageStatus;

    @Column(name = "Current_Position_ECA_status", length = 256)
    private String currentPositionEcaStatus;

    @Column(name = "Current_Position_Port_limit_status", length = 256)
    private String currentPositionPortLimitStatus;

    @Column(name = "Speed_Instruction", length = 256)
    private String speedInstruction;

    @Column(name = "Instucted_Speed_Value_knots", precision = 30, scale = 10)
    private BigDecimal instuctedSpeedValueKnots;

    @Column(name = "Main_Engine_Power_RPM_Status_During_Report_Period", length = 256)
    private String mainEnginePowerRpmStatusDuringReportPeriod;

    @Column(name = "Beaufort_force", precision = 30, scale = 10)
    private BigDecimal beaufortForce;

    @Column(name = "Wind_coming_From_degree_True_Wind_Direction", precision = 30, scale = 10)
    private BigDecimal windComingFromDegreeTrueWindDirection;

    @Column(name = "Wave_height_m", precision = 30, scale = 10)
    private BigDecimal waveHeightM;

    @Column(name = "Waves_going_towards_Degree_True_Swell_Direction", precision = 30, scale = 10)
    private BigDecimal wavesGoingTowardsDegreeTrueSwellDirection;

    @Column(name = "Vessel_Heading_Degree_Absolue_Direction", precision = 30, scale = 10)
    private BigDecimal vesselHeadingDegreeAbsolueDirection;

    @Column(name = "Barometric_Pressure_millibar", precision = 30, scale = 10)
    private BigDecimal barometricPressureMillibar;

    @Column(name = "Previous_GPS_Distance_counter_reading", precision = 30, scale = 10)
    private BigDecimal previousGpsDistanceCounterReading;

    @Column(name = "Current_GPS_Distance_counter_reading", precision = 30, scale = 10)
    private BigDecimal currentGpsDistanceCounterReading;

    @Column(name = "Observed_GPS_Distance_nm", precision = 29, scale = 18)
    private BigDecimal observedGpsDistanceNm;

    @Column(name = "Previous_Log_Distance_counter_reading", precision = 34, scale = 18)
    private BigDecimal previousLogDistanceCounterReading;

    @Column(name = "Current_Log_Distance_counter_reading", precision = 34, scale = 18)
    private BigDecimal currentLogDistanceCounterReading;

    @Column(name = "Logged_Engine_Distance_nm", precision = 29, scale = 16)
    private BigDecimal loggedEngineDistanceNm;

    @Column(name = "Previous_RPM_Counter", precision = 30, scale = 10)
    private BigDecimal previousRpmCounter;

    @Column(name = "Current_RPM_Counter", precision = 30, scale = 10)
    private BigDecimal currentRpmCounter;

    @Column(name = "Average_RPM", precision = 29, scale = 16)
    private BigDecimal averageRpm;

    @Column(name = "ME_Previous_Rhr_Counter", precision = 30, scale = 10)
    private BigDecimal mePreviousRhrCounter;

    @Column(name = "ME_Current_Rhr_Counter", precision = 30, scale = 10)
    private BigDecimal meCurrentRhrCounter;

    @Column(name = "ME_Running_hours_Hrs", precision = 34, scale = 18)
    private BigDecimal meRunningHoursHrs;

    @Column(name = "ME_Previous_kWh_Counter", precision = 30, scale = 10)
    private BigDecimal mePreviousKwhCounter;

    @Column(name = "ME_Current_kWh_Counter", precision = 30, scale = 10)
    private BigDecimal meCurrentKwhCounter;

    @Column(name = "ME_Shaft_Power_kW", precision = 34, scale = 18)
    private BigDecimal meShaftPowerKw;

    @Column(name = "Avg__Main_Engine_load_MCR", length = 256)
    private String avgMainEngineLoadMcr;

    @Column(name = "C_1_AE_Previous_Rhr_Counter", precision = 30, scale = 10)
    private BigDecimal c1AePreviousRhrCounter;

    @Column(name = "C_1_AE_Current_Rhr_Counter", precision = 30, scale = 10)
    private BigDecimal c1AeCurrentRhrCounter;

    @Column(name = "C_1_Aux_Engine_Running_Hours", precision = 34, scale = 18)
    private BigDecimal c1AuxEngineRunningHours;

    @Column(name = "C_2_AE_Previous_Rhr_Counter", precision = 30, scale = 10)
    private BigDecimal c2AePreviousRhrCounter;

    @Column(name = "C_2_AE_Current_Rhr_Counter", precision = 30, scale = 10)
    private BigDecimal c2AeCurrentRhrCounter;

    @Column(name = "C_2_Aux_Engine_Running_Hours", precision = 34, scale = 18)
    private BigDecimal c2AuxEngineRunningHours;

    @Column(name = "C_3_AE_Previous_Rhr_Counter", precision = 30, scale = 10)
    private BigDecimal c3AePreviousRhrCounter;

    @Column(name = "C_3_AE_Current_Rhr_Counter", precision = 30, scale = 10)
    private BigDecimal c3AeCurrentRhrCounter;

    @Column(name = "C_3_Aux_Engine_Running_Hours", precision = 34, scale = 18)
    private BigDecimal c3AuxEngineRunningHours;

    @Column(name = "C_1_AE_Previous_kWh_Counter", precision = 30, scale = 10)
    private BigDecimal c1AePreviousKwhCounter;

    @Column(name = "C_1_AE_Current_kWh_Counter", precision = 30, scale = 10)
    private BigDecimal c1AeCurrentKwhCounter;

    @Column(name = "C_1_Aux_Engine_kWh", precision = 29, scale = 18)
    private BigDecimal c1AuxEngineKwh;

    @Column(name = "C_2_AE_Previous_kWh_Counter", precision = 30, scale = 10)
    private BigDecimal c2AePreviousKwhCounter;

    @Column(name = "C_2_AE_Current_kWh_Counter", precision = 30, scale = 10)
    private BigDecimal c2AeCurrentKwhCounter;

    @Column(name = "C_2_Aux_Engine_kWh", precision = 29, scale = 18)
    private BigDecimal c2AuxEngineKwh;

    @Column(name = "C_3_AE_Previous_kWh_Counter", precision = 30, scale = 10)
    private BigDecimal c3AePreviousKwhCounter;

    @Column(name = "C_3_AE_Current_kWh_Counter", precision = 30, scale = 10)
    private BigDecimal c3AeCurrentKwhCounter;

    @Column(name = "C_3_Aux_Engine_kWh", precision = 29, scale = 18)
    private BigDecimal c3AuxEngineKwh;

    @Column(name = "Sea_Water_Temp_deg_C", precision = 30, scale = 10)
    private BigDecimal seaWaterTempDegC;

    @Column(name = "E_R_Temp_deg_C", precision = 30, scale = 10)
    private BigDecimal eRTempDegC;

    @Column(name = "Scavenge_Air_Temp_deg_C", precision = 30, scale = 10)
    private BigDecimal scavengeAirTempDegC;

    @Column(name = "Air_Cooler_Cooling_Water_inlet_Temp_deg_C", precision = 30, scale = 10)
    private BigDecimal airCoolerCoolingWaterInletTempDegC;

    @Column(name = "ME_Flowmeter_previous_counter_litres", precision = 30, scale = 10)
    private BigDecimal meFlowmeterPreviousCounterLitres;

    @Column(name = "ME_Flowmeter_Current_counter_litres", precision = 30, scale = 10)
    private BigDecimal meFlowmeterCurrentCounterLitres;

    @Column(name = "ME_Density_at_15_deg_C_of_Fuel_in_Use_MT_m3", precision = 30, scale = 10)
    private BigDecimal meDensityAt15DegCOfFuelInUseMtM3;

    @Column(name = "ME_Temp_at_Flowmeter_deg_C", precision = 30, scale = 10)
    private BigDecimal meTempAtFlowmeterDegC;

    @Column(name = "ME_Calculated_Consumption_MT", precision = 30, scale = 18)
    private BigDecimal meCalculatedConsumptionMt;

    @Column(name = "Main_Engine_Cons_MT_HSFO", precision = 29, scale = 18)
    private BigDecimal mainEngineConsMtHsfo;

    @Column(name = "Main_Engine_Cons_MT_ULSFO", precision = 29, scale = 18)
    private BigDecimal mainEngineConsMtUlsfo;

    @Column(name = "Main_Engine_Cons_MT_HSGO", precision = 29, scale = 18)
    private BigDecimal mainEngineConsMtHsgo;

    @Column(name = "Main_Engine_Cons_MT_LSGO", precision = 29, scale = 18)
    private BigDecimal mainEngineConsMtLsgo;

    @Column(name = "AE_Flowmeter_previous_counter_litres", precision = 30, scale = 10)
    private BigDecimal aeFlowmeterPreviousCounterLitres;

    @Column(name = "AE_Flowmeter_Current_counter_litres", precision = 30, scale = 10)
    private BigDecimal aeFlowmeterCurrentCounterLitres;

    @Column(name = "AE_AE_Density_At_15_deg_C_of_Fuel_in_Use_kg_m3", precision = 30, scale = 10)
    private BigDecimal aeAeDensityAt15DegCOfFuelInUseKgM3;

    @Column(name = "AE_Temp_at_Flowmeter_deg_C", precision = 30, scale = 10)
    private BigDecimal aeTempAtFlowmeterDegC;

    @Column(name = "AE_Calculated_Consumption_MT", precision = 30, scale = 18)
    private BigDecimal aeCalculatedConsumptionMt;

    @Column(name = "Aux_Engine_Cons_MT_HSFO", precision = 29, scale = 18)
    private BigDecimal auxEngineConsMtHsfo;

    @Column(name = "Aux_Engine_Cons_MT_ULSFO", precision = 29, scale = 18)
    private BigDecimal auxEngineConsMtUlsfo;

    @Column(name = "Aux_Engine_Cons_MT_HSGO", precision = 29, scale = 18)
    private BigDecimal auxEngineConsMtHsgo;

    @Column(name = "Aux_Engine_Cons_MT_LSGO", precision = 29, scale = 18)
    private BigDecimal auxEngineConsMtLsgo;

    @Column(name = "Boiler_Flowmeter_previous_counter_litres", precision = 30, scale = 10)
    private BigDecimal boilerFlowmeterPreviousCounterLitres;

    @Column(name = "Boiler_Flowmeter_Current_counter_litres", precision = 30, scale = 10)
    private BigDecimal boilerFlowmeterCurrentCounterLitres;

    @Column(name = "Boiler_Density_At_15_deg_C_of_Fuel_in_Use_kg_m3", precision = 30, scale = 10)
    private BigDecimal boilerDensityAt15DegCOfFuelInUseKgM3;

    @Column(name = "Boiler_Temp_at_Flowmeter_deg_C", precision = 30, scale = 10)
    private BigDecimal boilerTempAtFlowmeterDegC;

    @Column(name = "Boiler_Calculated_Consumption_MT", precision = 34, scale = 21)
    private BigDecimal boilerCalculatedConsumptionMt;

    @Column(name = "Boiler_Cons_MT_HSFO", precision = 29, scale = 18)
    private BigDecimal boilerConsMtHsfo;

    @Column(name = "Boiler_Cons_MT_ULSFO", precision = 29, scale = 18)
    private BigDecimal boilerConsMtUlsfo;

    @Column(name = "Boiler_Cons_MT_HSGO", precision = 29, scale = 18)
    private BigDecimal boilerConsMtHsgo;

    @Column(name = "Boiler_Cons_MT_LSGO", precision = 29, scale = 18)
    private BigDecimal boilerConsMtLsgo;

    @Column(name = "Incinerator_Cons_MT_HSGO", precision = 30, scale = 10)
    private BigDecimal incineratorConsMtHsgo;

    @Column(name = "Incinerator_Cons_MT_LSGO", precision = 30, scale = 10)
    private BigDecimal incineratorConsMtLsgo;

    @Column(name = "Inert_Gas_Generator_Cons_MT_HSGO", precision = 30, scale = 10)
    private BigDecimal inertGasGeneratorConsMtHsgo;

    @Column(name = "Inert_Gas_Generator_Cons_MT_LSGO", precision = 30, scale = 10)
    private BigDecimal inertGasGeneratorConsMtLsgo;

    @Column(name = "Tank_Cleaning_Cons_MT_HSFO", precision = 30, scale = 10)
    private BigDecimal tankCleaningConsMtHsfo;

    @Column(name = "Tank_Cleaning_Cons_MT_ULSFO", precision = 30, scale = 10)
    private BigDecimal tankCleaningConsMtUlsfo;

    @Column(name = "Tank_Cleaning_Cons_MT_HSGO", precision = 30, scale = 10)
    private BigDecimal tankCleaningConsMtHsgo;

    @Column(name = "Tank_Cleaning_Cons_MT_LSGO", precision = 30, scale = 10)
    private BigDecimal tankCleaningConsMtLsgo;

    @Column(name = "Cargo_Heating_Cons_MT_HSFO", precision = 30, scale = 10)
    private BigDecimal cargoHeatingConsMtHsfo;

    @Column(name = "Cargo_Heating_Cons_MT_ULSFO", precision = 30, scale = 10)
    private BigDecimal cargoHeatingConsMtUlsfo;

    @Column(name = "Cargo_Heating_Cons_MT_HSGO", precision = 30, scale = 10)
    private BigDecimal cargoHeatingConsMtHsgo;

    @Column(name = "Cargo_Heating_Cons_MT_LSGO", precision = 30, scale = 10)
    private BigDecimal cargoHeatingConsMtLsgo;

    @Column(name = "Total_Cargo_Qty_onboard_mt", precision = 30, scale = 10)
    private BigDecimal totalCargoQtyOnboardMt;

    @Column(name = "LCV_value_of_Fuel_used_kJ_kg", precision = 30, scale = 10)
    private BigDecimal lcvValueOfFuelUsedKjKg;

    @Column(name = "S_percent_of_Fuel_used_percent", precision = 30, scale = 10)
    private BigDecimal sPercentOfFuelUsedPercent;

    @Column(name = "Qty_of_CLO_used_litres", precision = 30, scale = 10)
    private BigDecimal qtyOfCloUsedLitres;

    @Column(name = "Fuel_Qty_Bunkered_MT_as_per_BDN_HSFO", precision = 30, scale = 10)
    private BigDecimal fuelQtyBunkeredMtAsPerBdnHsfo;

    @Column(name = "Fuel_Qty_Bunkered_MT_as_per_BDN_ULSFO", precision = 30, scale = 10)
    private BigDecimal fuelQtyBunkeredMtAsPerBdnUlsfo;

    @Column(name = "Fuel_Qty_Bunkered_MT_as_per_BDN_HSGO", precision = 30, scale = 10)
    private BigDecimal fuelQtyBunkeredMtAsPerBdnHsgo;

    @Column(name = "Fuel_Qty_Bunkered_MT_as_per_BDN_LSGO", precision = 30, scale = 10)
    private BigDecimal fuelQtyBunkeredMtAsPerBdnLsgo;

    @Column(name = "Fuel_Qty_actually_received_MT_HSFO", precision = 30, scale = 10)
    private BigDecimal fuelQtyActuallyReceivedMtHsfo;

    @Column(name = "Fuel_Qty_actually_received_MT_ULSFO", precision = 30, scale = 10)
    private BigDecimal fuelQtyActuallyReceivedMtUlsfo;

    @Column(name = "Fuel_Qty_actually_received_MT_HSGO", precision = 30, scale = 10)
    private BigDecimal fuelQtyActuallyReceivedMtHsgo;

    @Column(name = "Fuel_Qty_actually_received_MT_LSGO", precision = 30, scale = 10)
    private BigDecimal fuelQtyActuallyReceivedMtLsgo;

    @Column(name = "Bunker_Delivery_Note_identification_HSFO", length = 256)
    private String bunkerDeliveryNoteIdentificationHsfo;

    @Column(name = "Bunker_Delivery_Note_identification_ULSFO", length = 256)
    private String bunkerDeliveryNoteIdentificationUlsfo;

    @Column(name = "Bunker_Delivery_Note_identification_HSGO", length = 256)
    private String bunkerDeliveryNoteIdentificationHsgo;

    @Column(name = "Bunker_Delivery_Note_identification_LSGO", length = 256)
    private String bunkerDeliveryNoteIdentificationLsgo;

    @Column(name = "Bunker_LOP_Issued_HSFO", length = 256)
    private String bunkerLopIssuedHsfo;

    @Column(name = "Bunker_LOP_Issued_ULSFO", length = 256)
    private String bunkerLopIssuedUlsfo;

    @Column(name = "Bunker_LOP_Issued_HSGO", length = 256)
    private String bunkerLopIssuedHsgo;

    @Column(name = "Bunker_LOP_Issued_LSGO", length = 256)
    private String bunkerLopIssuedLsgo;

    @Column(name = "Stocks_remaining_on_baord_MT_HSFO", precision = 29, scale = 18)
    private BigDecimal stocksRemainingOnBaordMtHsfo;

    @Column(name = "Stocks_remaining_on_baord_MT_ULSFO", precision = 29, scale = 18)
    private BigDecimal stocksRemainingOnBaordMtUlsfo;

    @Column(name = "Stocks_remaining_on_baord_MT_HSGO", precision = 29, scale = 18)
    private BigDecimal stocksRemainingOnBaordMtHsgo;

    @Column(name = "Stocks_remaining_on_baord_MT_LSGO", precision = 29, scale = 18)
    private BigDecimal stocksRemainingOnBaordMtLsgo;

    @Column(name = "Port_Sounding_Log_filled_and_attached", length = 256)
    private String portSoundingLogFilledAndAttached;

    @Column(name = "Comments", length = 4000)
    private String comments;

    @Column(name = "IsFirstRecord", length = 3)
    private String isFirstRecord;

    @Column(name = "ETA_Next_Port")
    private Instant etaNextPort;

    @Column(name = "CLO_Cons_Status", length = 1024)
    private String cloConsStatus;

    @Column(name = "VeemsReportId", length = 32)
    private String veemsReportId;

    @Column(name = "Origin_Port", length = 256)
    private String originPort;

    @Column(name = "Distance_To_Go", precision = 29, scale = 10)
    private BigDecimal distanceToGo;

    @Column(name = "River_Passage_Ind")
    private Integer riverPassageInd;

    @Column(name = "VesselCode")
    private Integer vesselCode;

}