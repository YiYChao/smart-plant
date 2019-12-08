package top.aiplant.entity;

import java.util.Date;

public class TbDht {
    private Integer dhtId;

    private Integer sensorId;

    private String dhtTemperature;

    private String dhtHumidity;

    private String dhtHeat;

    private Date dhtTime;

    public Integer getDhtId() {
        return dhtId;
    }

    public void setDhtId(Integer dhtId) {
        this.dhtId = dhtId;
    }

    public Integer getSensorId() {
        return sensorId;
    }

    public void setSensorId(Integer sensorId) {
        this.sensorId = sensorId;
    }

    public String getDhtTemperature() {
        return dhtTemperature;
    }

    public void setDhtTemperature(String dhtTemperature) {
        this.dhtTemperature = dhtTemperature == null ? null : dhtTemperature.trim();
    }

    public String getDhtHumidity() {
        return dhtHumidity;
    }

    public void setDhtHumidity(String dhtHumidity) {
        this.dhtHumidity = dhtHumidity == null ? null : dhtHumidity.trim();
    }

    public String getDhtHeat() {
        return dhtHeat;
    }

    public void setDhtHeat(String dhtHeat) {
        this.dhtHeat = dhtHeat == null ? null : dhtHeat.trim();
    }

    public Date getDhtTime() {
        return dhtTime;
    }

    public void setDhtTime(Date dhtTime) {
        this.dhtTime = dhtTime;
    }
}