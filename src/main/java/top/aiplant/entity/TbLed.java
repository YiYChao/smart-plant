package top.aiplant.entity;

import java.util.Date;

public class TbLed {
    private Integer ledId;

    private Integer sensorId;

    private Byte ledStatus;

    private Date ledTime;

    public Integer getLedId() {
        return ledId;
    }

    public void setLedId(Integer ledId) {
        this.ledId = ledId;
    }

    public Integer getSensorId() {
        return sensorId;
    }

    public void setSensorId(Integer sensorId) {
        this.sensorId = sensorId;
    }

    public Byte getLedStatus() {
        return ledStatus;
    }

    public void setLedStatus(Byte ledStatus) {
        this.ledStatus = ledStatus;
    }

    public Date getLedTime() {
        return ledTime;
    }

    public void setLedTime(Date ledTime) {
        this.ledTime = ledTime;
    }
}