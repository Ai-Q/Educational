package com.Educational.entity;

import java.io.Serializable;
import java.util.Date;

public class EvaluationXueqi implements Serializable {
    private Integer evaluationId;

    private Integer studentId;

    private Integer disciplineId;

    private Integer staffId;

    private Integer classId;

    private String evaluationXueqi;

    private String evaluationMonth;

    private String evaluationMajor;

    private String evaluationContent;

    private Date evaluationTime;

    private String evaluationNote;

    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(Integer disciplineId) {
        this.disciplineId = disciplineId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getEvaluationXueqi() {
        return evaluationXueqi;
    }

    public void setEvaluationXueqi(String evaluationXueqi) {
        this.evaluationXueqi = evaluationXueqi == null ? null : evaluationXueqi.trim();
    }

    public String getEvaluationMonth() {
        return evaluationMonth;
    }

    public void setEvaluationMonth(String evaluationMonth) {
        this.evaluationMonth = evaluationMonth == null ? null : evaluationMonth.trim();
    }

    public String getEvaluationMajor() {
        return evaluationMajor;
    }

    public void setEvaluationMajor(String evaluationMajor) {
        this.evaluationMajor = evaluationMajor == null ? null : evaluationMajor.trim();
    }

    public String getEvaluationContent() {
        return evaluationContent;
    }

    public void setEvaluationContent(String evaluationContent) {
        this.evaluationContent = evaluationContent == null ? null : evaluationContent.trim();
    }

    public Date getEvaluationTime() {
        return evaluationTime;
    }

    public void setEvaluationTime(Date evaluationTime) {
        this.evaluationTime = evaluationTime;
    }

    public String getEvaluationNote() {
        return evaluationNote;
    }

    public void setEvaluationNote(String evaluationNote) {
        this.evaluationNote = evaluationNote == null ? null : evaluationNote.trim();
    }
}