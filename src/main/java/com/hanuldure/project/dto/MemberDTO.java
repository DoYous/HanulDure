package com.hanuldure.project.dto;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MemberDTO {

    private int user_seq;
    private String user_id;
    private String user_password;
    private String user_email;
    private String user_name;
    private String user_birth;
    private String user_phone;
    private String user_reason;
    private String user_region;
    private char user_gender;
    private String user_intro;
    private int user_point;
    private int user_type;

}
