package com.Educational.entity;

import java.util.ArrayList;
import java.util.List;

public class DisciplineInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DisciplineInfoExample() {
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

        public Criteria andDisciplineNoIsNull() {
            addCriterion("discipline_no is null");
            return (Criteria) this;
        }

        public Criteria andDisciplineNoIsNotNull() {
            addCriterion("discipline_no is not null");
            return (Criteria) this;
        }

        public Criteria andDisciplineNoEqualTo(String value) {
            addCriterion("discipline_no =", value, "disciplineNo");
            return (Criteria) this;
        }

        public Criteria andDisciplineNoNotEqualTo(String value) {
            addCriterion("discipline_no <>", value, "disciplineNo");
            return (Criteria) this;
        }

        public Criteria andDisciplineNoGreaterThan(String value) {
            addCriterion("discipline_no >", value, "disciplineNo");
            return (Criteria) this;
        }

        public Criteria andDisciplineNoGreaterThanOrEqualTo(String value) {
            addCriterion("discipline_no >=", value, "disciplineNo");
            return (Criteria) this;
        }

        public Criteria andDisciplineNoLessThan(String value) {
            addCriterion("discipline_no <", value, "disciplineNo");
            return (Criteria) this;
        }

        public Criteria andDisciplineNoLessThanOrEqualTo(String value) {
            addCriterion("discipline_no <=", value, "disciplineNo");
            return (Criteria) this;
        }

        public Criteria andDisciplineNoLike(String value) {
            addCriterion("discipline_no like", value, "disciplineNo");
            return (Criteria) this;
        }

        public Criteria andDisciplineNoNotLike(String value) {
            addCriterion("discipline_no not like", value, "disciplineNo");
            return (Criteria) this;
        }

        public Criteria andDisciplineNoIn(List<String> values) {
            addCriterion("discipline_no in", values, "disciplineNo");
            return (Criteria) this;
        }

        public Criteria andDisciplineNoNotIn(List<String> values) {
            addCriterion("discipline_no not in", values, "disciplineNo");
            return (Criteria) this;
        }

        public Criteria andDisciplineNoBetween(String value1, String value2) {
            addCriterion("discipline_no between", value1, value2, "disciplineNo");
            return (Criteria) this;
        }

        public Criteria andDisciplineNoNotBetween(String value1, String value2) {
            addCriterion("discipline_no not between", value1, value2, "disciplineNo");
            return (Criteria) this;
        }

        public Criteria andDisciplineNameIsNull() {
            addCriterion("discipline_name is null");
            return (Criteria) this;
        }

        public Criteria andDisciplineNameIsNotNull() {
            addCriterion("discipline_name is not null");
            return (Criteria) this;
        }

        public Criteria andDisciplineNameEqualTo(String value) {
            addCriterion("discipline_name =", value, "disciplineName");
            return (Criteria) this;
        }

        public Criteria andDisciplineNameNotEqualTo(String value) {
            addCriterion("discipline_name <>", value, "disciplineName");
            return (Criteria) this;
        }

        public Criteria andDisciplineNameGreaterThan(String value) {
            addCriterion("discipline_name >", value, "disciplineName");
            return (Criteria) this;
        }

        public Criteria andDisciplineNameGreaterThanOrEqualTo(String value) {
            addCriterion("discipline_name >=", value, "disciplineName");
            return (Criteria) this;
        }

        public Criteria andDisciplineNameLessThan(String value) {
            addCriterion("discipline_name <", value, "disciplineName");
            return (Criteria) this;
        }

        public Criteria andDisciplineNameLessThanOrEqualTo(String value) {
            addCriterion("discipline_name <=", value, "disciplineName");
            return (Criteria) this;
        }

        public Criteria andDisciplineNameLike(String value) {
            addCriterion("discipline_name like", value, "disciplineName");
            return (Criteria) this;
        }

        public Criteria andDisciplineNameNotLike(String value) {
            addCriterion("discipline_name not like", value, "disciplineName");
            return (Criteria) this;
        }

