package top.aiplant.entity;

import java.util.Date;

public class TbPlant {
    private Integer plantId;

    private Integer zoneId;

    private String plantName;

    private String plantDesc;

    private String plantGrowth;

    private Date plantTime;

    private String plantToken;

    private Byte plantStatus;

    public Integer getPlantId() {
        return plantId;
    }

    public void setPlantId(Integer plantId) {
        this.plantId = plantId;
    }

    public Integer getZoneId() {
        return zoneId;
    }

    public void setZoneId(Integer zoneId) {
        this.zoneId = zoneId;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName == null ? null : plantName.trim();
    }

    public String getPlantDesc() {
        return plantDesc;
    }

    public void setPlantDesc(String plantDesc) {
        this.plantDesc = plantDesc == null ? null : plantDesc.trim();
    }

    public String getPlantGrowth() {
        return plantGrowth;
    }

    public void setPlantGrowth(String plantGrowth) {
        this.plantGrowth = plantGrowth == null ? null : plantGrowth.trim();
    }

    public Date getPlantTime() {
        return plantTime;
    }

    public void setPlantTime(Date plantTime) {
        this.plantTime = plantTime;
    }

    public String getPlantToken() {
        return plantToken;
    }

    public void setPlantToken(String plantToken) {
        this.plantToken = plantToken == null ? null : plantToken.trim();
    }

    public Byte getPlantStatus() {
        return plantStatus;
    }

    public void setPlantStatus(Byte plantStatus) {
        this.plantStatus = plantStatus;
    }
}