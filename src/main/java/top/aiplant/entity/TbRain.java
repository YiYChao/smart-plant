package top.aiplant.entity;

import java.util.Date;

public class TbRain {
    private Integer rainId;

    private Integer sensorId;

    private Integer rainRainfall;

    private Date rainTime;

    public Integer getRainId() {
        return rainId;
    }

    public void setRainId(Integer rainId) {
        this.rainId = rainId;
    }

    public Integer getSensorId() {
        return sensorId;
    }

    public void setSensorId(Integer sensorId) {
        this.sensorId = sensorId;
    }

    public Integer getRainRainfall() {
        return rainRainfall;
    }

    public void setRainRainfall(Integer rainRainfall) {
        this.rainRainfall = rainRainfall;
    }

    public Date getRainTime() {
        return rainTime;
    }

    public void setRainTime(Date rainTime) {
        this.rainTime = rainTime;
    }
}