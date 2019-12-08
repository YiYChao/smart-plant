package top.aiplant.entity;

import java.util.Date;

public class TbFan {
    private Integer fanId;

    private Integer sensorId;

    private Byte fanStatus;

    private Date fanTime;

    public Integer getFanId() {
        return fanId;
    }

    public void setFanId(Integer fanId) {
        this.fanId = fanId;
    }

    public Integer getSensorId() {
        return sensorId;
    }

    public void setSensorId(Integer sensorId) {
        this.sensorId = sensorId;
    }

    public Byte getFanStatus() {
        return fanStatus;
    }

    public void setFanStatus(Byte fanStatus) {
        this.fanStatus = fanStatus;
    }

    public Date getFanTime() {
        return fanTime;
    }

    public void setFanTime(Date fanTime) {
        this.fanTime = fanTime;
    }
}