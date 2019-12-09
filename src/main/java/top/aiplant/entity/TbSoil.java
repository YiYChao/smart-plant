package top.aiplant.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TbSoil implements Serializable{
	private static final long serialVersionUID = -2014055203551003724L;

	private Integer soilId;

    private Integer sensorId;

    private Integer soilHumidity;

    private Date soilTime;

    public Integer getSoilId() {
        return soilId;
    }

    public void setSoilId(Integer soilId) {
        this.soilId = soilId;
    }

    public Integer getSensorId() {
        return sensorId;
    }

    public void setSensorId(Integer sensorId) {
        this.sensorId = sensorId;
    }

    public Integer getSoilHumidity() {
        return soilHumidity;
    }

    public void setSoilHumidity(Integer soilHumidity) {
        this.soilHumidity = soilHumidity;
    }

    public Date getSoilTime() {
        return soilTime;
    }

    public void setSoilTime(Date soilTime) {
        this.soilTime = soilTime;
    }

	@Override
	public String toString() {
		return "{soilId:" + String.valueOf(soilId) + ", sensorId:" + String.valueOf(sensorId) + ", soilHumidity:" + String.valueOf(soilHumidity) + ", soilTime:"
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(soilTime) + "}";
	}
    
}