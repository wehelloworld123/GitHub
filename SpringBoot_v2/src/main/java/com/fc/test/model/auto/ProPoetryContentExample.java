package com.fc.test.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;
/**
 * 诗歌创作内容 ProPoetryContentExample
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-09 12:08:33
 */
public class ProPoetryContentExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProPoetryContentExample() {
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
				
        public Criteria andNoIsNull() {
            addCriterion("no is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("no is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(String value) {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(String value) {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(String value) {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(String value) {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(String value) {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(String value) {
            addCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLike(String value) {
            addCriterion("no like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotLike(String value) {
            addCriterion("no not like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<String> values) {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<String> values) {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(String value1, String value2) {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(String value1, String value2) {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }
        
			
        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }
        
			
        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }
        
			
        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }
        
			
        public Criteria andCharpIdIsNull() {
            addCriterion("charp_id is null");
            return (Criteria) this;
        }

        public Criteria andCharpIdIsNotNull() {
            addCriterion("charp_id is not null");
            return (Criteria) this;
        }

        public Criteria andCharpIdEqualTo(Long value) {
            addCriterion("charp_id =", value, "charpId");
            return (Criteria) this;
        }

        public Criteria andCharpIdNotEqualTo(Long value) {
            addCriterion("charp_id <>", value, "charpId");
            return (Criteria) this;
        }

        public Criteria andCharpIdGreaterThan(Long value) {
            addCriterion("charp_id >", value, "charpId");
            return (Criteria) this;
        }

        public Criteria andCharpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("charp_id >=", value, "charpId");
            return (Criteria) this;
        }

        public Criteria andCharpIdLessThan(Long value) {
            addCriterion("charp_id <", value, "charpId");
            return (Criteria) this;
        }

        public Criteria andCharpIdLessThanOrEqualTo(Long value) {
            addCriterion("charp_id <=", value, "charpId");
            return (Criteria) this;
        }

        public Criteria andCharpIdLike(Long value) {
            addCriterion("charp_id like", value, "charpId");
            return (Criteria) this;
        }

        public Criteria andCharpIdNotLike(Long value) {
            addCriterion("charp_id not like", value, "charpId");
            return (Criteria) this;
        }

        public Criteria andCharpIdIn(List<Long> values) {
            addCriterion("charp_id in", values, "charpId");
            return (Criteria) this;
        }

        public Criteria andCharpIdNotIn(List<Long> values) {
            addCriterion("charp_id not in", values, "charpId");
            return (Criteria) this;
        }

        public Criteria andCharpIdBetween(Long value1, Long value2) {
            addCriterion("charp_id between", value1, value2, "charpId");
            return (Criteria) this;
        }

        public Criteria andCharpIdNotBetween(Long value1, Long value2) {
            addCriterion("charp_id not between", value1, value2, "charpId");
            return (Criteria) this;
        }
        
			
        public Criteria andCharpNameIsNull() {
            addCriterion("charp_name is null");
            return (Criteria) this;
        }

        public Criteria andCharpNameIsNotNull() {
            addCriterion("charp_name is not null");
            return (Criteria) this;
        }

        public Criteria andCharpNameEqualTo(String value) {
            addCriterion("charp_name =", value, "charpName");
            return (Criteria) this;
        }

        public Criteria andCharpNameNotEqualTo(String value) {
            addCriterion("charp_name <>", value, "charpName");
            return (Criteria) this;
        }

        public Criteria andCharpNameGreaterThan(String value) {
            addCriterion("charp_name >", value, "charpName");
            return (Criteria) this;
        }

        public Criteria andCharpNameGreaterThanOrEqualTo(String value) {
            addCriterion("charp_name >=", value, "charpName");
            return (Criteria) this;
        }

        public Criteria andCharpNameLessThan(String value) {
            addCriterion("charp_name <", value, "charpName");
            return (Criteria) this;
        }

        public Criteria andCharpNameLessThanOrEqualTo(String value) {
            addCriterion("charp_name <=", value, "charpName");
            return (Criteria) this;
        }

        public Criteria andCharpNameLike(String value) {
            addCriterion("charp_name like", value, "charpName");
            return (Criteria) this;
        }

        public Criteria andCharpNameNotLike(String value) {
            addCriterion("charp_name not like", value, "charpName");
            return (Criteria) this;
        }

        public Criteria andCharpNameIn(List<String> values) {
            addCriterion("charp_name in", values, "charpName");
            return (Criteria) this;
        }

        public Criteria andCharpNameNotIn(List<String> values) {
            addCriterion("charp_name not in", values, "charpName");
            return (Criteria) this;
        }

        public Criteria andCharpNameBetween(String value1, String value2) {
            addCriterion("charp_name between", value1, value2, "charpName");
            return (Criteria) this;
        }

        public Criteria andCharpNameNotBetween(String value1, String value2) {
            addCriterion("charp_name not between", value1, value2, "charpName");
            return (Criteria) this;
        }
        
			
        public Criteria andSecNameIsNull() {
            addCriterion("sec_name is null");
            return (Criteria) this;
        }

        public Criteria andSecNameIsNotNull() {
            addCriterion("sec_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecNameEqualTo(String value) {
            addCriterion("sec_name =", value, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameNotEqualTo(String value) {
            addCriterion("sec_name <>", value, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameGreaterThan(String value) {
            addCriterion("sec_name >", value, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameGreaterThanOrEqualTo(String value) {
            addCriterion("sec_name >=", value, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameLessThan(String value) {
            addCriterion("sec_name <", value, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameLessThanOrEqualTo(String value) {
            addCriterion("sec_name <=", value, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameLike(String value) {
            addCriterion("sec_name like", value, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameNotLike(String value) {
            addCriterion("sec_name not like", value, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameIn(List<String> values) {
            addCriterion("sec_name in", values, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameNotIn(List<String> values) {
            addCriterion("sec_name not in", values, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameBetween(String value1, String value2) {
            addCriterion("sec_name between", value1, value2, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameNotBetween(String value1, String value2) {
            addCriterion("sec_name not between", value1, value2, "secName");
            return (Criteria) this;
        }
        
			
        public Criteria andPoetryIdIsNull() {
            addCriterion("poetry_id is null");
            return (Criteria) this;
        }

        public Criteria andPoetryIdIsNotNull() {
            addCriterion("poetry_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoetryIdEqualTo(String value) {
            addCriterion("poetry_id =", value, "poetryId");
            return (Criteria) this;
        }

        public Criteria andPoetryIdNotEqualTo(String value) {
            addCriterion("poetry_id <>", value, "poetryId");
            return (Criteria) this;
        }

        public Criteria andPoetryIdGreaterThan(String value) {
            addCriterion("poetry_id >", value, "poetryId");
            return (Criteria) this;
        }

        public Criteria andPoetryIdGreaterThanOrEqualTo(String value) {
            addCriterion("poetry_id >=", value, "poetryId");
            return (Criteria) this;
        }

        public Criteria andPoetryIdLessThan(String value) {
            addCriterion("poetry_id <", value, "poetryId");
            return (Criteria) this;
        }

        public Criteria andPoetryIdLessThanOrEqualTo(String value) {
            addCriterion("poetry_id <=", value, "poetryId");
            return (Criteria) this;
        }

        public Criteria andPoetryIdLike(String value) {
            addCriterion("poetry_id like", value, "poetryId");
            return (Criteria) this;
        }

        public Criteria andPoetryIdNotLike(String value) {
            addCriterion("poetry_id not like", value, "poetryId");
            return (Criteria) this;
        }

        public Criteria andPoetryIdIn(List<String> values) {
            addCriterion("poetry_id in", values, "poetryId");
            return (Criteria) this;
        }

        public Criteria andPoetryIdNotIn(List<String> values) {
            addCriterion("poetry_id not in", values, "poetryId");
            return (Criteria) this;
        }

        public Criteria andPoetryIdBetween(String value1, String value2) {
            addCriterion("poetry_id between", value1, value2, "poetryId");
            return (Criteria) this;
        }

        public Criteria andPoetryIdNotBetween(String value1, String value2) {
            addCriterion("poetry_id not between", value1, value2, "poetryId");
            return (Criteria) this;
        }
        
			
        public Criteria andPoetryNameIsNull() {
            addCriterion("poetry_name is null");
            return (Criteria) this;
        }

        public Criteria andPoetryNameIsNotNull() {
            addCriterion("poetry_name is not null");
            return (Criteria) this;
        }

        public Criteria andPoetryNameEqualTo(String value) {
            addCriterion("poetry_name =", value, "poetryName");
            return (Criteria) this;
        }

        public Criteria andPoetryNameNotEqualTo(String value) {
            addCriterion("poetry_name <>", value, "poetryName");
            return (Criteria) this;
        }

        public Criteria andPoetryNameGreaterThan(String value) {
            addCriterion("poetry_name >", value, "poetryName");
            return (Criteria) this;
        }

        public Criteria andPoetryNameGreaterThanOrEqualTo(String value) {
            addCriterion("poetry_name >=", value, "poetryName");
            return (Criteria) this;
        }

        public Criteria andPoetryNameLessThan(String value) {
            addCriterion("poetry_name <", value, "poetryName");
            return (Criteria) this;
        }

        public Criteria andPoetryNameLessThanOrEqualTo(String value) {
            addCriterion("poetry_name <=", value, "poetryName");
            return (Criteria) this;
        }

        public Criteria andPoetryNameLike(String value) {
            addCriterion("poetry_name like", value, "poetryName");
            return (Criteria) this;
        }

        public Criteria andPoetryNameNotLike(String value) {
            addCriterion("poetry_name not like", value, "poetryName");
            return (Criteria) this;
        }

        public Criteria andPoetryNameIn(List<String> values) {
            addCriterion("poetry_name in", values, "poetryName");
            return (Criteria) this;
        }

        public Criteria andPoetryNameNotIn(List<String> values) {
            addCriterion("poetry_name not in", values, "poetryName");
            return (Criteria) this;
        }

        public Criteria andPoetryNameBetween(String value1, String value2) {
            addCriterion("poetry_name between", value1, value2, "poetryName");
            return (Criteria) this;
        }

        public Criteria andPoetryNameNotBetween(String value1, String value2) {
            addCriterion("poetry_name not between", value1, value2, "poetryName");
            return (Criteria) this;
        }
        
			
        public Criteria andLikesIsNull() {
            addCriterion("likes is null");
            return (Criteria) this;
        }

        public Criteria andLikesIsNotNull() {
            addCriterion("likes is not null");
            return (Criteria) this;
        }

        public Criteria andLikesEqualTo(Integer value) {
            addCriterion("likes =", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotEqualTo(Integer value) {
            addCriterion("likes <>", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesGreaterThan(Integer value) {
            addCriterion("likes >", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesGreaterThanOrEqualTo(Integer value) {
            addCriterion("likes >=", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesLessThan(Integer value) {
            addCriterion("likes <", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesLessThanOrEqualTo(Integer value) {
            addCriterion("likes <=", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesLike(Integer value) {
            addCriterion("likes like", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotLike(Integer value) {
            addCriterion("likes not like", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesIn(List<Integer> values) {
            addCriterion("likes in", values, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotIn(List<Integer> values) {
            addCriterion("likes not in", values, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesBetween(Integer value1, Integer value2) {
            addCriterion("likes between", value1, value2, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotBetween(Integer value1, Integer value2) {
            addCriterion("likes not between", value1, value2, "likes");
            return (Criteria) this;
        }
        
			
        public Criteria andRecomNoIsNull() {
            addCriterion("recom_no is null");
            return (Criteria) this;
        }

        public Criteria andRecomNoIsNotNull() {
            addCriterion("recom_no is not null");
            return (Criteria) this;
        }

        public Criteria andRecomNoEqualTo(Integer value) {
            addCriterion("recom_no =", value, "recomNo");
            return (Criteria) this;
        }

        public Criteria andRecomNoNotEqualTo(Integer value) {
            addCriterion("recom_no <>", value, "recomNo");
            return (Criteria) this;
        }

        public Criteria andRecomNoGreaterThan(Integer value) {
            addCriterion("recom_no >", value, "recomNo");
            return (Criteria) this;
        }

        public Criteria andRecomNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("recom_no >=", value, "recomNo");
            return (Criteria) this;
        }

        public Criteria andRecomNoLessThan(Integer value) {
            addCriterion("recom_no <", value, "recomNo");
            return (Criteria) this;
        }

        public Criteria andRecomNoLessThanOrEqualTo(Integer value) {
            addCriterion("recom_no <=", value, "recomNo");
            return (Criteria) this;
        }

        public Criteria andRecomNoLike(Integer value) {
            addCriterion("recom_no like", value, "recomNo");
            return (Criteria) this;
        }

        public Criteria andRecomNoNotLike(Integer value) {
            addCriterion("recom_no not like", value, "recomNo");
            return (Criteria) this;
        }

        public Criteria andRecomNoIn(List<Integer> values) {
            addCriterion("recom_no in", values, "recomNo");
            return (Criteria) this;
        }

        public Criteria andRecomNoNotIn(List<Integer> values) {
            addCriterion("recom_no not in", values, "recomNo");
            return (Criteria) this;
        }

        public Criteria andRecomNoBetween(Integer value1, Integer value2) {
            addCriterion("recom_no between", value1, value2, "recomNo");
            return (Criteria) this;
        }

        public Criteria andRecomNoNotBetween(Integer value1, Integer value2) {
            addCriterion("recom_no not between", value1, value2, "recomNo");
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

        public Criteria andViewsEqualTo(Integer value) {
            addCriterion("views =", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotEqualTo(Integer value) {
            addCriterion("views <>", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThan(Integer value) {
            addCriterion("views >", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("views >=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThan(Integer value) {
            addCriterion("views <", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThanOrEqualTo(Integer value) {
            addCriterion("views <=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLike(Integer value) {
            addCriterion("views like", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotLike(Integer value) {
            addCriterion("views not like", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsIn(List<Integer> values) {
            addCriterion("views in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotIn(List<Integer> values) {
            addCriterion("views not in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsBetween(Integer value1, Integer value2) {
            addCriterion("views between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotBetween(Integer value1, Integer value2) {
            addCriterion("views not between", value1, value2, "views");
            return (Criteria) this;
        }
			
        public Criteria andAdoptIsNull() {
            addCriterion("adopt is null");
            return (Criteria) this;
        }

        public Criteria andAdoptIsNotNull() {
            addCriterion("adopt is not null");
            return (Criteria) this;
        }

        public Criteria andAdoptEqualTo(Integer value) {
            addCriterion("adopt =", value, "adopt");
            return (Criteria) this;
        }

        public Criteria andAdoptNotEqualTo(Integer value) {
            addCriterion("adopt <>", value, "adopt");
            return (Criteria) this;
        }

        public Criteria andAdoptGreaterThan(Integer value) {
            addCriterion("adopt >", value, "adopt");
            return (Criteria) this;
        }

        public Criteria andAdoptGreaterThanOrEqualTo(Integer value) {
            addCriterion("adopt >=", value, "adopt");
            return (Criteria) this;
        }

        public Criteria andAdoptLessThan(Integer value) {
            addCriterion("adopt <", value, "adopt");
            return (Criteria) this;
        }

        public Criteria andAdoptLessThanOrEqualTo(Integer value) {
            addCriterion("adopt <=", value, "adopt");
            return (Criteria) this;
        }

        public Criteria andAdoptLike(Integer value) {
            addCriterion("adopt like", value, "adopt");
            return (Criteria) this;
        }

        public Criteria andAdoptNotLike(Integer value) {
            addCriterion("adopt not like", value, "adopt");
            return (Criteria) this;
        }

        public Criteria andAdoptIn(List<Integer> values) {
            addCriterion("adopt in", values, "adopt");
            return (Criteria) this;
        }

        public Criteria andAdoptNotIn(List<Integer> values) {
            addCriterion("adopt not in", values, "adopt");
            return (Criteria) this;
        }

        public Criteria andAdoptBetween(Integer value1, Integer value2) {
            addCriterion("adopt between", value1, value2, "adopt");
            return (Criteria) this;
        }

        public Criteria andAdoptNotBetween(Integer value1, Integer value2) {
            addCriterion("adopt not between", value1, value2, "adopt");
            return (Criteria) this;
        }
        
			
        public Criteria andFavorerIsNull() {
            addCriterion("favorer is null");
            return (Criteria) this;
        }

        public Criteria andFavorerIsNotNull() {
            addCriterion("favorer is not null");
            return (Criteria) this;
        }

        public Criteria andFavorerEqualTo(String value) {
            addCriterion("favorer =", value, "favorer");
            return (Criteria) this;
        }

        public Criteria andFavorerNotEqualTo(String value) {
            addCriterion("favorer <>", value, "favorer");
            return (Criteria) this;
        }

        public Criteria andFavorerGreaterThan(String value) {
            addCriterion("favorer >", value, "favorer");
            return (Criteria) this;
        }

        public Criteria andFavorerGreaterThanOrEqualTo(String value) {
            addCriterion("favorer >=", value, "favorer");
            return (Criteria) this;
        }

        public Criteria andFavorerLessThan(String value) {
            addCriterion("favorer <", value, "favorer");
            return (Criteria) this;
        }

        public Criteria andFavorerLessThanOrEqualTo(String value) {
            addCriterion("favorer <=", value, "favorer");
            return (Criteria) this;
        }

        public Criteria andFavorerLike(String value) {
            addCriterion("favorer like", value, "favorer");
            return (Criteria) this;
        }

        public Criteria andFavorerNotLike(String value) {
            addCriterion("favorer not like", value, "favorer");
            return (Criteria) this;
        }

        public Criteria andFavorerIn(List<String> values) {
            addCriterion("favorer in", values, "favorer");
            return (Criteria) this;
        }

        public Criteria andFavorerNotIn(List<String> values) {
            addCriterion("favorer not in", values, "favorer");
            return (Criteria) this;
        }

        public Criteria andFavorerBetween(String value1, String value2) {
            addCriterion("favorer between", value1, value2, "favorer");
            return (Criteria) this;
        }

        public Criteria andFavorerNotBetween(String value1, String value2) {
            addCriterion("favorer not between", value1, value2, "favorer");
            return (Criteria) this;
        }


        public Criteria andCreatorByIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
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
        
		
		 public Criteria andLikeQuery(ProPoetryContent record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
        	
        				 if(record.getNo()!=null&&StrUtil.isNotEmpty(record.getNo().toString())) {
    			 list.add("ifnull(no,'')");
    		 }
						 if(record.getTitle()!=null&&StrUtil.isNotEmpty(record.getTitle().toString())) {
    			 list.add("ifnull(title,'')");
    		 }
						 if(record.getBrand()!=null&&StrUtil.isNotEmpty(record.getBrand().toString())) {
    			 list.add("ifnull(brand,'')");
    		 }
						 if(record.getContent()!=null&&StrUtil.isNotEmpty(record.getContent().toString())) {
    			 list.add("ifnull(content,'')");
    		 }
						 if(record.getCharpId()!=null&&StrUtil.isNotEmpty(record.getCharpId().toString())) {
    			 list.add("ifnull(charp_id,'')");
    		 }
						 if(record.getCharpName()!=null&&StrUtil.isNotEmpty(record.getCharpName().toString())) {
    			 list.add("ifnull(charp_name,'')");
    		 }
						 if(record.getSecName()!=null&&StrUtil.isNotEmpty(record.getSecName().toString())) {
    			 list.add("ifnull(sec_name,'')");
    		 }
						 if(record.getPoetryId()!=null&&StrUtil.isNotEmpty(record.getPoetryId().toString())) {
    			 list.add("ifnull(poetry_id,'')");
    		 }
						 if(record.getPoetryName()!=null&&StrUtil.isNotEmpty(record.getPoetryName().toString())) {
    			 list.add("ifnull(poetry_name,'')");
    		 }
						 if(record.getLikes()!=null&&StrUtil.isNotEmpty(record.getLikes().toString())) {
    			 list.add("ifnull(likes,'')");
    		 }
						 if(record.getRecomNo()!=null&&StrUtil.isNotEmpty(record.getRecomNo().toString())) {
    			 list.add("ifnull(recom_no,'')");
    		 }
						 if(record.getAdopt()!=null&&StrUtil.isNotEmpty(record.getAdopt().toString())) {
    			 list.add("ifnull(adopt,'')");
    		 }
						 if(record.getFavorer()!=null&&StrUtil.isNotEmpty(record.getFavorer().toString())) {
    			 list.add("ifnull(favorer,'')");
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
										 if(record.getNo()!=null&&StrUtil.isNotEmpty(record.getNo().toString())) {
        			list2.add("'%"+record.getNo()+"%'");
        		 }
							 if(record.getTitle()!=null&&StrUtil.isNotEmpty(record.getTitle().toString())) {
        			list2.add("'%"+record.getTitle()+"%'");
        		 }
							 if(record.getBrand()!=null&&StrUtil.isNotEmpty(record.getBrand().toString())) {
        			list2.add("'%"+record.getBrand()+"%'");
        		 }
							 if(record.getContent()!=null&&StrUtil.isNotEmpty(record.getContent().toString())) {
        			list2.add("'%"+record.getContent()+"%'");
        		 }
							 if(record.getCharpId()!=null&&StrUtil.isNotEmpty(record.getCharpId().toString())) {
        			list2.add("'%"+record.getCharpId()+"%'");
        		 }
							 if(record.getCharpName()!=null&&StrUtil.isNotEmpty(record.getCharpName().toString())) {
        			list2.add("'%"+record.getCharpName()+"%'");
        		 }
							 if(record.getSecName()!=null&&StrUtil.isNotEmpty(record.getSecName().toString())) {
        			list2.add("'%"+record.getSecName()+"%'");
        		 }
							 if(record.getPoetryId()!=null&&StrUtil.isNotEmpty(record.getPoetryId().toString())) {
        			list2.add("'%"+record.getPoetryId()+"%'");
        		 }
							 if(record.getPoetryName()!=null&&StrUtil.isNotEmpty(record.getPoetryName().toString())) {
        			list2.add("'%"+record.getPoetryName()+"%'");
        		 }
							 if(record.getLikes()!=null&&StrUtil.isNotEmpty(record.getLikes().toString())) {
        			list2.add("'%"+record.getLikes()+"%'");
        		 }
							 if(record.getRecomNo()!=null&&StrUtil.isNotEmpty(record.getRecomNo().toString())) {
        			list2.add("'%"+record.getRecomNo()+"%'");
        		 }
							 if(record.getAdopt()!=null&&StrUtil.isNotEmpty(record.getAdopt().toString())) {
        			list2.add("'%"+record.getAdopt()+"%'");
        		 }
							 if(record.getFavorer()!=null&&StrUtil.isNotEmpty(record.getFavorer().toString())) {
        			list2.add("'%"+record.getFavorer()+"%'");
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