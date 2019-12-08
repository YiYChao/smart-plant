package top.aiplant.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbLightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbLightExample() {
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

        public Criteria andLightIdIsNull() {
            addCriterion("light_id is null");
            return (Criteria) this;
        }

        public Criteria andLightIdIsNotNull() {
            addCriterion("light_id is not null");
            return (Criteria) this;
        }

        public Criteria andLightIdEqualTo(Integer value) {
            addCriterion("light_id =", value, "lightId");
            return (Criteria) this;
        }

        public Criteria andLightIdNotEqualTo(Integer value) {
            addCriterion("light_id <>", value, "lightId");
            return (Criteria) this;
        }

        public Criteria andLightIdGreaterThan(Integer value) {
            addCriterion("light_id >", value, "lightId");
            return (Criteria) this;
        }

        public Criteria andLightIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("light_id >=", value, "lightId");
            return (Criteria) this;
        }

        public Criteria andLightIdLessThan(Integer value) {
            addCriterion("light_id <", value, "lightId");
            return (Criteria) this;
        }

        public Criteria andLightIdLessThanOrEqualTo(Integer value) {
            addCriterion("light_id <=", value, "lightId");
            return (Criteria) this;
        }

        public Criteria andLightIdIn(List<Integer> values) {
            addCriterion("light_id in", values, "lightId");
            return (Criteria) this;
        }

        public Criteria andLightIdNotIn(List<Integer> values) {
            addCriterion("light_id not in", values, "lightId");
            return (Criteria) this;
        }

        public Criteria andLightIdBetween(Integer value1, Integer value2) {
            addCriterion("light_id between", value1, value2, "lightId");
            return (Criteria) this;
        }

        public Criteria andLightIdNotBetween(Integer value1, Integer value2) {
            addCriterion("light_id not between", value1, value2, "lightId");
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

        public Criteria andLightIntensityIsNull() {
            addCriterion("light_intensity is null");
            return (Criteria) this;
        }

        public Criteria andLightIntensityIsNotNull() {
            addCriterion("light_intensity is not null");
            return (Criteria) this;
        }

        public Criteria andLightIntensityEqualTo(Integer value) {
            addCriterion("light_intensity =", value, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityNotEqualTo(Integer value) {
            addCriterion("light_intensity <>", value, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityGreaterThan(Integer value) {
            addCriterion("light_intensity >", value, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityGreaterThanOrEqualTo(Integer value) {
            addCriterion("light_intensity >=", value, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityLessThan(Integer value) {
            addCriterion("light_intensity <", value, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityLessThanOrEqualTo(Integer value) {
            addCriterion("light_intensity <=", value, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityIn(List<Integer> values) {
            addCriterion("light_intensity in", values, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityNotIn(List<Integer> values) {
            addCriterion("light_intensity not in", values, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityBetween(Integer value1, Integer value2) {
            addCriterion("light_intensity between", value1, value2, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityNotBetween(Integer value1, Integer value2) {
            addCriterion("light_intensity not between", value1, value2, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightTimeIsNull() {
            addCriterion("light_time is null");
            return (Criteria) this;
        }

        public Criteria andLightTimeIsNotNull() {
            addCriterion("light_time is not null");
            return (Criteria) this;
        }

        public Criteria andLightTimeEqualTo(Date value) {
            addCriterion("light_time =", value, "lightTime");
            return (Criteria) this;
        }

        public Criteria andLightTimeNotEqualTo(Date value) {
            addCriterion("light_time <>", value, "lightTime");
            return (Criteria) this;
        }

        public Criteria andLightTimeGreaterThan(Date value) {
            addCriterion("light_time >", value, "lightTime");
            return (Criteria) this;
        }

        public Criteria andLightTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("light_time >=", value, "lightTime");
            return (Criteria) this;
        }

        public Criteria andLightTimeLessThan(Date value) {
            addCriterion("light_time <", value, "lightTime");
            return (Criteria) this;
        }

        public Criteria andLightTimeLessThanOrEqualTo(Date value) {
            addCriterion("light_time <=", value, "lightTime");
            return (Criteria) this;
        }

        public Criteria andLightTimeIn(List<Date> values) {
            addCriterion("light_time in", values, "lightTime");
            return (Criteria) this;
        }

        public Criteria andLightTimeNotIn(List<Date> values) {
            addCriterion("light_time not in", values, "lightTime");
            return (Criteria) this;
        }

        public Criteria andLightTimeBetween(Date value1, Date value2) {
            addCriterion("light_time between", value1, value2, "lightTime");
            return (Criteria) this;
        }

        public Criteria andLightTimeNotBetween(Date value1, Date value2) {
            addCriterion("light_time not between", value1, value2, "lightTime");
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