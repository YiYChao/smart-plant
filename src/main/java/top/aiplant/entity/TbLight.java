package top.aiplant.entity;

import java.util.Date;

public class TbLight {
    private Integer lightId;

    private Integer sensorId;

    private Integer lightIntensity;

    private Date lightTime;

    public Integer getLightId() {
        return lightId;
    }

    public void setLightId(Integer lightId) {
        this.lightId = lightId;
    }

    public Integer getSensorId() {
        return sensorId;
    }

    public void setSensorId(Integer sensorId) {
        this.sensorId = sensorId;
    }

    public Integer getLightIntensity() {
        return lightIntensity;
    }

    public void setLightIntensity(Integer lightIntensity) {
        this.lightIntensity = lightIntensity;
    }

    public Date getLightTime() {
        return lightTime;
    }

    public void setLightTime(Date lightTime) {
        this.lightTime = lightTime;
    }
}