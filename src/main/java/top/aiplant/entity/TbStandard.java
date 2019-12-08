package top.aiplant.entity;

import java.util.Date;

public class TbStandard {
    private Integer stdId;

    private Integer plantId;

    private String stdName;

    private String stdDesc;

    private Float airTemperature;

    private Float airHumidity;

    private Float airHeat;

    private Float airLight;

    private Integer airRain;

    private Float soilHumidity;

    private Float waterDepth;

    private Date stdTime;

    private Byte stdStatus;

    public Integer getStdId() {
        return stdId;
    }

    public void setStdId(Integer stdId) {
        this.stdId = stdId;
    }

    public Integer getPlantId() {
        return plantId;
    }

    public void setPlantId(Integer plantId) {
        this.plantId = plantId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName == null ? null : stdName.trim();
    }

    public String getStdDesc() {
        return stdDesc;
    }

    public void setStdDesc(String stdDesc) {
        this.stdDesc = stdDesc == null ? null : stdDesc.trim();
    }

    public Float getAirTemperature() {
        return airTemperature;
    }

    public void setAirTemperature(Float airTemperature) {
        this.airTemperature = airTemperature;
    }

    public Float getAirHumidity() {
        return airHumidity;
    }

    public void setAirHumidity(Float airHumidity) {
        this.airHumidity = airHumidity;
    }

    public Float getAirHeat() {
        return airHeat;
    }

    public void setAirHeat(Float airHeat) {
        this.airHeat = airHeat;
    }

    public Float getAirLight() {
        return airLight;
    }

    public void setAirLight(Float airLight) {
        this.airLight = airLight;
    }

    public Integer getAirRain() {
        return airRain;
    }

    public void setAirRain(Integer airRain) {
        this.airRain = airRain;
    }

    public Float getSoilHumidity() {
        return soilHumidity;
    }

    public void setSoilHumidity(Float soilHumidity) {
        this.soilHumidity = soilHumidity;
    }

    public Float getWaterDepth() {
        return waterDepth;
    }

    public void setWaterDepth(Float waterDepth) {
        this.waterDepth = waterDepth;
    }

    public Date getStdTime() {
        return stdTime;
    }

    public void setStdTime(Date stdTime) {
        this.stdTime = stdTime;
    }

    public Byte getStdStatus() {
        return stdStatus;
    }

    public void setStdStatus(Byte stdStatus) {
        this.stdStatus = stdStatus;
    }
}