        public Criteria andDisciplineNameIn(List<String> values) {
            addCriterion("discipline_name in", values, "disciplineName");
            return (Criteria) this;
        }

        public Criteria andDisciplineNameNotIn(List<String> values) {
            addCriterion("discipline_name not in", values, "disciplineName");
            return (Criteria) this;
        }

        public Criteria andDisciplineNameBetween(String value1, String value2) {
            addCriterion("discipline_name between", value1, value2, "disciplineName");
            return (Criteria) this;
        }

        public Criteria andDisciplineNameNotBetween(String value1, String value2) {
            addCriterion("discipline_name not between", value1, value2, "disciplineName");
            return (Criteria) this;
        }

        public Criteria andDisciplineTuitionIsNull() {
            addCriterion("discipline_tuition is null");
            return (Criteria) this;
        }

        public Criteria andDisciplineTuitionIsNotNull() {
            addCriterion("discipline_tuition is not null");
            return (Criteria) this;
        }

        public Criteria andDisciplineTuitionEqualTo(Double value) {
            addCriterion("discipline_tuition =", value, "disciplineTuition");
            return (Criteria) this;
        }

        public Criteria andDisciplineTuitionNotEqualTo(Double value) {
            addCriterion("discipline_tuition <>", value, "disciplineTuition");
            return (Criteria) this;
        }

        public Criteria andDisciplineTuitionGreaterThan(Double value) {
            addCriterion("discipline_tuition >", value, "disciplineTuition");
            return (Criteria) this;
        }

        public Criteria andDisciplineTuitionGreaterThanOrEqualTo(Double value) {
            addCriterion("discipline_tuition >=", value, "disciplineTuition");
            return (Criteria) this;
        }

        public Criteria andDisciplineTuitionLessThan(Double value) {
            addCriterion("discipline_tuition <", value, "disciplineTuition");
            return (Criteria) this;
        }

        public Criteria andDisciplineTuitionLessThanOrEqualTo(Double value) {
            addCriterion("discipline_tuition <=", value, "disciplineTuition");
            return (Criteria) this;
        }

        public Criteria andDisciplineTuitionIn(List<Double> values) {
            addCriterion("discipline_tuition in", values, "disciplineTuition");
            return (Criteria) this;
        }

        public Criteria andDisciplineTuitionNotIn(List<Double> values) {
            addCriterion("discipline_tuition not in", values, "disciplineTuition");
            return (Criteria) this;
        }

        public Criteria andDisciplineTuitionBetween(Double value1, Double value2) {
            addCriterion("discipline_tuition between", value1, value2, "disciplineTuition");
            return (Criteria) this;
        }

        public Criteria andDisciplineTuitionNotBetween(Double value1, Double value2) {
            addCriterion("discipline_tuition not between", value1, value2, "disciplineTuition");
            return (Criteria) this;
        }

        public Criteria andDisciplineBringIsNull() {
            addCriterion("discipline_bring is null");
            return (Criteria) this;
        }

        public Criteria andDisciplineBringIsNotNull() {
            addCriterion("discipline_bring is not null");
            return (Criteria) this;
        }

        public Criteria andDisciplineBringEqualTo(Integer value) {
            addCriterion("discipline_bring =", value, "disciplineBring");
            return (Criteria) this;
        }

        public Criteria andDisciplineBringNotEqualTo(Integer value) {
            addCriterion("discipline_bring <>", value, "disciplineBring");
            return (Criteria) this;
        }

        public Criteria andDisciplineBringGreaterThan(Integer value) {
            addCriterion("discipline_bring >", value, "disciplineBring");
            return (Criteria) this;
        }

        public Criteria andDisciplineBringGreaterThanOrEqualTo(Integer value) {
            addCriterion("discipline_bring >=", value, "disciplineBring");
            return (Criteria) this;
        }

        public Criteria andDisciplineBringLessThan(Integer value) {
            addCriterion("discipline_bring <", value, "disciplineBring");
            return (Criteria) this;
        }

