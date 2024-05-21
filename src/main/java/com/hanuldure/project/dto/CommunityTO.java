package com.hanuldure.project.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class CommunityTO {

    private int user_seq;
    private int board_seq;
    private String board_title;
    private String board_content;
    private Date board_write_date;
    private String board_type;

    public CommunityTO() {
    }

    public CommunityTO(int user_seq, int board_seq, String board_title, String board_content, String board_write_date, String board_type) {
        this.user_seq = user_seq;
        this.board_seq = board_seq;
        this.board_title = board_title;
        this.board_content = board_content;
        this.board_type = board_type;
    }

    @Override
    public String toString() {
        return "CommunityTO{" +
                "user_seq=" + user_seq +
                ", board_seq=" + board_seq +
                ", board_title='" + board_title + '\'' +
                ", board_content='" + board_content + '\'' +
                ", board_write_date='" + board_write_date + '\'' +
                ", board_type='" + board_type + '\'' +
                '}';
    }
}
