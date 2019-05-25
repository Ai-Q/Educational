package com.Educational.entity;

import java.util.Date;

public class CommunicateInfo {
    private Integer communicateId;

    private Integer studentId;

    private Integer staffId;

    private Date communicateTime;

    private String communicateContent;

    private String communicateXuenian;

    private String communicateXueqi;

    private Integer leaveCount;

    private Integer truancyCount;

    private String rewardPunish;

    public Integer getCommunicateId() {
        return communicateId;
    }

    public void setCommunicateId(Integer communicateId) {
        this.communicateId = communicateId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Date getCommunicateTime() {
        return communicateTime;
    }

    public void setCommunicateTime(Date communicateTime) {
        this.communicateTime = communicateTime;
    }

    public String getCommunicateContent() {
        return communicateContent;
    }

    public void setCommunicateContent(String communicateContent) {
        this.communicateContent = communicateContent == null ? null : communicateContent.trim();
    }

    public String getCommunicateXuenian() {
        return communicateXuenian;
    }

    public void setCommunicateXuenian(String communicateXuenian) {
        this.communicateXuenian = communicateXuenian == null ? null : communicateXuenian.trim();
    }

    public String getCommunicateXueqi() {
        return communicateXueqi;
    }

    public void setCommunicateXueqi(String communicateXueqi) {
        this.communicateXueqi = communicateXueqi == null ? null : communicateXueqi.trim();
    }

    public Integer getLeaveCount() {
        return leaveCount;
    }

    public void setLeaveCount(Integer leaveCount) {
        this.leaveCount = leaveCount;
    }

    public Integer getTruancyCount() {
        return truancyCount;
    }

    public void setTruancyCount(Integer truancyCount) {
        this.truancyCount = truancyCount;
    }

    public String getRewardPunish() {
        return rewardPunish;
    }

    public void setRewardPunish(String rewardPunish) {
        this.rewardPunish = rewardPunish == null ? null : rewardPunish.trim();
    }
}