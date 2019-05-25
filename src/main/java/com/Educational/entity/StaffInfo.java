package com.Educational.entity;

import java.util.Date;

public class StaffInfo {
    private Integer staffId;

    private Integer roleId;

    private String staffName;

    private String staffSex;

    private Integer staffAge;

    private String staffNativePlace;

    private String staffIdcard;

    private Date staffBrithday;

    private String staffOfficePhone;

    private String staffMobilePhone;

    private String staffEamil;

    private String staffAddr;

    private String staffQq;

    private Date staffEntryTime;

    private String staffEductionLevel;

    private String staffRemark;

    private String staffState;

    private String userNumber;

    private String userPassowrd;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex == null ? null : staffSex.trim();
    }

    public Integer getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(Integer staffAge) {
        this.staffAge = staffAge;
    }

    public String getStaffNativePlace() {
        return staffNativePlace;
    }

    public void setStaffNativePlace(String staffNativePlace) {
        this.staffNativePlace = staffNativePlace == null ? null : staffNativePlace.trim();
    }

    public String getStaffIdcard() {
        return staffIdcard;
    }

    public void setStaffIdcard(String staffIdcard) {
        this.staffIdcard = staffIdcard == null ? null : staffIdcard.trim();
    }

    public Date getStaffBrithday() {
        return staffBrithday;
    }

    public void setStaffBrithday(Date staffBrithday) {
        this.staffBrithday = staffBrithday;
    }

    public String getStaffOfficePhone() {
        return staffOfficePhone;
    }

    public void setStaffOfficePhone(String staffOfficePhone) {
        this.staffOfficePhone = staffOfficePhone == null ? null : staffOfficePhone.trim();
    }

    public String getStaffMobilePhone() {
        return staffMobilePhone;
    }

    public void setStaffMobilePhone(String staffMobilePhone) {
        this.staffMobilePhone = staffMobilePhone == null ? null : staffMobilePhone.trim();
    }

    public String getStaffEamil() {
        return staffEamil;
    }

    public void setStaffEamil(String staffEamil) {
        this.staffEamil = staffEamil == null ? null : staffEamil.trim();
    }

    public String getStaffAddr() {
        return staffAddr;
    }

    public void setStaffAddr(String staffAddr) {
        this.staffAddr = staffAddr == null ? null : staffAddr.trim();
    }

    public String getStaffQq() {
        return staffQq;
    }

    public void setStaffQq(String staffQq) {
        this.staffQq = staffQq == null ? null : staffQq.trim();
    }

    public Date getStaffEntryTime() {
        return staffEntryTime;
    }

    public void setStaffEntryTime(Date staffEntryTime) {
        this.staffEntryTime = staffEntryTime;
    }

    public String getStaffEductionLevel() {
        return staffEductionLevel;
    }

    public void setStaffEductionLevel(String staffEductionLevel) {
        this.staffEductionLevel = staffEductionLevel == null ? null : staffEductionLevel.trim();
    }

    public String getStaffRemark() {
        return staffRemark;
    }

    public void setStaffRemark(String staffRemark) {
        this.staffRemark = staffRemark == null ? null : staffRemark.trim();
    }

    public String getStaffState() {
        return staffState;
    }

    public void setStaffState(String staffState) {
        this.staffState = staffState == null ? null : staffState.trim();
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber == null ? null : userNumber.trim();
    }

    public String getUserPassowrd() {
        return userPassowrd;
    }

    public void setUserPassowrd(String userPassowrd) {
        this.userPassowrd = userPassowrd == null ? null : userPassowrd.trim();
    }
}