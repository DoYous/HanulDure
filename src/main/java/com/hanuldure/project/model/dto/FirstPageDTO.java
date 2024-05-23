package com.hanuldure.project.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class FirstPageDTO {

    private int expSeq;
    private String expTitle;
    private String expAddr;
    private int expPrice;
    private int expMin;
    private int expMax;
    private String expImg;

}
