package top.aiplant.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSensorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSensorExample() {
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

        public Criteria andPlantIdIsNull() {
            addCriterion("plant_id is null");
            return (Criteria) this;
        }

        public Criteria andPlantIdIsNotNull() {
            addCriterion("plant_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlantIdEqualTo(Integer value) {
            addCriterion("plant_id =", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotEqualTo(Integer value) {
            addCriterion("plant_id <>", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdGreaterThan(Integer value) {
            addCriterion("plant_id >", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plant_id >=", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdLessThan(Integer value) {
            addCriterion("plant_id <", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdLessThanOrEqualTo(Integer value) {
            addCriterion("plant_id <=", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdIn(List<Integer> values) {
            addCriterion("plant_id in", values, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotIn(List<Integer> values) {
            addCriterion("plant_id not in", values, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdBetween(Integer value1, Integer value2) {
            addCriterion("plant_id between", value1, value2, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plant_id not between", value1, value2, "plantId");
            return (Criteria) this;
        }

        public Criteria andSensorNameIsNull() {
            addCriterion("sensor_name is null");
            return (Criteria) this;
        }

        public Criteria andSensorNameIsNotNull() {
            addCriterion("sensor_name is not null");
            return (Criteria) this;
        }

        public Criteria andSensorNameEqualTo(String value) {
            addCriterion("sensor_name =", value, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameNotEqualTo(String value) {
            addCriterion("sensor_name <>", value, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameGreaterThan(String value) {
            addCriterion("sensor_name >", value, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameGreaterThanOrEqualTo(String value) {
            addCriterion("sensor_name >=", value, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameLessThan(String value) {
            addCriterion("sensor_name <", value, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameLessThanOrEqualTo(String value) {
            addCriterion("sensor_name <=", value, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameLike(String value) {
            addCriterion("sensor_name like", value, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameNotLike(String value) {
            addCriterion("sensor_name not like", value, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameIn(List<String> values) {
            addCriterion("sensor_name in", values, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameNotIn(List<String> values) {
            addCriterion("sensor_name not in", values, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameBetween(String value1, String value2) {
            addCriterion("sensor_name between", value1, value2, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameNotBetween(String value1, String value2) {
            addCriterion("sensor_name not between", value1, value2, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorDesIsNull() {
            addCriterion("sensor__des is null");
            return (Criteria) this;
        }

        public Criteria andSensorDesIsNotNull() {
            addCriterion("sensor__des is not null");
            return (Criteria) this;
        }

        public Criteria andSensorDesEqualTo(String value) {
            addCriterion("sensor__des =", value, "sensorDes");
            return (Criteria) this;
        }

        public Criteria andSensorDesNotEqualTo(String value) {
            addCriterion("sensor__des <>", value, "sensorDes");
            return (Criteria) this;
        }

        public Criteria andSensorDesGreaterThan(String value) {
            addCriterion("sensor__des >", value, "sensorDes");
            return (Criteria) this;
        }

        public Criteria andSensorDesGreaterThanOrEqualTo(String value) {
            addCriterion("sensor__des >=", value, "sensorDes");
            return (Criteria) this;
        }

        public Criteria andSensorDesLessThan(String value) {
            addCriterion("sensor__des <", value, "sensorDes");
            return (Criteria) this;
        }

        public Criteria andSensorDesLessThanOrEqualTo(String value) {
            addCriterion("sensor__des <=", value, "sensorDes");
            return (Criteria) this;
        }

        public Criteria andSensorDesLike(String value) {
            addCriterion("sensor__des like", value, "sensorDes");
            return (Criteria) this;
        }

        public Criteria andSensorDesNotLike(String value) {
            addCriterion("sensor__des not like", value, "sensorDes");
            return (Criteria) this;
        }

        public Criteria andSensorDesIn(List<String> values) {
            addCriterion("sensor__des in", values, "sensorDes");
            return (Criteria) this;
        }

        public Criteria andSensorDesNotIn(List<String> values) {
            addCriterion("sensor__des not in", values, "sensorDes");
            return (Criteria) this;
        }

        public Criteria andSensorDesBetween(String value1, String value2) {
            addCriterion("sensor__des between", value1, value2, "sensorDes");
            return (Criteria) this;
        }

        public Criteria andSensorDesNotBetween(String value1, String value2) {
            addCriterion("sensor__des not between", value1, value2, "sensorDes");
            return (Criteria) this;
        }

        public Criteria andSensorTimeIsNull() {
            addCriterion("sensor_time is null");
            return (Criteria) this;
        }

        public Criteria andSensorTimeIsNotNull() {
            addCriterion("sensor_time is not null");
            return (Criteria) this;
        }

        public Criteria andSensorTimeEqualTo(Date value) {
            addCriterion("sensor_time =", value, "sensorTime");
            return (Criteria) this;
        }

        public Criteria andSensorTimeNotEqualTo(Date value) {
            addCriterion("sensor_time <>", value, "sensorTime");
            return (Criteria) this;
        }

        public Criteria andSensorTimeGreaterThan(Date value) {
            addCriterion("sensor_time >", value, "sensorTime");
            return (Criteria) this;
        }

        public Criteria andSensorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sensor_time >=", value, "sensorTime");
            return (Criteria) this;
        }

        public Criteria andSensorTimeLessThan(Date value) {
            addCriterion("sensor_time <", value, "sensorTime");
            return (Criteria) this;
        }

        public Criteria andSensorTimeLessThanOrEqualTo(Date value) {
            addCriterion("sensor_time <=", value, "sensorTime");
            return (Criteria) this;
        }

        public Criteria andSensorTimeIn(List<Date> values) {
            addCriterion("sensor_time in", values, "sensorTime");
            return (Criteria) this;
        }

        public Criteria andSensorTimeNotIn(List<Date> values) {
            addCriterion("sensor_time not in", values, "sensorTime");
            return (Criteria) this;
        }

        public Criteria andSensorTimeBetween(Date value1, Date value2) {
            addCriterion("sensor_time between", value1, value2, "sensorTime");
            return (Criteria) this;
        }

        public Criteria andSensorTimeNotBetween(Date value1, Date value2) {
            addCriterion("sensor_time not between", value1, value2, "sensorTime");
            return (Criteria) this;
        }

        public Criteria andSensorStatusIsNull() {
            addCriterion("sensor_status is null");
            return (Criteria) this;
        }

        public Criteria andSensorStatusIsNotNull() {
            addCriterion("sensor_status is not null");
            return (Criteria) this;
        }

        public Criteria andSensorStatusEqualTo(Byte value) {
            addCriterion("sensor_status =", value, "sensorStatus");
            return (Criteria) this;
        }

        public Criteria andSensorStatusNotEqualTo(Byte value) {
            addCriterion("sensor_status <>", value, "sensorStatus");
            return (Criteria) this;
        }

        public Criteria andSensorStatusGreaterThan(Byte value) {
            addCriterion("sensor_status >", value, "sensorStatus");
            return (Criteria) this;
        }

        public Criteria andSensorStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sensor_status >=", value, "sensorStatus");
            return (Criteria) this;
        }

        public Criteria andSensorStatusLessThan(Byte value) {
            addCriterion("sensor_status <", value, "sensorStatus");
            return (Criteria) this;
        }

        public Criteria andSensorStatusLessThanOrEqualTo(Byte value) {
            addCriterion("sensor_status <=", value, "sensorStatus");
            return (Criteria) this;
        }

        public Criteria andSensorStatusIn(List<Byte> values) {
            addCriterion("sensor_status in", values, "sensorStatus");
            return (Criteria) this;
        }

        public Criteria andSensorStatusNotIn(List<Byte> values) {
            addCriterion("sensor_status not in", values, "sensorStatus");
            return (Criteria) this;
        }

        public Criteria andSensorStatusBetween(Byte value1, Byte value2) {
            addCriterion("sensor_status between", value1, value2, "sensorStatus");
            return (Criteria) this;
        }

        public Criteria andSensorStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("sensor_status not between", value1, value2, "sensorStatus");
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