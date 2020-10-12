package com.fc.test.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;
/**
 * 绘画创作集 ProPaintExample
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-06-29 16:48:18
 */
public class ProPaintExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProPaintExample() {
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
				
        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }
        
			
        public Criteria andSeterIsNull() {
            addCriterion("seter is null");
            return (Criteria) this;
        }

        public Criteria andSeterIsNotNull() {
            addCriterion("seter is not null");
            return (Criteria) this;
        }

        public Criteria andSeterEqualTo(String value) {
            addCriterion("seter =", value, "seter");
            return (Criteria) this;
        }

        public Criteria andSeterNotEqualTo(String value) {
            addCriterion("seter <>", value, "seter");
            return (Criteria) this;
        }

        public Criteria andSeterGreaterThan(String value) {
            addCriterion("seter >", value, "seter");
            return (Criteria) this;
        }

        public Criteria andSeterGreaterThanOrEqualTo(String value) {
            addCriterion("seter >=", value, "seter");
            return (Criteria) this;
        }

        public Criteria andSeterLessThan(String value) {
            addCriterion("seter <", value, "seter");
            return (Criteria) this;
        }

        public Criteria andSeterLessThanOrEqualTo(String value) {
            addCriterion("seter <=", value, "seter");
            return (Criteria) this;
        }

        public Criteria andSeterLike(String value) {
            addCriterion("seter like", value, "seter");
            return (Criteria) this;
        }

        public Criteria andSeterNotLike(String value) {
            addCriterion("seter not like", value, "seter");
            return (Criteria) this;
        }

        public Criteria andSeterIn(List<String> values) {
            addCriterion("seter in", values, "seter");
            return (Criteria) this;
        }

        public Criteria andSeterNotIn(List<String> values) {
            addCriterion("seter not in", values, "seter");
            return (Criteria) this;
        }

        public Criteria andSeterBetween(String value1, String value2) {
            addCriterion("seter between", value1, value2, "seter");
            return (Criteria) this;
        }

        public Criteria andSeterNotBetween(String value1, String value2) {
            addCriterion("seter not between", value1, value2, "seter");
            return (Criteria) this;
        }
        
			
        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }
        
			
        public Criteria andQrCodeIsNull() {
            addCriterion("qr_code is null");
            return (Criteria) this;
        }

        public Criteria andQrCodeIsNotNull() {
            addCriterion("qr_code is not null");
            return (Criteria) this;
        }

        public Criteria andQrCodeEqualTo(String value) {
            addCriterion("qr_code =", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotEqualTo(String value) {
            addCriterion("qr_code <>", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThan(String value) {
            addCriterion("qr_code >", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("qr_code >=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThan(String value) {
            addCriterion("qr_code <", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThanOrEqualTo(String value) {
            addCriterion("qr_code <=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLike(String value) {
            addCriterion("qr_code like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotLike(String value) {
            addCriterion("qr_code not like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeIn(List<String> values) {
            addCriterion("qr_code in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotIn(List<String> values) {
            addCriterion("qr_code not in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeBetween(String value1, String value2) {
            addCriterion("qr_code between", value1, value2, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotBetween(String value1, String value2) {
            addCriterion("qr_code not between", value1, value2, "qrCode");
            return (Criteria) this;
        }
        
			
        public Criteria andExhibitionIsNull() {
            addCriterion("exhibition is null");
            return (Criteria) this;
        }

        public Criteria andExhibitionIsNotNull() {
            addCriterion("exhibition is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitionEqualTo(String value) {
            addCriterion("exhibition =", value, "exhibition");
            return (Criteria) this;
        }

        public Criteria andExhibitionNotEqualTo(String value) {
            addCriterion("exhibition <>", value, "exhibition");
            return (Criteria) this;
        }

        public Criteria andExhibitionGreaterThan(String value) {
            addCriterion("exhibition >", value, "exhibition");
            return (Criteria) this;
        }

        public Criteria andExhibitionGreaterThanOrEqualTo(String value) {
            addCriterion("exhibition >=", value, "exhibition");
            return (Criteria) this;
        }

        public Criteria andExhibitionLessThan(String value) {
            addCriterion("exhibition <", value, "exhibition");
            return (Criteria) this;
        }

        public Criteria andExhibitionLessThanOrEqualTo(String value) {
            addCriterion("exhibition <=", value, "exhibition");
            return (Criteria) this;
        }

        public Criteria andExhibitionLike(String value) {
            addCriterion("exhibition like", value, "exhibition");
            return (Criteria) this;
        }

        public Criteria andExhibitionNotLike(String value) {
            addCriterion("exhibition not like", value, "exhibition");
            return (Criteria) this;
        }

        public Criteria andExhibitionIn(List<String> values) {
            addCriterion("exhibition in", values, "exhibition");
            return (Criteria) this;
        }

        public Criteria andExhibitionNotIn(List<String> values) {
            addCriterion("exhibition not in", values, "exhibition");
            return (Criteria) this;
        }

        public Criteria andExhibitionBetween(String value1, String value2) {
            addCriterion("exhibition between", value1, value2, "exhibition");
            return (Criteria) this;
        }

        public Criteria andExhibitionNotBetween(String value1, String value2) {
            addCriterion("exhibition not between", value1, value2, "exhibition");
            return (Criteria) this;
        }
        
			
        public Criteria andCoverIsNull() {
            addCriterion("cover is null");
            return (Criteria) this;
        }

        public Criteria andCoverIsNotNull() {
            addCriterion("cover is not null");
            return (Criteria) this;
        }

        public Criteria andCoverEqualTo(String value) {
            addCriterion("cover =", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotEqualTo(String value) {
            addCriterion("cover <>", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThan(String value) {
            addCriterion("cover >", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThanOrEqualTo(String value) {
            addCriterion("cover >=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThan(String value) {
            addCriterion("cover <", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThanOrEqualTo(String value) {
            addCriterion("cover <=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLike(String value) {
            addCriterion("cover like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotLike(String value) {
            addCriterion("cover not like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverIn(List<String> values) {
            addCriterion("cover in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotIn(List<String> values) {
            addCriterion("cover not in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverBetween(String value1, String value2) {
            addCriterion("cover between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotBetween(String value1, String value2) {
            addCriterion("cover not between", value1, value2, "cover");
            return (Criteria) this;
        }
        
			
        public Criteria andTopicIsNull() {
            addCriterion("topic is null");
            return (Criteria) this;
        }

        public Criteria andTopicIsNotNull() {
            addCriterion("topic is not null");
            return (Criteria) this;
        }

        public Criteria andTopicEqualTo(String value) {
            addCriterion("topic =", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotEqualTo(String value) {
            addCriterion("topic <>", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThan(String value) {
            addCriterion("topic >", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThanOrEqualTo(String value) {
            addCriterion("topic >=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThan(String value) {
            addCriterion("topic <", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThanOrEqualTo(String value) {
            addCriterion("topic <=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLike(String value) {
            addCriterion("topic like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotLike(String value) {
            addCriterion("topic not like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicIn(List<String> values) {
            addCriterion("topic in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotIn(List<String> values) {
            addCriterion("topic not in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicBetween(String value1, String value2) {
            addCriterion("topic between", value1, value2, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotBetween(String value1, String value2) {
            addCriterion("topic not between", value1, value2, "topic");
            return (Criteria) this;
        }
        
			
        public Criteria andPurposeIsNull() {
            addCriterion("purpose is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("purpose is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("purpose =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("purpose <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("purpose >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("purpose >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("purpose <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("purpose <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("purpose like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("purpose not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("purpose in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("purpose not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("purpose between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("purpose not between", value1, value2, "purpose");
            return (Criteria) this;
        }
        
			
        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }
        
			
        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(Float value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(Float value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(Float value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(Float value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(Float value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(Float value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLike(Float value) {
            addCriterion("rate like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotLike(Float value) {
            addCriterion("rate not like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<Float> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<Float> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(Float value1, Float value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(Float value1, Float value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }
        
			
        public Criteria andKindIsNull() {
            addCriterion("kind is null");
            return (Criteria) this;
        }

        public Criteria andKindIsNotNull() {
            addCriterion("kind is not null");
            return (Criteria) this;
        }

        public Criteria andKindEqualTo(Integer value) {
            addCriterion("kind =", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotEqualTo(Integer value) {
            addCriterion("kind <>", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThan(Integer value) {
            addCriterion("kind >", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThanOrEqualTo(Integer value) {
            addCriterion("kind >=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThan(Integer value) {
            addCriterion("kind <", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThanOrEqualTo(Integer value) {
            addCriterion("kind <=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLike(Integer value) {
            addCriterion("kind like", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotLike(Integer value) {
            addCriterion("kind not like", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindIn(List<Integer> values) {
            addCriterion("kind in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotIn(List<Integer> values) {
            addCriterion("kind not in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindBetween(Integer value1, Integer value2) {
            addCriterion("kind between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotBetween(Integer value1, Integer value2) {
            addCriterion("kind not between", value1, value2, "kind");
            return (Criteria) this;
        }
        
			
        public Criteria andPartsIsNull() {
            addCriterion("parts is null");
            return (Criteria) this;
        }

        public Criteria andPartsIsNotNull() {
            addCriterion("parts is not null");
            return (Criteria) this;
        }

        public Criteria andPartsEqualTo(Integer value) {
            addCriterion("parts =", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsNotEqualTo(Integer value) {
            addCriterion("parts <>", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsGreaterThan(Integer value) {
            addCriterion("parts >", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsGreaterThanOrEqualTo(Integer value) {
            addCriterion("parts >=", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsLessThan(Integer value) {
            addCriterion("parts <", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsLessThanOrEqualTo(Integer value) {
            addCriterion("parts <=", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsLike(Integer value) {
            addCriterion("parts like", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsNotLike(Integer value) {
            addCriterion("parts not like", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsIn(List<Integer> values) {
            addCriterion("parts in", values, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsNotIn(List<Integer> values) {
            addCriterion("parts not in", values, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsBetween(Integer value1, Integer value2) {
            addCriterion("parts between", value1, value2, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsNotBetween(Integer value1, Integer value2) {
            addCriterion("parts not between", value1, value2, "parts");
            return (Criteria) this;
        }
        
			
        public Criteria andSectionIsNull() {
            addCriterion("section is null");
            return (Criteria) this;
        }

        public Criteria andSectionIsNotNull() {
            addCriterion("section is not null");
            return (Criteria) this;
        }

        public Criteria andSectionEqualTo(Integer value) {
            addCriterion("section =", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotEqualTo(Integer value) {
            addCriterion("section <>", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionGreaterThan(Integer value) {
            addCriterion("section >", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("section >=", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLessThan(Integer value) {
            addCriterion("section <", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLessThanOrEqualTo(Integer value) {
            addCriterion("section <=", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLike(Integer value) {
            addCriterion("section like", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotLike(Integer value) {
            addCriterion("section not like", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionIn(List<Integer> values) {
            addCriterion("section in", values, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotIn(List<Integer> values) {
            addCriterion("section not in", values, "section");
            return (Criteria) this;
        }

        public Criteria andSectionBetween(Integer value1, Integer value2) {
            addCriterion("section between", value1, value2, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotBetween(Integer value1, Integer value2) {
            addCriterion("section not between", value1, value2, "section");
            return (Criteria) this;
        }
        
			
        public Criteria andFinPartIsNull() {
            addCriterion("fin_part is null");
            return (Criteria) this;
        }

        public Criteria andFinPartIsNotNull() {
            addCriterion("fin_part is not null");
            return (Criteria) this;
        }

        public Criteria andFinPartEqualTo(Integer value) {
            addCriterion("fin_part =", value, "finPart");
            return (Criteria) this;
        }

        public Criteria andFinPartNotEqualTo(Integer value) {
            addCriterion("fin_part <>", value, "finPart");
            return (Criteria) this;
        }

        public Criteria andFinPartGreaterThan(Integer value) {
            addCriterion("fin_part >", value, "finPart");
            return (Criteria) this;
        }

        public Criteria andFinPartGreaterThanOrEqualTo(Integer value) {
            addCriterion("fin_part >=", value, "finPart");
            return (Criteria) this;
        }

        public Criteria andFinPartLessThan(Integer value) {
            addCriterion("fin_part <", value, "finPart");
            return (Criteria) this;
        }

        public Criteria andFinPartLessThanOrEqualTo(Integer value) {
            addCriterion("fin_part <=", value, "finPart");
            return (Criteria) this;
        }

        public Criteria andFinPartLike(Integer value) {
            addCriterion("fin_part like", value, "finPart");
            return (Criteria) this;
        }

        public Criteria andFinPartNotLike(Integer value) {
            addCriterion("fin_part not like", value, "finPart");
            return (Criteria) this;
        }

        public Criteria andFinPartIn(List<Integer> values) {
            addCriterion("fin_part in", values, "finPart");
            return (Criteria) this;
        }

        public Criteria andFinPartNotIn(List<Integer> values) {
            addCriterion("fin_part not in", values, "finPart");
            return (Criteria) this;
        }

        public Criteria andFinPartBetween(Integer value1, Integer value2) {
            addCriterion("fin_part between", value1, value2, "finPart");
            return (Criteria) this;
        }

        public Criteria andFinPartNotBetween(Integer value1, Integer value2) {
            addCriterion("fin_part not between", value1, value2, "finPart");
            return (Criteria) this;
        }
        
			
        public Criteria andFinSectionIsNull() {
            addCriterion("fin_section is null");
            return (Criteria) this;
        }

        public Criteria andFinSectionIsNotNull() {
            addCriterion("fin_section is not null");
            return (Criteria) this;
        }

        public Criteria andFinSectionEqualTo(Integer value) {
            addCriterion("fin_section =", value, "finSection");
            return (Criteria) this;
        }

        public Criteria andFinSectionNotEqualTo(Integer value) {
            addCriterion("fin_section <>", value, "finSection");
            return (Criteria) this;
        }

        public Criteria andFinSectionGreaterThan(Integer value) {
            addCriterion("fin_section >", value, "finSection");
            return (Criteria) this;
        }

        public Criteria andFinSectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("fin_section >=", value, "finSection");
            return (Criteria) this;
        }

        public Criteria andFinSectionLessThan(Integer value) {
            addCriterion("fin_section <", value, "finSection");
            return (Criteria) this;
        }

        public Criteria andFinSectionLessThanOrEqualTo(Integer value) {
            addCriterion("fin_section <=", value, "finSection");
            return (Criteria) this;
        }

        public Criteria andFinSectionLike(Integer value) {
            addCriterion("fin_section like", value, "finSection");
            return (Criteria) this;
        }

        public Criteria andFinSectionNotLike(Integer value) {
            addCriterion("fin_section not like", value, "finSection");
            return (Criteria) this;
        }

        public Criteria andFinSectionIn(List<Integer> values) {
            addCriterion("fin_section in", values, "finSection");
            return (Criteria) this;
        }

        public Criteria andFinSectionNotIn(List<Integer> values) {
            addCriterion("fin_section not in", values, "finSection");
            return (Criteria) this;
        }

        public Criteria andFinSectionBetween(Integer value1, Integer value2) {
            addCriterion("fin_section between", value1, value2, "finSection");
            return (Criteria) this;
        }

        public Criteria andFinSectionNotBetween(Integer value1, Integer value2) {
            addCriterion("fin_section not between", value1, value2, "finSection");
            return (Criteria) this;
        }
        
			
        public Criteria andFormIsNull() {
            addCriterion("form is null");
            return (Criteria) this;
        }

        public Criteria andFormIsNotNull() {
            addCriterion("form is not null");
            return (Criteria) this;
        }

        public Criteria andFormEqualTo(String value) {
            addCriterion("form =", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormNotEqualTo(String value) {
            addCriterion("form <>", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormGreaterThan(String value) {
            addCriterion("form >", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormGreaterThanOrEqualTo(String value) {
            addCriterion("form >=", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormLessThan(String value) {
            addCriterion("form <", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormLessThanOrEqualTo(String value) {
            addCriterion("form <=", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormLike(String value) {
            addCriterion("form like", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormNotLike(String value) {
            addCriterion("form not like", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormIn(List<String> values) {
            addCriterion("form in", values, "form");
            return (Criteria) this;
        }

        public Criteria andFormNotIn(List<String> values) {
            addCriterion("form not in", values, "form");
            return (Criteria) this;
        }

        public Criteria andFormBetween(String value1, String value2) {
            addCriterion("form between", value1, value2, "form");
            return (Criteria) this;
        }

        public Criteria andFormNotBetween(String value1, String value2) {
            addCriterion("form not between", value1, value2, "form");
            return (Criteria) this;
        }
        
			
        public Criteria andPartnerIsNull() {
            addCriterion("partner is null");
            return (Criteria) this;
        }

        public Criteria andPartnerIsNotNull() {
            addCriterion("partner is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerEqualTo(Long value) {
            addCriterion("partner =", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotEqualTo(Long value) {
            addCriterion("partner <>", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerGreaterThan(Long value) {
            addCriterion("partner >", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerGreaterThanOrEqualTo(Long value) {
            addCriterion("partner >=", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLessThan(Long value) {
            addCriterion("partner <", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLessThanOrEqualTo(Long value) {
            addCriterion("partner <=", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLike(Long value) {
            addCriterion("partner like", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotLike(Long value) {
            addCriterion("partner not like", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerIn(List<Long> values) {
            addCriterion("partner in", values, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotIn(List<Long> values) {
            addCriterion("partner not in", values, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerBetween(Long value1, Long value2) {
            addCriterion("partner between", value1, value2, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotBetween(Long value1, Long value2) {
            addCriterion("partner not between", value1, value2, "partner");
            return (Criteria) this;
        }
        
			
        public Criteria andViewsIsNull() {
            addCriterion("views is null");
            return (Criteria) this;
        }

        public Criteria andViewsIsNotNull() {
            addCriterion("views is not null");
            return (Criteria) this;
        }

        public Criteria andViewsEqualTo(Long value) {
            addCriterion("views =", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotEqualTo(Long value) {
            addCriterion("views <>", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThan(Long value) {
            addCriterion("views >", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThanOrEqualTo(Long value) {
            addCriterion("views >=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThan(Long value) {
            addCriterion("views <", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThanOrEqualTo(Long value) {
            addCriterion("views <=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLike(Long value) {
            addCriterion("views like", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotLike(Long value) {
            addCriterion("views not like", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsIn(List<Long> values) {
            addCriterion("views in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotIn(List<Long> values) {
            addCriterion("views not in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsBetween(Long value1, Long value2) {
            addCriterion("views between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotBetween(Long value1, Long value2) {
            addCriterion("views not between", value1, value2, "views");
            return (Criteria) this;
        }
        
			
        public Criteria andCopyrightIsNull() {
            addCriterion("copyright is null");
            return (Criteria) this;
        }

        public Criteria andCopyrightIsNotNull() {
            addCriterion("copyright is not null");
            return (Criteria) this;
        }

        public Criteria andCopyrightEqualTo(Integer value) {
            addCriterion("copyright =", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotEqualTo(Integer value) {
            addCriterion("copyright <>", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThan(Integer value) {
            addCriterion("copyright >", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThanOrEqualTo(Integer value) {
            addCriterion("copyright >=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThan(Integer value) {
            addCriterion("copyright <", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThanOrEqualTo(Integer value) {
            addCriterion("copyright <=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLike(Integer value) {
            addCriterion("copyright like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotLike(Integer value) {
            addCriterion("copyright not like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightIn(List<Integer> values) {
            addCriterion("copyright in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotIn(List<Integer> values) {
            addCriterion("copyright not in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightBetween(Integer value1, Integer value2) {
            addCriterion("copyright between", value1, value2, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotBetween(Integer value1, Integer value2) {
            addCriterion("copyright not between", value1, value2, "copyright");
            return (Criteria) this;
        }
        
			
        public Criteria andRewardIsNull() {
            addCriterion("reward is null");
            return (Criteria) this;
        }

        public Criteria andRewardIsNotNull() {
            addCriterion("reward is not null");
            return (Criteria) this;
        }

        public Criteria andRewardEqualTo(String value) {
            addCriterion("reward =", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotEqualTo(String value) {
            addCriterion("reward <>", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardGreaterThan(String value) {
            addCriterion("reward >", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardGreaterThanOrEqualTo(String value) {
            addCriterion("reward >=", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLessThan(String value) {
            addCriterion("reward <", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLessThanOrEqualTo(String value) {
            addCriterion("reward <=", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLike(String value) {
            addCriterion("reward like", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotLike(String value) {
            addCriterion("reward not like", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardIn(List<String> values) {
            addCriterion("reward in", values, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotIn(List<String> values) {
            addCriterion("reward not in", values, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardBetween(String value1, String value2) {
            addCriterion("reward between", value1, value2, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotBetween(String value1, String value2) {
            addCriterion("reward not between", value1, value2, "reward");
            return (Criteria) this;
        }
        
			
        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterion("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterion("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterion("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterion("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLike(Date value) {
            addCriterion("deadline like", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotLike(Date value) {
            addCriterion("deadline not like", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterion("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterion("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterion("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }
        
			
        public Criteria andPublisherIsNull() {
            addCriterion("publisher is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("publisher is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("publisher =", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("publisher <>", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("publisher >", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("publisher >=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("publisher <", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("publisher <=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("publisher like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("publisher not like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("publisher in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("publisher not in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("publisher between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("publisher not between", value1, value2, "publisher");
            return (Criteria) this;
        }
        
			
        public Criteria andIsTopIsNull() {
            addCriterion("is_top is null");
            return (Criteria) this;
        }

        public Criteria andIsTopIsNotNull() {
            addCriterion("is_top is not null");
            return (Criteria) this;
        }

        public Criteria andIsTopEqualTo(Integer value) {
            addCriterion("is_top =", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopNotEqualTo(Integer value) {
            addCriterion("is_top <>", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopGreaterThan(Integer value) {
            addCriterion("is_top >", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_top >=", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopLessThan(Integer value) {
            addCriterion("is_top <", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopLessThanOrEqualTo(Integer value) {
            addCriterion("is_top <=", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopLike(Integer value) {
            addCriterion("is_top like", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopNotLike(Integer value) {
            addCriterion("is_top not like", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopIn(List<Integer> values) {
            addCriterion("is_top in", values, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopNotIn(List<Integer> values) {
            addCriterion("is_top not in", values, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopBetween(Integer value1, Integer value2) {
            addCriterion("is_top between", value1, value2, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopNotBetween(Integer value1, Integer value2) {
            addCriterion("is_top not between", value1, value2, "isTop");
            return (Criteria) this;
        }


        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }
			
        public Criteria andFinishIsNull() {
            addCriterion("finish is null");
            return (Criteria) this;
        }

        public Criteria andFinishIsNotNull() {
            addCriterion("finish is not null");
            return (Criteria) this;
        }

        public Criteria andFinishEqualTo(Integer value) {
            addCriterion("finish =", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishNotEqualTo(Integer value) {
            addCriterion("finish <>", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishGreaterThan(Integer value) {
            addCriterion("finish >", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishGreaterThanOrEqualTo(Integer value) {
            addCriterion("finish >=", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishLessThan(Integer value) {
            addCriterion("finish <", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishLessThanOrEqualTo(Integer value) {
            addCriterion("finish <=", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishLike(Integer value) {
            addCriterion("finish like", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishNotLike(Integer value) {
            addCriterion("finish not like", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishIn(List<Integer> values) {
            addCriterion("finish in", values, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishNotIn(List<Integer> values) {
            addCriterion("finish not in", values, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishBetween(Integer value1, Integer value2) {
            addCriterion("finish between", value1, value2, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishNotBetween(Integer value1, Integer value2) {
            addCriterion("finish not between", value1, value2, "finish");
            return (Criteria) this;
        }
        
			
        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }
        
			
        public Criteria andCreateDatIsNull() {
            addCriterion("create_dat is null");
            return (Criteria) this;
        }

        public Criteria andCreateDatIsNotNull() {
            addCriterion("create_dat is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDatEqualTo(Date value) {
            addCriterion("create_dat =", value, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatNotEqualTo(Date value) {
            addCriterion("create_dat <>", value, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatGreaterThan(Date value) {
            addCriterion("create_dat >", value, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatGreaterThanOrEqualTo(Date value) {
            addCriterion("create_dat >=", value, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatLessThan(Date value) {
            addCriterion("create_dat <", value, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatLessThanOrEqualTo(Date value) {
            addCriterion("create_dat <=", value, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatLike(Date value) {
            addCriterion("create_dat like", value, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatNotLike(Date value) {
            addCriterion("create_dat not like", value, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatIn(List<Date> values) {
            addCriterion("create_dat in", values, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatNotIn(List<Date> values) {
            addCriterion("create_dat not in", values, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatBetween(Date value1, Date value2) {
            addCriterion("create_dat between", value1, value2, "createDat");
            return (Criteria) this;
        }

        public Criteria andCreateDatNotBetween(Date value1, Date value2) {
            addCriterion("create_dat not between", value1, value2, "createDat");
            return (Criteria) this;
        }
        
			
        public Criteria andLUpdateDatIsNull() {
            addCriterion("l_update_dat is null");
            return (Criteria) this;
        }

        public Criteria andLUpdateDatIsNotNull() {
            addCriterion("l_update_dat is not null");
            return (Criteria) this;
        }

        public Criteria andLUpdateDatEqualTo(Date value) {
            addCriterion("l_update_dat =", value, "lUpdateDat");
            return (Criteria) this;
        }

        public Criteria andLUpdateDatNotEqualTo(Date value) {
            addCriterion("l_update_dat <>", value, "lUpdateDat");
            return (Criteria) this;
        }

        public Criteria andLUpdateDatGreaterThan(Date value) {
            addCriterion("l_update_dat >", value, "lUpdateDat");
            return (Criteria) this;
        }

        public Criteria andLUpdateDatGreaterThanOrEqualTo(Date value) {
            addCriterion("l_update_dat >=", value, "lUpdateDat");
            return (Criteria) this;
        }

        public Criteria andLUpdateDatLessThan(Date value) {
            addCriterion("l_update_dat <", value, "lUpdateDat");
            return (Criteria) this;
        }

        public Criteria andLUpdateDatLessThanOrEqualTo(Date value) {
            addCriterion("l_update_dat <=", value, "lUpdateDat");
            return (Criteria) this;
        }

        public Criteria andLUpdateDatLike(Date value) {
            addCriterion("l_update_dat like", value, "lUpdateDat");
            return (Criteria) this;
        }

        public Criteria andLUpdateDatNotLike(Date value) {
            addCriterion("l_update_dat not like", value, "lUpdateDat");
            return (Criteria) this;
        }

        public Criteria andLUpdateDatIn(List<Date> values) {
            addCriterion("l_update_dat in", values, "lUpdateDat");
            return (Criteria) this;
        }

        public Criteria andLUpdateDatNotIn(List<Date> values) {
            addCriterion("l_update_dat not in", values, "lUpdateDat");
            return (Criteria) this;
        }

        public Criteria andLUpdateDatBetween(Date value1, Date value2) {
            addCriterion("l_update_dat between", value1, value2, "lUpdateDat");
            return (Criteria) this;
        }

        public Criteria andLUpdateDatNotBetween(Date value1, Date value2) {
            addCriterion("l_update_dat not between", value1, value2, "lUpdateDat");
            return (Criteria) this;
        }
        
			
        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Integer value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Integer value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Integer value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Integer value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLike(Integer value) {
            addCriterion("is_del like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotLike(Integer value) {
            addCriterion("is_del not like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Integer> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Integer> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Integer value1, Integer value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }
        
		
		 public Criteria andLikeQuery(ProPaint record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
        	
        				 if(record.getUid()!=null&&StrUtil.isNotEmpty(record.getUid().toString())) {
    			 list.add("ifnull(uid,'')");
    		 }
						 if(record.getSeter()!=null&&StrUtil.isNotEmpty(record.getSeter().toString())) {
    			 list.add("ifnull(seter,'')");
    		 }
						 if(record.getName()!=null&&StrUtil.isNotEmpty(record.getName().toString())) {
    			 list.add("ifnull(name,'')");
    		 }
						 if(record.getQrCode()!=null&&StrUtil.isNotEmpty(record.getQrCode().toString())) {
    			 list.add("ifnull(qr_code,'')");
    		 }
						 if(record.getExhibition()!=null&&StrUtil.isNotEmpty(record.getExhibition().toString())) {
    			 list.add("ifnull(exhibition,'')");
    		 }
						 if(record.getCover()!=null&&StrUtil.isNotEmpty(record.getCover().toString())) {
    			 list.add("ifnull(cover,'')");
    		 }
						 if(record.getTopic()!=null&&StrUtil.isNotEmpty(record.getTopic().toString())) {
    			 list.add("ifnull(topic,'')");
    		 }
						 if(record.getPurpose()!=null&&StrUtil.isNotEmpty(record.getPurpose().toString())) {
    			 list.add("ifnull(purpose,'')");
    		 }
						 if(record.getDescription()!=null&&StrUtil.isNotEmpty(record.getDescription().toString())) {
    			 list.add("ifnull(description,'')");
    		 }
						 if(record.getRate()!=null&&StrUtil.isNotEmpty(record.getRate().toString())) {
    			 list.add("ifnull(rate,'')");
    		 }
						 if(record.getKind()!=null&&StrUtil.isNotEmpty(record.getKind().toString())) {
    			 list.add("ifnull(kind,'')");
    		 }
						 if(record.getParts()!=null&&StrUtil.isNotEmpty(record.getParts().toString())) {
    			 list.add("ifnull(parts,'')");
    		 }
						 if(record.getSection()!=null&&StrUtil.isNotEmpty(record.getSection().toString())) {
    			 list.add("ifnull(section,'')");
    		 }
						 if(record.getFinPart()!=null&&StrUtil.isNotEmpty(record.getFinPart().toString())) {
    			 list.add("ifnull(fin_part,'')");
    		 }
						 if(record.getFinSection()!=null&&StrUtil.isNotEmpty(record.getFinSection().toString())) {
    			 list.add("ifnull(fin_section,'')");
    		 }
						 if(record.getForm()!=null&&StrUtil.isNotEmpty(record.getForm().toString())) {
    			 list.add("ifnull(form,'')");
    		 }
						 if(record.getPartner()!=null&&StrUtil.isNotEmpty(record.getPartner().toString())) {
    			 list.add("ifnull(partner,'')");
    		 }
						 if(record.getViews()!=null&&StrUtil.isNotEmpty(record.getViews().toString())) {
    			 list.add("ifnull(views,'')");
    		 }
						 if(record.getCopyright()!=null&&StrUtil.isNotEmpty(record.getCopyright().toString())) {
    			 list.add("ifnull(copyright,'')");
    		 }
						 if(record.getReward()!=null&&StrUtil.isNotEmpty(record.getReward().toString())) {
    			 list.add("ifnull(reward,'')");
    		 }
						 if(record.getDeadline()!=null&&StrUtil.isNotEmpty(record.getDeadline().toString())) {
    			 list.add("ifnull(deadline,'')");
    		 }
						 if(record.getPublisher()!=null&&StrUtil.isNotEmpty(record.getPublisher().toString())) {
    			 list.add("ifnull(publisher,'')");
    		 }
						 if(record.getIsTop()!=null&&StrUtil.isNotEmpty(record.getIsTop().toString())) {
    			 list.add("ifnull(is_top,'')");
    		 }
						 if(record.getFinish()!=null&&StrUtil.isNotEmpty(record.getFinish().toString())) {
    			 list.add("ifnull(finish,'')");
    		 }
						 if(record.getCreateBy()!=null&&StrUtil.isNotEmpty(record.getCreateBy().toString())) {
    			 list.add("ifnull(create_by,'')");
    		 }
						 if(record.getCreateDat()!=null&&StrUtil.isNotEmpty(record.getCreateDat().toString())) {
    			 list.add("ifnull(create_dat,'')");
    		 }
						 if(record.getlUpdateDat()!=null&&StrUtil.isNotEmpty(record.getlUpdateDat().toString())) {
    			 list.add("ifnull(l_update_dat,'')");
    		 }
						 if(record.getIsDel()!=null&&StrUtil.isNotEmpty(record.getIsDel().toString())) {
    			 list.add("ifnull(is_del,'')");
    		 }
										 if(record.getUid()!=null&&StrUtil.isNotEmpty(record.getUid().toString())) {
        			list2.add("'%"+record.getUid()+"%'");
        		 }
							 if(record.getSeter()!=null&&StrUtil.isNotEmpty(record.getSeter().toString())) {
        			list2.add("'%"+record.getSeter()+"%'");
        		 }
							 if(record.getName()!=null&&StrUtil.isNotEmpty(record.getName().toString())) {
        			list2.add("'%"+record.getName()+"%'");
        		 }
							 if(record.getQrCode()!=null&&StrUtil.isNotEmpty(record.getQrCode().toString())) {
        			list2.add("'%"+record.getQrCode()+"%'");
        		 }
							 if(record.getExhibition()!=null&&StrUtil.isNotEmpty(record.getExhibition().toString())) {
        			list2.add("'%"+record.getExhibition()+"%'");
        		 }
							 if(record.getCover()!=null&&StrUtil.isNotEmpty(record.getCover().toString())) {
        			list2.add("'%"+record.getCover()+"%'");
        		 }
							 if(record.getTopic()!=null&&StrUtil.isNotEmpty(record.getTopic().toString())) {
        			list2.add("'%"+record.getTopic()+"%'");
        		 }
							 if(record.getPurpose()!=null&&StrUtil.isNotEmpty(record.getPurpose().toString())) {
        			list2.add("'%"+record.getPurpose()+"%'");
        		 }
							 if(record.getDescription()!=null&&StrUtil.isNotEmpty(record.getDescription().toString())) {
        			list2.add("'%"+record.getDescription()+"%'");
        		 }
							 if(record.getRate()!=null&&StrUtil.isNotEmpty(record.getRate().toString())) {
        			list2.add("'%"+record.getRate()+"%'");
        		 }
							 if(record.getKind()!=null&&StrUtil.isNotEmpty(record.getKind().toString())) {
        			list2.add("'%"+record.getKind()+"%'");
        		 }
							 if(record.getParts()!=null&&StrUtil.isNotEmpty(record.getParts().toString())) {
        			list2.add("'%"+record.getParts()+"%'");
        		 }
							 if(record.getSection()!=null&&StrUtil.isNotEmpty(record.getSection().toString())) {
        			list2.add("'%"+record.getSection()+"%'");
        		 }
							 if(record.getFinPart()!=null&&StrUtil.isNotEmpty(record.getFinPart().toString())) {
        			list2.add("'%"+record.getFinPart()+"%'");
        		 }
							 if(record.getFinSection()!=null&&StrUtil.isNotEmpty(record.getFinSection().toString())) {
        			list2.add("'%"+record.getFinSection()+"%'");
        		 }
							 if(record.getForm()!=null&&StrUtil.isNotEmpty(record.getForm().toString())) {
        			list2.add("'%"+record.getForm()+"%'");
        		 }
							 if(record.getPartner()!=null&&StrUtil.isNotEmpty(record.getPartner().toString())) {
        			list2.add("'%"+record.getPartner()+"%'");
        		 }
							 if(record.getViews()!=null&&StrUtil.isNotEmpty(record.getViews().toString())) {
        			list2.add("'%"+record.getViews()+"%'");
        		 }
							 if(record.getCopyright()!=null&&StrUtil.isNotEmpty(record.getCopyright().toString())) {
        			list2.add("'%"+record.getCopyright()+"%'");
        		 }
							 if(record.getReward()!=null&&StrUtil.isNotEmpty(record.getReward().toString())) {
        			list2.add("'%"+record.getReward()+"%'");
        		 }
							 if(record.getDeadline()!=null&&StrUtil.isNotEmpty(record.getDeadline().toString())) {
        			list2.add("'%"+record.getDeadline()+"%'");
        		 }
							 if(record.getPublisher()!=null&&StrUtil.isNotEmpty(record.getPublisher().toString())) {
        			list2.add("'%"+record.getPublisher()+"%'");
        		 }
							 if(record.getIsTop()!=null&&StrUtil.isNotEmpty(record.getIsTop().toString())) {
        			list2.add("'%"+record.getIsTop()+"%'");
        		 }
							 if(record.getFinish()!=null&&StrUtil.isNotEmpty(record.getFinish().toString())) {
        			list2.add("'%"+record.getFinish()+"%'");
        		 }
							 if(record.getCreateBy()!=null&&StrUtil.isNotEmpty(record.getCreateBy().toString())) {
        			list2.add("'%"+record.getCreateBy()+"%'");
        		 }
							 if(record.getCreateDat()!=null&&StrUtil.isNotEmpty(record.getCreateDat().toString())) {
        			list2.add("'%"+record.getCreateDat()+"%'");
        		 }
							 if(record.getlUpdateDat()!=null&&StrUtil.isNotEmpty(record.getlUpdateDat().toString())) {
        			list2.add("'%"+record.getlUpdateDat()+"%'");
        		 }
							 if(record.getIsDel()!=null&&StrUtil.isNotEmpty(record.getIsDel().toString())) {
        			list2.add("'%"+record.getIsDel()+"%'");
        		 }
			        	
        	buffer.append(" CONCAT(");
	        buffer.append(StrUtil.join("",list));
        	buffer.append(")");
        	buffer.append("like CONCAT(");
        	
        	
        	buffer.append(StrUtil.join("",list2));
        	
        	buffer.append(")");
        	if(!" CONCAT()like CONCAT()".equals(buffer.toString())) {
        		addCriterion(buffer.toString());
        	}
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