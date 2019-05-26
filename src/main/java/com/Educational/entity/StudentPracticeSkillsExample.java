package com.Educational.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentPracticeSkillsExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentPracticeSkillsExample() {
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

        public Criteria andStudentPracticeIdIsNull() {
            addCriterion("student_practice_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdIsNotNull() {
            addCriterion("student_practice_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdEqualTo(Integer value) {
            addCriterion("student_practice_id =", value, "studentPracticeId");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdNotEqualTo(Integer value) {
            addCriterion("student_practice_id <>", value, "studentPracticeId");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdGreaterThan(Integer value) {
            addCriterion("student_practice_id >", value, "studentPracticeId");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_practice_id >=", value, "studentPracticeId");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdLessThan(Integer value) {
            addCriterion("student_practice_id <", value, "studentPracticeId");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_practice_id <=", value, "studentPracticeId");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdIn(List<Integer> values) {
            addCriterion("student_practice_id in", values, "studentPracticeId");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdNotIn(List<Integer> values) {
            addCriterion("student_practice_id not in", values, "studentPracticeId");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdBetween(Integer value1, Integer value2) {
            addCriterion("student_practice_id between", value1, value2, "studentPracticeId");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_practice_id not between", value1, value2, "studentPracticeId");
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

        public Criteria andPracticeStartIsNull() {
            addCriterion("practice_start is null");
            return (Criteria) this;
        }

        public Criteria andPracticeStartIsNotNull() {
            addCriterion("practice_start is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeStartEqualTo(Date value) {
            addCriterion("practice_start =", value, "practiceStart");
            return (Criteria) this;
        }

        public Criteria andPracticeStartNotEqualTo(Date value) {
            addCriterion("practice_start <>", value, "practiceStart");
            return (Criteria) this;
        }

        public Criteria andPracticeStartGreaterThan(Date value) {
            addCriterion("practice_start >", value, "practiceStart");
            return (Criteria) this;
        }

        public Criteria andPracticeStartGreaterThanOrEqualTo(Date value) {
            addCriterion("practice_start >=", value, "practiceStart");
            return (Criteria) this;
        }

        public Criteria andPracticeStartLessThan(Date value) {
            addCriterion("practice_start <", value, "practiceStart");
            return (Criteria) this;
        }

        public Criteria andPracticeStartLessThanOrEqualTo(Date value) {
            addCriterion("practice_start <=", value, "practiceStart");
            return (Criteria) this;
        }

        public Criteria andPracticeStartIn(List<Date> values) {
            addCriterion("practice_start in", values, "practiceStart");
            return (Criteria) this;
        }

        public Criteria andPracticeStartNotIn(List<Date> values) {
            addCriterion("practice_start not in", values, "practiceStart");
            return (Criteria) this;
        }

        public Criteria andPracticeStartBetween(Date value1, Date value2) {
            addCriterion("practice_start between", value1, value2, "practiceStart");
            return (Criteria) this;
        }

        public Criteria andPracticeStartNotBetween(Date value1, Date value2) {
            addCriterion("practice_start not between", value1, value2, "practiceStart");
            return (Criteria) this;
        }

        public Criteria andPracticeEndIsNull() {
            addCriterion("practice_end is null");
            return (Criteria) this;
        }

        public Criteria andPracticeEndIsNotNull() {
            addCriterion("practice_end is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeEndEqualTo(Date value) {
            addCriterion("practice_end =", value, "practiceEnd");
            return (Criteria) this;
        }

        public Criteria andPracticeEndNotEqualTo(Date value) {
            addCriterion("practice_end <>", value, "practiceEnd");
            return (Criteria) this;
        }

        public Criteria andPracticeEndGreaterThan(Date value) {
            addCriterion("practice_end >", value, "practiceEnd");
            return (Criteria) this;
        }

        public Criteria andPracticeEndGreaterThanOrEqualTo(Date value) {
            addCriterion("practice_end >=", value, "practiceEnd");
            return (Criteria) this;
        }

        public Criteria andPracticeEndLessThan(Date value) {
            addCriterion("practice_end <", value, "practiceEnd");
            return (Criteria) this;
        }

        public Criteria andPracticeEndLessThanOrEqualTo(Date value) {
            addCriterion("practice_end <=", value, "practiceEnd");
            return (Criteria) this;
        }

        public Criteria andPracticeEndIn(List<Date> values) {
            addCriterion("practice_end in", values, "practiceEnd");
            return (Criteria) this;
        }

        public Criteria andPracticeEndNotIn(List<Date> values) {
            addCriterion("practice_end not in", values, "practiceEnd");
            return (Criteria) this;
        }

        public Criteria andPracticeEndBetween(Date value1, Date value2) {
            addCriterion("practice_end between", value1, value2, "practiceEnd");
            return (Criteria) this;
        }

        public Criteria andPracticeEndNotBetween(Date value1, Date value2) {
            addCriterion("practice_end not between", value1, value2, "practiceEnd");
            return (Criteria) this;
        }

        public Criteria andPracticeAddressIsNull() {
            addCriterion("practice_address is null");
            return (Criteria) this;
        }

        public Criteria andPracticeAddressIsNotNull() {
            addCriterion("practice_address is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeAddressEqualTo(String value) {
            addCriterion("practice_address =", value, "practiceAddress");
            return (Criteria) this;
        }

        public Criteria andPracticeAddressNotEqualTo(String value) {
            addCriterion("practice_address <>", value, "practiceAddress");
            return (Criteria) this;
        }

        public Criteria andPracticeAddressGreaterThan(String value) {
            addCriterion("practice_address >", value, "practiceAddress");
            return (Criteria) this;
        }

        public Criteria andPracticeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("practice_address >=", value, "practiceAddress");
            return (Criteria) this;
        }

        public Criteria andPracticeAddressLessThan(String value) {
            addCriterion("practice_address <", value, "practiceAddress");
            return (Criteria) this;
        }

        public Criteria andPracticeAddressLessThanOrEqualTo(String value) {
            addCriterion("practice_address <=", value, "practiceAddress");
            return (Criteria) this;
        }

        public Criteria andPracticeAddressLike(String value) {
            addCriterion("practice_address like", value, "practiceAddress");
            return (Criteria) this;
        }

        public Criteria andPracticeAddressNotLike(String value) {
            addCriterion("practice_address not like", value, "practiceAddress");
            return (Criteria) this;
        }

        public Criteria andPracticeAddressIn(List<String> values) {
            addCriterion("practice_address in", values, "practiceAddress");
            return (Criteria) this;
        }

        public Criteria andPracticeAddressNotIn(List<String> values) {
            addCriterion("practice_address not in", values, "practiceAddress");
            return (Criteria) this;
        }

        public Criteria andPracticeAddressBetween(String value1, String value2) {
            addCriterion("practice_address between", value1, value2, "practiceAddress");
            return (Criteria) this;
        }

        public Criteria andPracticeAddressNotBetween(String value1, String value2) {
            addCriterion("practice_address not between", value1, value2, "practiceAddress");
            return (Criteria) this;
        }

        public Criteria andPracticeContentIsNull() {
            addCriterion("practice_content is null");
            return (Criteria) this;
        }

        public Criteria andPracticeContentIsNotNull() {
            addCriterion("practice_content is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeContentEqualTo(String value) {
            addCriterion("practice_content =", value, "practiceContent");
            return (Criteria) this;
        }

        public Criteria andPracticeContentNotEqualTo(String value) {
            addCriterion("practice_content <>", value, "practiceContent");
            return (Criteria) this;
        }

        public Criteria andPracticeContentGreaterThan(String value) {
            addCriterion("practice_content >", value, "practiceContent");
            return (Criteria) this;
        }

        public Criteria andPracticeContentGreaterThanOrEqualTo(String value) {
            addCriterion("practice_content >=", value, "practiceContent");
            return (Criteria) this;
        }

        public Criteria andPracticeContentLessThan(String value) {
            addCriterion("practice_content <", value, "practiceContent");
            return (Criteria) this;
        }

        public Criteria andPracticeContentLessThanOrEqualTo(String value) {
            addCriterion("practice_content <=", value, "practiceContent");
            return (Criteria) this;
        }

        public Criteria andPracticeContentLike(String value) {
            addCriterion("practice_content like", value, "practiceContent");
            return (Criteria) this;
        }

        public Criteria andPracticeContentNotLike(String value) {
            addCriterion("practice_content not like", value, "practiceContent");
            return (Criteria) this;
        }

        public Criteria andPracticeContentIn(List<String> values) {
            addCriterion("practice_content in", values, "practiceContent");
            return (Criteria) this;
        }

        public Criteria andPracticeContentNotIn(List<String> values) {
            addCriterion("practice_content not in", values, "practiceContent");
            return (Criteria) this;
        }

        public Criteria andPracticeContentBetween(String value1, String value2) {
            addCriterion("practice_content between", value1, value2, "practiceContent");
            return (Criteria) this;
        }

        public Criteria andPracticeContentNotBetween(String value1, String value2) {
            addCriterion("practice_content not between", value1, value2, "practiceContent");
            return (Criteria) this;
        }

        public Criteria andPracticeScoreIsNull() {
            addCriterion("practice_score is null");
            return (Criteria) this;
        }

        public Criteria andPracticeScoreIsNotNull() {
            addCriterion("practice_score is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeScoreEqualTo(String value) {
            addCriterion("practice_score =", value, "practiceScore");
            return (Criteria) this;
        }

        public Criteria andPracticeScoreNotEqualTo(String value) {
            addCriterion("practice_score <>", value, "practiceScore");
            return (Criteria) this;
        }

        public Criteria andPracticeScoreGreaterThan(String value) {
            addCriterion("practice_score >", value, "practiceScore");
            return (Criteria) this;
        }

        public Criteria andPracticeScoreGreaterThanOrEqualTo(String value) {
            addCriterion("practice_score >=", value, "practiceScore");
            return (Criteria) this;
        }

        public Criteria andPracticeScoreLessThan(String value) {
            addCriterion("practice_score <", value, "practiceScore");
            return (Criteria) this;
        }

        public Criteria andPracticeScoreLessThanOrEqualTo(String value) {
            addCriterion("practice_score <=", value, "practiceScore");
            return (Criteria) this;
        }

        public Criteria andPracticeScoreLike(String value) {
            addCriterion("practice_score like", value, "practiceScore");
            return (Criteria) this;
        }

        public Criteria andPracticeScoreNotLike(String value) {
            addCriterion("practice_score not like", value, "practiceScore");
            return (Criteria) this;
        }

        public Criteria andPracticeScoreIn(List<String> values) {
            addCriterion("practice_score in", values, "practiceScore");
            return (Criteria) this;
        }

        public Criteria andPracticeScoreNotIn(List<String> values) {
            addCriterion("practice_score not in", values, "practiceScore");
            return (Criteria) this;
        }

        public Criteria andPracticeScoreBetween(String value1, String value2) {
            addCriterion("practice_score between", value1, value2, "practiceScore");
            return (Criteria) this;
        }

        public Criteria andPracticeScoreNotBetween(String value1, String value2) {
            addCriterion("practice_score not between", value1, value2, "practiceScore");
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

        public Criteria andPracticeNoteIsNull() {
            addCriterion("practice_note is null");
            return (Criteria) this;
        }

        public Criteria andPracticeNoteIsNotNull() {
            addCriterion("practice_note is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeNoteEqualTo(String value) {
            addCriterion("practice_note =", value, "practiceNote");
            return (Criteria) this;
        }

        public Criteria andPracticeNoteNotEqualTo(String value) {
            addCriterion("practice_note <>", value, "practiceNote");
            return (Criteria) this;
        }

        public Criteria andPracticeNoteGreaterThan(String value) {
            addCriterion("practice_note >", value, "practiceNote");
            return (Criteria) this;
        }

        public Criteria andPracticeNoteGreaterThanOrEqualTo(String value) {
            addCriterion("practice_note >=", value, "practiceNote");
            return (Criteria) this;
        }

        public Criteria andPracticeNoteLessThan(String value) {
            addCriterion("practice_note <", value, "practiceNote");
            return (Criteria) this;
        }

        public Criteria andPracticeNoteLessThanOrEqualTo(String value) {
            addCriterion("practice_note <=", value, "practiceNote");
            return (Criteria) this;
        }

        public Criteria andPracticeNoteLike(String value) {
            addCriterion("practice_note like", value, "practiceNote");
            return (Criteria) this;
        }

        public Criteria andPracticeNoteNotLike(String value) {
            addCriterion("practice_note not like", value, "practiceNote");
            return (Criteria) this;
        }

        public Criteria andPracticeNoteIn(List<String> values) {
            addCriterion("practice_note in", values, "practiceNote");
            return (Criteria) this;
        }

        public Criteria andPracticeNoteNotIn(List<String> values) {
            addCriterion("practice_note not in", values, "practiceNote");
            return (Criteria) this;
        }

        public Criteria andPracticeNoteBetween(String value1, String value2) {
            addCriterion("practice_note between", value1, value2, "practiceNote");
            return (Criteria) this;
        }

        public Criteria andPracticeNoteNotBetween(String value1, String value2) {
            addCriterion("practice_note not between", value1, value2, "practiceNote");
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