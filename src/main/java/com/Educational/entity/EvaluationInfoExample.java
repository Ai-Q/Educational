package com.Educational.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvaluationInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluationInfoExample() {
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

        public Criteria andEvaluationIdIsNull() {
            addCriterion("evaluation_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdIsNotNull() {
            addCriterion("evaluation_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdEqualTo(Integer value) {
            addCriterion("evaluation_id =", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdNotEqualTo(Integer value) {
            addCriterion("evaluation_id <>", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdGreaterThan(Integer value) {
            addCriterion("evaluation_id >", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluation_id >=", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdLessThan(Integer value) {
            addCriterion("evaluation_id <", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdLessThanOrEqualTo(Integer value) {
            addCriterion("evaluation_id <=", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdIn(List<Integer> values) {
            addCriterion("evaluation_id in", values, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdNotIn(List<Integer> values) {
            addCriterion("evaluation_id not in", values, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdBetween(Integer value1, Integer value2) {
            addCriterion("evaluation_id between", value1, value2, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluation_id not between", value1, value2, "evaluationId");
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

        public Criteria andDisciplineIdIsNull() {
            addCriterion("discipline_id is null");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdIsNotNull() {
            addCriterion("discipline_id is not null");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdEqualTo(Integer value) {
            addCriterion("discipline_id =", value, "disciplineId");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdNotEqualTo(Integer value) {
            addCriterion("discipline_id <>", value, "disciplineId");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdGreaterThan(Integer value) {
            addCriterion("discipline_id >", value, "disciplineId");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("discipline_id >=", value, "disciplineId");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdLessThan(Integer value) {
            addCriterion("discipline_id <", value, "disciplineId");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdLessThanOrEqualTo(Integer value) {
            addCriterion("discipline_id <=", value, "disciplineId");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdIn(List<Integer> values) {
            addCriterion("discipline_id in", values, "disciplineId");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdNotIn(List<Integer> values) {
            addCriterion("discipline_id not in", values, "disciplineId");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdBetween(Integer value1, Integer value2) {
            addCriterion("discipline_id between", value1, value2, "disciplineId");
            return (Criteria) this;
        }

        public Criteria andDisciplineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("discipline_id not between", value1, value2, "disciplineId");
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

        public Criteria andEvaluationXueqiIsNull() {
            addCriterion("evaluation_xueqi is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationXueqiIsNotNull() {
            addCriterion("evaluation_xueqi is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationXueqiEqualTo(String value) {
            addCriterion("evaluation_xueqi =", value, "evaluationXueqi");
            return (Criteria) this;
        }

        public Criteria andEvaluationXueqiNotEqualTo(String value) {
            addCriterion("evaluation_xueqi <>", value, "evaluationXueqi");
            return (Criteria) this;
        }

        public Criteria andEvaluationXueqiGreaterThan(String value) {
            addCriterion("evaluation_xueqi >", value, "evaluationXueqi");
            return (Criteria) this;
        }

        public Criteria andEvaluationXueqiGreaterThanOrEqualTo(String value) {
            addCriterion("evaluation_xueqi >=", value, "evaluationXueqi");
            return (Criteria) this;
        }

        public Criteria andEvaluationXueqiLessThan(String value) {
            addCriterion("evaluation_xueqi <", value, "evaluationXueqi");
            return (Criteria) this;
        }

        public Criteria andEvaluationXueqiLessThanOrEqualTo(String value) {
            addCriterion("evaluation_xueqi <=", value, "evaluationXueqi");
            return (Criteria) this;
        }

        public Criteria andEvaluationXueqiLike(String value) {
            addCriterion("evaluation_xueqi like", value, "evaluationXueqi");
            return (Criteria) this;
        }

        public Criteria andEvaluationXueqiNotLike(String value) {
            addCriterion("evaluation_xueqi not like", value, "evaluationXueqi");
            return (Criteria) this;
        }

        public Criteria andEvaluationXueqiIn(List<String> values) {
            addCriterion("evaluation_xueqi in", values, "evaluationXueqi");
            return (Criteria) this;
        }

        public Criteria andEvaluationXueqiNotIn(List<String> values) {
            addCriterion("evaluation_xueqi not in", values, "evaluationXueqi");
            return (Criteria) this;
        }

        public Criteria andEvaluationXueqiBetween(String value1, String value2) {
            addCriterion("evaluation_xueqi between", value1, value2, "evaluationXueqi");
            return (Criteria) this;
        }

        public Criteria andEvaluationXueqiNotBetween(String value1, String value2) {
            addCriterion("evaluation_xueqi not between", value1, value2, "evaluationXueqi");
            return (Criteria) this;
        }

        public Criteria andEvaluationMonthIsNull() {
            addCriterion("evaluation_month is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationMonthIsNotNull() {
            addCriterion("evaluation_month is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationMonthEqualTo(String value) {
            addCriterion("evaluation_month =", value, "evaluationMonth");
            return (Criteria) this;
        }

        public Criteria andEvaluationMonthNotEqualTo(String value) {
            addCriterion("evaluation_month <>", value, "evaluationMonth");
            return (Criteria) this;
        }

        public Criteria andEvaluationMonthGreaterThan(String value) {
            addCriterion("evaluation_month >", value, "evaluationMonth");
            return (Criteria) this;
        }

        public Criteria andEvaluationMonthGreaterThanOrEqualTo(String value) {
            addCriterion("evaluation_month >=", value, "evaluationMonth");
            return (Criteria) this;
        }

        public Criteria andEvaluationMonthLessThan(String value) {
            addCriterion("evaluation_month <", value, "evaluationMonth");
            return (Criteria) this;
        }

        public Criteria andEvaluationMonthLessThanOrEqualTo(String value) {
            addCriterion("evaluation_month <=", value, "evaluationMonth");
            return (Criteria) this;
        }

        public Criteria andEvaluationMonthLike(String value) {
            addCriterion("evaluation_month like", value, "evaluationMonth");
            return (Criteria) this;
        }

        public Criteria andEvaluationMonthNotLike(String value) {
            addCriterion("evaluation_month not like", value, "evaluationMonth");
            return (Criteria) this;
        }

        public Criteria andEvaluationMonthIn(List<String> values) {
            addCriterion("evaluation_month in", values, "evaluationMonth");
            return (Criteria) this;
        }

        public Criteria andEvaluationMonthNotIn(List<String> values) {
            addCriterion("evaluation_month not in", values, "evaluationMonth");
            return (Criteria) this;
        }

        public Criteria andEvaluationMonthBetween(String value1, String value2) {
            addCriterion("evaluation_month between", value1, value2, "evaluationMonth");
            return (Criteria) this;
        }

        public Criteria andEvaluationMonthNotBetween(String value1, String value2) {
            addCriterion("evaluation_month not between", value1, value2, "evaluationMonth");
            return (Criteria) this;
        }

        public Criteria andEvaluationMajorIsNull() {
            addCriterion("evaluation_major is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationMajorIsNotNull() {
            addCriterion("evaluation_major is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationMajorEqualTo(String value) {
            addCriterion("evaluation_major =", value, "evaluationMajor");
            return (Criteria) this;
        }

        public Criteria andEvaluationMajorNotEqualTo(String value) {
            addCriterion("evaluation_major <>", value, "evaluationMajor");
            return (Criteria) this;
        }

        public Criteria andEvaluationMajorGreaterThan(String value) {
            addCriterion("evaluation_major >", value, "evaluationMajor");
            return (Criteria) this;
        }

        public Criteria andEvaluationMajorGreaterThanOrEqualTo(String value) {
            addCriterion("evaluation_major >=", value, "evaluationMajor");
            return (Criteria) this;
        }

        public Criteria andEvaluationMajorLessThan(String value) {
            addCriterion("evaluation_major <", value, "evaluationMajor");
            return (Criteria) this;
        }

        public Criteria andEvaluationMajorLessThanOrEqualTo(String value) {
            addCriterion("evaluation_major <=", value, "evaluationMajor");
            return (Criteria) this;
        }

        public Criteria andEvaluationMajorLike(String value) {
            addCriterion("evaluation_major like", value, "evaluationMajor");
            return (Criteria) this;
        }

        public Criteria andEvaluationMajorNotLike(String value) {
            addCriterion("evaluation_major not like", value, "evaluationMajor");
            return (Criteria) this;
        }

        public Criteria andEvaluationMajorIn(List<String> values) {
            addCriterion("evaluation_major in", values, "evaluationMajor");
            return (Criteria) this;
        }

        public Criteria andEvaluationMajorNotIn(List<String> values) {
            addCriterion("evaluation_major not in", values, "evaluationMajor");
            return (Criteria) this;
        }

        public Criteria andEvaluationMajorBetween(String value1, String value2) {
            addCriterion("evaluation_major between", value1, value2, "evaluationMajor");
            return (Criteria) this;
        }

        public Criteria andEvaluationMajorNotBetween(String value1, String value2) {
            addCriterion("evaluation_major not between", value1, value2, "evaluationMajor");
            return (Criteria) this;
        }

        public Criteria andScore1IsNull() {
            addCriterion("score1 is null");
            return (Criteria) this;
        }

        public Criteria andScore1IsNotNull() {
            addCriterion("score1 is not null");
            return (Criteria) this;
        }

        public Criteria andScore1EqualTo(Integer value) {
            addCriterion("score1 =", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotEqualTo(Integer value) {
            addCriterion("score1 <>", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1GreaterThan(Integer value) {
            addCriterion("score1 >", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1GreaterThanOrEqualTo(Integer value) {
            addCriterion("score1 >=", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1LessThan(Integer value) {
            addCriterion("score1 <", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1LessThanOrEqualTo(Integer value) {
            addCriterion("score1 <=", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1In(List<Integer> values) {
            addCriterion("score1 in", values, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotIn(List<Integer> values) {
            addCriterion("score1 not in", values, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1Between(Integer value1, Integer value2) {
            addCriterion("score1 between", value1, value2, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotBetween(Integer value1, Integer value2) {
            addCriterion("score1 not between", value1, value2, "score1");
            return (Criteria) this;
        }

        public Criteria andScore2IsNull() {
            addCriterion("score2 is null");
            return (Criteria) this;
        }

        public Criteria andScore2IsNotNull() {
            addCriterion("score2 is not null");
            return (Criteria) this;
        }

        public Criteria andScore2EqualTo(Integer value) {
            addCriterion("score2 =", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotEqualTo(Integer value) {
            addCriterion("score2 <>", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2GreaterThan(Integer value) {
            addCriterion("score2 >", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2GreaterThanOrEqualTo(Integer value) {
            addCriterion("score2 >=", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2LessThan(Integer value) {
            addCriterion("score2 <", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2LessThanOrEqualTo(Integer value) {
            addCriterion("score2 <=", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2In(List<Integer> values) {
            addCriterion("score2 in", values, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotIn(List<Integer> values) {
            addCriterion("score2 not in", values, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2Between(Integer value1, Integer value2) {
            addCriterion("score2 between", value1, value2, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotBetween(Integer value1, Integer value2) {
            addCriterion("score2 not between", value1, value2, "score2");
            return (Criteria) this;
        }

        public Criteria andScore3IsNull() {
            addCriterion("score3 is null");
            return (Criteria) this;
        }

        public Criteria andScore3IsNotNull() {
            addCriterion("score3 is not null");
            return (Criteria) this;
        }

        public Criteria andScore3EqualTo(Integer value) {
            addCriterion("score3 =", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotEqualTo(Integer value) {
            addCriterion("score3 <>", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3GreaterThan(Integer value) {
            addCriterion("score3 >", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3GreaterThanOrEqualTo(Integer value) {
            addCriterion("score3 >=", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3LessThan(Integer value) {
            addCriterion("score3 <", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3LessThanOrEqualTo(Integer value) {
            addCriterion("score3 <=", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3In(List<Integer> values) {
            addCriterion("score3 in", values, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotIn(List<Integer> values) {
            addCriterion("score3 not in", values, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3Between(Integer value1, Integer value2) {
            addCriterion("score3 between", value1, value2, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotBetween(Integer value1, Integer value2) {
            addCriterion("score3 not between", value1, value2, "score3");
            return (Criteria) this;
        }

        public Criteria andScore4IsNull() {
            addCriterion("score4 is null");
            return (Criteria) this;
        }

        public Criteria andScore4IsNotNull() {
            addCriterion("score4 is not null");
            return (Criteria) this;
        }

        public Criteria andScore4EqualTo(Integer value) {
            addCriterion("score4 =", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4NotEqualTo(Integer value) {
            addCriterion("score4 <>", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4GreaterThan(Integer value) {
            addCriterion("score4 >", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4GreaterThanOrEqualTo(Integer value) {
            addCriterion("score4 >=", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4LessThan(Integer value) {
            addCriterion("score4 <", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4LessThanOrEqualTo(Integer value) {
            addCriterion("score4 <=", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4In(List<Integer> values) {
            addCriterion("score4 in", values, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4NotIn(List<Integer> values) {
            addCriterion("score4 not in", values, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4Between(Integer value1, Integer value2) {
            addCriterion("score4 between", value1, value2, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4NotBetween(Integer value1, Integer value2) {
            addCriterion("score4 not between", value1, value2, "score4");
            return (Criteria) this;
        }

        public Criteria andScore5IsNull() {
            addCriterion("score5 is null");
            return (Criteria) this;
        }

        public Criteria andScore5IsNotNull() {
            addCriterion("score5 is not null");
            return (Criteria) this;
        }

        public Criteria andScore5EqualTo(Integer value) {
            addCriterion("score5 =", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5NotEqualTo(Integer value) {
            addCriterion("score5 <>", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5GreaterThan(Integer value) {
            addCriterion("score5 >", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5GreaterThanOrEqualTo(Integer value) {
            addCriterion("score5 >=", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5LessThan(Integer value) {
            addCriterion("score5 <", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5LessThanOrEqualTo(Integer value) {
            addCriterion("score5 <=", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5In(List<Integer> values) {
            addCriterion("score5 in", values, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5NotIn(List<Integer> values) {
            addCriterion("score5 not in", values, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5Between(Integer value1, Integer value2) {
            addCriterion("score5 between", value1, value2, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5NotBetween(Integer value1, Integer value2) {
            addCriterion("score5 not between", value1, value2, "score5");
            return (Criteria) this;
        }

        public Criteria andScore6IsNull() {
            addCriterion("score6 is null");
            return (Criteria) this;
        }

        public Criteria andScore6IsNotNull() {
            addCriterion("score6 is not null");
            return (Criteria) this;
        }

        public Criteria andScore6EqualTo(Integer value) {
            addCriterion("score6 =", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6NotEqualTo(Integer value) {
            addCriterion("score6 <>", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6GreaterThan(Integer value) {
            addCriterion("score6 >", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6GreaterThanOrEqualTo(Integer value) {
            addCriterion("score6 >=", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6LessThan(Integer value) {
            addCriterion("score6 <", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6LessThanOrEqualTo(Integer value) {
            addCriterion("score6 <=", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6In(List<Integer> values) {
            addCriterion("score6 in", values, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6NotIn(List<Integer> values) {
            addCriterion("score6 not in", values, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6Between(Integer value1, Integer value2) {
            addCriterion("score6 between", value1, value2, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6NotBetween(Integer value1, Integer value2) {
            addCriterion("score6 not between", value1, value2, "score6");
            return (Criteria) this;
        }

        public Criteria andSumIsNull() {
            addCriterion("sum is null");
            return (Criteria) this;
        }

        public Criteria andSumIsNotNull() {
            addCriterion("sum is not null");
            return (Criteria) this;
        }

        public Criteria andSumEqualTo(Integer value) {
            addCriterion("sum =", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotEqualTo(Integer value) {
            addCriterion("sum <>", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThan(Integer value) {
            addCriterion("sum >", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum >=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThan(Integer value) {
            addCriterion("sum <", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThanOrEqualTo(Integer value) {
            addCriterion("sum <=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumIn(List<Integer> values) {
            addCriterion("sum in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotIn(List<Integer> values) {
            addCriterion("sum not in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumBetween(Integer value1, Integer value2) {
            addCriterion("sum between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotBetween(Integer value1, Integer value2) {
            addCriterion("sum not between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeIsNull() {
            addCriterion("evaluation_time is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeIsNotNull() {
            addCriterion("evaluation_time is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeEqualTo(Date value) {
            addCriterion("evaluation_time =", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeNotEqualTo(Date value) {
            addCriterion("evaluation_time <>", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeGreaterThan(Date value) {
            addCriterion("evaluation_time >", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("evaluation_time >=", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeLessThan(Date value) {
            addCriterion("evaluation_time <", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeLessThanOrEqualTo(Date value) {
            addCriterion("evaluation_time <=", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeIn(List<Date> values) {
            addCriterion("evaluation_time in", values, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeNotIn(List<Date> values) {
            addCriterion("evaluation_time not in", values, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeBetween(Date value1, Date value2) {
            addCriterion("evaluation_time between", value1, value2, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeNotBetween(Date value1, Date value2) {
            addCriterion("evaluation_time not between", value1, value2, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationNoteIsNull() {
            addCriterion("evaluation_note is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationNoteIsNotNull() {
            addCriterion("evaluation_note is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationNoteEqualTo(String value) {
            addCriterion("evaluation_note =", value, "evaluationNote");
            return (Criteria) this;
        }

        public Criteria andEvaluationNoteNotEqualTo(String value) {
            addCriterion("evaluation_note <>", value, "evaluationNote");
            return (Criteria) this;
        }

        public Criteria andEvaluationNoteGreaterThan(String value) {
            addCriterion("evaluation_note >", value, "evaluationNote");
            return (Criteria) this;
        }

        public Criteria andEvaluationNoteGreaterThanOrEqualTo(String value) {
            addCriterion("evaluation_note >=", value, "evaluationNote");
            return (Criteria) this;
        }

        public Criteria andEvaluationNoteLessThan(String value) {
            addCriterion("evaluation_note <", value, "evaluationNote");
            return (Criteria) this;
        }

        public Criteria andEvaluationNoteLessThanOrEqualTo(String value) {
            addCriterion("evaluation_note <=", value, "evaluationNote");
            return (Criteria) this;
        }

        public Criteria andEvaluationNoteLike(String value) {
            addCriterion("evaluation_note like", value, "evaluationNote");
            return (Criteria) this;
        }

        public Criteria andEvaluationNoteNotLike(String value) {
            addCriterion("evaluation_note not like", value, "evaluationNote");
            return (Criteria) this;
        }

        public Criteria andEvaluationNoteIn(List<String> values) {
            addCriterion("evaluation_note in", values, "evaluationNote");
            return (Criteria) this;
        }

        public Criteria andEvaluationNoteNotIn(List<String> values) {
            addCriterion("evaluation_note not in", values, "evaluationNote");
            return (Criteria) this;
        }

        public Criteria andEvaluationNoteBetween(String value1, String value2) {
            addCriterion("evaluation_note between", value1, value2, "evaluationNote");
            return (Criteria) this;
        }

        public Criteria andEvaluationNoteNotBetween(String value1, String value2) {
            addCriterion("evaluation_note not between", value1, value2, "evaluationNote");
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