package com.Educational.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentLearnExperienceExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentLearnExperienceExample() {
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

        public Criteria andStudentLearnIdIsNull() {
            addCriterion("student_learn_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentLearnIdIsNotNull() {
            addCriterion("student_learn_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentLearnIdEqualTo(Integer value) {
            addCriterion("student_learn_id =", value, "studentLearnId");
            return (Criteria) this;
        }

        public Criteria andStudentLearnIdNotEqualTo(Integer value) {
            addCriterion("student_learn_id <>", value, "studentLearnId");
            return (Criteria) this;
        }

        public Criteria andStudentLearnIdGreaterThan(Integer value) {
            addCriterion("student_learn_id >", value, "studentLearnId");
            return (Criteria) this;
        }

        public Criteria andStudentLearnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_learn_id >=", value, "studentLearnId");
            return (Criteria) this;
        }

        public Criteria andStudentLearnIdLessThan(Integer value) {
            addCriterion("student_learn_id <", value, "studentLearnId");
            return (Criteria) this;
        }

        public Criteria andStudentLearnIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_learn_id <=", value, "studentLearnId");
            return (Criteria) this;
        }

        public Criteria andStudentLearnIdIn(List<Integer> values) {
            addCriterion("student_learn_id in", values, "studentLearnId");
            return (Criteria) this;
        }

        public Criteria andStudentLearnIdNotIn(List<Integer> values) {
            addCriterion("student_learn_id not in", values, "studentLearnId");
            return (Criteria) this;
        }

        public Criteria andStudentLearnIdBetween(Integer value1, Integer value2) {
            addCriterion("student_learn_id between", value1, value2, "studentLearnId");
            return (Criteria) this;
        }

        public Criteria andStudentLearnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_learn_id not between", value1, value2, "studentLearnId");
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

        public Criteria andLearnAllyearsIsNull() {
            addCriterion("learn_allyears is null");
            return (Criteria) this;
        }

        public Criteria andLearnAllyearsIsNotNull() {
            addCriterion("learn_allyears is not null");
            return (Criteria) this;
        }

        public Criteria andLearnAllyearsEqualTo(String value) {
            addCriterion("learn_allyears =", value, "learnAllyears");
            return (Criteria) this;
        }

        public Criteria andLearnAllyearsNotEqualTo(String value) {
            addCriterion("learn_allyears <>", value, "learnAllyears");
            return (Criteria) this;
        }

        public Criteria andLearnAllyearsGreaterThan(String value) {
            addCriterion("learn_allyears >", value, "learnAllyears");
            return (Criteria) this;
        }

        public Criteria andLearnAllyearsGreaterThanOrEqualTo(String value) {
            addCriterion("learn_allyears >=", value, "learnAllyears");
            return (Criteria) this;
        }

        public Criteria andLearnAllyearsLessThan(String value) {
            addCriterion("learn_allyears <", value, "learnAllyears");
            return (Criteria) this;
        }

        public Criteria andLearnAllyearsLessThanOrEqualTo(String value) {
            addCriterion("learn_allyears <=", value, "learnAllyears");
            return (Criteria) this;
        }

        public Criteria andLearnAllyearsLike(String value) {
            addCriterion("learn_allyears like", value, "learnAllyears");
            return (Criteria) this;
        }

        public Criteria andLearnAllyearsNotLike(String value) {
            addCriterion("learn_allyears not like", value, "learnAllyears");
            return (Criteria) this;
        }

        public Criteria andLearnAllyearsIn(List<String> values) {
            addCriterion("learn_allyears in", values, "learnAllyears");
            return (Criteria) this;
        }

        public Criteria andLearnAllyearsNotIn(List<String> values) {
            addCriterion("learn_allyears not in", values, "learnAllyears");
            return (Criteria) this;
        }

        public Criteria andLearnAllyearsBetween(String value1, String value2) {
            addCriterion("learn_allyears between", value1, value2, "learnAllyears");
            return (Criteria) this;
        }

        public Criteria andLearnAllyearsNotBetween(String value1, String value2) {
            addCriterion("learn_allyears not between", value1, value2, "learnAllyears");
            return (Criteria) this;
        }

        public Criteria andLearnSchoolIsNull() {
            addCriterion("learn_school is null");
            return (Criteria) this;
        }

        public Criteria andLearnSchoolIsNotNull() {
            addCriterion("learn_school is not null");
            return (Criteria) this;
        }

        public Criteria andLearnSchoolEqualTo(String value) {
            addCriterion("learn_school =", value, "learnSchool");
            return (Criteria) this;
        }

        public Criteria andLearnSchoolNotEqualTo(String value) {
            addCriterion("learn_school <>", value, "learnSchool");
            return (Criteria) this;
        }

        public Criteria andLearnSchoolGreaterThan(String value) {
            addCriterion("learn_school >", value, "learnSchool");
            return (Criteria) this;
        }

        public Criteria andLearnSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("learn_school >=", value, "learnSchool");
            return (Criteria) this;
        }

        public Criteria andLearnSchoolLessThan(String value) {
            addCriterion("learn_school <", value, "learnSchool");
            return (Criteria) this;
        }

        public Criteria andLearnSchoolLessThanOrEqualTo(String value) {
            addCriterion("learn_school <=", value, "learnSchool");
            return (Criteria) this;
        }

        public Criteria andLearnSchoolLike(String value) {
            addCriterion("learn_school like", value, "learnSchool");
            return (Criteria) this;
        }

        public Criteria andLearnSchoolNotLike(String value) {
            addCriterion("learn_school not like", value, "learnSchool");
            return (Criteria) this;
        }

        public Criteria andLearnSchoolIn(List<String> values) {
            addCriterion("learn_school in", values, "learnSchool");
            return (Criteria) this;
        }

        public Criteria andLearnSchoolNotIn(List<String> values) {
            addCriterion("learn_school not in", values, "learnSchool");
            return (Criteria) this;
        }

        public Criteria andLearnSchoolBetween(String value1, String value2) {
            addCriterion("learn_school between", value1, value2, "learnSchool");
            return (Criteria) this;
        }

        public Criteria andLearnSchoolNotBetween(String value1, String value2) {
            addCriterion("learn_school not between", value1, value2, "learnSchool");
            return (Criteria) this;
        }

        public Criteria andLearnPositionIsNull() {
            addCriterion("learn_position is null");
            return (Criteria) this;
        }

        public Criteria andLearnPositionIsNotNull() {
            addCriterion("learn_position is not null");
            return (Criteria) this;
        }

        public Criteria andLearnPositionEqualTo(String value) {
            addCriterion("learn_position =", value, "learnPosition");
            return (Criteria) this;
        }

        public Criteria andLearnPositionNotEqualTo(String value) {
            addCriterion("learn_position <>", value, "learnPosition");
            return (Criteria) this;
        }

        public Criteria andLearnPositionGreaterThan(String value) {
            addCriterion("learn_position >", value, "learnPosition");
            return (Criteria) this;
        }

        public Criteria andLearnPositionGreaterThanOrEqualTo(String value) {
            addCriterion("learn_position >=", value, "learnPosition");
            return (Criteria) this;
        }

        public Criteria andLearnPositionLessThan(String value) {
            addCriterion("learn_position <", value, "learnPosition");
            return (Criteria) this;
        }

        public Criteria andLearnPositionLessThanOrEqualTo(String value) {
            addCriterion("learn_position <=", value, "learnPosition");
            return (Criteria) this;
        }

        public Criteria andLearnPositionLike(String value) {
            addCriterion("learn_position like", value, "learnPosition");
            return (Criteria) this;
        }

        public Criteria andLearnPositionNotLike(String value) {
            addCriterion("learn_position not like", value, "learnPosition");
            return (Criteria) this;
        }

        public Criteria andLearnPositionIn(List<String> values) {
            addCriterion("learn_position in", values, "learnPosition");
            return (Criteria) this;
        }

        public Criteria andLearnPositionNotIn(List<String> values) {
            addCriterion("learn_position not in", values, "learnPosition");
            return (Criteria) this;
        }

        public Criteria andLearnPositionBetween(String value1, String value2) {
            addCriterion("learn_position between", value1, value2, "learnPosition");
            return (Criteria) this;
        }

        public Criteria andLearnPositionNotBetween(String value1, String value2) {
            addCriterion("learn_position not between", value1, value2, "learnPosition");
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

        public Criteria andLearnNoteIsNull() {
            addCriterion("learn_note is null");
            return (Criteria) this;
        }

        public Criteria andLearnNoteIsNotNull() {
            addCriterion("learn_note is not null");
            return (Criteria) this;
        }

        public Criteria andLearnNoteEqualTo(String value) {
            addCriterion("learn_note =", value, "learnNote");
            return (Criteria) this;
        }

        public Criteria andLearnNoteNotEqualTo(String value) {
            addCriterion("learn_note <>", value, "learnNote");
            return (Criteria) this;
        }

        public Criteria andLearnNoteGreaterThan(String value) {
            addCriterion("learn_note >", value, "learnNote");
            return (Criteria) this;
        }

        public Criteria andLearnNoteGreaterThanOrEqualTo(String value) {
            addCriterion("learn_note >=", value, "learnNote");
            return (Criteria) this;
        }

        public Criteria andLearnNoteLessThan(String value) {
            addCriterion("learn_note <", value, "learnNote");
            return (Criteria) this;
        }

        public Criteria andLearnNoteLessThanOrEqualTo(String value) {
            addCriterion("learn_note <=", value, "learnNote");
            return (Criteria) this;
        }

        public Criteria andLearnNoteLike(String value) {
            addCriterion("learn_note like", value, "learnNote");
            return (Criteria) this;
        }

        public Criteria andLearnNoteNotLike(String value) {
            addCriterion("learn_note not like", value, "learnNote");
            return (Criteria) this;
        }

        public Criteria andLearnNoteIn(List<String> values) {
            addCriterion("learn_note in", values, "learnNote");
            return (Criteria) this;
        }

        public Criteria andLearnNoteNotIn(List<String> values) {
            addCriterion("learn_note not in", values, "learnNote");
            return (Criteria) this;
        }

        public Criteria andLearnNoteBetween(String value1, String value2) {
            addCriterion("learn_note between", value1, value2, "learnNote");
            return (Criteria) this;
        }

        public Criteria andLearnNoteNotBetween(String value1, String value2) {
            addCriterion("learn_note not between", value1, value2, "learnNote");
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