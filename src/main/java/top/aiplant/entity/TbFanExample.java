package top.aiplant.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbFanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbFanExample() {
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

        public Criteria andFanIdIsNull() {
            addCriterion("fan_id is null");
            return (Criteria) this;
        }

        public Criteria andFanIdIsNotNull() {
            addCriterion("fan_id is not null");
            return (Criteria) this;
        }

        public Criteria andFanIdEqualTo(Integer value) {
            addCriterion("fan_id =", value, "fanId");
            return (Criteria) this;
        }

        public Criteria andFanIdNotEqualTo(Integer value) {
            addCriterion("fan_id <>", value, "fanId");
            return (Criteria) this;
        }

        public Criteria andFanIdGreaterThan(Integer value) {
            addCriterion("fan_id >", value, "fanId");
            return (Criteria) this;
        }

        public Criteria andFanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fan_id >=", value, "fanId");
            return (Criteria) this;
        }

        public Criteria andFanIdLessThan(Integer value) {
            addCriterion("fan_id <", value, "fanId");
            return (Criteria) this;
        }

        public Criteria andFanIdLessThanOrEqualTo(Integer value) {
            addCriterion("fan_id <=", value, "fanId");
            return (Criteria) this;
        }

        public Criteria andFanIdIn(List<Integer> values) {
            addCriterion("fan_id in", values, "fanId");
            return (Criteria) this;
        }

        public Criteria andFanIdNotIn(List<Integer> values) {
            addCriterion("fan_id not in", values, "fanId");
            return (Criteria) this;
        }

        public Criteria andFanIdBetween(Integer value1, Integer value2) {
            addCriterion("fan_id between", value1, value2, "fanId");
            return (Criteria) this;
        }

        public Criteria andFanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fan_id not between", value1, value2, "fanId");
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

        public Criteria andFanStatusIsNull() {
            addCriterion("fan_status is null");
            return (Criteria) this;
        }

        public Criteria andFanStatusIsNotNull() {
            addCriterion("fan_status is not null");
            return (Criteria) this;
        }

        public Criteria andFanStatusEqualTo(Byte value) {
            addCriterion("fan_status =", value, "fanStatus");
            return (Criteria) this;
        }

        public Criteria andFanStatusNotEqualTo(Byte value) {
            addCriterion("fan_status <>", value, "fanStatus");
            return (Criteria) this;
        }

        public Criteria andFanStatusGreaterThan(Byte value) {
            addCriterion("fan_status >", value, "fanStatus");
            return (Criteria) this;
        }

        public Criteria andFanStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("fan_status >=", value, "fanStatus");
            return (Criteria) this;
        }

        public Criteria andFanStatusLessThan(Byte value) {
            addCriterion("fan_status <", value, "fanStatus");
            return (Criteria) this;
        }

        public Criteria andFanStatusLessThanOrEqualTo(Byte value) {
            addCriterion("fan_status <=", value, "fanStatus");
            return (Criteria) this;
        }

        public Criteria andFanStatusIn(List<Byte> values) {
            addCriterion("fan_status in", values, "fanStatus");
            return (Criteria) this;
        }

        public Criteria andFanStatusNotIn(List<Byte> values) {
            addCriterion("fan_status not in", values, "fanStatus");
            return (Criteria) this;
        }

        public Criteria andFanStatusBetween(Byte value1, Byte value2) {
            addCriterion("fan_status between", value1, value2, "fanStatus");
            return (Criteria) this;
        }

        public Criteria andFanStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("fan_status not between", value1, value2, "fanStatus");
            return (Criteria) this;
        }

        public Criteria andFanTimeIsNull() {
            addCriterion("fan_time is null");
            return (Criteria) this;
        }

        public Criteria andFanTimeIsNotNull() {
            addCriterion("fan_time is not null");
            return (Criteria) this;
        }

        public Criteria andFanTimeEqualTo(Date value) {
            addCriterion("fan_time =", value, "fanTime");
            return (Criteria) this;
        }

        public Criteria andFanTimeNotEqualTo(Date value) {
            addCriterion("fan_time <>", value, "fanTime");
            return (Criteria) this;
        }

        public Criteria andFanTimeGreaterThan(Date value) {
            addCriterion("fan_time >", value, "fanTime");
            return (Criteria) this;
        }

        public Criteria andFanTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fan_time >=", value, "fanTime");
            return (Criteria) this;
        }

        public Criteria andFanTimeLessThan(Date value) {
            addCriterion("fan_time <", value, "fanTime");
            return (Criteria) this;
        }

        public Criteria andFanTimeLessThanOrEqualTo(Date value) {
            addCriterion("fan_time <=", value, "fanTime");
            return (Criteria) this;
        }

        public Criteria andFanTimeIn(List<Date> values) {
            addCriterion("fan_time in", values, "fanTime");
            return (Criteria) this;
        }

        public Criteria andFanTimeNotIn(List<Date> values) {
            addCriterion("fan_time not in", values, "fanTime");
            return (Criteria) this;
        }

        public Criteria andFanTimeBetween(Date value1, Date value2) {
            addCriterion("fan_time between", value1, value2, "fanTime");
            return (Criteria) this;
        }

        public Criteria andFanTimeNotBetween(Date value1, Date value2) {
            addCriterion("fan_time not between", value1, value2, "fanTime");
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