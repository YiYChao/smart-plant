package top.aiplant.entity;

import java.util.Date;

public class TbZone {
    private Integer zoneId;

    private Integer userId;

    private String zoneName;

    private String zoneDesc;

    private String zoneAddress;

    private Date zoneTime;

    private Byte zoneStatus;

    public Integer getZoneId() {
        return zoneId;
    }

    public void setZoneId(Integer zoneId) {
        this.zoneId = zoneId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName == null ? null : zoneName.trim();
    }

    public String getZoneDesc() {
        return zoneDesc;
    }

    public void setZoneDesc(String zoneDesc) {
        this.zoneDesc = zoneDesc == null ? null : zoneDesc.trim();
    }

    public String getZoneAddress() {
        return zoneAddress;
    }

    public void setZoneAddress(String zoneAddress) {
        this.zoneAddress = zoneAddress == null ? null : zoneAddress.trim();
    }

    public Date getZoneTime() {
        return zoneTime;
    }

    public void setZoneTime(Date zoneTime) {
        this.zoneTime = zoneTime;
    }

    public Byte getZoneStatus() {
        return zoneStatus;
    }

    public void setZoneStatus(Byte zoneStatus) {
        this.zoneStatus = zoneStatus;
    }
}