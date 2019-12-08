package top.aiplant.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbZoneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbZoneExample() {
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

        public Criteria andZoneIdIsNull() {
            addCriterion("zone_id is null");
            return (Criteria) this;
        }

        public Criteria andZoneIdIsNotNull() {
            addCriterion("zone_id is not null");
            return (Criteria) this;
        }

        public Criteria andZoneIdEqualTo(Integer value) {
            addCriterion("zone_id =", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotEqualTo(Integer value) {
            addCriterion("zone_id <>", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdGreaterThan(Integer value) {
            addCriterion("zone_id >", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zone_id >=", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdLessThan(Integer value) {
            addCriterion("zone_id <", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdLessThanOrEqualTo(Integer value) {
            addCriterion("zone_id <=", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdIn(List<Integer> values) {
            addCriterion("zone_id in", values, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotIn(List<Integer> values) {
            addCriterion("zone_id not in", values, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdBetween(Integer value1, Integer value2) {
            addCriterion("zone_id between", value1, value2, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zone_id not between", value1, value2, "zoneId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andZoneNameIsNull() {
            addCriterion("zone_name is null");
            return (Criteria) this;
        }

        public Criteria andZoneNameIsNotNull() {
            addCriterion("zone_name is not null");
            return (Criteria) this;
        }

        public Criteria andZoneNameEqualTo(String value) {
            addCriterion("zone_name =", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotEqualTo(String value) {
            addCriterion("zone_name <>", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameGreaterThan(String value) {
            addCriterion("zone_name >", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameGreaterThanOrEqualTo(String value) {
            addCriterion("zone_name >=", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameLessThan(String value) {
            addCriterion("zone_name <", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameLessThanOrEqualTo(String value) {
            addCriterion("zone_name <=", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameLike(String value) {
            addCriterion("zone_name like", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotLike(String value) {
            addCriterion("zone_name not like", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameIn(List<String> values) {
            addCriterion("zone_name in", values, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotIn(List<String> values) {
            addCriterion("zone_name not in", values, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameBetween(String value1, String value2) {
            addCriterion("zone_name between", value1, value2, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotBetween(String value1, String value2) {
            addCriterion("zone_name not between", value1, value2, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneDescIsNull() {
            addCriterion("zone_desc is null");
            return (Criteria) this;
        }

        public Criteria andZoneDescIsNotNull() {
            addCriterion("zone_desc is not null");
            return (Criteria) this;
        }

        public Criteria andZoneDescEqualTo(String value) {
            addCriterion("zone_desc =", value, "zoneDesc");
            return (Criteria) this;
        }

        public Criteria andZoneDescNotEqualTo(String value) {
            addCriterion("zone_desc <>", value, "zoneDesc");
            return (Criteria) this;
        }

        public Criteria andZoneDescGreaterThan(String value) {
            addCriterion("zone_desc >", value, "zoneDesc");
            return (Criteria) this;
        }

        public Criteria andZoneDescGreaterThanOrEqualTo(String value) {
            addCriterion("zone_desc >=", value, "zoneDesc");
            return (Criteria) this;
        }

        public Criteria andZoneDescLessThan(String value) {
            addCriterion("zone_desc <", value, "zoneDesc");
            return (Criteria) this;
        }

        public Criteria andZoneDescLessThanOrEqualTo(String value) {
            addCriterion("zone_desc <=", value, "zoneDesc");
            return (Criteria) this;
        }

        public Criteria andZoneDescLike(String value) {
            addCriterion("zone_desc like", value, "zoneDesc");
            return (Criteria) this;
        }

        public Criteria andZoneDescNotLike(String value) {
            addCriterion("zone_desc not like", value, "zoneDesc");
            return (Criteria) this;
        }

        public Criteria andZoneDescIn(List<String> values) {
            addCriterion("zone_desc in", values, "zoneDesc");
            return (Criteria) this;
        }

        public Criteria andZoneDescNotIn(List<String> values) {
            addCriterion("zone_desc not in", values, "zoneDesc");
            return (Criteria) this;
        }

        public Criteria andZoneDescBetween(String value1, String value2) {
            addCriterion("zone_desc between", value1, value2, "zoneDesc");
            return (Criteria) this;
        }

        public Criteria andZoneDescNotBetween(String value1, String value2) {
            addCriterion("zone_desc not between", value1, value2, "zoneDesc");
            return (Criteria) this;
        }

        public Criteria andZoneAddressIsNull() {
            addCriterion("zone_address is null");
            return (Criteria) this;
        }

        public Criteria andZoneAddressIsNotNull() {
            addCriterion("zone_address is not null");
            return (Criteria) this;
        }

        public Criteria andZoneAddressEqualTo(String value) {
            addCriterion("zone_address =", value, "zoneAddress");
            return (Criteria) this;
        }

        public Criteria andZoneAddressNotEqualTo(String value) {
            addCriterion("zone_address <>", value, "zoneAddress");
            return (Criteria) this;
        }

        public Criteria andZoneAddressGreaterThan(String value) {
            addCriterion("zone_address >", value, "zoneAddress");
            return (Criteria) this;
        }

        public Criteria andZoneAddressGreaterThanOrEqualTo(String value) {
            addCriterion("zone_address >=", value, "zoneAddress");
            return (Criteria) this;
        }

        public Criteria andZoneAddressLessThan(String value) {
            addCriterion("zone_address <", value, "zoneAddress");
            return (Criteria) this;
        }

        public Criteria andZoneAddressLessThanOrEqualTo(String value) {
            addCriterion("zone_address <=", value, "zoneAddress");
            return (Criteria) this;
        }

        public Criteria andZoneAddressLike(String value) {
            addCriterion("zone_address like", value, "zoneAddress");
            return (Criteria) this;
        }

        public Criteria andZoneAddressNotLike(String value) {
            addCriterion("zone_address not like", value, "zoneAddress");
            return (Criteria) this;
        }

        public Criteria andZoneAddressIn(List<String> values) {
            addCriterion("zone_address in", values, "zoneAddress");
            return (Criteria) this;
        }

        public Criteria andZoneAddressNotIn(List<String> values) {
            addCriterion("zone_address not in", values, "zoneAddress");
            return (Criteria) this;
        }

        public Criteria andZoneAddressBetween(String value1, String value2) {
            addCriterion("zone_address between", value1, value2, "zoneAddress");
            return (Criteria) this;
        }

        public Criteria andZoneAddressNotBetween(String value1, String value2) {
            addCriterion("zone_address not between", value1, value2, "zoneAddress");
            return (Criteria) this;
        }

        public Criteria andZoneTimeIsNull() {
            addCriterion("zone_time is null");
            return (Criteria) this;
        }

        public Criteria andZoneTimeIsNotNull() {
            addCriterion("zone_time is not null");
            return (Criteria) this;
        }

        public Criteria andZoneTimeEqualTo(Date value) {
            addCriterion("zone_time =", value, "zoneTime");
            return (Criteria) this;
        }

        public Criteria andZoneTimeNotEqualTo(Date value) {
            addCriterion("zone_time <>", value, "zoneTime");
            return (Criteria) this;
        }

        public Criteria andZoneTimeGreaterThan(Date value) {
            addCriterion("zone_time >", value, "zoneTime");
            return (Criteria) this;
        }

        public Criteria andZoneTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zone_time >=", value, "zoneTime");
            return (Criteria) this;
        }

        public Criteria andZoneTimeLessThan(Date value) {
            addCriterion("zone_time <", value, "zoneTime");
            return (Criteria) this;
        }

        public Criteria andZoneTimeLessThanOrEqualTo(Date value) {
            addCriterion("zone_time <=", value, "zoneTime");
            return (Criteria) this;
        }

        public Criteria andZoneTimeIn(List<Date> values) {
            addCriterion("zone_time in", values, "zoneTime");
            return (Criteria) this;
        }

        public Criteria andZoneTimeNotIn(List<Date> values) {
            addCriterion("zone_time not in", values, "zoneTime");
            return (Criteria) this;
        }

        public Criteria andZoneTimeBetween(Date value1, Date value2) {
            addCriterion("zone_time between", value1, value2, "zoneTime");
            return (Criteria) this;
        }

        public Criteria andZoneTimeNotBetween(Date value1, Date value2) {
            addCriterion("zone_time not between", value1, value2, "zoneTime");
            return (Criteria) this;
        }

        public Criteria andZoneStatusIsNull() {
            addCriterion("zone_status is null");
            return (Criteria) this;
        }

        public Criteria andZoneStatusIsNotNull() {
            addCriterion("zone_status is not null");
            return (Criteria) this;
        }

        public Criteria andZoneStatusEqualTo(Byte value) {
            addCriterion("zone_status =", value, "zoneStatus");
            return (Criteria) this;
        }

        public Criteria andZoneStatusNotEqualTo(Byte value) {
            addCriterion("zone_status <>", value, "zoneStatus");
            return (Criteria) this;
        }

        public Criteria andZoneStatusGreaterThan(Byte value) {
            addCriterion("zone_status >", value, "zoneStatus");
            return (Criteria) this;
        }

        public Criteria andZoneStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("zone_status >=", value, "zoneStatus");
            return (Criteria) this;
        }

        public Criteria andZoneStatusLessThan(Byte value) {
            addCriterion("zone_status <", value, "zoneStatus");
            return (Criteria) this;
        }

        public Criteria andZoneStatusLessThanOrEqualTo(Byte value) {
            addCriterion("zone_status <=", value, "zoneStatus");
            return (Criteria) this;
        }

        public Criteria andZoneStatusIn(List<Byte> values) {
            addCriterion("zone_status in", values, "zoneStatus");
            return (Criteria) this;
        }

        public Criteria andZoneStatusNotIn(List<Byte> values) {
            addCriterion("zone_status not in", values, "zoneStatus");
            return (Criteria) this;
        }

        public Criteria andZoneStatusBetween(Byte value1, Byte value2) {
            addCriterion("zone_status between", value1, value2, "zoneStatus");
            return (Criteria) this;
        }

        public Criteria andZoneStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("zone_status not between", value1, value2, "zoneStatus");
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