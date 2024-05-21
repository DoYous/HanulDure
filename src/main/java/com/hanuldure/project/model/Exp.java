package com.hanuldure.project.model;

public class Exp {
    private int expSeq;
    private int userSeq;
    private String expTitle;
    private String expContent;
    private int currentParticipants;
    private String expStatus;  // 관리자 승인 상태
    private String expStatus2; // 진행 상태

    // Getters and Setters

    public int getExpSeq() {
        return expSeq;
    }

    public void setExpSeq(int expSeq) {
        this.expSeq = expSeq;
    }

    public int getUserSeq() {
        return userSeq;
    }

    public void setUserSeq(int userSeq) {
        this.userSeq = userSeq;
    }

    public String getExpTitle() {
        return expTitle;
    }

    public void setExpTitle(String expTitle) {
        this.expTitle = expTitle;
    }

    public String getExpContent() {
        return expContent;
    }

    public void setExpContent(String expContent) {
        this.expContent = expContent;
    }

    public int getCurrentParticipants() {
        return currentParticipants;
    }

    public void setCurrentParticipants(int currentParticipants) {
        this.currentParticipants = currentParticipants;
    }

    public String getExpStatus() {
        return expStatus;
    }

    public void setExpStatus(String expStatus) {
        this.expStatus = expStatus;
    }

    public String getExpStatus2() {
        return expStatus2;
    }

    public void setExpStatus2(String expStatus2) {
        this.expStatus2 = expStatus2;
    }
}
