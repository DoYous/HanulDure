package com.hanuldure.project.model.dto;

public class MemberDTO {

    private String id;
    private String pw;
    private String email;
    private String name;
    private String birth;
    private String phone;
    private int userType;
    private String userRegion;

    public MemberDTO() {
    }

    public MemberDTO(String id, String pw, String email, String name, String birth, String phone, int userType, String userRegion) {
        this.id = id;
        this.pw = pw;
        this.email = email;
        this.name = name;
        this.birth = birth;
        this.phone = phone;
        this.userType = userType;
        this.userRegion = userRegion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getUserRegion() {
        return userRegion;
    }

    public void setUserRegion(String userRegion) {
        this.userRegion = userRegion;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", phone='" + phone + '\'' +
                ", userType=" + userType +
                ", userRegion='" + userRegion + '\'' +
                '}';
    }
}