        public Criteria andDisciplineBringLessThanOrEqualTo(Integer value) {
            addCriterion("discipline_bring <=", value, "disciplineBring");
            return (Criteria) this;
        }

        public Criteria andDisciplineBringIn(List<Integer> values) {
            addCriterion("discipline_bring in", values, "disciplineBring");
            return (Criteria) this;
        }

        public Criteria andDisciplineBringNotIn(List<Integer> values) {
            addCriterion("discipline_bring not in", values, "disciplineBring");
            return (Criteria) this;
        }

        public Criteria andDisciplineBringBetween(Integer value1, Integer value2) {
            addCriterion("discipline_bring between", value1, value2, "disciplineBring");
            return (Criteria) this;
        }

        public Criteria andDisciplineBringNotBetween(Integer value1, Integer value2) {
            addCriterion("discipline_bring not between", value1, value2, "disciplineBring");
            return (Criteria) this;
        }

        public Criteria andDisciplineTypeIsNull() {
            addCriterion("discipline_type is null");
            return (Criteria) this;
        }

        public Criteria andDisciplineTypeIsNotNull() {
            addCriterion("discipline_type is not null");
            return (Criteria) this;
        }

        public Criteria andDisciplineTypeEqualTo(String value) {
            addCriterion("discipline_type =", value, "disciplineType");
            return (Criteria) this;
        }

        public Criteria andDisciplineTypeNotEqualTo(String value) {
            addCriterion("discipline_type <>", value, "disciplineType");
            return (Criteria) this;
        }

        public Criteria andDisciplineTypeGreaterThan(String value) {
            addCriterion("discipline_type >", value, "disciplineType");
            return (Criteria) this;
        }

        public Criteria andDisciplineTypeGreaterThanOrEqualTo(String value) {
            addCriterion("discipline_type >=", value, "disciplineType");
            return (Criteria) this;
        }

        public Criteria andDisciplineTypeLessThan(String value) {
            addCriterion("discipline_type <", value, "disciplineType");
            return (Criteria) this;
        }

        public Criteria andDisciplineTypeLessThanOrEqualTo(String value) {
            addCriterion("discipline_type <=", value, "disciplineType");
            return (Criteria) this;
        }

        public Criteria andDisciplineTypeLike(String value) {
            addCriterion("discipline_type like", value, "disciplineType");
            return (Criteria) this;
        }

        public Criteria andDisciplineTypeNotLike(String value) {
            addCriterion("discipline_type not like", value, "disciplineType");
            return (Criteria) this;
        }

        public Criteria andDisciplineTypeIn(List<String> values) {
            addCriterion("discipline_type in", values, "disciplineType");
            return (Criteria) this;
        }

        public Criteria andDisciplineTypeNotIn(List<String> values) {
            addCriterion("discipline_type not in", values, "disciplineType");
            return (Criteria) this;
        }

        public Criteria andDisciplineTypeBetween(String value1, String value2) {
            addCriterion("discipline_type between", value1, value2, "disciplineType");
            return (Criteria) this;
        }

        public Criteria andDisciplineTypeNotBetween(String value1, String value2) {
            addCriterion("discipline_type not between", value1, value2, "disciplineType");
            return (Criteria) this;
        }

        public Criteria andDisciplineDescIsNull() {
            addCriterion("discipline_desc is null");
            return (Criteria) this;
        }

