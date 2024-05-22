package com.hanuldure.project.dto;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MemberDTO {

    private int userSeq;
    private String userId;
    private String userPassword;
    private String userEmail;
    private String userName;
    private String userBirth;
    private String userPhone;
    private String userReason;
    private String userRegion;
    private char userGender;
    private String userIntro;
    private int userPoint;
    private int userType;

}
