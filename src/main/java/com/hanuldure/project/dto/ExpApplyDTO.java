package com.hanuldure.project.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ExpApplyDTO {

    private int user_seq;
    private int exp_seq;
    private int apply_user_num;
    private String user_phone;
    private String apply_comment;

}