        public Criteria andDisciplineDescIsNotNull() {
            addCriterion("discipline_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDisciplineDescEqualTo(String value) {
            addCriterion("discipline_desc =", value, "disciplineDesc");
            return (Criteria) this;
        }

        public Criteria andDisciplineDescNotEqualTo(String value) {
            addCriterion("discipline_desc <>", value, "disciplineDesc");
            return (Criteria) this;
        }

        public Criteria andDisciplineDescGreaterThan(String value) {
            addCriterion("discipline_desc >", value, "disciplineDesc");
            return (Criteria) this;
        }

        public Criteria andDisciplineDescGreaterThanOrEqualTo(String value) {
            addCriterion("discipline_desc >=", value, "disciplineDesc");
            return (Criteria) this;
        }

        public Criteria andDisciplineDescLessThan(String value) {
            addCriterion("discipline_desc <", value, "disciplineDesc");
            return (Criteria) this;
        }

        public Criteria andDisciplineDescLessThanOrEqualTo(String value) {
            addCriterion("discipline_desc <=", value, "disciplineDesc");
            return (Criteria) this;
        }

        public Criteria andDisciplineDescLike(String value) {
            addCriterion("discipline_desc like", value, "disciplineDesc");
            return (Criteria) this;
        }

        public Criteria andDisciplineDescNotLike(String value) {
            addCriterion("discipline_desc not like", value, "disciplineDesc");
            return (Criteria) this;
        }

        public Criteria andDisciplineDescIn(List<String> values) {
            addCriterion("discipline_desc in", values, "disciplineDesc");
            return (Criteria) this;
        }

        public Criteria andDisciplineDescNotIn(List<String> values) {
            addCriterion("discipline_desc not in", values, "disciplineDesc");
            return (Criteria) this;
        }

        public Criteria andDisciplineDescBetween(String value1, String value2) {
            addCriterion("discipline_desc between", value1, value2, "disciplineDesc");
            return (Criteria) this;
        }

        public Criteria andDisciplineDescNotBetween(String value1, String value2) {
            addCriterion("discipline_desc not between", value1, value2, "disciplineDesc");
            return (Criteria) this;
        }

        public Criteria andDisciplineIsuesdIsNull() {
            addCriterion("discipline_isuesd is null");
            return (Criteria) this;
        }

        public Criteria andDisciplineIsuesdIsNotNull() {
            addCriterion("discipline_isuesd is not null");
            return (Criteria) this;
        }

        public Criteria andDisciplineIsuesdEqualTo(String value) {
            addCriterion("discipline_isuesd =", value, "disciplineIsuesd");
            return (Criteria) this;
        }

        public Criteria andDisciplineIsuesdNotEqualTo(String value) {
            addCriterion("discipline_isuesd <>", value, "disciplineIsuesd");
            return (Criteria) this;
        }

        public Criteria andDisciplineIsuesdGreaterThan(String value) {
            addCriterion("discipline_isuesd >", value, "disciplineIsuesd");
            return (Criteria) this;
        }

        public Criteria andDisciplineIsuesdGreaterThanOrEqualTo(String value) {
            addCriterion("discipline_isuesd >=", value, "disciplineIsuesd");
            return (Criteria) this;
        }

        public Criteria andDisciplineIsuesdLessThan(String value) {
            addCriterion("discipline_isuesd <", value, "disciplineIsuesd");
            return (Criteria) this;
        }

        public Criteria andDisciplineIsuesdLessThanOrEqualTo(String value) {
            addCriterion("discipline_isuesd <=", value, "disciplineIsuesd");
            return (Criteria) this;
        }

        public Criteria andDisciplineIsuesdLike(String value) {
            addCriterion("discipline_isuesd like", value, "disciplineIsuesd");
            return (Criteria) this;
        }

        public Criteria andDisciplineIsuesdNotLike(String value) {
            addCriterion("discipline_isuesd not like", value, "disciplineIsuesd");
            return (Criteria) this;
        }

        public Criteria andDisciplineIsuesdIn(List<String> values) {
            addCriterion("discipline_isuesd in", values, "disciplineIsuesd");
            return (Criteria) this;
        }

        public Criteria andDisciplineIsuesdNotIn(List<String> values) {
            addCriterion("discipline_isuesd not in", values, "disciplineIsuesd");
            return (Criteria) this;
        }

        public Criteria andDisciplineIsuesdBetween(String value1, String value2) {
            addCriterion("discipline_isuesd between", value1, value2, "disciplineIsuesd");
            return (Criteria) this;
        }

        public Criteria andDisciplineIsuesdNotBetween(String value1, String value2) {
            addCriterion("discipline_isuesd not between", value1, value2, "disciplineIsuesd");
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