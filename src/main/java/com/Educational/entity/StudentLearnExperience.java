package com.Educational.entity;

import java.io.Serializable;
import java.util.Date;

public class StudentLearnExperience  implements Serializable {
    private Integer studentLearnId;

    private Integer studentId;

    private Integer staffId;

    private String learnAllyears;

    private String learnSchool;

    private String learnPosition;

    private Date regTime;

    private String learnNote;

    public Integer getStudentLearnId() {
        return studentLearnId;
    }

    public void setStudentLearnId(Integer studentLearnId) {
        this.studentLearnId = studentLearnId;
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

    public String getLearnAllyears() {
        return learnAllyears;
    }

    public void setLearnAllyears(String learnAllyears) {
        this.learnAllyears = learnAllyears == null ? null : learnAllyears.trim();
    }

    public String getLearnSchool() {
        return learnSchool;
    }

    public void setLearnSchool(String learnSchool) {
        this.learnSchool = learnSchool == null ? null : learnSchool.trim();
    }

    public String getLearnPosition() {
        return learnPosition;
    }

    public void setLearnPosition(String learnPosition) {
        this.learnPosition = learnPosition == null ? null : learnPosition.trim();
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getLearnNote() {
        return learnNote;
    }

    public void setLearnNote(String learnNote) {
        this.learnNote = learnNote == null ? null : learnNote.trim();
    }
}