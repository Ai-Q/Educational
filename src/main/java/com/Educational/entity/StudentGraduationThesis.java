package com.Educational.entity;

import java.io.Serializable;
import java.util.Date;

public class StudentGraduationThesis implements Serializable {
    private Integer studentPaperId;

    private Integer studentId;

    private Integer staffId;

    private String paperTitle;

    private String paperTeacher;

    private String paperStart;

    private Date paperTime;

    private String paperScore;

    private String paperComments;

    private Date regTime;

    private String paperNote;

    public Integer getStudentPaperId() {
        return studentPaperId;
    }

    public void setStudentPaperId(Integer studentPaperId) {
        this.studentPaperId = studentPaperId;
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

    public String getPaperTitle() {
        return paperTitle;
    }

    public void setPaperTitle(String paperTitle) {
        this.paperTitle = paperTitle == null ? null : paperTitle.trim();
    }

    public String getPaperTeacher() {
        return paperTeacher;
    }

    public void setPaperTeacher(String paperTeacher) {
        this.paperTeacher = paperTeacher == null ? null : paperTeacher.trim();
    }

    public String getPaperStart() {
        return paperStart;
    }

    public void setPaperStart(String paperStart) {
        this.paperStart = paperStart == null ? null : paperStart.trim();
    }

    public Date getPaperTime() {
        return paperTime;
    }

    public void setPaperTime(Date paperTime) {
        this.paperTime = paperTime;
    }

    public String getPaperScore() {
        return paperScore;
    }

    public void setPaperScore(String paperScore) {
        this.paperScore = paperScore == null ? null : paperScore.trim();
    }

    public String getPaperComments() {
        return paperComments;
    }

    public void setPaperComments(String paperComments) {
        this.paperComments = paperComments == null ? null : paperComments.trim();
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getPaperNote() {
        return paperNote;
    }

    public void setPaperNote(String paperNote) {
        this.paperNote = paperNote == null ? null : paperNote.trim();
    }
}