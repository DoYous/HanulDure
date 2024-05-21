package com.hanuldure.project.model;

import lombok.Setter;

public class Farmer {
    private String farmerId;
    @Setter
    private String farmerName;
    @Setter
    private String farmerPhone;
    @Setter
    private String farmerRegion;
    private String farmerIntro;
    @Setter
    private String farmerImg; // 추가

    // 게터와 세터 추가
    public String getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(String userId) {
        this.farmerId = farmerId;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public String getFarmerPhone() {
        return farmerPhone;
    }

    public String getFarmerRegion() {
        return farmerRegion;
    }

    public String getFarmerIntro() {
        return farmerIntro;
    }

    public void setFarmerIntro(String farmerIntro) {
        this.farmerIntro = farmerIntro;
    }

    public String getFarmerImg() {
        return farmerImg;
    }


}