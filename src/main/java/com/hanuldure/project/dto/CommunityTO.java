package com.hanuldure.project.dto;

public class CommunityTO {

    private int user_seq;

    private int board_seq;
    private String board_title;
    private String board_content;
    private String board_write_date;
    private char board_type;

    public CommunityTO() {
    }

    public CommunityTO(int user_seq, int board_seq, String board_title, String board_content, String board_write_date, char board_type) {
        this.user_seq = user_seq;
        this.board_seq = board_seq;
        this.board_title = board_title;
        this.board_content = board_content;
        this.board_write_date = board_write_date;
        this.board_type = board_type;
    }

    public int getUser_seq() {
        return user_seq;
    }

    public void setUser_seq(int user_seq) {
        this.user_seq = user_seq;
    }

    public int getBoard_seq() {
        return board_seq;
    }

    public void setBoard_seq(int board_seq) {
        this.board_seq = board_seq;
    }

    public String getBoard_title() {
        return board_title;
    }

    public void setBoard_title(String board_title) {
        this.board_title = board_title;
    }

    public String getBoard_content() {
        return board_content;
    }

    public void setBoard_content(String board_content) {
        this.board_content = board_content;
    }

    public String getBoard_write_date() {
        return board_write_date;
    }

    public void setBoard_write_date(String board_write_date) {
        this.board_write_date = board_write_date;
    }

    public char getBoard_type() {
        return board_type;
    }

    public void setBoard_type(char board_type) {
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
                ", board_type=" + board_type +
                '}';
    }
}
