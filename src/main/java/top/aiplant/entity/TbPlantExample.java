package top.aiplant.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbPlantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPlantExample() {
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

        public Criteria andPlantNameIsNull() {
            addCriterion("plant_name is null");
            return (Criteria) this;
        }

        public Criteria andPlantNameIsNotNull() {
            addCriterion("plant_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlantNameEqualTo(String value) {
            addCriterion("plant_name =", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameNotEqualTo(String value) {
            addCriterion("plant_name <>", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameGreaterThan(String value) {
            addCriterion("plant_name >", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameGreaterThanOrEqualTo(String value) {
            addCriterion("plant_name >=", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameLessThan(String value) {
            addCriterion("plant_name <", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameLessThanOrEqualTo(String value) {
            addCriterion("plant_name <=", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameLike(String value) {
            addCriterion("plant_name like", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameNotLike(String value) {
            addCriterion("plant_name not like", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameIn(List<String> values) {
            addCriterion("plant_name in", values, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameNotIn(List<String> values) {
            addCriterion("plant_name not in", values, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameBetween(String value1, String value2) {
            addCriterion("plant_name between", value1, value2, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameNotBetween(String value1, String value2) {
            addCriterion("plant_name not between", value1, value2, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantDescIsNull() {
            addCriterion("plant_desc is null");
            return (Criteria) this;
        }

        public Criteria andPlantDescIsNotNull() {
            addCriterion("plant_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPlantDescEqualTo(String value) {
            addCriterion("plant_desc =", value, "plantDesc");
            return (Criteria) this;
        }

        public Criteria andPlantDescNotEqualTo(String value) {
            addCriterion("plant_desc <>", value, "plantDesc");
            return (Criteria) this;
        }

        public Criteria andPlantDescGreaterThan(String value) {
            addCriterion("plant_desc >", value, "plantDesc");
            return (Criteria) this;
        }

        public Criteria andPlantDescGreaterThanOrEqualTo(String value) {
            addCriterion("plant_desc >=", value, "plantDesc");
            return (Criteria) this;
        }

        public Criteria andPlantDescLessThan(String value) {
            addCriterion("plant_desc <", value, "plantDesc");
            return (Criteria) this;
        }

        public Criteria andPlantDescLessThanOrEqualTo(String value) {
            addCriterion("plant_desc <=", value, "plantDesc");
            return (Criteria) this;
        }

        public Criteria andPlantDescLike(String value) {
            addCriterion("plant_desc like", value, "plantDesc");
            return (Criteria) this;
        }

        public Criteria andPlantDescNotLike(String value) {
            addCriterion("plant_desc not like", value, "plantDesc");
            return (Criteria) this;
        }

        public Criteria andPlantDescIn(List<String> values) {
            addCriterion("plant_desc in", values, "plantDesc");
            return (Criteria) this;
        }

        public Criteria andPlantDescNotIn(List<String> values) {
            addCriterion("plant_desc not in", values, "plantDesc");
            return (Criteria) this;
        }

        public Criteria andPlantDescBetween(String value1, String value2) {
            addCriterion("plant_desc between", value1, value2, "plantDesc");
            return (Criteria) this;
        }

        public Criteria andPlantDescNotBetween(String value1, String value2) {
            addCriterion("plant_desc not between", value1, value2, "plantDesc");
            return (Criteria) this;
        }

        public Criteria andPlantGrowthIsNull() {
            addCriterion("plant_growth is null");
            return (Criteria) this;
        }

        public Criteria andPlantGrowthIsNotNull() {
            addCriterion("plant_growth is not null");
            return (Criteria) this;
        }

        public Criteria andPlantGrowthEqualTo(String value) {
            addCriterion("plant_growth =", value, "plantGrowth");
            return (Criteria) this;
        }

        public Criteria andPlantGrowthNotEqualTo(String value) {
            addCriterion("plant_growth <>", value, "plantGrowth");
            return (Criteria) this;
        }

        public Criteria andPlantGrowthGreaterThan(String value) {
            addCriterion("plant_growth >", value, "plantGrowth");
            return (Criteria) this;
        }

        public Criteria andPlantGrowthGreaterThanOrEqualTo(String value) {
            addCriterion("plant_growth >=", value, "plantGrowth");
            return (Criteria) this;
        }

        public Criteria andPlantGrowthLessThan(String value) {
            addCriterion("plant_growth <", value, "plantGrowth");
            return (Criteria) this;
        }

        public Criteria andPlantGrowthLessThanOrEqualTo(String value) {
            addCriterion("plant_growth <=", value, "plantGrowth");
            return (Criteria) this;
        }

        public Criteria andPlantGrowthLike(String value) {
            addCriterion("plant_growth like", value, "plantGrowth");
            return (Criteria) this;
        }

        public Criteria andPlantGrowthNotLike(String value) {
            addCriterion("plant_growth not like", value, "plantGrowth");
            return (Criteria) this;
        }

        public Criteria andPlantGrowthIn(List<String> values) {
            addCriterion("plant_growth in", values, "plantGrowth");
            return (Criteria) this;
        }

        public Criteria andPlantGrowthNotIn(List<String> values) {
            addCriterion("plant_growth not in", values, "plantGrowth");
            return (Criteria) this;
        }

        public Criteria andPlantGrowthBetween(String value1, String value2) {
            addCriterion("plant_growth between", value1, value2, "plantGrowth");
            return (Criteria) this;
        }

        public Criteria andPlantGrowthNotBetween(String value1, String value2) {
            addCriterion("plant_growth not between", value1, value2, "plantGrowth");
            return (Criteria) this;
        }

        public Criteria andPlantTimeIsNull() {
            addCriterion("plant_time is null");
            return (Criteria) this;
        }

        public Criteria andPlantTimeIsNotNull() {
            addCriterion("plant_time is not null");
            return (Criteria) this;
        }

        public Criteria andPlantTimeEqualTo(Date value) {
            addCriterion("plant_time =", value, "plantTime");
            return (Criteria) this;
        }

        public Criteria andPlantTimeNotEqualTo(Date value) {
            addCriterion("plant_time <>", value, "plantTime");
            return (Criteria) this;
        }

        public Criteria andPlantTimeGreaterThan(Date value) {
            addCriterion("plant_time >", value, "plantTime");
            return (Criteria) this;
        }

        public Criteria andPlantTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("plant_time >=", value, "plantTime");
            return (Criteria) this;
        }

        public Criteria andPlantTimeLessThan(Date value) {
            addCriterion("plant_time <", value, "plantTime");
            return (Criteria) this;
        }

        public Criteria andPlantTimeLessThanOrEqualTo(Date value) {
            addCriterion("plant_time <=", value, "plantTime");
            return (Criteria) this;
        }

        public Criteria andPlantTimeIn(List<Date> values) {
            addCriterion("plant_time in", values, "plantTime");
            return (Criteria) this;
        }

        public Criteria andPlantTimeNotIn(List<Date> values) {
            addCriterion("plant_time not in", values, "plantTime");
            return (Criteria) this;
        }

        public Criteria andPlantTimeBetween(Date value1, Date value2) {
            addCriterion("plant_time between", value1, value2, "plantTime");
            return (Criteria) this;
        }

        public Criteria andPlantTimeNotBetween(Date value1, Date value2) {
            addCriterion("plant_time not between", value1, value2, "plantTime");
            return (Criteria) this;
        }

        public Criteria andPlantTokenIsNull() {
            addCriterion("plant_token is null");
            return (Criteria) this;
        }

        public Criteria andPlantTokenIsNotNull() {
            addCriterion("plant_token is not null");
            return (Criteria) this;
        }

        public Criteria andPlantTokenEqualTo(String value) {
            addCriterion("plant_token =", value, "plantToken");
            return (Criteria) this;
        }

        public Criteria andPlantTokenNotEqualTo(String value) {
            addCriterion("plant_token <>", value, "plantToken");
            return (Criteria) this;
        }

        public Criteria andPlantTokenGreaterThan(String value) {
            addCriterion("plant_token >", value, "plantToken");
            return (Criteria) this;
        }

        public Criteria andPlantTokenGreaterThanOrEqualTo(String value) {
            addCriterion("plant_token >=", value, "plantToken");
            return (Criteria) this;
        }

        public Criteria andPlantTokenLessThan(String value) {
            addCriterion("plant_token <", value, "plantToken");
            return (Criteria) this;
        }

        public Criteria andPlantTokenLessThanOrEqualTo(String value) {
            addCriterion("plant_token <=", value, "plantToken");
            return (Criteria) this;
        }

        public Criteria andPlantTokenLike(String value) {
            addCriterion("plant_token like", value, "plantToken");
            return (Criteria) this;
        }

        public Criteria andPlantTokenNotLike(String value) {
            addCriterion("plant_token not like", value, "plantToken");
            return (Criteria) this;
        }

        public Criteria andPlantTokenIn(List<String> values) {
            addCriterion("plant_token in", values, "plantToken");
            return (Criteria) this;
        }

        public Criteria andPlantTokenNotIn(List<String> values) {
            addCriterion("plant_token not in", values, "plantToken");
            return (Criteria) this;
        }

        public Criteria andPlantTokenBetween(String value1, String value2) {
            addCriterion("plant_token between", value1, value2, "plantToken");
            return (Criteria) this;
        }

        public Criteria andPlantTokenNotBetween(String value1, String value2) {
            addCriterion("plant_token not between", value1, value2, "plantToken");
            return (Criteria) this;
        }

        public Criteria andPlantStatusIsNull() {
            addCriterion("plant_status is null");
            return (Criteria) this;
        }

        public Criteria andPlantStatusIsNotNull() {
            addCriterion("plant_status is not null");
            return (Criteria) this;
        }

        public Criteria andPlantStatusEqualTo(Byte value) {
            addCriterion("plant_status =", value, "plantStatus");
            return (Criteria) this;
        }

        public Criteria andPlantStatusNotEqualTo(Byte value) {
            addCriterion("plant_status <>", value, "plantStatus");
            return (Criteria) this;
        }

        public Criteria andPlantStatusGreaterThan(Byte value) {
            addCriterion("plant_status >", value, "plantStatus");
            return (Criteria) this;
        }

        public Criteria andPlantStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("plant_status >=", value, "plantStatus");
            return (Criteria) this;
        }

        public Criteria andPlantStatusLessThan(Byte value) {
            addCriterion("plant_status <", value, "plantStatus");
            return (Criteria) this;
        }

        public Criteria andPlantStatusLessThanOrEqualTo(Byte value) {
            addCriterion("plant_status <=", value, "plantStatus");
            return (Criteria) this;
        }

        public Criteria andPlantStatusIn(List<Byte> values) {
            addCriterion("plant_status in", values, "plantStatus");
            return (Criteria) this;
        }

        public Criteria andPlantStatusNotIn(List<Byte> values) {
            addCriterion("plant_status not in", values, "plantStatus");
            return (Criteria) this;
        }

        public Criteria andPlantStatusBetween(Byte value1, Byte value2) {
            addCriterion("plant_status between", value1, value2, "plantStatus");
            return (Criteria) this;
        }

        public Criteria andPlantStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("plant_status not between", value1, value2, "plantStatus");
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