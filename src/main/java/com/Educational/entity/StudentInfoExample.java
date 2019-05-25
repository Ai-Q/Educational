package com.Educational.entity;

import java.util.ArrayList;
import java.util.List;

public class StudentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentInfoExample() {
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

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andStudentNoIsNull() {
            addCriterion("student_no is null");
            return (Criteria) this;
        }

        public Criteria andStudentNoIsNotNull() {
            addCriterion("student_no is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNoEqualTo(String value) {
            addCriterion("student_no =", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotEqualTo(String value) {
            addCriterion("student_no <>", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoGreaterThan(String value) {
            addCriterion("student_no >", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoGreaterThanOrEqualTo(String value) {
            addCriterion("student_no >=", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoLessThan(String value) {
            addCriterion("student_no <", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoLessThanOrEqualTo(String value) {
            addCriterion("student_no <=", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoLike(String value) {
            addCriterion("student_no like", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotLike(String value) {
            addCriterion("student_no not like", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoIn(List<String> values) {
            addCriterion("student_no in", values, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotIn(List<String> values) {
            addCriterion("student_no not in", values, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoBetween(String value1, String value2) {
            addCriterion("student_no between", value1, value2, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotBetween(String value1, String value2) {
            addCriterion("student_no not between", value1, value2, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNull() {
            addCriterion("student_sex is null");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNotNull() {
            addCriterion("student_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSexEqualTo(String value) {
            addCriterion("student_sex =", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotEqualTo(String value) {
            addCriterion("student_sex <>", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThan(String value) {
            addCriterion("student_sex >", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThanOrEqualTo(String value) {
            addCriterion("student_sex >=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThan(String value) {
            addCriterion("student_sex <", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThanOrEqualTo(String value) {
            addCriterion("student_sex <=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLike(String value) {
            addCriterion("student_sex like", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotLike(String value) {
            addCriterion("student_sex not like", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexIn(List<String> values) {
            addCriterion("student_sex in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotIn(List<String> values) {
            addCriterion("student_sex not in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexBetween(String value1, String value2) {
            addCriterion("student_sex between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotBetween(String value1, String value2) {
            addCriterion("student_sex not between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentName1IsNull() {
            addCriterion("student_name1 is null");
            return (Criteria) this;
        }

        public Criteria andStudentName1IsNotNull() {
            addCriterion("student_name1 is not null");
            return (Criteria) this;
        }

        public Criteria andStudentName1EqualTo(String value) {
            addCriterion("student_name1 =", value, "studentName1");
            return (Criteria) this;
        }

        public Criteria andStudentName1NotEqualTo(String value) {
            addCriterion("student_name1 <>", value, "studentName1");
            return (Criteria) this;
        }

        public Criteria andStudentName1GreaterThan(String value) {
            addCriterion("student_name1 >", value, "studentName1");
            return (Criteria) this;
        }

        public Criteria andStudentName1GreaterThanOrEqualTo(String value) {
            addCriterion("student_name1 >=", value, "studentName1");
            return (Criteria) this;
        }

        public Criteria andStudentName1LessThan(String value) {
            addCriterion("student_name1 <", value, "studentName1");
            return (Criteria) this;
        }

        public Criteria andStudentName1LessThanOrEqualTo(String value) {
            addCriterion("student_name1 <=", value, "studentName1");
            return (Criteria) this;
        }

        public Criteria andStudentName1Like(String value) {
            addCriterion("student_name1 like", value, "studentName1");
            return (Criteria) this;
        }

        public Criteria andStudentName1NotLike(String value) {
            addCriterion("student_name1 not like", value, "studentName1");
            return (Criteria) this;
        }

        public Criteria andStudentName1In(List<String> values) {
            addCriterion("student_name1 in", values, "studentName1");
            return (Criteria) this;
        }

        public Criteria andStudentName1NotIn(List<String> values) {
            addCriterion("student_name1 not in", values, "studentName1");
            return (Criteria) this;
        }

        public Criteria andStudentName1Between(String value1, String value2) {
            addCriterion("student_name1 between", value1, value2, "studentName1");
            return (Criteria) this;
        }

        public Criteria andStudentName1NotBetween(String value1, String value2) {
            addCriterion("student_name1 not between", value1, value2, "studentName1");
            return (Criteria) this;
        }

        public Criteria andStudentNationalIsNull() {
            addCriterion("student_national is null");
            return (Criteria) this;
        }

        public Criteria andStudentNationalIsNotNull() {
            addCriterion("student_national is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNationalEqualTo(String value) {
            addCriterion("student_national =", value, "studentNational");
            return (Criteria) this;
        }

        public Criteria andStudentNationalNotEqualTo(String value) {
            addCriterion("student_national <>", value, "studentNational");
            return (Criteria) this;
        }

        public Criteria andStudentNationalGreaterThan(String value) {
            addCriterion("student_national >", value, "studentNational");
            return (Criteria) this;
        }

        public Criteria andStudentNationalGreaterThanOrEqualTo(String value) {
            addCriterion("student_national >=", value, "studentNational");
            return (Criteria) this;
        }

        public Criteria andStudentNationalLessThan(String value) {
            addCriterion("student_national <", value, "studentNational");
            return (Criteria) this;
        }

        public Criteria andStudentNationalLessThanOrEqualTo(String value) {
            addCriterion("student_national <=", value, "studentNational");
            return (Criteria) this;
        }

        public Criteria andStudentNationalLike(String value) {
            addCriterion("student_national like", value, "studentNational");
            return (Criteria) this;
        }

        public Criteria andStudentNationalNotLike(String value) {
            addCriterion("student_national not like", value, "studentNational");
            return (Criteria) this;
        }

        public Criteria andStudentNationalIn(List<String> values) {
            addCriterion("student_national in", values, "studentNational");
            return (Criteria) this;
        }

        public Criteria andStudentNationalNotIn(List<String> values) {
            addCriterion("student_national not in", values, "studentNational");
            return (Criteria) this;
        }

        public Criteria andStudentNationalBetween(String value1, String value2) {
            addCriterion("student_national between", value1, value2, "studentNational");
            return (Criteria) this;
        }

        public Criteria andStudentNationalNotBetween(String value1, String value2) {
            addCriterion("student_national not between", value1, value2, "studentNational");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayIsNull() {
            addCriterion("student_birthday is null");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayIsNotNull() {
            addCriterion("student_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayEqualTo(String value) {
            addCriterion("student_birthday =", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayNotEqualTo(String value) {
            addCriterion("student_birthday <>", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayGreaterThan(String value) {
            addCriterion("student_birthday >", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("student_birthday >=", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayLessThan(String value) {
            addCriterion("student_birthday <", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayLessThanOrEqualTo(String value) {
            addCriterion("student_birthday <=", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayLike(String value) {
            addCriterion("student_birthday like", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayNotLike(String value) {
            addCriterion("student_birthday not like", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayIn(List<String> values) {
            addCriterion("student_birthday in", values, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayNotIn(List<String> values) {
            addCriterion("student_birthday not in", values, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayBetween(String value1, String value2) {
            addCriterion("student_birthday between", value1, value2, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayNotBetween(String value1, String value2) {
            addCriterion("student_birthday not between", value1, value2, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentHealthIsNull() {
            addCriterion("student_health is null");
            return (Criteria) this;
        }

        public Criteria andStudentHealthIsNotNull() {
            addCriterion("student_health is not null");
            return (Criteria) this;
        }

        public Criteria andStudentHealthEqualTo(String value) {
            addCriterion("student_health =", value, "studentHealth");
            return (Criteria) this;
        }

        public Criteria andStudentHealthNotEqualTo(String value) {
            addCriterion("student_health <>", value, "studentHealth");
            return (Criteria) this;
        }

        public Criteria andStudentHealthGreaterThan(String value) {
            addCriterion("student_health >", value, "studentHealth");
            return (Criteria) this;
        }

        public Criteria andStudentHealthGreaterThanOrEqualTo(String value) {
            addCriterion("student_health >=", value, "studentHealth");
            return (Criteria) this;
        }

        public Criteria andStudentHealthLessThan(String value) {
            addCriterion("student_health <", value, "studentHealth");
            return (Criteria) this;
        }

        public Criteria andStudentHealthLessThanOrEqualTo(String value) {
            addCriterion("student_health <=", value, "studentHealth");
            return (Criteria) this;
        }

        public Criteria andStudentHealthLike(String value) {
            addCriterion("student_health like", value, "studentHealth");
            return (Criteria) this;
        }

        public Criteria andStudentHealthNotLike(String value) {
            addCriterion("student_health not like", value, "studentHealth");
            return (Criteria) this;
        }

        public Criteria andStudentHealthIn(List<String> values) {
            addCriterion("student_health in", values, "studentHealth");
            return (Criteria) this;
        }

        public Criteria andStudentHealthNotIn(List<String> values) {
            addCriterion("student_health not in", values, "studentHealth");
            return (Criteria) this;
        }

        public Criteria andStudentHealthBetween(String value1, String value2) {
            addCriterion("student_health between", value1, value2, "studentHealth");
            return (Criteria) this;
        }

        public Criteria andStudentHealthNotBetween(String value1, String value2) {
            addCriterion("student_health not between", value1, value2, "studentHealth");
            return (Criteria) this;
        }

        public Criteria andStudentNativeIsNull() {
            addCriterion("student_native is null");
            return (Criteria) this;
        }

        public Criteria andStudentNativeIsNotNull() {
            addCriterion("student_native is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNativeEqualTo(String value) {
            addCriterion("student_native =", value, "studentNative");
            return (Criteria) this;
        }

        public Criteria andStudentNativeNotEqualTo(String value) {
            addCriterion("student_native <>", value, "studentNative");
            return (Criteria) this;
        }

        public Criteria andStudentNativeGreaterThan(String value) {
            addCriterion("student_native >", value, "studentNative");
            return (Criteria) this;
        }

        public Criteria andStudentNativeGreaterThanOrEqualTo(String value) {
            addCriterion("student_native >=", value, "studentNative");
            return (Criteria) this;
        }

        public Criteria andStudentNativeLessThan(String value) {
            addCriterion("student_native <", value, "studentNative");
            return (Criteria) this;
        }

        public Criteria andStudentNativeLessThanOrEqualTo(String value) {
            addCriterion("student_native <=", value, "studentNative");
            return (Criteria) this;
        }

        public Criteria andStudentNativeLike(String value) {
            addCriterion("student_native like", value, "studentNative");
            return (Criteria) this;
        }

        public Criteria andStudentNativeNotLike(String value) {
            addCriterion("student_native not like", value, "studentNative");
            return (Criteria) this;
        }

        public Criteria andStudentNativeIn(List<String> values) {
            addCriterion("student_native in", values, "studentNative");
            return (Criteria) this;
        }

        public Criteria andStudentNativeNotIn(List<String> values) {
            addCriterion("student_native not in", values, "studentNative");
            return (Criteria) this;
        }

        public Criteria andStudentNativeBetween(String value1, String value2) {
            addCriterion("student_native between", value1, value2, "studentNative");
            return (Criteria) this;
        }

        public Criteria andStudentNativeNotBetween(String value1, String value2) {
            addCriterion("student_native not between", value1, value2, "studentNative");
            return (Criteria) this;
        }

        public Criteria andStudentIndateIsNull() {
            addCriterion("student_indate is null");
            return (Criteria) this;
        }

        public Criteria andStudentIndateIsNotNull() {
            addCriterion("student_indate is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIndateEqualTo(String value) {
            addCriterion("student_indate =", value, "studentIndate");
            return (Criteria) this;
        }

        public Criteria andStudentIndateNotEqualTo(String value) {
            addCriterion("student_indate <>", value, "studentIndate");
            return (Criteria) this;
        }

        public Criteria andStudentIndateGreaterThan(String value) {
            addCriterion("student_indate >", value, "studentIndate");
            return (Criteria) this;
        }

        public Criteria andStudentIndateGreaterThanOrEqualTo(String value) {
            addCriterion("student_indate >=", value, "studentIndate");
            return (Criteria) this;
        }

        public Criteria andStudentIndateLessThan(String value) {
            addCriterion("student_indate <", value, "studentIndate");
            return (Criteria) this;
        }

        public Criteria andStudentIndateLessThanOrEqualTo(String value) {
            addCriterion("student_indate <=", value, "studentIndate");
            return (Criteria) this;
        }

        public Criteria andStudentIndateLike(String value) {
            addCriterion("student_indate like", value, "studentIndate");
            return (Criteria) this;
        }

        public Criteria andStudentIndateNotLike(String value) {
            addCriterion("student_indate not like", value, "studentIndate");
            return (Criteria) this;
        }

        public Criteria andStudentIndateIn(List<String> values) {
            addCriterion("student_indate in", values, "studentIndate");
            return (Criteria) this;
        }

        public Criteria andStudentIndateNotIn(List<String> values) {
            addCriterion("student_indate not in", values, "studentIndate");
            return (Criteria) this;
        }

        public Criteria andStudentIndateBetween(String value1, String value2) {
            addCriterion("student_indate between", value1, value2, "studentIndate");
            return (Criteria) this;
        }

        public Criteria andStudentIndateNotBetween(String value1, String value2) {
            addCriterion("student_indate not between", value1, value2, "studentIndate");
            return (Criteria) this;
        }

        public Criteria andStudentMaritalIsNull() {
            addCriterion("student_marital is null");
            return (Criteria) this;
        }

        public Criteria andStudentMaritalIsNotNull() {
            addCriterion("student_marital is not null");
            return (Criteria) this;
        }

        public Criteria andStudentMaritalEqualTo(String value) {
            addCriterion("student_marital =", value, "studentMarital");
            return (Criteria) this;
        }

        public Criteria andStudentMaritalNotEqualTo(String value) {
            addCriterion("student_marital <>", value, "studentMarital");
            return (Criteria) this;
        }

        public Criteria andStudentMaritalGreaterThan(String value) {
            addCriterion("student_marital >", value, "studentMarital");
            return (Criteria) this;
        }

        public Criteria andStudentMaritalGreaterThanOrEqualTo(String value) {
            addCriterion("student_marital >=", value, "studentMarital");
            return (Criteria) this;
        }

        public Criteria andStudentMaritalLessThan(String value) {
            addCriterion("student_marital <", value, "studentMarital");
            return (Criteria) this;
        }

        public Criteria andStudentMaritalLessThanOrEqualTo(String value) {
            addCriterion("student_marital <=", value, "studentMarital");
            return (Criteria) this;
        }

        public Criteria andStudentMaritalLike(String value) {
            addCriterion("student_marital like", value, "studentMarital");
            return (Criteria) this;
        }

        public Criteria andStudentMaritalNotLike(String value) {
            addCriterion("student_marital not like", value, "studentMarital");
            return (Criteria) this;
        }

        public Criteria andStudentMaritalIn(List<String> values) {
            addCriterion("student_marital in", values, "studentMarital");
            return (Criteria) this;
        }

        public Criteria andStudentMaritalNotIn(List<String> values) {
            addCriterion("student_marital not in", values, "studentMarital");
            return (Criteria) this;
        }

        public Criteria andStudentMaritalBetween(String value1, String value2) {
            addCriterion("student_marital between", value1, value2, "studentMarital");
            return (Criteria) this;
        }

        public Criteria andStudentMaritalNotBetween(String value1, String value2) {
            addCriterion("student_marital not between", value1, value2, "studentMarital");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIsNull() {
            addCriterion("student_address is null");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIsNotNull() {
            addCriterion("student_address is not null");
            return (Criteria) this;
        }

        public Criteria andStudentAddressEqualTo(String value) {
            addCriterion("student_address =", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotEqualTo(String value) {
            addCriterion("student_address <>", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressGreaterThan(String value) {
            addCriterion("student_address >", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("student_address >=", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLessThan(String value) {
            addCriterion("student_address <", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLessThanOrEqualTo(String value) {
            addCriterion("student_address <=", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLike(String value) {
            addCriterion("student_address like", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotLike(String value) {
            addCriterion("student_address not like", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIn(List<String> values) {
            addCriterion("student_address in", values, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotIn(List<String> values) {
            addCriterion("student_address not in", values, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressBetween(String value1, String value2) {
            addCriterion("student_address between", value1, value2, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotBetween(String value1, String value2) {
            addCriterion("student_address not between", value1, value2, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentPostIsNull() {
            addCriterion("student_post is null");
            return (Criteria) this;
        }

        public Criteria andStudentPostIsNotNull() {
            addCriterion("student_post is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPostEqualTo(String value) {
            addCriterion("student_post =", value, "studentPost");
            return (Criteria) this;
        }

        public Criteria andStudentPostNotEqualTo(String value) {
            addCriterion("student_post <>", value, "studentPost");
            return (Criteria) this;
        }

        public Criteria andStudentPostGreaterThan(String value) {
            addCriterion("student_post >", value, "studentPost");
            return (Criteria) this;
        }

        public Criteria andStudentPostGreaterThanOrEqualTo(String value) {
            addCriterion("student_post >=", value, "studentPost");
            return (Criteria) this;
        }

        public Criteria andStudentPostLessThan(String value) {
            addCriterion("student_post <", value, "studentPost");
            return (Criteria) this;
        }

        public Criteria andStudentPostLessThanOrEqualTo(String value) {
            addCriterion("student_post <=", value, "studentPost");
            return (Criteria) this;
        }

        public Criteria andStudentPostLike(String value) {
            addCriterion("student_post like", value, "studentPost");
            return (Criteria) this;
        }

        public Criteria andStudentPostNotLike(String value) {
            addCriterion("student_post not like", value, "studentPost");
            return (Criteria) this;
        }

        public Criteria andStudentPostIn(List<String> values) {
            addCriterion("student_post in", values, "studentPost");
            return (Criteria) this;
        }

        public Criteria andStudentPostNotIn(List<String> values) {
            addCriterion("student_post not in", values, "studentPost");
            return (Criteria) this;
        }

        public Criteria andStudentPostBetween(String value1, String value2) {
            addCriterion("student_post between", value1, value2, "studentPost");
            return (Criteria) this;
        }

        public Criteria andStudentPostNotBetween(String value1, String value2) {
            addCriterion("student_post not between", value1, value2, "studentPost");
            return (Criteria) this;
        }

        public Criteria andFamilyTellphoneIsNull() {
            addCriterion("family_tellphone is null");
            return (Criteria) this;
        }

        public Criteria andFamilyTellphoneIsNotNull() {
            addCriterion("family_tellphone is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyTellphoneEqualTo(String value) {
            addCriterion("family_tellphone =", value, "familyTellphone");
            return (Criteria) this;
        }

        public Criteria andFamilyTellphoneNotEqualTo(String value) {
            addCriterion("family_tellphone <>", value, "familyTellphone");
            return (Criteria) this;
        }

        public Criteria andFamilyTellphoneGreaterThan(String value) {
            addCriterion("family_tellphone >", value, "familyTellphone");
            return (Criteria) this;
        }

        public Criteria andFamilyTellphoneGreaterThanOrEqualTo(String value) {
            addCriterion("family_tellphone >=", value, "familyTellphone");
            return (Criteria) this;
        }

        public Criteria andFamilyTellphoneLessThan(String value) {
            addCriterion("family_tellphone <", value, "familyTellphone");
            return (Criteria) this;
        }

        public Criteria andFamilyTellphoneLessThanOrEqualTo(String value) {
            addCriterion("family_tellphone <=", value, "familyTellphone");
            return (Criteria) this;
        }

        public Criteria andFamilyTellphoneLike(String value) {
            addCriterion("family_tellphone like", value, "familyTellphone");
            return (Criteria) this;
        }

        public Criteria andFamilyTellphoneNotLike(String value) {
            addCriterion("family_tellphone not like", value, "familyTellphone");
            return (Criteria) this;
        }

        public Criteria andFamilyTellphoneIn(List<String> values) {
            addCriterion("family_tellphone in", values, "familyTellphone");
            return (Criteria) this;
        }

        public Criteria andFamilyTellphoneNotIn(List<String> values) {
            addCriterion("family_tellphone not in", values, "familyTellphone");
            return (Criteria) this;
        }

        public Criteria andFamilyTellphoneBetween(String value1, String value2) {
            addCriterion("family_tellphone between", value1, value2, "familyTellphone");
            return (Criteria) this;
        }

        public Criteria andFamilyTellphoneNotBetween(String value1, String value2) {
            addCriterion("family_tellphone not between", value1, value2, "familyTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneIsNull() {
            addCriterion("student_tellphone is null");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneIsNotNull() {
            addCriterion("student_tellphone is not null");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneEqualTo(String value) {
            addCriterion("student_tellphone =", value, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneNotEqualTo(String value) {
            addCriterion("student_tellphone <>", value, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneGreaterThan(String value) {
            addCriterion("student_tellphone >", value, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneGreaterThanOrEqualTo(String value) {
            addCriterion("student_tellphone >=", value, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneLessThan(String value) {
            addCriterion("student_tellphone <", value, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneLessThanOrEqualTo(String value) {
            addCriterion("student_tellphone <=", value, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneLike(String value) {
            addCriterion("student_tellphone like", value, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneNotLike(String value) {
            addCriterion("student_tellphone not like", value, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneIn(List<String> values) {
            addCriterion("student_tellphone in", values, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneNotIn(List<String> values) {
            addCriterion("student_tellphone not in", values, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneBetween(String value1, String value2) {
            addCriterion("student_tellphone between", value1, value2, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentTellphoneNotBetween(String value1, String value2) {
            addCriterion("student_tellphone not between", value1, value2, "studentTellphone");
            return (Criteria) this;
        }

        public Criteria andStudentQqIsNull() {
            addCriterion("student_qq is null");
            return (Criteria) this;
        }

        public Criteria andStudentQqIsNotNull() {
            addCriterion("student_qq is not null");
            return (Criteria) this;
        }

        public Criteria andStudentQqEqualTo(String value) {
            addCriterion("student_qq =", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotEqualTo(String value) {
            addCriterion("student_qq <>", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqGreaterThan(String value) {
            addCriterion("student_qq >", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqGreaterThanOrEqualTo(String value) {
            addCriterion("student_qq >=", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqLessThan(String value) {
            addCriterion("student_qq <", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqLessThanOrEqualTo(String value) {
            addCriterion("student_qq <=", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqLike(String value) {
            addCriterion("student_qq like", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotLike(String value) {
            addCriterion("student_qq not like", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqIn(List<String> values) {
            addCriterion("student_qq in", values, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotIn(List<String> values) {
            addCriterion("student_qq not in", values, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqBetween(String value1, String value2) {
            addCriterion("student_qq between", value1, value2, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotBetween(String value1, String value2) {
            addCriterion("student_qq not between", value1, value2, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentIsleagueIsNull() {
            addCriterion("student_isleague is null");
            return (Criteria) this;
        }

        public Criteria andStudentIsleagueIsNotNull() {
            addCriterion("student_isleague is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIsleagueEqualTo(String value) {
            addCriterion("student_isleague =", value, "studentIsleague");
            return (Criteria) this;
        }

        public Criteria andStudentIsleagueNotEqualTo(String value) {
            addCriterion("student_isleague <>", value, "studentIsleague");
            return (Criteria) this;
        }

        public Criteria andStudentIsleagueGreaterThan(String value) {
            addCriterion("student_isleague >", value, "studentIsleague");
            return (Criteria) this;
        }

        public Criteria andStudentIsleagueGreaterThanOrEqualTo(String value) {
            addCriterion("student_isleague >=", value, "studentIsleague");
            return (Criteria) this;
        }

        public Criteria andStudentIsleagueLessThan(String value) {
            addCriterion("student_isleague <", value, "studentIsleague");
            return (Criteria) this;
        }

        public Criteria andStudentIsleagueLessThanOrEqualTo(String value) {
            addCriterion("student_isleague <=", value, "studentIsleague");
            return (Criteria) this;
        }

        public Criteria andStudentIsleagueLike(String value) {
            addCriterion("student_isleague like", value, "studentIsleague");
            return (Criteria) this;
        }

        public Criteria andStudentIsleagueNotLike(String value) {
            addCriterion("student_isleague not like", value, "studentIsleague");
            return (Criteria) this;
        }

        public Criteria andStudentIsleagueIn(List<String> values) {
            addCriterion("student_isleague in", values, "studentIsleague");
            return (Criteria) this;
        }

        public Criteria andStudentIsleagueNotIn(List<String> values) {
            addCriterion("student_isleague not in", values, "studentIsleague");
            return (Criteria) this;
        }

        public Criteria andStudentIsleagueBetween(String value1, String value2) {
            addCriterion("student_isleague between", value1, value2, "studentIsleague");
            return (Criteria) this;
        }

        public Criteria andStudentIsleagueNotBetween(String value1, String value2) {
            addCriterion("student_isleague not between", value1, value2, "studentIsleague");
            return (Criteria) this;
        }

        public Criteria andStudentJoinTimeIsNull() {
            addCriterion("student_join_time is null");
            return (Criteria) this;
        }

        public Criteria andStudentJoinTimeIsNotNull() {
            addCriterion("student_join_time is not null");
            return (Criteria) this;
        }

        public Criteria andStudentJoinTimeEqualTo(String value) {
            addCriterion("student_join_time =", value, "studentJoinTime");
            return (Criteria) this;
        }

        public Criteria andStudentJoinTimeNotEqualTo(String value) {
            addCriterion("student_join_time <>", value, "studentJoinTime");
            return (Criteria) this;
        }

        public Criteria andStudentJoinTimeGreaterThan(String value) {
            addCriterion("student_join_time >", value, "studentJoinTime");
            return (Criteria) this;
        }

        public Criteria andStudentJoinTimeGreaterThanOrEqualTo(String value) {
            addCriterion("student_join_time >=", value, "studentJoinTime");
            return (Criteria) this;
        }

        public Criteria andStudentJoinTimeLessThan(String value) {
            addCriterion("student_join_time <", value, "studentJoinTime");
            return (Criteria) this;
        }

        public Criteria andStudentJoinTimeLessThanOrEqualTo(String value) {
            addCriterion("student_join_time <=", value, "studentJoinTime");
            return (Criteria) this;
        }

        public Criteria andStudentJoinTimeLike(String value) {
            addCriterion("student_join_time like", value, "studentJoinTime");
            return (Criteria) this;
        }

        public Criteria andStudentJoinTimeNotLike(String value) {
            addCriterion("student_join_time not like", value, "studentJoinTime");
            return (Criteria) this;
        }

        public Criteria andStudentJoinTimeIn(List<String> values) {
            addCriterion("student_join_time in", values, "studentJoinTime");
            return (Criteria) this;
        }

        public Criteria andStudentJoinTimeNotIn(List<String> values) {
            addCriterion("student_join_time not in", values, "studentJoinTime");
            return (Criteria) this;
        }

        public Criteria andStudentJoinTimeBetween(String value1, String value2) {
            addCriterion("student_join_time between", value1, value2, "studentJoinTime");
            return (Criteria) this;
        }

        public Criteria andStudentJoinTimeNotBetween(String value1, String value2) {
            addCriterion("student_join_time not between", value1, value2, "studentJoinTime");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardIsNull() {
            addCriterion("student_idcard is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardIsNotNull() {
            addCriterion("student_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardEqualTo(String value) {
            addCriterion("student_idcard =", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardNotEqualTo(String value) {
            addCriterion("student_idcard <>", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardGreaterThan(String value) {
            addCriterion("student_idcard >", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("student_idcard >=", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardLessThan(String value) {
            addCriterion("student_idcard <", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardLessThanOrEqualTo(String value) {
            addCriterion("student_idcard <=", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardLike(String value) {
            addCriterion("student_idcard like", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardNotLike(String value) {
            addCriterion("student_idcard not like", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardIn(List<String> values) {
            addCriterion("student_idcard in", values, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardNotIn(List<String> values) {
            addCriterion("student_idcard not in", values, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardBetween(String value1, String value2) {
            addCriterion("student_idcard between", value1, value2, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardNotBetween(String value1, String value2) {
            addCriterion("student_idcard not between", value1, value2, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentBeforeSchoolIsNull() {
            addCriterion("student_before_school is null");
            return (Criteria) this;
        }

        public Criteria andStudentBeforeSchoolIsNotNull() {
            addCriterion("student_before_school is not null");
            return (Criteria) this;
        }

        public Criteria andStudentBeforeSchoolEqualTo(String value) {
            addCriterion("student_before_school =", value, "studentBeforeSchool");
            return (Criteria) this;
        }

        public Criteria andStudentBeforeSchoolNotEqualTo(String value) {
            addCriterion("student_before_school <>", value, "studentBeforeSchool");
            return (Criteria) this;
        }

        public Criteria andStudentBeforeSchoolGreaterThan(String value) {
            addCriterion("student_before_school >", value, "studentBeforeSchool");
            return (Criteria) this;
        }

        public Criteria andStudentBeforeSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("student_before_school >=", value, "studentBeforeSchool");
            return (Criteria) this;
        }

        public Criteria andStudentBeforeSchoolLessThan(String value) {
            addCriterion("student_before_school <", value, "studentBeforeSchool");
            return (Criteria) this;
        }

        public Criteria andStudentBeforeSchoolLessThanOrEqualTo(String value) {
            addCriterion("student_before_school <=", value, "studentBeforeSchool");
            return (Criteria) this;
        }

        public Criteria andStudentBeforeSchoolLike(String value) {
            addCriterion("student_before_school like", value, "studentBeforeSchool");
            return (Criteria) this;
        }

        public Criteria andStudentBeforeSchoolNotLike(String value) {
            addCriterion("student_before_school not like", value, "studentBeforeSchool");
            return (Criteria) this;
        }

        public Criteria andStudentBeforeSchoolIn(List<String> values) {
            addCriterion("student_before_school in", values, "studentBeforeSchool");
            return (Criteria) this;
        }

        public Criteria andStudentBeforeSchoolNotIn(List<String> values) {
            addCriterion("student_before_school not in", values, "studentBeforeSchool");
            return (Criteria) this;
        }

        public Criteria andStudentBeforeSchoolBetween(String value1, String value2) {
            addCriterion("student_before_school between", value1, value2, "studentBeforeSchool");
            return (Criteria) this;
        }

        public Criteria andStudentBeforeSchoolNotBetween(String value1, String value2) {
            addCriterion("student_before_school not between", value1, value2, "studentBeforeSchool");
            return (Criteria) this;
        }

        public Criteria andStudentHobbyIsNull() {
            addCriterion("student_hobby is null");
            return (Criteria) this;
        }

        public Criteria andStudentHobbyIsNotNull() {
            addCriterion("student_hobby is not null");
            return (Criteria) this;
        }

        public Criteria andStudentHobbyEqualTo(String value) {
            addCriterion("student_hobby =", value, "studentHobby");
            return (Criteria) this;
        }

        public Criteria andStudentHobbyNotEqualTo(String value) {
            addCriterion("student_hobby <>", value, "studentHobby");
            return (Criteria) this;
        }

        public Criteria andStudentHobbyGreaterThan(String value) {
            addCriterion("student_hobby >", value, "studentHobby");
            return (Criteria) this;
        }

        public Criteria andStudentHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("student_hobby >=", value, "studentHobby");
            return (Criteria) this;
        }

        public Criteria andStudentHobbyLessThan(String value) {
            addCriterion("student_hobby <", value, "studentHobby");
            return (Criteria) this;
        }

        public Criteria andStudentHobbyLessThanOrEqualTo(String value) {
            addCriterion("student_hobby <=", value, "studentHobby");
            return (Criteria) this;
        }

        public Criteria andStudentHobbyLike(String value) {
            addCriterion("student_hobby like", value, "studentHobby");
            return (Criteria) this;
        }

        public Criteria andStudentHobbyNotLike(String value) {
            addCriterion("student_hobby not like", value, "studentHobby");
            return (Criteria) this;
        }

        public Criteria andStudentHobbyIn(List<String> values) {
            addCriterion("student_hobby in", values, "studentHobby");
            return (Criteria) this;
        }

        public Criteria andStudentHobbyNotIn(List<String> values) {
            addCriterion("student_hobby not in", values, "studentHobby");
            return (Criteria) this;
        }

        public Criteria andStudentHobbyBetween(String value1, String value2) {
            addCriterion("student_hobby between", value1, value2, "studentHobby");
            return (Criteria) this;
        }

        public Criteria andStudentHobbyNotBetween(String value1, String value2) {
            addCriterion("student_hobby not between", value1, value2, "studentHobby");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolIsNull() {
            addCriterion("student_school is null");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolIsNotNull() {
            addCriterion("student_school is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolEqualTo(String value) {
            addCriterion("student_school =", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolNotEqualTo(String value) {
            addCriterion("student_school <>", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolGreaterThan(String value) {
            addCriterion("student_school >", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("student_school >=", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolLessThan(String value) {
            addCriterion("student_school <", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolLessThanOrEqualTo(String value) {
            addCriterion("student_school <=", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolLike(String value) {
            addCriterion("student_school like", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolNotLike(String value) {
            addCriterion("student_school not like", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolIn(List<String> values) {
            addCriterion("student_school in", values, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolNotIn(List<String> values) {
            addCriterion("student_school not in", values, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolBetween(String value1, String value2) {
            addCriterion("student_school between", value1, value2, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolNotBetween(String value1, String value2) {
            addCriterion("student_school not between", value1, value2, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentProIsNull() {
            addCriterion("student_pro is null");
            return (Criteria) this;
        }

        public Criteria andStudentProIsNotNull() {
            addCriterion("student_pro is not null");
            return (Criteria) this;
        }

        public Criteria andStudentProEqualTo(String value) {
            addCriterion("student_pro =", value, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProNotEqualTo(String value) {
            addCriterion("student_pro <>", value, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProGreaterThan(String value) {
            addCriterion("student_pro >", value, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProGreaterThanOrEqualTo(String value) {
            addCriterion("student_pro >=", value, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProLessThan(String value) {
            addCriterion("student_pro <", value, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProLessThanOrEqualTo(String value) {
            addCriterion("student_pro <=", value, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProLike(String value) {
            addCriterion("student_pro like", value, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProNotLike(String value) {
            addCriterion("student_pro not like", value, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProIn(List<String> values) {
            addCriterion("student_pro in", values, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProNotIn(List<String> values) {
            addCriterion("student_pro not in", values, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProBetween(String value1, String value2) {
            addCriterion("student_pro between", value1, value2, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentProNotBetween(String value1, String value2) {
            addCriterion("student_pro not between", value1, value2, "studentPro");
            return (Criteria) this;
        }

        public Criteria andStudentEduSysIsNull() {
            addCriterion("student_edu_sys is null");
            return (Criteria) this;
        }

        public Criteria andStudentEduSysIsNotNull() {
            addCriterion("student_edu_sys is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEduSysEqualTo(String value) {
            addCriterion("student_edu_sys =", value, "studentEduSys");
            return (Criteria) this;
        }

        public Criteria andStudentEduSysNotEqualTo(String value) {
            addCriterion("student_edu_sys <>", value, "studentEduSys");
            return (Criteria) this;
        }

        public Criteria andStudentEduSysGreaterThan(String value) {
            addCriterion("student_edu_sys >", value, "studentEduSys");
            return (Criteria) this;
        }

        public Criteria andStudentEduSysGreaterThanOrEqualTo(String value) {
            addCriterion("student_edu_sys >=", value, "studentEduSys");
            return (Criteria) this;
        }

        public Criteria andStudentEduSysLessThan(String value) {
            addCriterion("student_edu_sys <", value, "studentEduSys");
            return (Criteria) this;
        }

        public Criteria andStudentEduSysLessThanOrEqualTo(String value) {
            addCriterion("student_edu_sys <=", value, "studentEduSys");
            return (Criteria) this;
        }

        public Criteria andStudentEduSysLike(String value) {
            addCriterion("student_edu_sys like", value, "studentEduSys");
            return (Criteria) this;
        }

        public Criteria andStudentEduSysNotLike(String value) {
            addCriterion("student_edu_sys not like", value, "studentEduSys");
            return (Criteria) this;
        }

        public Criteria andStudentEduSysIn(List<String> values) {
            addCriterion("student_edu_sys in", values, "studentEduSys");
            return (Criteria) this;
        }

        public Criteria andStudentEduSysNotIn(List<String> values) {
            addCriterion("student_edu_sys not in", values, "studentEduSys");
            return (Criteria) this;
        }

        public Criteria andStudentEduSysBetween(String value1, String value2) {
            addCriterion("student_edu_sys between", value1, value2, "studentEduSys");
            return (Criteria) this;
        }

        public Criteria andStudentEduSysNotBetween(String value1, String value2) {
            addCriterion("student_edu_sys not between", value1, value2, "studentEduSys");
            return (Criteria) this;
        }

        public Criteria andStudentProCityIsNull() {
            addCriterion("student_pro_city is null");
            return (Criteria) this;
        }

        public Criteria andStudentProCityIsNotNull() {
            addCriterion("student_pro_city is not null");
            return (Criteria) this;
        }

        public Criteria andStudentProCityEqualTo(String value) {
            addCriterion("student_pro_city =", value, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityNotEqualTo(String value) {
            addCriterion("student_pro_city <>", value, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityGreaterThan(String value) {
            addCriterion("student_pro_city >", value, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityGreaterThanOrEqualTo(String value) {
            addCriterion("student_pro_city >=", value, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityLessThan(String value) {
            addCriterion("student_pro_city <", value, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityLessThanOrEqualTo(String value) {
            addCriterion("student_pro_city <=", value, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityLike(String value) {
            addCriterion("student_pro_city like", value, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityNotLike(String value) {
            addCriterion("student_pro_city not like", value, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityIn(List<String> values) {
            addCriterion("student_pro_city in", values, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityNotIn(List<String> values) {
            addCriterion("student_pro_city not in", values, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityBetween(String value1, String value2) {
            addCriterion("student_pro_city between", value1, value2, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentProCityNotBetween(String value1, String value2) {
            addCriterion("student_pro_city not between", value1, value2, "studentProCity");
            return (Criteria) this;
        }

        public Criteria andStudentTypeIsNull() {
            addCriterion("student_type is null");
            return (Criteria) this;
        }

        public Criteria andStudentTypeIsNotNull() {
            addCriterion("student_type is not null");
            return (Criteria) this;
        }

        public Criteria andStudentTypeEqualTo(String value) {
            addCriterion("student_type =", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeNotEqualTo(String value) {
            addCriterion("student_type <>", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeGreaterThan(String value) {
            addCriterion("student_type >", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("student_type >=", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeLessThan(String value) {
            addCriterion("student_type <", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeLessThanOrEqualTo(String value) {
            addCriterion("student_type <=", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeLike(String value) {
            addCriterion("student_type like", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeNotLike(String value) {
            addCriterion("student_type not like", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeIn(List<String> values) {
            addCriterion("student_type in", values, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeNotIn(List<String> values) {
            addCriterion("student_type not in", values, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeBetween(String value1, String value2) {
            addCriterion("student_type between", value1, value2, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeNotBetween(String value1, String value2) {
            addCriterion("student_type not between", value1, value2, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentIspayIsNull() {
            addCriterion("student_ispay is null");
            return (Criteria) this;
        }

        public Criteria andStudentIspayIsNotNull() {
            addCriterion("student_ispay is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIspayEqualTo(String value) {
            addCriterion("student_ispay =", value, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayNotEqualTo(String value) {
            addCriterion("student_ispay <>", value, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayGreaterThan(String value) {
            addCriterion("student_ispay >", value, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayGreaterThanOrEqualTo(String value) {
            addCriterion("student_ispay >=", value, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayLessThan(String value) {
            addCriterion("student_ispay <", value, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayLessThanOrEqualTo(String value) {
            addCriterion("student_ispay <=", value, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayLike(String value) {
            addCriterion("student_ispay like", value, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayNotLike(String value) {
            addCriterion("student_ispay not like", value, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayIn(List<String> values) {
            addCriterion("student_ispay in", values, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayNotIn(List<String> values) {
            addCriterion("student_ispay not in", values, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayBetween(String value1, String value2) {
            addCriterion("student_ispay between", value1, value2, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentIspayNotBetween(String value1, String value2) {
            addCriterion("student_ispay not between", value1, value2, "studentIspay");
            return (Criteria) this;
        }

        public Criteria andStudentDescIsNull() {
            addCriterion("student_desc is null");
            return (Criteria) this;
        }

        public Criteria andStudentDescIsNotNull() {
            addCriterion("student_desc is not null");
            return (Criteria) this;
        }

        public Criteria andStudentDescEqualTo(String value) {
            addCriterion("student_desc =", value, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescNotEqualTo(String value) {
            addCriterion("student_desc <>", value, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescGreaterThan(String value) {
            addCriterion("student_desc >", value, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescGreaterThanOrEqualTo(String value) {
            addCriterion("student_desc >=", value, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescLessThan(String value) {
            addCriterion("student_desc <", value, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescLessThanOrEqualTo(String value) {
            addCriterion("student_desc <=", value, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescLike(String value) {
            addCriterion("student_desc like", value, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescNotLike(String value) {
            addCriterion("student_desc not like", value, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescIn(List<String> values) {
            addCriterion("student_desc in", values, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescNotIn(List<String> values) {
            addCriterion("student_desc not in", values, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescBetween(String value1, String value2) {
            addCriterion("student_desc between", value1, value2, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentDescNotBetween(String value1, String value2) {
            addCriterion("student_desc not between", value1, value2, "studentDesc");
            return (Criteria) this;
        }

        public Criteria andStudentNumberIsNull() {
            addCriterion("student_number is null");
            return (Criteria) this;
        }

        public Criteria andStudentNumberIsNotNull() {
            addCriterion("student_number is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNumberEqualTo(String value) {
            addCriterion("student_number =", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotEqualTo(String value) {
            addCriterion("student_number <>", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberGreaterThan(String value) {
            addCriterion("student_number >", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("student_number >=", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberLessThan(String value) {
            addCriterion("student_number <", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberLessThanOrEqualTo(String value) {
            addCriterion("student_number <=", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberLike(String value) {
            addCriterion("student_number like", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotLike(String value) {
            addCriterion("student_number not like", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberIn(List<String> values) {
            addCriterion("student_number in", values, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotIn(List<String> values) {
            addCriterion("student_number not in", values, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberBetween(String value1, String value2) {
            addCriterion("student_number between", value1, value2, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotBetween(String value1, String value2) {
            addCriterion("student_number not between", value1, value2, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordIsNull() {
            addCriterion("student_password is null");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordIsNotNull() {
            addCriterion("student_password is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordEqualTo(String value) {
            addCriterion("student_password =", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotEqualTo(String value) {
            addCriterion("student_password <>", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordGreaterThan(String value) {
            addCriterion("student_password >", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("student_password >=", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordLessThan(String value) {
            addCriterion("student_password <", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordLessThanOrEqualTo(String value) {
            addCriterion("student_password <=", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordLike(String value) {
            addCriterion("student_password like", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotLike(String value) {
            addCriterion("student_password not like", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordIn(List<String> values) {
            addCriterion("student_password in", values, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotIn(List<String> values) {
            addCriterion("student_password not in", values, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordBetween(String value1, String value2) {
            addCriterion("student_password between", value1, value2, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotBetween(String value1, String value2) {
            addCriterion("student_password not between", value1, value2, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentMarkIsNull() {
            addCriterion("student_mark is null");
            return (Criteria) this;
        }

        public Criteria andStudentMarkIsNotNull() {
            addCriterion("student_mark is not null");
            return (Criteria) this;
        }

        public Criteria andStudentMarkEqualTo(Integer value) {
            addCriterion("student_mark =", value, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentMarkNotEqualTo(Integer value) {
            addCriterion("student_mark <>", value, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentMarkGreaterThan(Integer value) {
            addCriterion("student_mark >", value, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_mark >=", value, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentMarkLessThan(Integer value) {
            addCriterion("student_mark <", value, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentMarkLessThanOrEqualTo(Integer value) {
            addCriterion("student_mark <=", value, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentMarkIn(List<Integer> values) {
            addCriterion("student_mark in", values, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentMarkNotIn(List<Integer> values) {
            addCriterion("student_mark not in", values, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentMarkBetween(Integer value1, Integer value2) {
            addCriterion("student_mark between", value1, value2, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("student_mark not between", value1, value2, "studentMark");
            return (Criteria) this;
        }

        public Criteria andStudentStateIsNull() {
            addCriterion("student_state is null");
            return (Criteria) this;
        }

        public Criteria andStudentStateIsNotNull() {
            addCriterion("student_state is not null");
            return (Criteria) this;
        }

        public Criteria andStudentStateEqualTo(String value) {
            addCriterion("student_state =", value, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateNotEqualTo(String value) {
            addCriterion("student_state <>", value, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateGreaterThan(String value) {
            addCriterion("student_state >", value, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateGreaterThanOrEqualTo(String value) {
            addCriterion("student_state >=", value, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateLessThan(String value) {
            addCriterion("student_state <", value, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateLessThanOrEqualTo(String value) {
            addCriterion("student_state <=", value, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateLike(String value) {
            addCriterion("student_state like", value, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateNotLike(String value) {
            addCriterion("student_state not like", value, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateIn(List<String> values) {
            addCriterion("student_state in", values, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateNotIn(List<String> values) {
            addCriterion("student_state not in", values, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateBetween(String value1, String value2) {
            addCriterion("student_state between", value1, value2, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateNotBetween(String value1, String value2) {
            addCriterion("student_state not between", value1, value2, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentHardIsNull() {
            addCriterion("student_hard is null");
            return (Criteria) this;
        }

        public Criteria andStudentHardIsNotNull() {
            addCriterion("student_hard is not null");
            return (Criteria) this;
        }

        public Criteria andStudentHardEqualTo(String value) {
            addCriterion("student_hard =", value, "studentHard");
            return (Criteria) this;
        }

        public Criteria andStudentHardNotEqualTo(String value) {
            addCriterion("student_hard <>", value, "studentHard");
            return (Criteria) this;
        }

        public Criteria andStudentHardGreaterThan(String value) {
            addCriterion("student_hard >", value, "studentHard");
            return (Criteria) this;
        }

        public Criteria andStudentHardGreaterThanOrEqualTo(String value) {
            addCriterion("student_hard >=", value, "studentHard");
            return (Criteria) this;
        }

        public Criteria andStudentHardLessThan(String value) {
            addCriterion("student_hard <", value, "studentHard");
            return (Criteria) this;
        }

        public Criteria andStudentHardLessThanOrEqualTo(String value) {
            addCriterion("student_hard <=", value, "studentHard");
            return (Criteria) this;
        }

        public Criteria andStudentHardLike(String value) {
            addCriterion("student_hard like", value, "studentHard");
            return (Criteria) this;
        }

        public Criteria andStudentHardNotLike(String value) {
            addCriterion("student_hard not like", value, "studentHard");
            return (Criteria) this;
        }

        public Criteria andStudentHardIn(List<String> values) {
            addCriterion("student_hard in", values, "studentHard");
            return (Criteria) this;
        }

        public Criteria andStudentHardNotIn(List<String> values) {
            addCriterion("student_hard not in", values, "studentHard");
            return (Criteria) this;
        }

        public Criteria andStudentHardBetween(String value1, String value2) {
            addCriterion("student_hard between", value1, value2, "studentHard");
            return (Criteria) this;
        }

        public Criteria andStudentHardNotBetween(String value1, String value2) {
            addCriterion("student_hard not between", value1, value2, "studentHard");
            return (Criteria) this;
        }

        public Criteria andStudentLoanIsNull() {
            addCriterion("student_loan is null");
            return (Criteria) this;
        }

        public Criteria andStudentLoanIsNotNull() {
            addCriterion("student_loan is not null");
            return (Criteria) this;
        }

        public Criteria andStudentLoanEqualTo(String value) {
            addCriterion("student_loan =", value, "studentLoan");
            return (Criteria) this;
        }

        public Criteria andStudentLoanNotEqualTo(String value) {
            addCriterion("student_loan <>", value, "studentLoan");
            return (Criteria) this;
        }

        public Criteria andStudentLoanGreaterThan(String value) {
            addCriterion("student_loan >", value, "studentLoan");
            return (Criteria) this;
        }

        public Criteria andStudentLoanGreaterThanOrEqualTo(String value) {
            addCriterion("student_loan >=", value, "studentLoan");
            return (Criteria) this;
        }

        public Criteria andStudentLoanLessThan(String value) {
            addCriterion("student_loan <", value, "studentLoan");
            return (Criteria) this;
        }

        public Criteria andStudentLoanLessThanOrEqualTo(String value) {
            addCriterion("student_loan <=", value, "studentLoan");
            return (Criteria) this;
        }

        public Criteria andStudentLoanLike(String value) {
            addCriterion("student_loan like", value, "studentLoan");
            return (Criteria) this;
        }

        public Criteria andStudentLoanNotLike(String value) {
            addCriterion("student_loan not like", value, "studentLoan");
            return (Criteria) this;
        }

        public Criteria andStudentLoanIn(List<String> values) {
            addCriterion("student_loan in", values, "studentLoan");
            return (Criteria) this;
        }

        public Criteria andStudentLoanNotIn(List<String> values) {
            addCriterion("student_loan not in", values, "studentLoan");
            return (Criteria) this;
        }

        public Criteria andStudentLoanBetween(String value1, String value2) {
            addCriterion("student_loan between", value1, value2, "studentLoan");
            return (Criteria) this;
        }

        public Criteria andStudentLoanNotBetween(String value1, String value2) {
            addCriterion("student_loan not between", value1, value2, "studentLoan");
            return (Criteria) this;
        }

        public Criteria andStudentMusterIsNull() {
            addCriterion("student_muster is null");
            return (Criteria) this;
        }

        public Criteria andStudentMusterIsNotNull() {
            addCriterion("student_muster is not null");
            return (Criteria) this;
        }

        public Criteria andStudentMusterEqualTo(String value) {
            addCriterion("student_muster =", value, "studentMuster");
            return (Criteria) this;
        }

        public Criteria andStudentMusterNotEqualTo(String value) {
            addCriterion("student_muster <>", value, "studentMuster");
            return (Criteria) this;
        }

        public Criteria andStudentMusterGreaterThan(String value) {
            addCriterion("student_muster >", value, "studentMuster");
            return (Criteria) this;
        }

        public Criteria andStudentMusterGreaterThanOrEqualTo(String value) {
            addCriterion("student_muster >=", value, "studentMuster");
            return (Criteria) this;
        }

        public Criteria andStudentMusterLessThan(String value) {
            addCriterion("student_muster <", value, "studentMuster");
            return (Criteria) this;
        }

        public Criteria andStudentMusterLessThanOrEqualTo(String value) {
            addCriterion("student_muster <=", value, "studentMuster");
            return (Criteria) this;
        }

        public Criteria andStudentMusterLike(String value) {
            addCriterion("student_muster like", value, "studentMuster");
            return (Criteria) this;
        }

        public Criteria andStudentMusterNotLike(String value) {
            addCriterion("student_muster not like", value, "studentMuster");
            return (Criteria) this;
        }

        public Criteria andStudentMusterIn(List<String> values) {
            addCriterion("student_muster in", values, "studentMuster");
            return (Criteria) this;
        }

        public Criteria andStudentMusterNotIn(List<String> values) {
            addCriterion("student_muster not in", values, "studentMuster");
            return (Criteria) this;
        }

        public Criteria andStudentMusterBetween(String value1, String value2) {
            addCriterion("student_muster between", value1, value2, "studentMuster");
            return (Criteria) this;
        }

        public Criteria andStudentMusterNotBetween(String value1, String value2) {
            addCriterion("student_muster not between", value1, value2, "studentMuster");
            return (Criteria) this;
        }

        public Criteria andStudentProjectIsNull() {
            addCriterion("student_project is null");
            return (Criteria) this;
        }

        public Criteria andStudentProjectIsNotNull() {
            addCriterion("student_project is not null");
            return (Criteria) this;
        }

        public Criteria andStudentProjectEqualTo(Double value) {
            addCriterion("student_project =", value, "studentProject");
            return (Criteria) this;
        }

        public Criteria andStudentProjectNotEqualTo(Double value) {
            addCriterion("student_project <>", value, "studentProject");
            return (Criteria) this;
        }

        public Criteria andStudentProjectGreaterThan(Double value) {
            addCriterion("student_project >", value, "studentProject");
            return (Criteria) this;
        }

        public Criteria andStudentProjectGreaterThanOrEqualTo(Double value) {
            addCriterion("student_project >=", value, "studentProject");
            return (Criteria) this;
        }

        public Criteria andStudentProjectLessThan(Double value) {
            addCriterion("student_project <", value, "studentProject");
            return (Criteria) this;
        }

        public Criteria andStudentProjectLessThanOrEqualTo(Double value) {
            addCriterion("student_project <=", value, "studentProject");
            return (Criteria) this;
        }

        public Criteria andStudentProjectIn(List<Double> values) {
            addCriterion("student_project in", values, "studentProject");
            return (Criteria) this;
        }

        public Criteria andStudentProjectNotIn(List<Double> values) {
            addCriterion("student_project not in", values, "studentProject");
            return (Criteria) this;
        }

        public Criteria andStudentProjectBetween(Double value1, Double value2) {
            addCriterion("student_project between", value1, value2, "studentProject");
            return (Criteria) this;
        }

        public Criteria andStudentProjectNotBetween(Double value1, Double value2) {
            addCriterion("student_project not between", value1, value2, "studentProject");
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