package top.aiplant.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbWaterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbWaterExample() {
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

        public Criteria andWaterIdIsNull() {
            addCriterion("water_id is null");
            return (Criteria) this;
        }

        public Criteria andWaterIdIsNotNull() {
            addCriterion("water_id is not null");
            return (Criteria) this;
        }

        public Criteria andWaterIdEqualTo(Integer value) {
            addCriterion("water_id =", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdNotEqualTo(Integer value) {
            addCriterion("water_id <>", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdGreaterThan(Integer value) {
            addCriterion("water_id >", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("water_id >=", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdLessThan(Integer value) {
            addCriterion("water_id <", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdLessThanOrEqualTo(Integer value) {
            addCriterion("water_id <=", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdIn(List<Integer> values) {
            addCriterion("water_id in", values, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdNotIn(List<Integer> values) {
            addCriterion("water_id not in", values, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdBetween(Integer value1, Integer value2) {
            addCriterion("water_id between", value1, value2, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("water_id not between", value1, value2, "waterId");
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

        public Criteria andWaterDepthIsNull() {
            addCriterion("water_depth is null");
            return (Criteria) this;
        }

        public Criteria andWaterDepthIsNotNull() {
            addCriterion("water_depth is not null");
            return (Criteria) this;
        }

        public Criteria andWaterDepthEqualTo(Integer value) {
            addCriterion("water_depth =", value, "waterDepth");
            return (Criteria) this;
        }

        public Criteria andWaterDepthNotEqualTo(Integer value) {
            addCriterion("water_depth <>", value, "waterDepth");
            return (Criteria) this;
        }

        public Criteria andWaterDepthGreaterThan(Integer value) {
            addCriterion("water_depth >", value, "waterDepth");
            return (Criteria) this;
        }

        public Criteria andWaterDepthGreaterThanOrEqualTo(Integer value) {
            addCriterion("water_depth >=", value, "waterDepth");
            return (Criteria) this;
        }

        public Criteria andWaterDepthLessThan(Integer value) {
            addCriterion("water_depth <", value, "waterDepth");
            return (Criteria) this;
        }

        public Criteria andWaterDepthLessThanOrEqualTo(Integer value) {
            addCriterion("water_depth <=", value, "waterDepth");
            return (Criteria) this;
        }

        public Criteria andWaterDepthIn(List<Integer> values) {
            addCriterion("water_depth in", values, "waterDepth");
            return (Criteria) this;
        }

        public Criteria andWaterDepthNotIn(List<Integer> values) {
            addCriterion("water_depth not in", values, "waterDepth");
            return (Criteria) this;
        }

        public Criteria andWaterDepthBetween(Integer value1, Integer value2) {
            addCriterion("water_depth between", value1, value2, "waterDepth");
            return (Criteria) this;
        }

        public Criteria andWaterDepthNotBetween(Integer value1, Integer value2) {
            addCriterion("water_depth not between", value1, value2, "waterDepth");
            return (Criteria) this;
        }

        public Criteria andWaterTimeIsNull() {
            addCriterion("water_time is null");
            return (Criteria) this;
        }

        public Criteria andWaterTimeIsNotNull() {
            addCriterion("water_time is not null");
            return (Criteria) this;
        }

        public Criteria andWaterTimeEqualTo(Date value) {
            addCriterion("water_time =", value, "waterTime");
            return (Criteria) this;
        }

        public Criteria andWaterTimeNotEqualTo(Date value) {
            addCriterion("water_time <>", value, "waterTime");
            return (Criteria) this;
        }

        public Criteria andWaterTimeGreaterThan(Date value) {
            addCriterion("water_time >", value, "waterTime");
            return (Criteria) this;
        }

        public Criteria andWaterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("water_time >=", value, "waterTime");
            return (Criteria) this;
        }

        public Criteria andWaterTimeLessThan(Date value) {
            addCriterion("water_time <", value, "waterTime");
            return (Criteria) this;
        }

        public Criteria andWaterTimeLessThanOrEqualTo(Date value) {
            addCriterion("water_time <=", value, "waterTime");
            return (Criteria) this;
        }

        public Criteria andWaterTimeIn(List<Date> values) {
            addCriterion("water_time in", values, "waterTime");
            return (Criteria) this;
        }

        public Criteria andWaterTimeNotIn(List<Date> values) {
            addCriterion("water_time not in", values, "waterTime");
            return (Criteria) this;
        }

        public Criteria andWaterTimeBetween(Date value1, Date value2) {
            addCriterion("water_time between", value1, value2, "waterTime");
            return (Criteria) this;
        }

        public Criteria andWaterTimeNotBetween(Date value1, Date value2) {
            addCriterion("water_time not between", value1, value2, "waterTime");
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