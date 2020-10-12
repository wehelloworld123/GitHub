package com.fc.test.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;
/**
 * 创作推荐表 ProRecomExample
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-12 17:17:42
 */
public class ProRecomExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProRecomExample() {
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
				
        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(Long value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(Long value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
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
        
			
        public Criteria andContentIdIsNull() {
            addCriterion("content_id is null");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNotNull() {
            addCriterion("content_id is not null");
            return (Criteria) this;
        }

        public Criteria andContentIdEqualTo(String value) {
            addCriterion("content_id =", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotEqualTo(String value) {
            addCriterion("content_id <>", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThan(String value) {
            addCriterion("content_id >", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThanOrEqualTo(String value) {
            addCriterion("content_id >=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThan(String value) {
            addCriterion("content_id <", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThanOrEqualTo(String value) {
            addCriterion("content_id <=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLike(String value) {
            addCriterion("content_id like", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotLike(String value) {
            addCriterion("content_id not like", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdIn(List<String> values) {
            addCriterion("content_id in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotIn(List<String> values) {
            addCriterion("content_id not in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdBetween(String value1, String value2) {
            addCriterion("content_id between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotBetween(String value1, String value2) {
            addCriterion("content_id not between", value1, value2, "contentId");
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
        
			
        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
            return (Criteria) this;
        }
        
			
        public Criteria andTypIsNull() {
            addCriterion("typ is null");
            return (Criteria) this;
        }

        public Criteria andTypIsNotNull() {
            addCriterion("typ is not null");
            return (Criteria) this;
        }

        public Criteria andTypEqualTo(Integer value) {
            addCriterion("typ =", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypNotEqualTo(Integer value) {
            addCriterion("typ <>", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypGreaterThan(Integer value) {
            addCriterion("typ >", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypGreaterThanOrEqualTo(Integer value) {
            addCriterion("typ >=", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypLessThan(Integer value) {
            addCriterion("typ <", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypLessThanOrEqualTo(Integer value) {
            addCriterion("typ <=", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypLike(Integer value) {
            addCriterion("typ like", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypNotLike(Integer value) {
            addCriterion("typ not like", value, "typ");
            return (Criteria) this;
        }

        public Criteria andTypIn(List<Integer> values) {
            addCriterion("typ in", values, "typ");
            return (Criteria) this;
        }

        public Criteria andTypNotIn(List<Integer> values) {
            addCriterion("typ not in", values, "typ");
            return (Criteria) this;
        }

        public Criteria andTypBetween(Integer value1, Integer value2) {
            addCriterion("typ between", value1, value2, "typ");
            return (Criteria) this;
        }

        public Criteria andTypNotBetween(Integer value1, Integer value2) {
            addCriterion("typ not between", value1, value2, "typ");
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
        
			
        public Criteria andCreatorIsNull() {
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
        
			
        public Criteria andCreateAvatIsNull() {
            addCriterion("create_avat is null");
            return (Criteria) this;
        }

        public Criteria andCreateAvatIsNotNull() {
            addCriterion("create_avat is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAvatEqualTo(String value) {
            addCriterion("create_avat =", value, "createAvat");
            return (Criteria) this;
        }

        public Criteria andCreateAvatNotEqualTo(String value) {
            addCriterion("create_avat <>", value, "createAvat");
            return (Criteria) this;
        }

        public Criteria andCreateAvatGreaterThan(String value) {
            addCriterion("create_avat >", value, "createAvat");
            return (Criteria) this;
        }

        public Criteria andCreateAvatGreaterThanOrEqualTo(String value) {
            addCriterion("create_avat >=", value, "createAvat");
            return (Criteria) this;
        }

        public Criteria andCreateAvatLessThan(String value) {
            addCriterion("create_avat <", value, "createAvat");
            return (Criteria) this;
        }

        public Criteria andCreateAvatLessThanOrEqualTo(String value) {
            addCriterion("create_avat <=", value, "createAvat");
            return (Criteria) this;
        }

        public Criteria andCreateAvatLike(String value) {
            addCriterion("create_avat like", value, "createAvat");
            return (Criteria) this;
        }

        public Criteria andCreateAvatNotLike(String value) {
            addCriterion("create_avat not like", value, "createAvat");
            return (Criteria) this;
        }

        public Criteria andCreateAvatIn(List<String> values) {
            addCriterion("create_avat in", values, "createAvat");
            return (Criteria) this;
        }

        public Criteria andCreateAvatNotIn(List<String> values) {
            addCriterion("create_avat not in", values, "createAvat");
            return (Criteria) this;
        }

        public Criteria andCreateAvatBetween(String value1, String value2) {
            addCriterion("create_avat between", value1, value2, "createAvat");
            return (Criteria) this;
        }

        public Criteria andCreateAvatNotBetween(String value1, String value2) {
            addCriterion("create_avat not between", value1, value2, "createAvat");
            return (Criteria) this;
        }
        
			
        public Criteria andCreateSexIsNull() {
            addCriterion("create_sex is null");
            return (Criteria) this;
        }

        public Criteria andCreateSexIsNotNull() {
            addCriterion("create_sex is not null");
            return (Criteria) this;
        }

        public Criteria andCreateSexEqualTo(Integer value) {
            addCriterion("create_sex =", value, "createSex");
            return (Criteria) this;
        }

        public Criteria andCreateSexNotEqualTo(Integer value) {
            addCriterion("create_sex <>", value, "createSex");
            return (Criteria) this;
        }

        public Criteria andCreateSexGreaterThan(Integer value) {
            addCriterion("create_sex >", value, "createSex");
            return (Criteria) this;
        }

        public Criteria andCreateSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_sex >=", value, "createSex");
            return (Criteria) this;
        }

        public Criteria andCreateSexLessThan(Integer value) {
            addCriterion("create_sex <", value, "createSex");
            return (Criteria) this;
        }

        public Criteria andCreateSexLessThanOrEqualTo(Integer value) {
            addCriterion("create_sex <=", value, "createSex");
            return (Criteria) this;
        }

        public Criteria andCreateSexLike(Integer value) {
            addCriterion("create_sex like", value, "createSex");
            return (Criteria) this;
        }

        public Criteria andCreateSexNotLike(Integer value) {
            addCriterion("create_sex not like", value, "createSex");
            return (Criteria) this;
        }

        public Criteria andCreateSexIn(List<Integer> values) {
            addCriterion("create_sex in", values, "createSex");
            return (Criteria) this;
        }

        public Criteria andCreateSexNotIn(List<Integer> values) {
            addCriterion("create_sex not in", values, "createSex");
            return (Criteria) this;
        }

        public Criteria andCreateSexBetween(Integer value1, Integer value2) {
            addCriterion("create_sex between", value1, value2, "createSex");
            return (Criteria) this;
        }

        public Criteria andCreateSexNotBetween(Integer value1, Integer value2) {
            addCriterion("create_sex not between", value1, value2, "createSex");
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
        
		
		 public Criteria andLikeQuery(ProRecom record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
        	
        				 if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		 }
						 if(record.getContent()!=null&&StrUtil.isNotEmpty(record.getContent().toString())) {
    			 list.add("ifnull(content,'')");
    		 }
						 if(record.getContentId()!=null&&StrUtil.isNotEmpty(record.getContentId().toString())) {
    			 list.add("ifnull(content_id,'')");
    		 }
						 if(record.getTitle()!=null&&StrUtil.isNotEmpty(record.getTitle().toString())) {
    			 list.add("ifnull(title,'')");
    		 }
						 if(record.getSummary()!=null&&StrUtil.isNotEmpty(record.getSummary().toString())) {
    			 list.add("ifnull(summary,'')");
    		 }
						 if(record.getTyp()!=null&&StrUtil.isNotEmpty(record.getTyp().toString())) {
    			 list.add("ifnull(typ,'')");
    		 }
						 if(record.getLikes()!=null&&StrUtil.isNotEmpty(record.getLikes().toString())) {
    			 list.add("ifnull(likes,'')");
    		 }
						 if(record.getFavorer()!=null&&StrUtil.isNotEmpty(record.getFavorer().toString())) {
    			 list.add("ifnull(favorer,'')");
    		 }
						 if(record.getCreator()!=null&&StrUtil.isNotEmpty(record.getCreator().toString())) {
    			 list.add("ifnull(creator,'')");
    		 }
						 if(record.getCreateAvat()!=null&&StrUtil.isNotEmpty(record.getCreateAvat().toString())) {
    			 list.add("ifnull(create_avat,'')");
    		 }
						 if(record.getCreateSex()!=null&&StrUtil.isNotEmpty(record.getCreateSex().toString())) {
    			 list.add("ifnull(create_sex,'')");
    		 }
						 if(record.getAdopt()!=null&&StrUtil.isNotEmpty(record.getAdopt().toString())) {
    			 list.add("ifnull(adopt,'')");
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
										 if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
        			list2.add("'%"+record.getId()+"%'");
        		 }
							 if(record.getContent()!=null&&StrUtil.isNotEmpty(record.getContent().toString())) {
        			list2.add("'%"+record.getContent()+"%'");
        		 }
							 if(record.getContentId()!=null&&StrUtil.isNotEmpty(record.getContentId().toString())) {
        			list2.add("'%"+record.getContentId()+"%'");
        		 }
							 if(record.getTitle()!=null&&StrUtil.isNotEmpty(record.getTitle().toString())) {
        			list2.add("'%"+record.getTitle()+"%'");
        		 }
							 if(record.getSummary()!=null&&StrUtil.isNotEmpty(record.getSummary().toString())) {
        			list2.add("'%"+record.getSummary()+"%'");
        		 }
							 if(record.getTyp()!=null&&StrUtil.isNotEmpty(record.getTyp().toString())) {
        			list2.add("'%"+record.getTyp()+"%'");
        		 }
							 if(record.getLikes()!=null&&StrUtil.isNotEmpty(record.getLikes().toString())) {
        			list2.add("'%"+record.getLikes()+"%'");
        		 }
							 if(record.getFavorer()!=null&&StrUtil.isNotEmpty(record.getFavorer().toString())) {
        			list2.add("'%"+record.getFavorer()+"%'");
        		 }
							 if(record.getCreator()!=null&&StrUtil.isNotEmpty(record.getCreator().toString())) {
        			list2.add("'%"+record.getCreator()+"%'");
        		 }
							 if(record.getCreateAvat()!=null&&StrUtil.isNotEmpty(record.getCreateAvat().toString())) {
        			list2.add("'%"+record.getCreateAvat()+"%'");
        		 }
							 if(record.getCreateSex()!=null&&StrUtil.isNotEmpty(record.getCreateSex().toString())) {
        			list2.add("'%"+record.getCreateSex()+"%'");
        		 }
							 if(record.getAdopt()!=null&&StrUtil.isNotEmpty(record.getAdopt().toString())) {
        			list2.add("'%"+record.getAdopt()+"%'");
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