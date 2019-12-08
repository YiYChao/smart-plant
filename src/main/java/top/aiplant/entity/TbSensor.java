package top.aiplant.entity;

import java.util.Date;

public class TbSensor {
    private Integer sensorId;

    private Integer plantId;

    private String sensorName;

    private String sensorDes;

    private Date sensorTime;

    private Byte sensorStatus;

    public Integer getSensorId() {
        return sensorId;
    }

    public void setSensorId(Integer sensorId) {
        this.sensorId = sensorId;
    }

    public Integer getPlantId() {
        return plantId;
    }

    public void setPlantId(Integer plantId) {
        this.plantId = plantId;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName == null ? null : sensorName.trim();
    }

    public String getSensorDes() {
        return sensorDes;
    }

    public void setSensorDes(String sensorDes) {
        this.sensorDes = sensorDes == null ? null : sensorDes.trim();
    }

    public Date getSensorTime() {
        return sensorTime;
    }

    public void setSensorTime(Date sensorTime) {
        this.sensorTime = sensorTime;
    }

    public Byte getSensorStatus() {
        return sensorStatus;
    }

    public void setSensorStatus(Byte sensorStatus) {
        this.sensorStatus = sensorStatus;
    }
}