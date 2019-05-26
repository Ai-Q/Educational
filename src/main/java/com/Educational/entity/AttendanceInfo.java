package com.Educational.entity;

import java.io.Serializable;
import java.util.Date;

public class AttendanceInfo implements Serializable {
    private Integer attendanceId;

    private Integer studentId;

    private Integer staffId;

    private String attendanceDesc;

    private String attendanceState;

    private Date attendanceTime;

    private String attendanceRemark;

    private String attendanceXuenian;

    private String attendanceXueqi;

    private String attendanceMonth;

    public Integer getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
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

    public String getAttendanceDesc() {
        return attendanceDesc;
    }

    public void setAttendanceDesc(String attendanceDesc) {
        this.attendanceDesc = attendanceDesc == null ? null : attendanceDesc.trim();
    }

    public String getAttendanceState() {
        return attendanceState;
    }

    public void setAttendanceState(String attendanceState) {
        this.attendanceState = attendanceState == null ? null : attendanceState.trim();
    }

    public Date getAttendanceTime() {
        return attendanceTime;
    }

    public void setAttendanceTime(Date attendanceTime) {
        this.attendanceTime = attendanceTime;
    }

    public String getAttendanceRemark() {
        return attendanceRemark;
    }

    public void setAttendanceRemark(String attendanceRemark) {
        this.attendanceRemark = attendanceRemark == null ? null : attendanceRemark.trim();
    }

    public String getAttendanceXuenian() {
        return attendanceXuenian;
    }

    public void setAttendanceXuenian(String attendanceXuenian) {
        this.attendanceXuenian = attendanceXuenian == null ? null : attendanceXuenian.trim();
    }

    public String getAttendanceXueqi() {
        return attendanceXueqi;
    }

    public void setAttendanceXueqi(String attendanceXueqi) {
        this.attendanceXueqi = attendanceXueqi == null ? null : attendanceXueqi.trim();
    }

    public String getAttendanceMonth() {
        return attendanceMonth;
    }

    public void setAttendanceMonth(String attendanceMonth) {
        this.attendanceMonth = attendanceMonth == null ? null : attendanceMonth.trim();
    }
}