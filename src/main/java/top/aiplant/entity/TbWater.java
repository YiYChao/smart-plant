package top.aiplant.entity;

import java.util.Date;

public class TbWater {
    private Integer waterId;

    private Integer sensorId;

    private Integer waterDepth;

    private Date waterTime;

    public Integer getWaterId() {
        return waterId;
    }

    public void setWaterId(Integer waterId) {
        this.waterId = waterId;
    }

    public Integer getSensorId() {
        return sensorId;
    }

    public void setSensorId(Integer sensorId) {
        this.sensorId = sensorId;
    }

    public Integer getWaterDepth() {
        return waterDepth;
    }

    public void setWaterDepth(Integer waterDepth) {
        this.waterDepth = waterDepth;
    }

    public Date getWaterTime() {
        return waterTime;
    }

    public void setWaterTime(Date waterTime) {
        this.waterTime = waterTime;
    }
}