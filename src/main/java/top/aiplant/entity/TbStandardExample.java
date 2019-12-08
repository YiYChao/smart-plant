package top.aiplant.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbStandardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbStandardExample() {
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

        public Criteria andStdIdIsNull() {
            addCriterion("std_id is null");
            return (Criteria) this;
        }

        public Criteria andStdIdIsNotNull() {
            addCriterion("std_id is not null");
            return (Criteria) this;
        }

        public Criteria andStdIdEqualTo(Integer value) {
            addCriterion("std_id =", value, "stdId");
            return (Criteria) this;
        }

        public Criteria andStdIdNotEqualTo(Integer value) {
            addCriterion("std_id <>", value, "stdId");
            return (Criteria) this;
        }

        public Criteria andStdIdGreaterThan(Integer value) {
            addCriterion("std_id >", value, "stdId");
            return (Criteria) this;
        }

        public Criteria andStdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("std_id >=", value, "stdId");
            return (Criteria) this;
        }

        public Criteria andStdIdLessThan(Integer value) {
            addCriterion("std_id <", value, "stdId");
            return (Criteria) this;
        }

        public Criteria andStdIdLessThanOrEqualTo(Integer value) {
            addCriterion("std_id <=", value, "stdId");
            return (Criteria) this;
        }

        public Criteria andStdIdIn(List<Integer> values) {
            addCriterion("std_id in", values, "stdId");
            return (Criteria) this;
        }

        public Criteria andStdIdNotIn(List<Integer> values) {
            addCriterion("std_id not in", values, "stdId");
            return (Criteria) this;
        }

        public Criteria andStdIdBetween(Integer value1, Integer value2) {
            addCriterion("std_id between", value1, value2, "stdId");
            return (Criteria) this;
        }

        public Criteria andStdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("std_id not between", value1, value2, "stdId");
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

        public Criteria andStdNameIsNull() {
            addCriterion("std_name is null");
            return (Criteria) this;
        }

        public Criteria andStdNameIsNotNull() {
            addCriterion("std_name is not null");
            return (Criteria) this;
        }

        public Criteria andStdNameEqualTo(String value) {
            addCriterion("std_name =", value, "stdName");
            return (Criteria) this;
        }

        public Criteria andStdNameNotEqualTo(String value) {
            addCriterion("std_name <>", value, "stdName");
            return (Criteria) this;
        }

        public Criteria andStdNameGreaterThan(String value) {
            addCriterion("std_name >", value, "stdName");
            return (Criteria) this;
        }

        public Criteria andStdNameGreaterThanOrEqualTo(String value) {
            addCriterion("std_name >=", value, "stdName");
            return (Criteria) this;
        }

        public Criteria andStdNameLessThan(String value) {
            addCriterion("std_name <", value, "stdName");
            return (Criteria) this;
        }

        public Criteria andStdNameLessThanOrEqualTo(String value) {
            addCriterion("std_name <=", value, "stdName");
            return (Criteria) this;
        }

        public Criteria andStdNameLike(String value) {
            addCriterion("std_name like", value, "stdName");
            return (Criteria) this;
        }

        public Criteria andStdNameNotLike(String value) {
            addCriterion("std_name not like", value, "stdName");
            return (Criteria) this;
        }

        public Criteria andStdNameIn(List<String> values) {
            addCriterion("std_name in", values, "stdName");
            return (Criteria) this;
        }

        public Criteria andStdNameNotIn(List<String> values) {
            addCriterion("std_name not in", values, "stdName");
            return (Criteria) this;
        }

        public Criteria andStdNameBetween(String value1, String value2) {
            addCriterion("std_name between", value1, value2, "stdName");
            return (Criteria) this;
        }

        public Criteria andStdNameNotBetween(String value1, String value2) {
            addCriterion("std_name not between", value1, value2, "stdName");
            return (Criteria) this;
        }

        public Criteria andStdDescIsNull() {
            addCriterion("std_desc is null");
            return (Criteria) this;
        }

        public Criteria andStdDescIsNotNull() {
            addCriterion("std_desc is not null");
            return (Criteria) this;
        }

        public Criteria andStdDescEqualTo(String value) {
            addCriterion("std_desc =", value, "stdDesc");
            return (Criteria) this;
        }

        public Criteria andStdDescNotEqualTo(String value) {
            addCriterion("std_desc <>", value, "stdDesc");
            return (Criteria) this;
        }

        public Criteria andStdDescGreaterThan(String value) {
            addCriterion("std_desc >", value, "stdDesc");
            return (Criteria) this;
        }

        public Criteria andStdDescGreaterThanOrEqualTo(String value) {
            addCriterion("std_desc >=", value, "stdDesc");
            return (Criteria) this;
        }

        public Criteria andStdDescLessThan(String value) {
            addCriterion("std_desc <", value, "stdDesc");
            return (Criteria) this;
        }

        public Criteria andStdDescLessThanOrEqualTo(String value) {
            addCriterion("std_desc <=", value, "stdDesc");
            return (Criteria) this;
        }

        public Criteria andStdDescLike(String value) {
            addCriterion("std_desc like", value, "stdDesc");
            return (Criteria) this;
        }

        public Criteria andStdDescNotLike(String value) {
            addCriterion("std_desc not like", value, "stdDesc");
            return (Criteria) this;
        }

        public Criteria andStdDescIn(List<String> values) {
            addCriterion("std_desc in", values, "stdDesc");
            return (Criteria) this;
        }

        public Criteria andStdDescNotIn(List<String> values) {
            addCriterion("std_desc not in", values, "stdDesc");
            return (Criteria) this;
        }

        public Criteria andStdDescBetween(String value1, String value2) {
            addCriterion("std_desc between", value1, value2, "stdDesc");
            return (Criteria) this;
        }

        public Criteria andStdDescNotBetween(String value1, String value2) {
            addCriterion("std_desc not between", value1, value2, "stdDesc");
            return (Criteria) this;
        }

        public Criteria andAirTemperatureIsNull() {
            addCriterion("air_temperature is null");
            return (Criteria) this;
        }

        public Criteria andAirTemperatureIsNotNull() {
            addCriterion("air_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andAirTemperatureEqualTo(Float value) {
            addCriterion("air_temperature =", value, "airTemperature");
            return (Criteria) this;
        }

        public Criteria andAirTemperatureNotEqualTo(Float value) {
            addCriterion("air_temperature <>", value, "airTemperature");
            return (Criteria) this;
        }

        public Criteria andAirTemperatureGreaterThan(Float value) {
            addCriterion("air_temperature >", value, "airTemperature");
            return (Criteria) this;
        }

        public Criteria andAirTemperatureGreaterThanOrEqualTo(Float value) {
            addCriterion("air_temperature >=", value, "airTemperature");
            return (Criteria) this;
        }

        public Criteria andAirTemperatureLessThan(Float value) {
            addCriterion("air_temperature <", value, "airTemperature");
            return (Criteria) this;
        }

        public Criteria andAirTemperatureLessThanOrEqualTo(Float value) {
            addCriterion("air_temperature <=", value, "airTemperature");
            return (Criteria) this;
        }

        public Criteria andAirTemperatureIn(List<Float> values) {
            addCriterion("air_temperature in", values, "airTemperature");
            return (Criteria) this;
        }

        public Criteria andAirTemperatureNotIn(List<Float> values) {
            addCriterion("air_temperature not in", values, "airTemperature");
            return (Criteria) this;
        }

        public Criteria andAirTemperatureBetween(Float value1, Float value2) {
            addCriterion("air_temperature between", value1, value2, "airTemperature");
            return (Criteria) this;
        }

        public Criteria andAirTemperatureNotBetween(Float value1, Float value2) {
            addCriterion("air_temperature not between", value1, value2, "airTemperature");
            return (Criteria) this;
        }

        public Criteria andAirHumidityIsNull() {
            addCriterion("air_humidity is null");
            return (Criteria) this;
        }

        public Criteria andAirHumidityIsNotNull() {
            addCriterion("air_humidity is not null");
            return (Criteria) this;
        }

        public Criteria andAirHumidityEqualTo(Float value) {
            addCriterion("air_humidity =", value, "airHumidity");
            return (Criteria) this;
        }

        public Criteria andAirHumidityNotEqualTo(Float value) {
            addCriterion("air_humidity <>", value, "airHumidity");
            return (Criteria) this;
        }

        public Criteria andAirHumidityGreaterThan(Float value) {
            addCriterion("air_humidity >", value, "airHumidity");
            return (Criteria) this;
        }

        public Criteria andAirHumidityGreaterThanOrEqualTo(Float value) {
            addCriterion("air_humidity >=", value, "airHumidity");
            return (Criteria) this;
        }

        public Criteria andAirHumidityLessThan(Float value) {
            addCriterion("air_humidity <", value, "airHumidity");
            return (Criteria) this;
        }

        public Criteria andAirHumidityLessThanOrEqualTo(Float value) {
            addCriterion("air_humidity <=", value, "airHumidity");
            return (Criteria) this;
        }

        public Criteria andAirHumidityIn(List<Float> values) {
            addCriterion("air_humidity in", values, "airHumidity");
            return (Criteria) this;
        }

        public Criteria andAirHumidityNotIn(List<Float> values) {
            addCriterion("air_humidity not in", values, "airHumidity");
            return (Criteria) this;
        }

        public Criteria andAirHumidityBetween(Float value1, Float value2) {
            addCriterion("air_humidity between", value1, value2, "airHumidity");
            return (Criteria) this;
        }

        public Criteria andAirHumidityNotBetween(Float value1, Float value2) {
            addCriterion("air_humidity not between", value1, value2, "airHumidity");
            return (Criteria) this;
        }

        public Criteria andAirHeatIsNull() {
            addCriterion("air_heat is null");
            return (Criteria) this;
        }

        public Criteria andAirHeatIsNotNull() {
            addCriterion("air_heat is not null");
            return (Criteria) this;
        }

        public Criteria andAirHeatEqualTo(Float value) {
            addCriterion("air_heat =", value, "airHeat");
            return (Criteria) this;
        }

        public Criteria andAirHeatNotEqualTo(Float value) {
            addCriterion("air_heat <>", value, "airHeat");
            return (Criteria) this;
        }

        public Criteria andAirHeatGreaterThan(Float value) {
            addCriterion("air_heat >", value, "airHeat");
            return (Criteria) this;
        }

        public Criteria andAirHeatGreaterThanOrEqualTo(Float value) {
            addCriterion("air_heat >=", value, "airHeat");
            return (Criteria) this;
        }

        public Criteria andAirHeatLessThan(Float value) {
            addCriterion("air_heat <", value, "airHeat");
            return (Criteria) this;
        }

        public Criteria andAirHeatLessThanOrEqualTo(Float value) {
            addCriterion("air_heat <=", value, "airHeat");
            return (Criteria) this;
        }

        public Criteria andAirHeatIn(List<Float> values) {
            addCriterion("air_heat in", values, "airHeat");
            return (Criteria) this;
        }

        public Criteria andAirHeatNotIn(List<Float> values) {
            addCriterion("air_heat not in", values, "airHeat");
            return (Criteria) this;
        }

        public Criteria andAirHeatBetween(Float value1, Float value2) {
            addCriterion("air_heat between", value1, value2, "airHeat");
            return (Criteria) this;
        }

        public Criteria andAirHeatNotBetween(Float value1, Float value2) {
            addCriterion("air_heat not between", value1, value2, "airHeat");
            return (Criteria) this;
        }

        public Criteria andAirLightIsNull() {
            addCriterion("air_light is null");
            return (Criteria) this;
        }

        public Criteria andAirLightIsNotNull() {
            addCriterion("air_light is not null");
            return (Criteria) this;
        }

        public Criteria andAirLightEqualTo(Float value) {
            addCriterion("air_light =", value, "airLight");
            return (Criteria) this;
        }

        public Criteria andAirLightNotEqualTo(Float value) {
            addCriterion("air_light <>", value, "airLight");
            return (Criteria) this;
        }

        public Criteria andAirLightGreaterThan(Float value) {
            addCriterion("air_light >", value, "airLight");
            return (Criteria) this;
        }

        public Criteria andAirLightGreaterThanOrEqualTo(Float value) {
            addCriterion("air_light >=", value, "airLight");
            return (Criteria) this;
        }

        public Criteria andAirLightLessThan(Float value) {
            addCriterion("air_light <", value, "airLight");
            return (Criteria) this;
        }

        public Criteria andAirLightLessThanOrEqualTo(Float value) {
            addCriterion("air_light <=", value, "airLight");
            return (Criteria) this;
        }

        public Criteria andAirLightIn(List<Float> values) {
            addCriterion("air_light in", values, "airLight");
            return (Criteria) this;
        }

        public Criteria andAirLightNotIn(List<Float> values) {
            addCriterion("air_light not in", values, "airLight");
            return (Criteria) this;
        }

        public Criteria andAirLightBetween(Float value1, Float value2) {
            addCriterion("air_light between", value1, value2, "airLight");
            return (Criteria) this;
        }

        public Criteria andAirLightNotBetween(Float value1, Float value2) {
            addCriterion("air_light not between", value1, value2, "airLight");
            return (Criteria) this;
        }

        public Criteria andAirRainIsNull() {
            addCriterion("air_rain is null");
            return (Criteria) this;
        }

        public Criteria andAirRainIsNotNull() {
            addCriterion("air_rain is not null");
            return (Criteria) this;
        }

        public Criteria andAirRainEqualTo(Integer value) {
            addCriterion("air_rain =", value, "airRain");
            return (Criteria) this;
        }

        public Criteria andAirRainNotEqualTo(Integer value) {
            addCriterion("air_rain <>", value, "airRain");
            return (Criteria) this;
        }

        public Criteria andAirRainGreaterThan(Integer value) {
            addCriterion("air_rain >", value, "airRain");
            return (Criteria) this;
        }

        public Criteria andAirRainGreaterThanOrEqualTo(Integer value) {
            addCriterion("air_rain >=", value, "airRain");
            return (Criteria) this;
        }

        public Criteria andAirRainLessThan(Integer value) {
            addCriterion("air_rain <", value, "airRain");
            return (Criteria) this;
        }

        public Criteria andAirRainLessThanOrEqualTo(Integer value) {
            addCriterion("air_rain <=", value, "airRain");
            return (Criteria) this;
        }

        public Criteria andAirRainIn(List<Integer> values) {
            addCriterion("air_rain in", values, "airRain");
            return (Criteria) this;
        }

        public Criteria andAirRainNotIn(List<Integer> values) {
            addCriterion("air_rain not in", values, "airRain");
            return (Criteria) this;
        }

        public Criteria andAirRainBetween(Integer value1, Integer value2) {
            addCriterion("air_rain between", value1, value2, "airRain");
            return (Criteria) this;
        }

        public Criteria andAirRainNotBetween(Integer value1, Integer value2) {
            addCriterion("air_rain not between", value1, value2, "airRain");
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

        public Criteria andSoilHumidityEqualTo(Float value) {
            addCriterion("soil_humidity =", value, "soilHumidity");
            return (Criteria) this;
        }

        public Criteria andSoilHumidityNotEqualTo(Float value) {
            addCriterion("soil_humidity <>", value, "soilHumidity");
            return (Criteria) this;
        }

        public Criteria andSoilHumidityGreaterThan(Float value) {
            addCriterion("soil_humidity >", value, "soilHumidity");
            return (Criteria) this;
        }

        public Criteria andSoilHumidityGreaterThanOrEqualTo(Float value) {
            addCriterion("soil_humidity >=", value, "soilHumidity");
            return (Criteria) this;
        }

        public Criteria andSoilHumidityLessThan(Float value) {
            addCriterion("soil_humidity <", value, "soilHumidity");
            return (Criteria) this;
        }

        public Criteria andSoilHumidityLessThanOrEqualTo(Float value) {
            addCriterion("soil_humidity <=", value, "soilHumidity");
            return (Criteria) this;
        }

        public Criteria andSoilHumidityIn(List<Float> values) {
            addCriterion("soil_humidity in", values, "soilHumidity");
            return (Criteria) this;
        }

        public Criteria andSoilHumidityNotIn(List<Float> values) {
            addCriterion("soil_humidity not in", values, "soilHumidity");
            return (Criteria) this;
        }

        public Criteria andSoilHumidityBetween(Float value1, Float value2) {
            addCriterion("soil_humidity between", value1, value2, "soilHumidity");
            return (Criteria) this;
        }

        public Criteria andSoilHumidityNotBetween(Float value1, Float value2) {
            addCriterion("soil_humidity not between", value1, value2, "soilHumidity");
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

        public Criteria andWaterDepthEqualTo(Float value) {
            addCriterion("water_depth =", value, "waterDepth");
            return (Criteria) this;
        }

        public Criteria andWaterDepthNotEqualTo(Float value) {
            addCriterion("water_depth <>", value, "waterDepth");
            return (Criteria) this;
        }

        public Criteria andWaterDepthGreaterThan(Float value) {
            addCriterion("water_depth >", value, "waterDepth");
            return (Criteria) this;
        }

        public Criteria andWaterDepthGreaterThanOrEqualTo(Float value) {
            addCriterion("water_depth >=", value, "waterDepth");
            return (Criteria) this;
        }

        public Criteria andWaterDepthLessThan(Float value) {
            addCriterion("water_depth <", value, "waterDepth");
            return (Criteria) this;
        }

        public Criteria andWaterDepthLessThanOrEqualTo(Float value) {
            addCriterion("water_depth <=", value, "waterDepth");
            return (Criteria) this;
        }

        public Criteria andWaterDepthIn(List<Float> values) {
            addCriterion("water_depth in", values, "waterDepth");
            return (Criteria) this;
        }

        public Criteria andWaterDepthNotIn(List<Float> values) {
            addCriterion("water_depth not in", values, "waterDepth");
            return (Criteria) this;
        }

        public Criteria andWaterDepthBetween(Float value1, Float value2) {
            addCriterion("water_depth between", value1, value2, "waterDepth");
            return (Criteria) this;
        }

        public Criteria andWaterDepthNotBetween(Float value1, Float value2) {
            addCriterion("water_depth not between", value1, value2, "waterDepth");
            return (Criteria) this;
        }

        public Criteria andStdTimeIsNull() {
            addCriterion("std_time is null");
            return (Criteria) this;
        }

        public Criteria andStdTimeIsNotNull() {
            addCriterion("std_time is not null");
            return (Criteria) this;
        }

        public Criteria andStdTimeEqualTo(Date value) {
            addCriterion("std_time =", value, "stdTime");
            return (Criteria) this;
        }

        public Criteria andStdTimeNotEqualTo(Date value) {
            addCriterion("std_time <>", value, "stdTime");
            return (Criteria) this;
        }

        public Criteria andStdTimeGreaterThan(Date value) {
            addCriterion("std_time >", value, "stdTime");
            return (Criteria) this;
        }

        public Criteria andStdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("std_time >=", value, "stdTime");
            return (Criteria) this;
        }

        public Criteria andStdTimeLessThan(Date value) {
            addCriterion("std_time <", value, "stdTime");
            return (Criteria) this;
        }

        public Criteria andStdTimeLessThanOrEqualTo(Date value) {
            addCriterion("std_time <=", value, "stdTime");
            return (Criteria) this;
        }

        public Criteria andStdTimeIn(List<Date> values) {
            addCriterion("std_time in", values, "stdTime");
            return (Criteria) this;
        }

        public Criteria andStdTimeNotIn(List<Date> values) {
            addCriterion("std_time not in", values, "stdTime");
            return (Criteria) this;
        }

        public Criteria andStdTimeBetween(Date value1, Date value2) {
            addCriterion("std_time between", value1, value2, "stdTime");
            return (Criteria) this;
        }

        public Criteria andStdTimeNotBetween(Date value1, Date value2) {
            addCriterion("std_time not between", value1, value2, "stdTime");
            return (Criteria) this;
        }

        public Criteria andStdStatusIsNull() {
            addCriterion("std_status is null");
            return (Criteria) this;
        }

        public Criteria andStdStatusIsNotNull() {
            addCriterion("std_status is not null");
            return (Criteria) this;
        }

        public Criteria andStdStatusEqualTo(Byte value) {
            addCriterion("std_status =", value, "stdStatus");
            return (Criteria) this;
        }

        public Criteria andStdStatusNotEqualTo(Byte value) {
            addCriterion("std_status <>", value, "stdStatus");
            return (Criteria) this;
        }

        public Criteria andStdStatusGreaterThan(Byte value) {
            addCriterion("std_status >", value, "stdStatus");
            return (Criteria) this;
        }

        public Criteria andStdStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("std_status >=", value, "stdStatus");
            return (Criteria) this;
        }

        public Criteria andStdStatusLessThan(Byte value) {
            addCriterion("std_status <", value, "stdStatus");
            return (Criteria) this;
        }

        public Criteria andStdStatusLessThanOrEqualTo(Byte value) {
            addCriterion("std_status <=", value, "stdStatus");
            return (Criteria) this;
        }

        public Criteria andStdStatusIn(List<Byte> values) {
            addCriterion("std_status in", values, "stdStatus");
            return (Criteria) this;
        }

        public Criteria andStdStatusNotIn(List<Byte> values) {
            addCriterion("std_status not in", values, "stdStatus");
            return (Criteria) this;
        }

        public Criteria andStdStatusBetween(Byte value1, Byte value2) {
            addCriterion("std_status between", value1, value2, "stdStatus");
            return (Criteria) this;
        }

        public Criteria andStdStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("std_status not between", value1, value2, "stdStatus");
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