package com.jf.medtec.MedTecServer.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Trace {
    @Id
    private Long traceId;
    private LocalDateTime timestamp;
    private Double longitude;
    private Double latitude;
    private Double temperature;
    private String nfc;
    private String arduino;

    public Trace() {
    }

    public Trace(Long traceId, LocalDateTime timestamp, Double longitude, Double latitude, Double temperature, String nfc, String arduino) {
        this.traceId = traceId;
        this.timestamp = timestamp;
        this.longitude = longitude;
        this.latitude = latitude;
        this.temperature = temperature;
        this.nfc = nfc;
        this.arduino = arduino;
    }

    public Long getTraceId() {
        return traceId;
    }

    public void setTraceId(Long traceId) {
        this.traceId = traceId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public String getNfc() {
        return nfc;
    }

    public void setNfc(String nfc) {
        this.nfc = nfc;
    }

    public String getArduino() {
        return arduino;
    }

    public void setArduino(String arduino) {
        this.arduino = arduino;
    }

    @Override
    public String toString() {
        return "Trace{" +
                "traceId=" + traceId +
                ", timestamp=" + timestamp +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", temperature=" + temperature +
                ", nfc='" + nfc + '\'' +
                ", arduino='" + arduino + '\'' +
                '}';
    }
}
