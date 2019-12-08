package top.aiplant.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbLedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbLedExample() {
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

        public Criteria andLedIdIsNull() {
            addCriterion("led_id is null");
            return (Criteria) this;
        }

        public Criteria andLedIdIsNotNull() {
            addCriterion("led_id is not null");
            return (Criteria) this;
        }

        public Criteria andLedIdEqualTo(Integer value) {
            addCriterion("led_id =", value, "ledId");
            return (Criteria) this;
        }

        public Criteria andLedIdNotEqualTo(Integer value) {
            addCriterion("led_id <>", value, "ledId");
            return (Criteria) this;
        }

        public Criteria andLedIdGreaterThan(Integer value) {
            addCriterion("led_id >", value, "ledId");
            return (Criteria) this;
        }

        public Criteria andLedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("led_id >=", value, "ledId");
            return (Criteria) this;
        }

        public Criteria andLedIdLessThan(Integer value) {
            addCriterion("led_id <", value, "ledId");
            return (Criteria) this;
        }

        public Criteria andLedIdLessThanOrEqualTo(Integer value) {
            addCriterion("led_id <=", value, "ledId");
            return (Criteria) this;
        }

        public Criteria andLedIdIn(List<Integer> values) {
            addCriterion("led_id in", values, "ledId");
            return (Criteria) this;
        }

        public Criteria andLedIdNotIn(List<Integer> values) {
            addCriterion("led_id not in", values, "ledId");
            return (Criteria) this;
        }

        public Criteria andLedIdBetween(Integer value1, Integer value2) {
            addCriterion("led_id between", value1, value2, "ledId");
            return (Criteria) this;
        }

        public Criteria andLedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("led_id not between", value1, value2, "ledId");
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

        public Criteria andLedStatusIsNull() {
            addCriterion("led_status is null");
            return (Criteria) this;
        }

        public Criteria andLedStatusIsNotNull() {
            addCriterion("led_status is not null");
            return (Criteria) this;
        }

        public Criteria andLedStatusEqualTo(Byte value) {
            addCriterion("led_status =", value, "ledStatus");
            return (Criteria) this;
        }

        public Criteria andLedStatusNotEqualTo(Byte value) {
            addCriterion("led_status <>", value, "ledStatus");
            return (Criteria) this;
        }

        public Criteria andLedStatusGreaterThan(Byte value) {
            addCriterion("led_status >", value, "ledStatus");
            return (Criteria) this;
        }

        public Criteria andLedStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("led_status >=", value, "ledStatus");
            return (Criteria) this;
        }

        public Criteria andLedStatusLessThan(Byte value) {
            addCriterion("led_status <", value, "ledStatus");
            return (Criteria) this;
        }

        public Criteria andLedStatusLessThanOrEqualTo(Byte value) {
            addCriterion("led_status <=", value, "ledStatus");
            return (Criteria) this;
        }

        public Criteria andLedStatusIn(List<Byte> values) {
            addCriterion("led_status in", values, "ledStatus");
            return (Criteria) this;
        }

        public Criteria andLedStatusNotIn(List<Byte> values) {
            addCriterion("led_status not in", values, "ledStatus");
            return (Criteria) this;
        }

        public Criteria andLedStatusBetween(Byte value1, Byte value2) {
            addCriterion("led_status between", value1, value2, "ledStatus");
            return (Criteria) this;
        }

        public Criteria andLedStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("led_status not between", value1, value2, "ledStatus");
            return (Criteria) this;
        }

        public Criteria andLedTimeIsNull() {
            addCriterion("led_time is null");
            return (Criteria) this;
        }

        public Criteria andLedTimeIsNotNull() {
            addCriterion("led_time is not null");
            return (Criteria) this;
        }

        public Criteria andLedTimeEqualTo(Date value) {
            addCriterion("led_time =", value, "ledTime");
            return (Criteria) this;
        }

        public Criteria andLedTimeNotEqualTo(Date value) {
            addCriterion("led_time <>", value, "ledTime");
            return (Criteria) this;
        }

        public Criteria andLedTimeGreaterThan(Date value) {
            addCriterion("led_time >", value, "ledTime");
            return (Criteria) this;
        }

        public Criteria andLedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("led_time >=", value, "ledTime");
            return (Criteria) this;
        }

        public Criteria andLedTimeLessThan(Date value) {
            addCriterion("led_time <", value, "ledTime");
            return (Criteria) this;
        }

        public Criteria andLedTimeLessThanOrEqualTo(Date value) {
            addCriterion("led_time <=", value, "ledTime");
            return (Criteria) this;
        }

        public Criteria andLedTimeIn(List<Date> values) {
            addCriterion("led_time in", values, "ledTime");
            return (Criteria) this;
        }

        public Criteria andLedTimeNotIn(List<Date> values) {
            addCriterion("led_time not in", values, "ledTime");
            return (Criteria) this;
        }

        public Criteria andLedTimeBetween(Date value1, Date value2) {
            addCriterion("led_time between", value1, value2, "ledTime");
            return (Criteria) this;
        }

        public Criteria andLedTimeNotBetween(Date value1, Date value2) {
            addCriterion("led_time not between", value1, value2, "ledTime");
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