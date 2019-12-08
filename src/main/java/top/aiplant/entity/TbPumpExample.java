package top.aiplant.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbPumpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPumpExample() {
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

        public Criteria andPumpIdIsNull() {
            addCriterion("pump_id is null");
            return (Criteria) this;
        }

        public Criteria andPumpIdIsNotNull() {
            addCriterion("pump_id is not null");
            return (Criteria) this;
        }

        public Criteria andPumpIdEqualTo(Integer value) {
            addCriterion("pump_id =", value, "pumpId");
            return (Criteria) this;
        }

        public Criteria andPumpIdNotEqualTo(Integer value) {
            addCriterion("pump_id <>", value, "pumpId");
            return (Criteria) this;
        }

        public Criteria andPumpIdGreaterThan(Integer value) {
            addCriterion("pump_id >", value, "pumpId");
            return (Criteria) this;
        }

        public Criteria andPumpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pump_id >=", value, "pumpId");
            return (Criteria) this;
        }

        public Criteria andPumpIdLessThan(Integer value) {
            addCriterion("pump_id <", value, "pumpId");
            return (Criteria) this;
        }

        public Criteria andPumpIdLessThanOrEqualTo(Integer value) {
            addCriterion("pump_id <=", value, "pumpId");
            return (Criteria) this;
        }

        public Criteria andPumpIdIn(List<Integer> values) {
            addCriterion("pump_id in", values, "pumpId");
            return (Criteria) this;
        }

        public Criteria andPumpIdNotIn(List<Integer> values) {
            addCriterion("pump_id not in", values, "pumpId");
            return (Criteria) this;
        }

        public Criteria andPumpIdBetween(Integer value1, Integer value2) {
            addCriterion("pump_id between", value1, value2, "pumpId");
            return (Criteria) this;
        }

        public Criteria andPumpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pump_id not between", value1, value2, "pumpId");
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

        public Criteria andPumpStatusIsNull() {
            addCriterion("pump_status is null");
            return (Criteria) this;
        }

        public Criteria andPumpStatusIsNotNull() {
            addCriterion("pump_status is not null");
            return (Criteria) this;
        }

        public Criteria andPumpStatusEqualTo(Byte value) {
            addCriterion("pump_status =", value, "pumpStatus");
            return (Criteria) this;
        }

        public Criteria andPumpStatusNotEqualTo(Byte value) {
            addCriterion("pump_status <>", value, "pumpStatus");
            return (Criteria) this;
        }

        public Criteria andPumpStatusGreaterThan(Byte value) {
            addCriterion("pump_status >", value, "pumpStatus");
            return (Criteria) this;
        }

        public Criteria andPumpStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("pump_status >=", value, "pumpStatus");
            return (Criteria) this;
        }

        public Criteria andPumpStatusLessThan(Byte value) {
            addCriterion("pump_status <", value, "pumpStatus");
            return (Criteria) this;
        }

        public Criteria andPumpStatusLessThanOrEqualTo(Byte value) {
            addCriterion("pump_status <=", value, "pumpStatus");
            return (Criteria) this;
        }

        public Criteria andPumpStatusIn(List<Byte> values) {
            addCriterion("pump_status in", values, "pumpStatus");
            return (Criteria) this;
        }

        public Criteria andPumpStatusNotIn(List<Byte> values) {
            addCriterion("pump_status not in", values, "pumpStatus");
            return (Criteria) this;
        }

        public Criteria andPumpStatusBetween(Byte value1, Byte value2) {
            addCriterion("pump_status between", value1, value2, "pumpStatus");
            return (Criteria) this;
        }

        public Criteria andPumpStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("pump_status not between", value1, value2, "pumpStatus");
            return (Criteria) this;
        }

        public Criteria andPumpTimeIsNull() {
            addCriterion("pump_time is null");
            return (Criteria) this;
        }

        public Criteria andPumpTimeIsNotNull() {
            addCriterion("pump_time is not null");
            return (Criteria) this;
        }

        public Criteria andPumpTimeEqualTo(Date value) {
            addCriterion("pump_time =", value, "pumpTime");
            return (Criteria) this;
        }

        public Criteria andPumpTimeNotEqualTo(Date value) {
            addCriterion("pump_time <>", value, "pumpTime");
            return (Criteria) this;
        }

        public Criteria andPumpTimeGreaterThan(Date value) {
            addCriterion("pump_time >", value, "pumpTime");
            return (Criteria) this;
        }

        public Criteria andPumpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pump_time >=", value, "pumpTime");
            return (Criteria) this;
        }

        public Criteria andPumpTimeLessThan(Date value) {
            addCriterion("pump_time <", value, "pumpTime");
            return (Criteria) this;
        }

        public Criteria andPumpTimeLessThanOrEqualTo(Date value) {
            addCriterion("pump_time <=", value, "pumpTime");
            return (Criteria) this;
        }

        public Criteria andPumpTimeIn(List<Date> values) {
            addCriterion("pump_time in", values, "pumpTime");
            return (Criteria) this;
        }

        public Criteria andPumpTimeNotIn(List<Date> values) {
            addCriterion("pump_time not in", values, "pumpTime");
            return (Criteria) this;
        }

        public Criteria andPumpTimeBetween(Date value1, Date value2) {
            addCriterion("pump_time between", value1, value2, "pumpTime");
            return (Criteria) this;
        }

        public Criteria andPumpTimeNotBetween(Date value1, Date value2) {
            addCriterion("pump_time not between", value1, value2, "pumpTime");
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