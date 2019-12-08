package top.aiplant.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSoilExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSoilExample() {
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

        public Criteria andSoilIdIsNull() {
            addCriterion("soil_id is null");
            return (Criteria) this;
        }

        public Criteria andSoilIdIsNotNull() {
            addCriterion("soil_id is not null");
            return (Criteria) this;
        }

        public Criteria andSoilIdEqualTo(Integer value) {
            addCriterion("soil_id =", value, "soilId");
            return (Criteria) this;
        }

        public Criteria andSoilIdNotEqualTo(Integer value) {
            addCriterion("soil_id <>", value, "soilId");
            return (Criteria) this;
        }

        public Criteria andSoilIdGreaterThan(Integer value) {
            addCriterion("soil_id >", value, "soilId");
            return (Criteria) this;
        }

        public Criteria andSoilIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("soil_id >=", value, "soilId");
            return (Criteria) this;
        }

        public Criteria andSoilIdLessThan(Integer value) {
            addCriterion("soil_id <", value, "soilId");
            return (Criteria) this;
        }

        public Criteria andSoilIdLessThanOrEqualTo(Integer value) {
            addCriterion("soil_id <=", value, "soilId");
            return (Criteria) this;
        }

        public Criteria andSoilIdIn(List<Integer> values) {
            addCriterion("soil_id in", values, "soilId");
            return (Criteria) this;
        }

        public Criteria andSoilIdNotIn(List<Integer> values) {
            addCriterion("soil_id not in", values, "soilId");
            return (Criteria) this;
        }

        public Criteria andSoilIdBetween(Integer value1, Integer value2) {
            addCriterion("soil_id between", value1, value2, "soilId");
            return (Criteria) this;
        }

        public Criteria andSoilIdNotBetween(Integer value1, Integer value2) {
            addCriterion("soil_id not between", value1, value2, "soilId");
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

        public Criteria andSoilHumidityIsNull() {
            addCriterion("soil_humidity is null");
            return (Criteria) this;
        }

        public Criteria andSoilHumidityIsNotNull() {
            addCriterion("soil_humidity is not null");
            return (Criteria) this;
        }

        public Criteria andSoilHumidityEqualTo(Integer value) {
            addCriterion("soil_humidity =", value, "soilHumidity");
            return (Criteria) this;
        }

        public Criteria andSoilHumidityNotEqualTo(Integer value) {
            addCriterion("soil_humidity <>", value, "soilHumidity");
            return (Criteria) this;
        }

        public Criteria andSoilHumidityGreaterThan(Integer value) {
            addCriterion("soil_humidity >", value, "soilHumidity");
            return (Criteria) this;
        }

        public Criteria andSoilHumidityGreaterThanOrEqualTo(Integer value) {
            addCriterion("soil_humidity >=", value, "soilHumidity");
            return (Criteria) this;
        }

        public Criteria andSoilHumidityLessThan(Integer value) {
            addCriterion("soil_humidity <", value, "soilHumidity");
            return (Criteria) this;
        }

        public Criteria andSoilHumidityLessThanOrEqualTo(Integer value) {
            addCriterion("soil_humidity <=", value, "soilHumidity");
            return (Criteria) this;
        }

        public Criteria andSoilHumidityIn(List<Integer> values) {
            addCriterion("soil_humidity in", values, "soilHumidity");
            return (Criteria) this;
        }

        public Criteria andSoilHumidityNotIn(List<Integer> values) {
            addCriterion("soil_humidity not in", values, "soilHumidity");
            return (Criteria) this;
        }

        public Criteria andSoilHumidityBetween(Integer value1, Integer value2) {
            addCriterion("soil_humidity between", value1, value2, "soilHumidity");
            return (Criteria) this;
        }

        public Criteria andSoilHumidityNotBetween(Integer value1, Integer value2) {
            addCriterion("soil_humidity not between", value1, value2, "soilHumidity");
            return (Criteria) this;
        }

        public Criteria andSoilTimeIsNull() {
            addCriterion("soil_time is null");
            return (Criteria) this;
        }

        public Criteria andSoilTimeIsNotNull() {
            addCriterion("soil_time is not null");
            return (Criteria) this;
        }

        public Criteria andSoilTimeEqualTo(Date value) {
            addCriterion("soil_time =", value, "soilTime");
            return (Criteria) this;
        }

        public Criteria andSoilTimeNotEqualTo(Date value) {
            addCriterion("soil_time <>", value, "soilTime");
            return (Criteria) this;
        }

        public Criteria andSoilTimeGreaterThan(Date value) {
            addCriterion("soil_time >", value, "soilTime");
            return (Criteria) this;
        }

        public Criteria andSoilTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("soil_time >=", value, "soilTime");
            return (Criteria) this;
        }

        public Criteria andSoilTimeLessThan(Date value) {
            addCriterion("soil_time <", value, "soilTime");
            return (Criteria) this;
        }

        public Criteria andSoilTimeLessThanOrEqualTo(Date value) {
            addCriterion("soil_time <=", value, "soilTime");
            return (Criteria) this;
        }

        public Criteria andSoilTimeIn(List<Date> values) {
            addCriterion("soil_time in", values, "soilTime");
            return (Criteria) this;
        }

        public Criteria andSoilTimeNotIn(List<Date> values) {
            addCriterion("soil_time not in", values, "soilTime");
            return (Criteria) this;
        }

        public Criteria andSoilTimeBetween(Date value1, Date value2) {
            addCriterion("soil_time between", value1, value2, "soilTime");
            return (Criteria) this;
        }

        public Criteria andSoilTimeNotBetween(Date value1, Date value2) {
            addCriterion("soil_time not between", value1, value2, "soilTime");
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