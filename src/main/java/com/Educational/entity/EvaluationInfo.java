package com.Educational.entity;

import java.util.Date;

public class EvaluationInfo {
    private Integer evaluationId;

    private Integer studentId;

    private Integer disciplineId;

    private Integer staffId;

    private Integer classId;

    private String evaluationXueqi;

    private String evaluationMonth;

    private String evaluationMajor;

    private Integer score1;

    private Integer score2;

    private Integer score3;

    private Integer score4;

    private Integer score5;

    private Integer score6;

    private Integer sum;

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

    public Integer getScore1() {
        return score1;
    }

    public void setScore1(Integer score1) {
        this.score1 = score1;
    }

    public Integer getScore2() {
        return score2;
    }

    public void setScore2(Integer score2) {
        this.score2 = score2;
    }

    public Integer getScore3() {
        return score3;
    }

    public void setScore3(Integer score3) {
        this.score3 = score3;
    }

    public Integer getScore4() {
        return score4;
    }

    public void setScore4(Integer score4) {
        this.score4 = score4;
    }

    public Integer getScore5() {
        return score5;
    }

    public void setScore5(Integer score5) {
        this.score5 = score5;
    }

    public Integer getScore6() {
        return score6;
    }

    public void setScore6(Integer score6) {
        this.score6 = score6;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
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