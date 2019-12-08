package top.aiplant.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbRainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbRainExample() {
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

        public Criteria andRainIdIsNull() {
            addCriterion("rain_id is null");
            return (Criteria) this;
        }

        public Criteria andRainIdIsNotNull() {
            addCriterion("rain_id is not null");
            return (Criteria) this;
        }

        public Criteria andRainIdEqualTo(Integer value) {
            addCriterion("rain_id =", value, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdNotEqualTo(Integer value) {
            addCriterion("rain_id <>", value, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdGreaterThan(Integer value) {
            addCriterion("rain_id >", value, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rain_id >=", value, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdLessThan(Integer value) {
            addCriterion("rain_id <", value, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdLessThanOrEqualTo(Integer value) {
            addCriterion("rain_id <=", value, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdIn(List<Integer> values) {
            addCriterion("rain_id in", values, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdNotIn(List<Integer> values) {
            addCriterion("rain_id not in", values, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdBetween(Integer value1, Integer value2) {
            addCriterion("rain_id between", value1, value2, "rainId");
            return (Criteria) this;
        }

        public Criteria andRainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rain_id not between", value1, value2, "rainId");
            return (Criteria) this;
        }

        public Criteria andSensorIdIsNull() {
            addCriterion("sensor_id is null");
            return (Criteria) this;
        }

        public Criteria andSensorIdIsNotNull() {
            addCriterion("sensor_id is not null");
            return (Criteria) this;
        }

        public Criteria andSensorIdEqualTo(Integer value) {
            addCriterion("sensor_id =", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdNotEqualTo(Integer value) {
            addCriterion("sensor_id <>", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdGreaterThan(Integer value) {
            addCriterion("sensor_id >", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sensor_id >=", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdLessThan(Integer value) {
            addCriterion("sensor_id <", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdLessThanOrEqualTo(Integer value) {
            addCriterion("sensor_id <=", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdIn(List<Integer> values) {
            addCriterion("sensor_id in", values, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdNotIn(List<Integer> values) {
            addCriterion("sensor_id not in", values, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdBetween(Integer value1, Integer value2) {
            addCriterion("sensor_id between", value1, value2, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sensor_id not between", value1, value2, "sensorId");
            return (Criteria) this;
        }

        public Criteria andRainRainfallIsNull() {
            addCriterion("rain_rainfall is null");
            return (Criteria) this;
        }

        public Criteria andRainRainfallIsNotNull() {
            addCriterion("rain_rainfall is not null");
            return (Criteria) this;
        }

        public Criteria andRainRainfallEqualTo(Integer value) {
            addCriterion("rain_rainfall =", value, "rainRainfall");
            return (Criteria) this;
        }

        public Criteria andRainRainfallNotEqualTo(Integer value) {
            addCriterion("rain_rainfall <>", value, "rainRainfall");
            return (Criteria) this;
        }

        public Criteria andRainRainfallGreaterThan(Integer value) {
            addCriterion("rain_rainfall >", value, "rainRainfall");
            return (Criteria) this;
        }

        public Criteria andRainRainfallGreaterThanOrEqualTo(Integer value) {
            addCriterion("rain_rainfall >=", value, "rainRainfall");
            return (Criteria) this;
        }

        public Criteria andRainRainfallLessThan(Integer value) {
            addCriterion("rain_rainfall <", value, "rainRainfall");
            return (Criteria) this;
        }

        public Criteria andRainRainfallLessThanOrEqualTo(Integer value) {
            addCriterion("rain_rainfall <=", value, "rainRainfall");
            return (Criteria) this;
        }

        public Criteria andRainRainfallIn(List<Integer> values) {
            addCriterion("rain_rainfall in", values, "rainRainfall");
            return (Criteria) this;
        }

        public Criteria andRainRainfallNotIn(List<Integer> values) {
            addCriterion("rain_rainfall not in", values, "rainRainfall");
            return (Criteria) this;
        }

        public Criteria andRainRainfallBetween(Integer value1, Integer value2) {
            addCriterion("rain_rainfall between", value1, value2, "rainRainfall");
            return (Criteria) this;
        }

        public Criteria andRainRainfallNotBetween(Integer value1, Integer value2) {
            addCriterion("rain_rainfall not between", value1, value2, "rainRainfall");
            return (Criteria) this;
        }

        public Criteria andRainTimeIsNull() {
            addCriterion("rain_time is null");
            return (Criteria) this;
        }

        public Criteria andRainTimeIsNotNull() {
            addCriterion("rain_time is not null");
            return (Criteria) this;
        }

        public Criteria andRainTimeEqualTo(Date value) {
            addCriterion("rain_time =", value, "rainTime");
            return (Criteria) this;
        }

        public Criteria andRainTimeNotEqualTo(Date value) {
            addCriterion("rain_time <>", value, "rainTime");
            return (Criteria) this;
        }

        public Criteria andRainTimeGreaterThan(Date value) {
            addCriterion("rain_time >", value, "rainTime");
            return (Criteria) this;
        }

        public Criteria andRainTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rain_time >=", value, "rainTime");
            return (Criteria) this;
        }

        public Criteria andRainTimeLessThan(Date value) {
            addCriterion("rain_time <", value, "rainTime");
            return (Criteria) this;
        }

        public Criteria andRainTimeLessThanOrEqualTo(Date value) {
            addCriterion("rain_time <=", value, "rainTime");
            return (Criteria) this;
        }

        public Criteria andRainTimeIn(List<Date> values) {
            addCriterion("rain_time in", values, "rainTime");
            return (Criteria) this;
        }

        public Criteria andRainTimeNotIn(List<Date> values) {
            addCriterion("rain_time not in", values, "rainTime");
            return (Criteria) this;
        }

        public Criteria andRainTimeBetween(Date value1, Date value2) {
            addCriterion("rain_time between", value1, value2, "rainTime");
            return (Criteria) this;
        }

        public Criteria andRainTimeNotBetween(Date value1, Date value2) {
            addCriterion("rain_time not between", value1, value2, "rainTime");
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