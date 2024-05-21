package com.hanuldure.project.service;

import com.hanuldure.project.model.Farmer;
import org.springframework.stereotype.Service;


    @Service
    public class FarmerService {

        public Farmer getFarmerProfile(String farmerId) {
            Farmer farmer = new Farmer();
            farmer.setFarmerId(farmerId);
            farmer.setFarmerName("농업인 닉네임");
            farmer.setFarmerPhone("010-0000-0000");
            farmer.setFarmerRegion("서울");
            farmer.setFarmerIntro("ㅇㅇ면에서 벼를 재배합니다.");
            farmer.setFarmerImg("/path/to/image.jpg");
            return farmer;
        }
    }


