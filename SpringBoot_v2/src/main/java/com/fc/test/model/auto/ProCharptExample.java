package com.fc.test.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;
/**
 * 文学作品章节 ProCharptExample
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-06-30 16:41:40
 */
public class ProCharptExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProCharptExample() {
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
        
			
        public Criteria andIntroduceIsNull() {
            addCriterion("introduce is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNotNull() {
            addCriterion("introduce is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceEqualTo(String value) {
            addCriterion("introduce =", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotEqualTo(String value) {
            addCriterion("introduce <>", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThan(String value) {
            addCriterion("introduce >", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("introduce >=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThan(String value) {
            addCriterion("introduce <", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThanOrEqualTo(String value) {
            addCriterion("introduce <=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLike(String value) {
            addCriterion("introduce like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotLike(String value) {
            addCriterion("introduce not like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceIn(List<String> values) {
            addCriterion("introduce in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotIn(List<String> values) {
            addCriterion("introduce not in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceBetween(String value1, String value2) {
            addCriterion("introduce between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotBetween(String value1, String value2) {
            addCriterion("introduce not between", value1, value2, "introduce");
            return (Criteria) this;
        }
        
			
        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }
        
			
        public Criteria andRequirementIsNull() {
            addCriterion("requirement is null");
            return (Criteria) this;
        }

        public Criteria andRequirementIsNotNull() {
            addCriterion("requirement is not null");
            return (Criteria) this;
        }

        public Criteria andRequirementEqualTo(String value) {
            addCriterion("requirement =", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotEqualTo(String value) {
            addCriterion("requirement <>", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementGreaterThan(String value) {
            addCriterion("requirement >", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementGreaterThanOrEqualTo(String value) {
            addCriterion("requirement >=", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLessThan(String value) {
            addCriterion("requirement <", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLessThanOrEqualTo(String value) {
            addCriterion("requirement <=", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLike(String value) {
            addCriterion("requirement like", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotLike(String value) {
            addCriterion("requirement not like", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementIn(List<String> values) {
            addCriterion("requirement in", values, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotIn(List<String> values) {
            addCriterion("requirement not in", values, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementBetween(String value1, String value2) {
            addCriterion("requirement between", value1, value2, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotBetween(String value1, String value2) {
            addCriterion("requirement not between", value1, value2, "requirement");
            return (Criteria) this;
        }
        
			
        public Criteria andChapTypeIsNull() {
            addCriterion("chap_type is null");
            return (Criteria) this;
        }

        public Criteria andChapTypeIsNotNull() {
            addCriterion("chap_type is not null");
            return (Criteria) this;
        }

        public Criteria andChapTypeEqualTo(Integer value) {
            addCriterion("chap_type =", value, "chapType");
            return (Criteria) this;
        }

        public Criteria andChapTypeNotEqualTo(Integer value) {
            addCriterion("chap_type <>", value, "chapType");
            return (Criteria) this;
        }

        public Criteria andChapTypeGreaterThan(Integer value) {
            addCriterion("chap_type >", value, "chapType");
            return (Criteria) this;
        }

        public Criteria andChapTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("chap_type >=", value, "chapType");
            return (Criteria) this;
        }

        public Criteria andChapTypeLessThan(Integer value) {
            addCriterion("chap_type <", value, "chapType");
            return (Criteria) this;
        }

        public Criteria andChapTypeLessThanOrEqualTo(Integer value) {
            addCriterion("chap_type <=", value, "chapType");
            return (Criteria) this;
        }

        public Criteria andChapTypeLike(Integer value) {
            addCriterion("chap_type like", value, "chapType");
            return (Criteria) this;
        }

        public Criteria andChapTypeNotLike(Integer value) {
            addCriterion("chap_type not like", value, "chapType");
            return (Criteria) this;
        }

        public Criteria andChapTypeIn(List<Integer> values) {
            addCriterion("chap_type in", values, "chapType");
            return (Criteria) this;
        }

        public Criteria andChapTypeNotIn(List<Integer> values) {
            addCriterion("chap_type not in", values, "chapType");
            return (Criteria) this;
        }

        public Criteria andChapTypeBetween(Integer value1, Integer value2) {
            addCriterion("chap_type between", value1, value2, "chapType");
            return (Criteria) this;
        }

        public Criteria andChapTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("chap_type not between", value1, value2, "chapType");
            return (Criteria) this;
        }
        
			
        public Criteria andLabelIsNull() {
            addCriterion("label is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("label is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(String value) {
            addCriterion("label =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(String value) {
            addCriterion("label <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(String value) {
            addCriterion("label >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(String value) {
            addCriterion("label >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(String value) {
            addCriterion("label <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(String value) {
            addCriterion("label <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLike(String value) {
            addCriterion("label like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotLike(String value) {
            addCriterion("label not like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<String> values) {
            addCriterion("label in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<String> values) {
            addCriterion("label not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(String value1, String value2) {
            addCriterion("label between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(String value1, String value2) {
            addCriterion("label not between", value1, value2, "label");
            return (Criteria) this;
        }
        
			
        public Criteria andCreatorsIsNull() {
            addCriterion("creators is null");
            return (Criteria) this;
        }

        public Criteria andCreatorsIsNotNull() {
            addCriterion("creators is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorsEqualTo(Integer value) {
            addCriterion("creators =", value, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsNotEqualTo(Integer value) {
            addCriterion("creators <>", value, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsGreaterThan(Integer value) {
            addCriterion("creators >", value, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsGreaterThanOrEqualTo(Integer value) {
            addCriterion("creators >=", value, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsLessThan(Integer value) {
            addCriterion("creators <", value, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsLessThanOrEqualTo(Integer value) {
            addCriterion("creators <=", value, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsLike(Integer value) {
            addCriterion("creators like", value, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsNotLike(Integer value) {
            addCriterion("creators not like", value, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsIn(List<Integer> values) {
            addCriterion("creators in", values, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsNotIn(List<Integer> values) {
            addCriterion("creators not in", values, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsBetween(Integer value1, Integer value2) {
            addCriterion("creators between", value1, value2, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsNotBetween(Integer value1, Integer value2) {
            addCriterion("creators not between", value1, value2, "creators");
            return (Criteria) this;
        }
        
			
        public Criteria andRootIsNull() {
            addCriterion("root is null");
            return (Criteria) this;
        }

        public Criteria andRootIsNotNull() {
            addCriterion("root is not null");
            return (Criteria) this;
        }

        public Criteria andRootEqualTo(Integer value) {
            addCriterion("root =", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootNotEqualTo(Integer value) {
            addCriterion("root <>", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootGreaterThan(Integer value) {
            addCriterion("root >", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootGreaterThanOrEqualTo(Integer value) {
            addCriterion("root >=", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootLessThan(Integer value) {
            addCriterion("root <", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootLessThanOrEqualTo(Integer value) {
            addCriterion("root <=", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootLike(Integer value) {
            addCriterion("root like", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootNotLike(Integer value) {
            addCriterion("root not like", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootIn(List<Integer> values) {
            addCriterion("root in", values, "root");
            return (Criteria) this;
        }

        public Criteria andRootNotIn(List<Integer> values) {
            addCriterion("root not in", values, "root");
            return (Criteria) this;
        }

        public Criteria andRootBetween(Integer value1, Integer value2) {
            addCriterion("root between", value1, value2, "root");
            return (Criteria) this;
        }

        public Criteria andRootNotBetween(Integer value1, Integer value2) {
            addCriterion("root not between", value1, value2, "root");
            return (Criteria) this;
        }
        
			
        public Criteria andRootIdIsNull() {
            addCriterion("root_id is null");
            return (Criteria) this;
        }

        public Criteria andRootIdIsNotNull() {
            addCriterion("root_id is not null");
            return (Criteria) this;
        }

        public Criteria andRootIdEqualTo(Long value) {
            addCriterion("root_id =", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdNotEqualTo(Long value) {
            addCriterion("root_id <>", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdGreaterThan(Long value) {
            addCriterion("root_id >", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdGreaterThanOrEqualTo(Long value) {
            addCriterion("root_id >=", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdLessThan(Long value) {
            addCriterion("root_id <", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdLessThanOrEqualTo(Long value) {
            addCriterion("root_id <=", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdLike(Long value) {
            addCriterion("root_id like", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdNotLike(Long value) {
            addCriterion("root_id not like", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdIn(List<Long> values) {
            addCriterion("root_id in", values, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdNotIn(List<Long> values) {
            addCriterion("root_id not in", values, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdBetween(Long value1, Long value2) {
            addCriterion("root_id between", value1, value2, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdNotBetween(Long value1, Long value2) {
            addCriterion("root_id not between", value1, value2, "rootId");
            return (Criteria) this;
        }
        
			
        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(String value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(String value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(String value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(String value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(String value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(String value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLike(String value) {
            addCriterion("book_id like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotLike(String value) {
            addCriterion("book_id not like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<String> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<String> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(String value1, String value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(String value1, String value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }
        
			
        public Criteria andPaintIdIsNull() {
            addCriterion("paint_id is null");
            return (Criteria) this;
        }

        public Criteria andPaintIdIsNotNull() {
            addCriterion("paint_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaintIdEqualTo(Long value) {
            addCriterion("paint_id =", value, "paintId");
            return (Criteria) this;
        }

        public Criteria andPaintIdNotEqualTo(Long value) {
            addCriterion("paint_id <>", value, "paintId");
            return (Criteria) this;
        }

        public Criteria andPaintIdGreaterThan(Long value) {
            addCriterion("paint_id >", value, "paintId");
            return (Criteria) this;
        }

        public Criteria andPaintIdGreaterThanOrEqualTo(Long value) {
            addCriterion("paint_id >=", value, "paintId");
            return (Criteria) this;
        }

        public Criteria andPaintIdLessThan(Long value) {
            addCriterion("paint_id <", value, "paintId");
            return (Criteria) this;
        }

        public Criteria andPaintIdLessThanOrEqualTo(Long value) {
            addCriterion("paint_id <=", value, "paintId");
            return (Criteria) this;
        }

        public Criteria andPaintIdLike(Long value) {
            addCriterion("paint_id like", value, "paintId");
            return (Criteria) this;
        }

        public Criteria andPaintIdNotLike(Long value) {
            addCriterion("paint_id not like", value, "paintId");
            return (Criteria) this;
        }

        public Criteria andPaintIdIn(List<Long> values) {
            addCriterion("paint_id in", values, "paintId");
            return (Criteria) this;
        }

        public Criteria andPaintIdNotIn(List<Long> values) {
            addCriterion("paint_id not in", values, "paintId");
            return (Criteria) this;
        }

        public Criteria andPaintIdBetween(Long value1, Long value2) {
            addCriterion("paint_id between", value1, value2, "paintId");
            return (Criteria) this;
        }

        public Criteria andPaintIdNotBetween(Long value1, Long value2) {
            addCriterion("paint_id not between", value1, value2, "paintId");
            return (Criteria) this;
        }
        
			
        public Criteria andPoemIdIsNull() {
            addCriterion("poem_id is null");
            return (Criteria) this;
        }

        public Criteria andPoemIdIsNotNull() {
            addCriterion("poem_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoemIdEqualTo(Long value) {
            addCriterion("poem_id =", value, "poemId");
            return (Criteria) this;
        }

        public Criteria andPoemIdNotEqualTo(Long value) {
            addCriterion("poem_id <>", value, "poemId");
            return (Criteria) this;
        }

        public Criteria andPoemIdGreaterThan(Long value) {
            addCriterion("poem_id >", value, "poemId");
            return (Criteria) this;
        }

        public Criteria andPoemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("poem_id >=", value, "poemId");
            return (Criteria) this;
        }

        public Criteria andPoemIdLessThan(Long value) {
            addCriterion("poem_id <", value, "poemId");
            return (Criteria) this;
        }

        public Criteria andPoemIdLessThanOrEqualTo(Long value) {
            addCriterion("poem_id <=", value, "poemId");
            return (Criteria) this;
        }

        public Criteria andPoemIdLike(Long value) {
            addCriterion("poem_id like", value, "poemId");
            return (Criteria) this;
        }

        public Criteria andPoemIdNotLike(Long value) {
            addCriterion("poem_id not like", value, "poemId");
            return (Criteria) this;
        }

        public Criteria andPoemIdIn(List<Long> values) {
            addCriterion("poem_id in", values, "poemId");
            return (Criteria) this;
        }

        public Criteria andPoemIdNotIn(List<Long> values) {
            addCriterion("poem_id not in", values, "poemId");
            return (Criteria) this;
        }

        public Criteria andPoemIdBetween(Long value1, Long value2) {
            addCriterion("poem_id between", value1, value2, "poemId");
            return (Criteria) this;
        }

        public Criteria andPoemIdNotBetween(Long value1, Long value2) {
            addCriterion("poem_id not between", value1, value2, "poemId");
            return (Criteria) this;
        }
        
			
        public Criteria andRootOrdIsNull() {
            addCriterion("root_ord is null");
            return (Criteria) this;
        }

        public Criteria andRootOrdIsNotNull() {
            addCriterion("root_ord is not null");
            return (Criteria) this;
        }

        public Criteria andRootOrdEqualTo(Integer value) {
            addCriterion("root_ord =", value, "rootOrd");
            return (Criteria) this;
        }

        public Criteria andRootOrdNotEqualTo(Integer value) {
            addCriterion("root_ord <>", value, "rootOrd");
            return (Criteria) this;
        }

        public Criteria andRootOrdGreaterThan(Integer value) {
            addCriterion("root_ord >", value, "rootOrd");
            return (Criteria) this;
        }

        public Criteria andRootOrdGreaterThanOrEqualTo(Integer value) {
            addCriterion("root_ord >=", value, "rootOrd");
            return (Criteria) this;
        }

        public Criteria andRootOrdLessThan(Integer value) {
            addCriterion("root_ord <", value, "rootOrd");
            return (Criteria) this;
        }

        public Criteria andRootOrdLessThanOrEqualTo(Integer value) {
            addCriterion("root_ord <=", value, "rootOrd");
            return (Criteria) this;
        }

        public Criteria andRootOrdLike(Integer value) {
            addCriterion("root_ord like", value, "rootOrd");
            return (Criteria) this;
        }

        public Criteria andRootOrdNotLike(Integer value) {
            addCriterion("root_ord not like", value, "rootOrd");
            return (Criteria) this;
        }

        public Criteria andRootOrdIn(List<Integer> values) {
            addCriterion("root_ord in", values, "rootOrd");
            return (Criteria) this;
        }

        public Criteria andRootOrdNotIn(List<Integer> values) {
            addCriterion("root_ord not in", values, "rootOrd");
            return (Criteria) this;
        }

        public Criteria andRootOrdBetween(Integer value1, Integer value2) {
            addCriterion("root_ord between", value1, value2, "rootOrd");
            return (Criteria) this;
        }

        public Criteria andRootOrdNotBetween(Integer value1, Integer value2) {
            addCriterion("root_ord not between", value1, value2, "rootOrd");
            return (Criteria) this;
        }
        
			
        public Criteria andOrdIsNull() {
            addCriterion("ord is null");
            return (Criteria) this;
        }

        public Criteria andOrdIsNotNull() {
            addCriterion("ord is not null");
            return (Criteria) this;
        }

        public Criteria andOrdEqualTo(Integer value) {
            addCriterion("ord =", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdNotEqualTo(Integer value) {
            addCriterion("ord <>", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdGreaterThan(Integer value) {
            addCriterion("ord >", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ord >=", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdLessThan(Integer value) {
            addCriterion("ord <", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdLessThanOrEqualTo(Integer value) {
            addCriterion("ord <=", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdLike(Integer value) {
            addCriterion("ord like", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdNotLike(Integer value) {
            addCriterion("ord not like", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdIn(List<Integer> values) {
            addCriterion("ord in", values, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdNotIn(List<Integer> values) {
            addCriterion("ord not in", values, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdBetween(Integer value1, Integer value2) {
            addCriterion("ord between", value1, value2, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdNotBetween(Integer value1, Integer value2) {
            addCriterion("ord not between", value1, value2, "ord");
            return (Criteria) this;
        }
        
			
        public Criteria andIsLockIsNull() {
            addCriterion("is_lock is null");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNotNull() {
            addCriterion("is_lock is not null");
            return (Criteria) this;
        }

        public Criteria andIsLockEqualTo(Integer value) {
            addCriterion("is_lock =", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotEqualTo(Integer value) {
            addCriterion("is_lock <>", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThan(Integer value) {
            addCriterion("is_lock >", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_lock >=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThan(Integer value) {
            addCriterion("is_lock <", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThanOrEqualTo(Integer value) {
            addCriterion("is_lock <=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLike(Integer value) {
            addCriterion("is_lock like", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotLike(Integer value) {
            addCriterion("is_lock not like", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockIn(List<Integer> values) {
            addCriterion("is_lock in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotIn(List<Integer> values) {
            addCriterion("is_lock not in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockBetween(Integer value1, Integer value2) {
            addCriterion("is_lock between", value1, value2, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotBetween(Integer value1, Integer value2) {
            addCriterion("is_lock not between", value1, value2, "isLock");
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
        
		
		 public Criteria andLikeQuery(ProCharpt record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
        	
        				 if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		 }
						 if(record.getTitle()!=null&&StrUtil.isNotEmpty(record.getTitle().toString())) {
    			 list.add("ifnull(title,'')");
    		 }
						 if(record.getIntroduce()!=null&&StrUtil.isNotEmpty(record.getIntroduce().toString())) {
    			 list.add("ifnull(introduce,'')");
    		 }
						 if(record.getPic()!=null&&StrUtil.isNotEmpty(record.getPic().toString())) {
    			 list.add("ifnull(pic,'')");
    		 }
						 if(record.getRequirement()!=null&&StrUtil.isNotEmpty(record.getRequirement().toString())) {
    			 list.add("ifnull(requirement,'')");
    		 }
						 if(record.getChapType()!=null&&StrUtil.isNotEmpty(record.getChapType().toString())) {
    			 list.add("ifnull(chap_type,'')");
    		 }
						 if(record.getLabel()!=null&&StrUtil.isNotEmpty(record.getLabel().toString())) {
    			 list.add("ifnull(label,'')");
    		 }
						 if(record.getCreators()!=null&&StrUtil.isNotEmpty(record.getCreators().toString())) {
    			 list.add("ifnull(creators,'')");
    		 }
						 if(record.getRoot()!=null&&StrUtil.isNotEmpty(record.getRoot().toString())) {
    			 list.add("ifnull(root,'')");
    		 }
						 if(record.getRootId()!=null&&StrUtil.isNotEmpty(record.getRootId().toString())) {
    			 list.add("ifnull(root_id,'')");
    		 }
						 if(record.getBookId()!=null&&StrUtil.isNotEmpty(record.getBookId().toString())) {
    			 list.add("ifnull(book_id,'')");
    		 }
						 if(record.getPaintId()!=null&&StrUtil.isNotEmpty(record.getPaintId().toString())) {
    			 list.add("ifnull(paint_id,'')");
    		 }
						 if(record.getPoemId()!=null&&StrUtil.isNotEmpty(record.getPoemId().toString())) {
    			 list.add("ifnull(poem_id,'')");
    		 }
						 if(record.getRootOrd()!=null&&StrUtil.isNotEmpty(record.getRootOrd().toString())) {
    			 list.add("ifnull(root_ord,'')");
    		 }
						 if(record.getOrd()!=null&&StrUtil.isNotEmpty(record.getOrd().toString())) {
    			 list.add("ifnull(ord,'')");
    		 }
						 if(record.getIsLock()!=null&&StrUtil.isNotEmpty(record.getIsLock().toString())) {
    			 list.add("ifnull(is_lock,'')");
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
										 if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
        			list2.add("'%"+record.getId()+"%'");
        		 }
							 if(record.getTitle()!=null&&StrUtil.isNotEmpty(record.getTitle().toString())) {
        			list2.add("'%"+record.getTitle()+"%'");
        		 }
							 if(record.getIntroduce()!=null&&StrUtil.isNotEmpty(record.getIntroduce().toString())) {
        			list2.add("'%"+record.getIntroduce()+"%'");
        		 }
							 if(record.getPic()!=null&&StrUtil.isNotEmpty(record.getPic().toString())) {
        			list2.add("'%"+record.getPic()+"%'");
        		 }
							 if(record.getRequirement()!=null&&StrUtil.isNotEmpty(record.getRequirement().toString())) {
        			list2.add("'%"+record.getRequirement()+"%'");
        		 }
							 if(record.getChapType()!=null&&StrUtil.isNotEmpty(record.getChapType().toString())) {
        			list2.add("'%"+record.getChapType()+"%'");
        		 }
							 if(record.getLabel()!=null&&StrUtil.isNotEmpty(record.getLabel().toString())) {
        			list2.add("'%"+record.getLabel()+"%'");
        		 }
							 if(record.getCreators()!=null&&StrUtil.isNotEmpty(record.getCreators().toString())) {
        			list2.add("'%"+record.getCreators()+"%'");
        		 }
							 if(record.getRoot()!=null&&StrUtil.isNotEmpty(record.getRoot().toString())) {
        			list2.add("'%"+record.getRoot()+"%'");
        		 }
							 if(record.getRootId()!=null&&StrUtil.isNotEmpty(record.getRootId().toString())) {
        			list2.add("'%"+record.getRootId()+"%'");
        		 }
							 if(record.getBookId()!=null&&StrUtil.isNotEmpty(record.getBookId().toString())) {
        			list2.add("'%"+record.getBookId()+"%'");
        		 }
							 if(record.getPaintId()!=null&&StrUtil.isNotEmpty(record.getPaintId().toString())) {
        			list2.add("'%"+record.getPaintId()+"%'");
        		 }
							 if(record.getPoemId()!=null&&StrUtil.isNotEmpty(record.getPoemId().toString())) {
        			list2.add("'%"+record.getPoemId()+"%'");
        		 }
							 if(record.getRootOrd()!=null&&StrUtil.isNotEmpty(record.getRootOrd().toString())) {
        			list2.add("'%"+record.getRootOrd()+"%'");
        		 }
							 if(record.getOrd()!=null&&StrUtil.isNotEmpty(record.getOrd().toString())) {
        			list2.add("'%"+record.getOrd()+"%'");
        		 }
							 if(record.getIsLock()!=null&&StrUtil.isNotEmpty(record.getIsLock().toString())) {
        			list2.add("'%"+record.getIsLock()+"%'");
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