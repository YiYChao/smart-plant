package top.aiplant.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TbPump implements Serializable{
	private static final long serialVersionUID = 1103013159169150397L;

	private Integer pumpId;

    private Integer sensorId;

    private Byte pumpStatus;

    private Date pumpTime;

    public Integer getPumpId() {
        return pumpId;
    }

    public void setPumpId(Integer pumpId) {
        this.pumpId = pumpId;
    }

    public Integer getSensorId() {
        return sensorId;
    }

    public void setSensorId(Integer sensorId) {
        this.sensorId = sensorId;
    }

    public Byte getPumpStatus() {
        return pumpStatus;
    }

    public void setPumpStatus(Byte pumpStatus) {
        this.pumpStatus = pumpStatus;
    }

    public Date getPumpTime() {
        return pumpTime;
    }

    public void setPumpTime(Date pumpTime) {
        this.pumpTime = pumpTime;
    }

	@Override
	public String toString() {
		return "{pumpId:" + String.valueOf(pumpId) + ", sensorId:" + String.valueOf(sensorId) + ", pumpStatus:" + String.valueOf(pumpStatus) + ", pumpTime:"
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(pumpTime) + "}";
	}
    
}