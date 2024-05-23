package com.hanuldure.project.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
public class CommunityTO {

    private int userSeq;
    private int boardSeq;
    private String boardTitle;
    private String boardContent;
    private Date boardWriteDate;
    private String boardType;

}
