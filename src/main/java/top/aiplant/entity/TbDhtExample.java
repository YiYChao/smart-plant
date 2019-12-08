package top.aiplant.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbDhtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbDhtExample() {
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

        public Criteria andDhtIdIsNull() {
            addCriterion("dht_id is null");
            return (Criteria) this;
        }

        public Criteria andDhtIdIsNotNull() {
            addCriterion("dht_id is not null");
            return (Criteria) this;
        }

        public Criteria andDhtIdEqualTo(Integer value) {
            addCriterion("dht_id =", value, "dhtId");
            return (Criteria) this;
        }

        public Criteria andDhtIdNotEqualTo(Integer value) {
            addCriterion("dht_id <>", value, "dhtId");
            return (Criteria) this;
        }

        public Criteria andDhtIdGreaterThan(Integer value) {
            addCriterion("dht_id >", value, "dhtId");
            return (Criteria) this;
        }

        public Criteria andDhtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dht_id >=", value, "dhtId");
            return (Criteria) this;
        }

        public Criteria andDhtIdLessThan(Integer value) {
            addCriterion("dht_id <", value, "dhtId");
            return (Criteria) this;
        }

        public Criteria andDhtIdLessThanOrEqualTo(Integer value) {
            addCriterion("dht_id <=", value, "dhtId");
            return (Criteria) this;
        }

        public Criteria andDhtIdIn(List<Integer> values) {
            addCriterion("dht_id in", values, "dhtId");
            return (Criteria) this;
        }

        public Criteria andDhtIdNotIn(List<Integer> values) {
            addCriterion("dht_id not in", values, "dhtId");
            return (Criteria) this;
        }

        public Criteria andDhtIdBetween(Integer value1, Integer value2) {
            addCriterion("dht_id between", value1, value2, "dhtId");
            return (Criteria) this;
        }

        public Criteria andDhtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dht_id not between", value1, value2, "dhtId");
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

        public Criteria andDhtTemperatureIsNull() {
            addCriterion("dht_temperature is null");
            return (Criteria) this;
        }

        public Criteria andDhtTemperatureIsNotNull() {
            addCriterion("dht_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andDhtTemperatureEqualTo(String value) {
            addCriterion("dht_temperature =", value, "dhtTemperature");
            return (Criteria) this;
        }

        public Criteria andDhtTemperatureNotEqualTo(String value) {
            addCriterion("dht_temperature <>", value, "dhtTemperature");
            return (Criteria) this;
        }

        public Criteria andDhtTemperatureGreaterThan(String value) {
            addCriterion("dht_temperature >", value, "dhtTemperature");
            return (Criteria) this;
        }

        public Criteria andDhtTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("dht_temperature >=", value, "dhtTemperature");
            return (Criteria) this;
        }

        public Criteria andDhtTemperatureLessThan(String value) {
            addCriterion("dht_temperature <", value, "dhtTemperature");
            return (Criteria) this;
        }

        public Criteria andDhtTemperatureLessThanOrEqualTo(String value) {
            addCriterion("dht_temperature <=", value, "dhtTemperature");
            return (Criteria) this;
        }

        public Criteria andDhtTemperatureLike(String value) {
            addCriterion("dht_temperature like", value, "dhtTemperature");
            return (Criteria) this;
        }

        public Criteria andDhtTemperatureNotLike(String value) {
            addCriterion("dht_temperature not like", value, "dhtTemperature");
            return (Criteria) this;
        }

        public Criteria andDhtTemperatureIn(List<String> values) {
            addCriterion("dht_temperature in", values, "dhtTemperature");
            return (Criteria) this;
        }

        public Criteria andDhtTemperatureNotIn(List<String> values) {
            addCriterion("dht_temperature not in", values, "dhtTemperature");
            return (Criteria) this;
        }

        public Criteria andDhtTemperatureBetween(String value1, String value2) {
            addCriterion("dht_temperature between", value1, value2, "dhtTemperature");
            return (Criteria) this;
        }

        public Criteria andDhtTemperatureNotBetween(String value1, String value2) {
            addCriterion("dht_temperature not between", value1, value2, "dhtTemperature");
            return (Criteria) this;
        }

        public Criteria andDhtHumidityIsNull() {
            addCriterion("dht_humidity is null");
            return (Criteria) this;
        }

        public Criteria andDhtHumidityIsNotNull() {
            addCriterion("dht_humidity is not null");
            return (Criteria) this;
        }

        public Criteria andDhtHumidityEqualTo(String value) {
            addCriterion("dht_humidity =", value, "dhtHumidity");
            return (Criteria) this;
        }

        public Criteria andDhtHumidityNotEqualTo(String value) {
            addCriterion("dht_humidity <>", value, "dhtHumidity");
            return (Criteria) this;
        }

        public Criteria andDhtHumidityGreaterThan(String value) {
            addCriterion("dht_humidity >", value, "dhtHumidity");
            return (Criteria) this;
        }

        public Criteria andDhtHumidityGreaterThanOrEqualTo(String value) {
            addCriterion("dht_humidity >=", value, "dhtHumidity");
            return (Criteria) this;
        }

        public Criteria andDhtHumidityLessThan(String value) {
            addCriterion("dht_humidity <", value, "dhtHumidity");
            return (Criteria) this;
        }

        public Criteria andDhtHumidityLessThanOrEqualTo(String value) {
            addCriterion("dht_humidity <=", value, "dhtHumidity");
            return (Criteria) this;
        }

        public Criteria andDhtHumidityLike(String value) {
            addCriterion("dht_humidity like", value, "dhtHumidity");
            return (Criteria) this;
        }

        public Criteria andDhtHumidityNotLike(String value) {
            addCriterion("dht_humidity not like", value, "dhtHumidity");
            return (Criteria) this;
        }

        public Criteria andDhtHumidityIn(List<String> values) {
            addCriterion("dht_humidity in", values, "dhtHumidity");
            return (Criteria) this;
        }

        public Criteria andDhtHumidityNotIn(List<String> values) {
            addCriterion("dht_humidity not in", values, "dhtHumidity");
            return (Criteria) this;
        }

        public Criteria andDhtHumidityBetween(String value1, String value2) {
            addCriterion("dht_humidity between", value1, value2, "dhtHumidity");
            return (Criteria) this;
        }

        public Criteria andDhtHumidityNotBetween(String value1, String value2) {
            addCriterion("dht_humidity not between", value1, value2, "dhtHumidity");
            return (Criteria) this;
        }

        public Criteria andDhtHeatIsNull() {
            addCriterion("dht_heat is null");
            return (Criteria) this;
        }

        public Criteria andDhtHeatIsNotNull() {
            addCriterion("dht_heat is not null");
            return (Criteria) this;
        }

        public Criteria andDhtHeatEqualTo(String value) {
            addCriterion("dht_heat =", value, "dhtHeat");
            return (Criteria) this;
        }

        public Criteria andDhtHeatNotEqualTo(String value) {
            addCriterion("dht_heat <>", value, "dhtHeat");
            return (Criteria) this;
        }

        public Criteria andDhtHeatGreaterThan(String value) {
            addCriterion("dht_heat >", value, "dhtHeat");
            return (Criteria) this;
        }

        public Criteria andDhtHeatGreaterThanOrEqualTo(String value) {
            addCriterion("dht_heat >=", value, "dhtHeat");
            return (Criteria) this;
        }

        public Criteria andDhtHeatLessThan(String value) {
            addCriterion("dht_heat <", value, "dhtHeat");
            return (Criteria) this;
        }

        public Criteria andDhtHeatLessThanOrEqualTo(String value) {
            addCriterion("dht_heat <=", value, "dhtHeat");
            return (Criteria) this;
        }

        public Criteria andDhtHeatLike(String value) {
            addCriterion("dht_heat like", value, "dhtHeat");
            return (Criteria) this;
        }

        public Criteria andDhtHeatNotLike(String value) {
            addCriterion("dht_heat not like", value, "dhtHeat");
            return (Criteria) this;
        }

        public Criteria andDhtHeatIn(List<String> values) {
            addCriterion("dht_heat in", values, "dhtHeat");
            return (Criteria) this;
        }

        public Criteria andDhtHeatNotIn(List<String> values) {
            addCriterion("dht_heat not in", values, "dhtHeat");
            return (Criteria) this;
        }

        public Criteria andDhtHeatBetween(String value1, String value2) {
            addCriterion("dht_heat between", value1, value2, "dhtHeat");
            return (Criteria) this;
        }

        public Criteria andDhtHeatNotBetween(String value1, String value2) {
            addCriterion("dht_heat not between", value1, value2, "dhtHeat");
            return (Criteria) this;
        }

        public Criteria andDhtTimeIsNull() {
            addCriterion("dht_time is null");
            return (Criteria) this;
        }

        public Criteria andDhtTimeIsNotNull() {
            addCriterion("dht_time is not null");
            return (Criteria) this;
        }

        public Criteria andDhtTimeEqualTo(Date value) {
            addCriterion("dht_time =", value, "dhtTime");
            return (Criteria) this;
        }

        public Criteria andDhtTimeNotEqualTo(Date value) {
            addCriterion("dht_time <>", value, "dhtTime");
            return (Criteria) this;
        }

        public Criteria andDhtTimeGreaterThan(Date value) {
            addCriterion("dht_time >", value, "dhtTime");
            return (Criteria) this;
        }

        public Criteria andDhtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dht_time >=", value, "dhtTime");
            return (Criteria) this;
        }

        public Criteria andDhtTimeLessThan(Date value) {
            addCriterion("dht_time <", value, "dhtTime");
            return (Criteria) this;
        }

        public Criteria andDhtTimeLessThanOrEqualTo(Date value) {
            addCriterion("dht_time <=", value, "dhtTime");
            return (Criteria) this;
        }

        public Criteria andDhtTimeIn(List<Date> values) {
            addCriterion("dht_time in", values, "dhtTime");
            return (Criteria) this;
        }

        public Criteria andDhtTimeNotIn(List<Date> values) {
            addCriterion("dht_time not in", values, "dhtTime");
            return (Criteria) this;
        }

        public Criteria andDhtTimeBetween(Date value1, Date value2) {
            addCriterion("dht_time between", value1, value2, "dhtTime");
            return (Criteria) this;
        }

        public Criteria andDhtTimeNotBetween(Date value1, Date value2) {
            addCriterion("dht_time not between", value1, value2, "dhtTime");
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