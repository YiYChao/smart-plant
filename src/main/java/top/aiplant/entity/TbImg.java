package top.aiplant.entity;

import java.util.Date;

public class TbImg {
    private Integer imgId;

    private Integer plantId;

    private String imgUrl;

    private Byte imgStatus;

    private Date imgDate;

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Integer getPlantId() {
        return plantId;
    }

    public void setPlantId(Integer plantId) {
        this.plantId = plantId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Byte getImgStatus() {
        return imgStatus;
    }

    public void setImgStatus(Byte imgStatus) {
        this.imgStatus = imgStatus;
    }

    public Date getImgDate() {
        return imgDate;
    }

    public void setImgDate(Date imgDate) {
        this.imgDate = imgDate;
    }
}