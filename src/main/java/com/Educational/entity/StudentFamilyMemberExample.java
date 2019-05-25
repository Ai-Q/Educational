package com.Educational.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentFamilyMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentFamilyMemberExample() {
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

        public Criteria andStudentFamilyIdIsNull() {
            addCriterion("student_family_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentFamilyIdIsNotNull() {
            addCriterion("student_family_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentFamilyIdEqualTo(Integer value) {
            addCriterion("student_family_id =", value, "studentFamilyId");
            return (Criteria) this;
        }

        public Criteria andStudentFamilyIdNotEqualTo(Integer value) {
            addCriterion("student_family_id <>", value, "studentFamilyId");
            return (Criteria) this;
        }

        public Criteria andStudentFamilyIdGreaterThan(Integer value) {
            addCriterion("student_family_id >", value, "studentFamilyId");
            return (Criteria) this;
        }

        public Criteria andStudentFamilyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_family_id >=", value, "studentFamilyId");
            return (Criteria) this;
        }

        public Criteria andStudentFamilyIdLessThan(Integer value) {
            addCriterion("student_family_id <", value, "studentFamilyId");
            return (Criteria) this;
        }

        public Criteria andStudentFamilyIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_family_id <=", value, "studentFamilyId");
            return (Criteria) this;
        }

        public Criteria andStudentFamilyIdIn(List<Integer> values) {
            addCriterion("student_family_id in", values, "studentFamilyId");
            return (Criteria) this;
        }

        public Criteria andStudentFamilyIdNotIn(List<Integer> values) {
            addCriterion("student_family_id not in", values, "studentFamilyId");
            return (Criteria) this;
        }

        public Criteria andStudentFamilyIdBetween(Integer value1, Integer value2) {
            addCriterion("student_family_id between", value1, value2, "studentFamilyId");
            return (Criteria) this;
        }

        public Criteria andStudentFamilyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_family_id not between", value1, value2, "studentFamilyId");
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

        public Criteria andFamilyNameIsNull() {
            addCriterion("family_name is null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIsNotNull() {
            addCriterion("family_name is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameEqualTo(String value) {
            addCriterion("family_name =", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotEqualTo(String value) {
            addCriterion("family_name <>", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThan(String value) {
            addCriterion("family_name >", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThanOrEqualTo(String value) {
            addCriterion("family_name >=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThan(String value) {
            addCriterion("family_name <", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThanOrEqualTo(String value) {
            addCriterion("family_name <=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLike(String value) {
            addCriterion("family_name like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotLike(String value) {
            addCriterion("family_name not like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIn(List<String> values) {
            addCriterion("family_name in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotIn(List<String> values) {
            addCriterion("family_name not in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameBetween(String value1, String value2) {
            addCriterion("family_name between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotBetween(String value1, String value2) {
            addCriterion("family_name not between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyAppIsNull() {
            addCriterion("family_app is null");
            return (Criteria) this;
        }

        public Criteria andFamilyAppIsNotNull() {
            addCriterion("family_app is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyAppEqualTo(String value) {
            addCriterion("family_app =", value, "familyApp");
            return (Criteria) this;
        }

        public Criteria andFamilyAppNotEqualTo(String value) {
            addCriterion("family_app <>", value, "familyApp");
            return (Criteria) this;
        }

        public Criteria andFamilyAppGreaterThan(String value) {
            addCriterion("family_app >", value, "familyApp");
            return (Criteria) this;
        }

        public Criteria andFamilyAppGreaterThanOrEqualTo(String value) {
            addCriterion("family_app >=", value, "familyApp");
            return (Criteria) this;
        }

        public Criteria andFamilyAppLessThan(String value) {
            addCriterion("family_app <", value, "familyApp");
            return (Criteria) this;
        }

        public Criteria andFamilyAppLessThanOrEqualTo(String value) {
            addCriterion("family_app <=", value, "familyApp");
            return (Criteria) this;
        }

        public Criteria andFamilyAppLike(String value) {
            addCriterion("family_app like", value, "familyApp");
            return (Criteria) this;
        }

        public Criteria andFamilyAppNotLike(String value) {
            addCriterion("family_app not like", value, "familyApp");
            return (Criteria) this;
        }

        public Criteria andFamilyAppIn(List<String> values) {
            addCriterion("family_app in", values, "familyApp");
            return (Criteria) this;
        }

        public Criteria andFamilyAppNotIn(List<String> values) {
            addCriterion("family_app not in", values, "familyApp");
            return (Criteria) this;
        }

        public Criteria andFamilyAppBetween(String value1, String value2) {
            addCriterion("family_app between", value1, value2, "familyApp");
            return (Criteria) this;
        }

        public Criteria andFamilyAppNotBetween(String value1, String value2) {
            addCriterion("family_app not between", value1, value2, "familyApp");
            return (Criteria) this;
        }

        public Criteria andFamilyAgeIsNull() {
            addCriterion("family_age is null");
            return (Criteria) this;
        }

        public Criteria andFamilyAgeIsNotNull() {
            addCriterion("family_age is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyAgeEqualTo(Integer value) {
            addCriterion("family_age =", value, "familyAge");
            return (Criteria) this;
        }

        public Criteria andFamilyAgeNotEqualTo(Integer value) {
            addCriterion("family_age <>", value, "familyAge");
            return (Criteria) this;
        }

        public Criteria andFamilyAgeGreaterThan(Integer value) {
            addCriterion("family_age >", value, "familyAge");
            return (Criteria) this;
        }

        public Criteria andFamilyAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("family_age >=", value, "familyAge");
            return (Criteria) this;
        }

        public Criteria andFamilyAgeLessThan(Integer value) {
            addCriterion("family_age <", value, "familyAge");
            return (Criteria) this;
        }

        public Criteria andFamilyAgeLessThanOrEqualTo(Integer value) {
            addCriterion("family_age <=", value, "familyAge");
            return (Criteria) this;
        }

        public Criteria andFamilyAgeIn(List<Integer> values) {
            addCriterion("family_age in", values, "familyAge");
            return (Criteria) this;
        }

        public Criteria andFamilyAgeNotIn(List<Integer> values) {
            addCriterion("family_age not in", values, "familyAge");
            return (Criteria) this;
        }

        public Criteria andFamilyAgeBetween(Integer value1, Integer value2) {
            addCriterion("family_age between", value1, value2, "familyAge");
            return (Criteria) this;
        }

        public Criteria andFamilyAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("family_age not between", value1, value2, "familyAge");
            return (Criteria) this;
        }

        public Criteria andFamilyZcmmIsNull() {
            addCriterion("family_zcmm is null");
            return (Criteria) this;
        }

        public Criteria andFamilyZcmmIsNotNull() {
            addCriterion("family_zcmm is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyZcmmEqualTo(String value) {
            addCriterion("family_zcmm =", value, "familyZcmm");
            return (Criteria) this;
        }

        public Criteria andFamilyZcmmNotEqualTo(String value) {
            addCriterion("family_zcmm <>", value, "familyZcmm");
            return (Criteria) this;
        }

        public Criteria andFamilyZcmmGreaterThan(String value) {
            addCriterion("family_zcmm >", value, "familyZcmm");
            return (Criteria) this;
        }

        public Criteria andFamilyZcmmGreaterThanOrEqualTo(String value) {
            addCriterion("family_zcmm >=", value, "familyZcmm");
            return (Criteria) this;
        }

        public Criteria andFamilyZcmmLessThan(String value) {
            addCriterion("family_zcmm <", value, "familyZcmm");
            return (Criteria) this;
        }

        public Criteria andFamilyZcmmLessThanOrEqualTo(String value) {
            addCriterion("family_zcmm <=", value, "familyZcmm");
            return (Criteria) this;
        }

        public Criteria andFamilyZcmmLike(String value) {
            addCriterion("family_zcmm like", value, "familyZcmm");
            return (Criteria) this;
        }

        public Criteria andFamilyZcmmNotLike(String value) {
            addCriterion("family_zcmm not like", value, "familyZcmm");
            return (Criteria) this;
        }

        public Criteria andFamilyZcmmIn(List<String> values) {
            addCriterion("family_zcmm in", values, "familyZcmm");
            return (Criteria) this;
        }

        public Criteria andFamilyZcmmNotIn(List<String> values) {
            addCriterion("family_zcmm not in", values, "familyZcmm");
            return (Criteria) this;
        }

        public Criteria andFamilyZcmmBetween(String value1, String value2) {
            addCriterion("family_zcmm between", value1, value2, "familyZcmm");
            return (Criteria) this;
        }

        public Criteria andFamilyZcmmNotBetween(String value1, String value2) {
            addCriterion("family_zcmm not between", value1, value2, "familyZcmm");
            return (Criteria) this;
        }

        public Criteria andWorkplaceIsNull() {
            addCriterion("workplace is null");
            return (Criteria) this;
        }

        public Criteria andWorkplaceIsNotNull() {
            addCriterion("workplace is not null");
            return (Criteria) this;
        }

        public Criteria andWorkplaceEqualTo(String value) {
            addCriterion("workplace =", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotEqualTo(String value) {
            addCriterion("workplace <>", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceGreaterThan(String value) {
            addCriterion("workplace >", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceGreaterThanOrEqualTo(String value) {
            addCriterion("workplace >=", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLessThan(String value) {
            addCriterion("workplace <", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLessThanOrEqualTo(String value) {
            addCriterion("workplace <=", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLike(String value) {
            addCriterion("workplace like", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotLike(String value) {
            addCriterion("workplace not like", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceIn(List<String> values) {
            addCriterion("workplace in", values, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotIn(List<String> values) {
            addCriterion("workplace not in", values, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceBetween(String value1, String value2) {
            addCriterion("workplace between", value1, value2, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotBetween(String value1, String value2) {
            addCriterion("workplace not between", value1, value2, "workplace");
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

        public Criteria andFamilyNoteIsNull() {
            addCriterion("family_note is null");
            return (Criteria) this;
        }

        public Criteria andFamilyNoteIsNotNull() {
            addCriterion("family_note is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyNoteEqualTo(String value) {
            addCriterion("family_note =", value, "familyNote");
            return (Criteria) this;
        }

        public Criteria andFamilyNoteNotEqualTo(String value) {
            addCriterion("family_note <>", value, "familyNote");
            return (Criteria) this;
        }

        public Criteria andFamilyNoteGreaterThan(String value) {
            addCriterion("family_note >", value, "familyNote");
            return (Criteria) this;
        }

        public Criteria andFamilyNoteGreaterThanOrEqualTo(String value) {
            addCriterion("family_note >=", value, "familyNote");
            return (Criteria) this;
        }

        public Criteria andFamilyNoteLessThan(String value) {
            addCriterion("family_note <", value, "familyNote");
            return (Criteria) this;
        }

        public Criteria andFamilyNoteLessThanOrEqualTo(String value) {
            addCriterion("family_note <=", value, "familyNote");
            return (Criteria) this;
        }

        public Criteria andFamilyNoteLike(String value) {
            addCriterion("family_note like", value, "familyNote");
            return (Criteria) this;
        }

        public Criteria andFamilyNoteNotLike(String value) {
            addCriterion("family_note not like", value, "familyNote");
            return (Criteria) this;
        }

        public Criteria andFamilyNoteIn(List<String> values) {
            addCriterion("family_note in", values, "familyNote");
            return (Criteria) this;
        }

        public Criteria andFamilyNoteNotIn(List<String> values) {
            addCriterion("family_note not in", values, "familyNote");
            return (Criteria) this;
        }

        public Criteria andFamilyNoteBetween(String value1, String value2) {
            addCriterion("family_note between", value1, value2, "familyNote");
            return (Criteria) this;
        }

        public Criteria andFamilyNoteNotBetween(String value1, String value2) {
            addCriterion("family_note not between", value1, value2, "familyNote");
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