package com.Educational.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentGraduationThesisExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentGraduationThesisExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andStudentPaperIdIsNull() {
            addCriterion("student_paper_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentPaperIdIsNotNull() {
            addCriterion("student_paper_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPaperIdEqualTo(Integer value) {
            addCriterion("student_paper_id =", value, "studentPaperId");
            return (Criteria) this;
        }

        public Criteria andStudentPaperIdNotEqualTo(Integer value) {
            addCriterion("student_paper_id <>", value, "studentPaperId");
            return (Criteria) this;
        }

        public Criteria andStudentPaperIdGreaterThan(Integer value) {
            addCriterion("student_paper_id >", value, "studentPaperId");
            return (Criteria) this;
        }

        public Criteria andStudentPaperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_paper_id >=", value, "studentPaperId");
            return (Criteria) this;
        }

        public Criteria andStudentPaperIdLessThan(Integer value) {
            addCriterion("student_paper_id <", value, "studentPaperId");
            return (Criteria) this;
        }

        public Criteria andStudentPaperIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_paper_id <=", value, "studentPaperId");
            return (Criteria) this;
        }

        public Criteria andStudentPaperIdIn(List<Integer> values) {
            addCriterion("student_paper_id in", values, "studentPaperId");
            return (Criteria) this;
        }

        public Criteria andStudentPaperIdNotIn(List<Integer> values) {
            addCriterion("student_paper_id not in", values, "studentPaperId");
            return (Criteria) this;
        }

        public Criteria andStudentPaperIdBetween(Integer value1, Integer value2) {
            addCriterion("student_paper_id between", value1, value2, "studentPaperId");
            return (Criteria) this;
        }

        public Criteria andStudentPaperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_paper_id not between", value1, value2, "studentPaperId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andPaperTitleIsNull() {
            addCriterion("paper_title is null");
            return (Criteria) this;
        }

        public Criteria andPaperTitleIsNotNull() {
            addCriterion("paper_title is not null");
            return (Criteria) this;
        }

        public Criteria andPaperTitleEqualTo(String value) {
            addCriterion("paper_title =", value, "paperTitle");
            return (Criteria) this;
        }

        public Criteria andPaperTitleNotEqualTo(String value) {
            addCriterion("paper_title <>", value, "paperTitle");
            return (Criteria) this;
        }

        public Criteria andPaperTitleGreaterThan(String value) {
            addCriterion("paper_title >", value, "paperTitle");
            return (Criteria) this;
        }

        public Criteria andPaperTitleGreaterThanOrEqualTo(String value) {
            addCriterion("paper_title >=", value, "paperTitle");
            return (Criteria) this;
        }

        public Criteria andPaperTitleLessThan(String value) {
            addCriterion("paper_title <", value, "paperTitle");
            return (Criteria) this;
        }

        public Criteria andPaperTitleLessThanOrEqualTo(String value) {
            addCriterion("paper_title <=", value, "paperTitle");
            return (Criteria) this;
        }

        public Criteria andPaperTitleLike(String value) {
            addCriterion("paper_title like", value, "paperTitle");
            return (Criteria) this;
        }

        public Criteria andPaperTitleNotLike(String value) {
            addCriterion("paper_title not like", value, "paperTitle");
            return (Criteria) this;
        }

        public Criteria andPaperTitleIn(List<String> values) {
            addCriterion("paper_title in", values, "paperTitle");
            return (Criteria) this;
        }

        public Criteria andPaperTitleNotIn(List<String> values) {
            addCriterion("paper_title not in", values, "paperTitle");
            return (Criteria) this;
        }

        public Criteria andPaperTitleBetween(String value1, String value2) {
            addCriterion("paper_title between", value1, value2, "paperTitle");
            return (Criteria) this;
        }

        public Criteria andPaperTitleNotBetween(String value1, String value2) {
            addCriterion("paper_title not between", value1, value2, "paperTitle");
            return (Criteria) this;
        }

        public Criteria andPaperTeacherIsNull() {
            addCriterion("paper_teacher is null");
            return (Criteria) this;
        }

        public Criteria andPaperTeacherIsNotNull() {
            addCriterion("paper_teacher is not null");
            return (Criteria) this;
        }

        public Criteria andPaperTeacherEqualTo(String value) {
            addCriterion("paper_teacher =", value, "paperTeacher");
            return (Criteria) this;
        }

        public Criteria andPaperTeacherNotEqualTo(String value) {
            addCriterion("paper_teacher <>", value, "paperTeacher");
            return (Criteria) this;
        }

        public Criteria andPaperTeacherGreaterThan(String value) {
            addCriterion("paper_teacher >", value, "paperTeacher");
            return (Criteria) this;
        }

        public Criteria andPaperTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("paper_teacher >=", value, "paperTeacher");
            return (Criteria) this;
        }

        public Criteria andPaperTeacherLessThan(String value) {
            addCriterion("paper_teacher <", value, "paperTeacher");
            return (Criteria) this;
        }

        public Criteria andPaperTeacherLessThanOrEqualTo(String value) {
            addCriterion("paper_teacher <=", value, "paperTeacher");
            return (Criteria) this;
        }

        public Criteria andPaperTeacherLike(String value) {
            addCriterion("paper_teacher like", value, "paperTeacher");
            return (Criteria) this;
        }

        public Criteria andPaperTeacherNotLike(String value) {
            addCriterion("paper_teacher not like", value, "paperTeacher");
            return (Criteria) this;
        }

        public Criteria andPaperTeacherIn(List<String> values) {
            addCriterion("paper_teacher in", values, "paperTeacher");
            return (Criteria) this;
        }

        public Criteria andPaperTeacherNotIn(List<String> values) {
            addCriterion("paper_teacher not in", values, "paperTeacher");
            return (Criteria) this;
        }

        public Criteria andPaperTeacherBetween(String value1, String value2) {
            addCriterion("paper_teacher between", value1, value2, "paperTeacher");
            return (Criteria) this;
        }

        public Criteria andPaperTeacherNotBetween(String value1, String value2) {
            addCriterion("paper_teacher not between", value1, value2, "paperTeacher");
            return (Criteria) this;
        }

        public Criteria andPaperStartIsNull() {
            addCriterion("paper_start is null");
            return (Criteria) this;
        }

        public Criteria andPaperStartIsNotNull() {
            addCriterion("paper_start is not null");
            return (Criteria) this;
        }

        public Criteria andPaperStartEqualTo(String value) {
            addCriterion("paper_start =", value, "paperStart");
            return (Criteria) this;
        }

        public Criteria andPaperStartNotEqualTo(String value) {
            addCriterion("paper_start <>", value, "paperStart");
            return (Criteria) this;
        }

        public Criteria andPaperStartGreaterThan(String value) {
            addCriterion("paper_start >", value, "paperStart");
            return (Criteria) this;
        }

        public Criteria andPaperStartGreaterThanOrEqualTo(String value) {
            addCriterion("paper_start >=", value, "paperStart");
            return (Criteria) this;
        }

        public Criteria andPaperStartLessThan(String value) {
            addCriterion("paper_start <", value, "paperStart");
            return (Criteria) this;
        }

        public Criteria andPaperStartLessThanOrEqualTo(String value) {
            addCriterion("paper_start <=", value, "paperStart");
            return (Criteria) this;
        }

        public Criteria andPaperStartLike(String value) {
            addCriterion("paper_start like", value, "paperStart");
            return (Criteria) this;
        }

        public Criteria andPaperStartNotLike(String value) {
            addCriterion("paper_start not like", value, "paperStart");
            return (Criteria) this;
        }

        public Criteria andPaperStartIn(List<String> values) {
            addCriterion("paper_start in", values, "paperStart");
            return (Criteria) this;
        }

        public Criteria andPaperStartNotIn(List<String> values) {
            addCriterion("paper_start not in", values, "paperStart");
            return (Criteria) this;
        }

        public Criteria andPaperStartBetween(String value1, String value2) {
            addCriterion("paper_start between", value1, value2, "paperStart");
            return (Criteria) this;
        }

        public Criteria andPaperStartNotBetween(String value1, String value2) {
            addCriterion("paper_start not between", value1, value2, "paperStart");
            return (Criteria) this;
        }

        public Criteria andPaperTimeIsNull() {
            addCriterion("paper_time is null");
            return (Criteria) this;
        }

        public Criteria andPaperTimeIsNotNull() {
            addCriterion("paper_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaperTimeEqualTo(Date value) {
            addCriterion("paper_time =", value, "paperTime");
            return (Criteria) this;
        }

        public Criteria andPaperTimeNotEqualTo(Date value) {
            addCriterion("paper_time <>", value, "paperTime");
            return (Criteria) this;
        }

        public Criteria andPaperTimeGreaterThan(Date value) {
            addCriterion("paper_time >", value, "paperTime");
            return (Criteria) this;
        }

        public Criteria andPaperTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("paper_time >=", value, "paperTime");
            return (Criteria) this;
        }

        public Criteria andPaperTimeLessThan(Date value) {
            addCriterion("paper_time <", value, "paperTime");
            return (Criteria) this;
        }

        public Criteria andPaperTimeLessThanOrEqualTo(Date value) {
            addCriterion("paper_time <=", value, "paperTime");
            return (Criteria) this;
        }

        public Criteria andPaperTimeIn(List<Date> values) {
            addCriterion("paper_time in", values, "paperTime");
            return (Criteria) this;
        }

        public Criteria andPaperTimeNotIn(List<Date> values) {
            addCriterion("paper_time not in", values, "paperTime");
            return (Criteria) this;
        }

        public Criteria andPaperTimeBetween(Date value1, Date value2) {
            addCriterion("paper_time between", value1, value2, "paperTime");
            return (Criteria) this;
        }

        public Criteria andPaperTimeNotBetween(Date value1, Date value2) {
            addCriterion("paper_time not between", value1, value2, "paperTime");
            return (Criteria) this;
        }

        public Criteria andPaperScoreIsNull() {
            addCriterion("paper_score is null");
            return (Criteria) this;
        }

        public Criteria andPaperScoreIsNotNull() {
            addCriterion("paper_score is not null");
            return (Criteria) this;
        }

        public Criteria andPaperScoreEqualTo(String value) {
            addCriterion("paper_score =", value, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreNotEqualTo(String value) {
            addCriterion("paper_score <>", value, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreGreaterThan(String value) {
            addCriterion("paper_score >", value, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreGreaterThanOrEqualTo(String value) {
            addCriterion("paper_score >=", value, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreLessThan(String value) {
            addCriterion("paper_score <", value, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreLessThanOrEqualTo(String value) {
            addCriterion("paper_score <=", value, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreLike(String value) {
            addCriterion("paper_score like", value, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreNotLike(String value) {
            addCriterion("paper_score not like", value, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreIn(List<String> values) {
            addCriterion("paper_score in", values, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreNotIn(List<String> values) {
            addCriterion("paper_score not in", values, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreBetween(String value1, String value2) {
            addCriterion("paper_score between", value1, value2, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreNotBetween(String value1, String value2) {
            addCriterion("paper_score not between", value1, value2, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperCommentsIsNull() {
            addCriterion("paper_comments is null");
            return (Criteria) this;
        }

        public Criteria andPaperCommentsIsNotNull() {
            addCriterion("paper_comments is not null");
            return (Criteria) this;
        }

        public Criteria andPaperCommentsEqualTo(String value) {
            addCriterion("paper_comments =", value, "paperComments");
            return (Criteria) this;
        }

        public Criteria andPaperCommentsNotEqualTo(String value) {
            addCriterion("paper_comments <>", value, "paperComments");
            return (Criteria) this;
        }

        public Criteria andPaperCommentsGreaterThan(String value) {
            addCriterion("paper_comments >", value, "paperComments");
            return (Criteria) this;
        }

        public Criteria andPaperCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("paper_comments >=", value, "paperComments");
            return (Criteria) this;
        }

        public Criteria andPaperCommentsLessThan(String value) {
            addCriterion("paper_comments <", value, "paperComments");
            return (Criteria) this;
        }

        public Criteria andPaperCommentsLessThanOrEqualTo(String value) {
            addCriterion("paper_comments <=", value, "paperComments");
            return (Criteria) this;
        }

        public Criteria andPaperCommentsLike(String value) {
            addCriterion("paper_comments like", value, "paperComments");
            return (Criteria) this;
        }

        public Criteria andPaperCommentsNotLike(String value) {
            addCriterion("paper_comments not like", value, "paperComments");
            return (Criteria) this;
        }

        public Criteria andPaperCommentsIn(List<String> values) {
            addCriterion("paper_comments in", values, "paperComments");
            return (Criteria) this;
        }

        public Criteria andPaperCommentsNotIn(List<String> values) {
            addCriterion("paper_comments not in", values, "paperComments");
            return (Criteria) this;
        }

        public Criteria andPaperCommentsBetween(String value1, String value2) {
            addCriterion("paper_comments between", value1, value2, "paperComments");
            return (Criteria) this;
        }

        public Criteria andPaperCommentsNotBetween(String value1, String value2) {
            addCriterion("paper_comments not between", value1, value2, "paperComments");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNull() {
            addCriterion("reg_time is null");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNotNull() {
            addCriterion("reg_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegTimeEqualTo(Date value) {
            addCriterion("reg_time =", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotEqualTo(Date value) {
            addCriterion("reg_time <>", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThan(Date value) {
            addCriterion("reg_time >", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reg_time >=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThan(Date value) {
            addCriterion("reg_time <", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThanOrEqualTo(Date value) {
            addCriterion("reg_time <=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeIn(List<Date> values) {
            addCriterion("reg_time in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotIn(List<Date> values) {
            addCriterion("reg_time not in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeBetween(Date value1, Date value2) {
            addCriterion("reg_time between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotBetween(Date value1, Date value2) {
            addCriterion("reg_time not between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andPaperNoteIsNull() {
            addCriterion("paper_note is null");
            return (Criteria) this;
        }

        public Criteria andPaperNoteIsNotNull() {
            addCriterion("paper_note is not null");
            return (Criteria) this;
        }

        public Criteria andPaperNoteEqualTo(String value) {
            addCriterion("paper_note =", value, "paperNote");
            return (Criteria) this;
        }

        public Criteria andPaperNoteNotEqualTo(String value) {
            addCriterion("paper_note <>", value, "paperNote");
            return (Criteria) this;
        }

        public Criteria andPaperNoteGreaterThan(String value) {
            addCriterion("paper_note >", value, "paperNote");
            return (Criteria) this;
        }

        public Criteria andPaperNoteGreaterThanOrEqualTo(String value) {
            addCriterion("paper_note >=", value, "paperNote");
            return (Criteria) this;
        }

        public Criteria andPaperNoteLessThan(String value) {
            addCriterion("paper_note <", value, "paperNote");
            return (Criteria) this;
        }

        public Criteria andPaperNoteLessThanOrEqualTo(String value) {
            addCriterion("paper_note <=", value, "paperNote");
            return (Criteria) this;
        }

        public Criteria andPaperNoteLike(String value) {
            addCriterion("paper_note like", value, "paperNote");
            return (Criteria) this;
        }

        public Criteria andPaperNoteNotLike(String value) {
            addCriterion("paper_note not like", value, "paperNote");
            return (Criteria) this;
        }

        public Criteria andPaperNoteIn(List<String> values) {
            addCriterion("paper_note in", values, "paperNote");
            return (Criteria) this;
        }

        public Criteria andPaperNoteNotIn(List<String> values) {
            addCriterion("paper_note not in", values, "paperNote");
            return (Criteria) this;
        }

        public Criteria andPaperNoteBetween(String value1, String value2) {
            addCriterion("paper_note between", value1, value2, "paperNote");
            return (Criteria) this;
        }

        public Criteria andPaperNoteNotBetween(String value1, String value2) {
            addCriterion("paper_note not between", value1, value2, "paperNote");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}