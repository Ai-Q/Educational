package com.Educational.entity;

import java.util.Date;

public class StudentPracticeSkills {
    private Integer studentPracticeId;

    private Integer studentId;

    private Integer staffId;

    private Date practiceStart;

    private Date practiceEnd;

    private String practiceAddress;

    private String practiceContent;

    private String practiceScore;

    private Date regTime;

    private String practiceNote;

    public Integer getStudentPracticeId() {
        return studentPracticeId;
    }

    public void setStudentPracticeId(Integer studentPracticeId) {
        this.studentPracticeId = studentPracticeId;
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

    public Date getPracticeStart() {
        return practiceStart;
    }

    public void setPracticeStart(Date practiceStart) {
        this.practiceStart = practiceStart;
    }

    public Date getPracticeEnd() {
        return practiceEnd;
    }

    public void setPracticeEnd(Date practiceEnd) {
        this.practiceEnd = practiceEnd;
    }

    public String getPracticeAddress() {
        return practiceAddress;
    }

    public void setPracticeAddress(String practiceAddress) {
        this.practiceAddress = practiceAddress == null ? null : practiceAddress.trim();
    }

    public String getPracticeContent() {
        return practiceContent;
    }

    public void setPracticeContent(String practiceContent) {
        this.practiceContent = practiceContent == null ? null : practiceContent.trim();
    }

    public String getPracticeScore() {
        return practiceScore;
    }

    public void setPracticeScore(String practiceScore) {
        this.practiceScore = practiceScore == null ? null : practiceScore.trim();
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getPracticeNote() {
        return practiceNote;
    }

    public void setPracticeNote(String practiceNote) {
        this.practiceNote = practiceNote == null ? null : practiceNote.trim();
    }
}