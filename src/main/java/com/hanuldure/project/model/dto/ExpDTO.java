package com.hanuldure.project.model.dto;

import java.util.Date;

public class ExpDTO implements java.io.Serializable {
    private int expSeq; //체험번호
    private int userSeq; //농업인 번호
    private String expTitle; //체험제목
    private String expContent; //체험 내용
    private Date expStart; //시작일시
    private Date expEnd; //종료일시
    private Date expGetStart; //모집시작일시
    private Date expGetEnd; //모집 마감일시
    private int expMin; //최소인원
    private int expMax; //최대 인원
    private String expAddr; //주소
    private String expAddrDetail; //상세 주소
    private String expImg; //체험 이미지
    private int expPrice; //체험 비용
    private int revSeq; //체험후기 번호
    private String revContent; //후기 내용
    private String revWriteDate; //작성일시

    private String userName; //작성자 닉네임
    private int expTime; //소요시간

    public ExpDTO() {
    }

    public ExpDTO(int expSeq, int userSeq, String expTitle, String expContent, Date expStart, Date expEnd, Date expGetStart, Date expGetEnd, int expMin, int expMax, String expAddr, String expAddrDetail, String expImg, int expPrice, int revSeq, String revContent, String revWriteDate, String userName, int expTime) {
        this.expSeq = expSeq;
        this.userSeq = userSeq;
        this.expTitle = expTitle;
        this.expContent = expContent;
        this.expStart = expStart;
        this.expEnd = expEnd;
        this.expGetStart = expGetStart;
        this.expGetEnd = expGetEnd;
        this.expMin = expMin;
        this.expMax = expMax;
        this.expAddr = expAddr;
        this.expAddrDetail = expAddrDetail;
        this.expImg = expImg;
        this.expPrice = expPrice;
        this.revSeq = revSeq;
        this.revContent = revContent;
        this.revWriteDate = revWriteDate;
        this.userName = userName;
        this.expTime = expTime;
    }

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

    public Date getExpStart() {
        return expStart;
    }

    public void setExpStart(Date expStart) {
        this.expStart = expStart;
    }

    public Date getExpEnd() {
        return expEnd;
    }

    public void setExpEnd(Date expEnd) {
        this.expEnd = expEnd;
    }

    public Date getExpGetStart() {
        return expGetStart;
    }

    public void setExpGetStart(Date expGetStart) {
        this.expGetStart = expGetStart;
    }

    public Date getExpGetEnd() {
        return expGetEnd;
    }

    public void setExpGetEnd(Date expGetEnd) {
        this.expGetEnd = expGetEnd;
    }

    public int getExpMin() {
        return expMin;
    }

    public void setExpMin(int expMin) {
        this.expMin = expMin;
    }

    public int getExpMax() {
        return expMax;
    }

    public void setExpMax(int expMax) {
        this.expMax = expMax;
    }

    public String getExpAddr() {
        return expAddr;
    }

    public void setExpAddr(String expAddr) {
        this.expAddr = expAddr;
    }

    public String getExpAddrDetail() {
        return expAddrDetail;
    }

    public void setExpAddrDetail(String expAddrDetail) {
        this.expAddrDetail = expAddrDetail;
    }

    public String getExpImg() {
        return expImg;
    }

    public void setExpImg(String expImg) {
        this.expImg = expImg;
    }

    public int getExpPrice() {
        return expPrice;
    }

    public void setExpPrice(int expPrice) {
        this.expPrice = expPrice;
    }

    public int getRevSeq() {
        return revSeq;
    }

    public void setRevSeq(int revSeq) {
        this.revSeq = revSeq;
    }

    public String getRevContent() {
        return revContent;
    }

    public void setRevContent(String revContent) {
        this.revContent = revContent;
    }

    public String getRevWriteDate() {
        return revWriteDate;
    }

    public void setRevWriteDate(String revWriteDate) {
        this.revWriteDate = revWriteDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getExpTime() {
        return expTime;
    }

    public void setExpTime(int expTime) {
        this.expTime = expTime;
    }

    @Override
    public String toString() {
        return "ExpDTO{" +
                "expSeq=" + expSeq +
                ", userSeq=" + userSeq +
                ", expTitle='" + expTitle + '\'' +
                ", expContent='" + expContent + '\'' +
                ", expStart=" + expStart +
                ", expEnd=" + expEnd +
                ", expGetStart=" + expGetStart +
                ", expGetEnd=" + expGetEnd +
                ", expMin=" + expMin +
                ", expMax=" + expMax +
                ", expAddr='" + expAddr + '\'' +
                ", expAddrDetail='" + expAddrDetail + '\'' +
                ", expImg='" + expImg + '\'' +
                ", expPrice=" + expPrice +
                ", revSeq=" + revSeq +
                ", revContent='" + revContent + '\'' +
                ", revWriteDate='" + revWriteDate + '\'' +
                ", userName='" + userName + '\'' +
                ", expTime=" + expTime +
                '}';
    }

    private String expStatus;

    public String getExpStatus() {
        return expStatus;
    }

    public void setExpStatus(String expStatus) {
        this.expStatus = expStatus;
    }
}
