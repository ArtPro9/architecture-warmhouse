package ru.yandex.practicum.temperature_api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class TemperatureResponse {

    @JsonProperty("value")
    private double value;

    @JsonProperty("unit")
    private String unit;

    @JsonProperty("timestamp")
    private LocalDateTime timestamp;

    @JsonProperty("location")
    private String location;

    @JsonProperty("status")
    private String status;

    @JsonProperty("sensor_id")
    private String sensorId;

    @JsonProperty("sensor_type")
    private String sensorType;

    @JsonProperty("description")
    private String description;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "TemperatureResponse{" +
                "value=" + value +
                ", unit='" + unit + '\'' +
                ", timestamp=" + timestamp +
                ", location='" + location + '\'' +
                ", status='" + status + '\'' +
                ", sensorId='" + sensorId + '\'' +
                ", sensorType='" + sensorType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
