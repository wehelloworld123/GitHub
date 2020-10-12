package com.fc.test.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;
/**
 * 用户创作采纳表 ProUserAdoptExample
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-30 23:53:45
 */
public class ProUserAdoptExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProUserAdoptExample() {
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
        
			
        public Criteria andProNoIsNull() {
            addCriterion("pro_no is null");
            return (Criteria) this;
        }

        public Criteria andProNoIsNotNull() {
            addCriterion("pro_no is not null");
            return (Criteria) this;
        }

        public Criteria andProNoEqualTo(String value) {
            addCriterion("pro_no =", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotEqualTo(String value) {
            addCriterion("pro_no <>", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoGreaterThan(String value) {
            addCriterion("pro_no >", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoGreaterThanOrEqualTo(String value) {
            addCriterion("pro_no >=", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoLessThan(String value) {
            addCriterion("pro_no <", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoLessThanOrEqualTo(String value) {
            addCriterion("pro_no <=", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoLike(String value) {
            addCriterion("pro_no like", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotLike(String value) {
            addCriterion("pro_no not like", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoIn(List<String> values) {
            addCriterion("pro_no in", values, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotIn(List<String> values) {
            addCriterion("pro_no not in", values, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoBetween(String value1, String value2) {
            addCriterion("pro_no between", value1, value2, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotBetween(String value1, String value2) {
            addCriterion("pro_no not between", value1, value2, "proNo");
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
        
			
        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }
        
			
        public Criteria andLiterTextIsNull() {
            addCriterion("liter_text is null");
            return (Criteria) this;
        }

        public Criteria andLiterTextIsNotNull() {
            addCriterion("liter_text is not null");
            return (Criteria) this;
        }

        public Criteria andLiterTextEqualTo(String value) {
            addCriterion("liter_text =", value, "literText");
            return (Criteria) this;
        }

        public Criteria andLiterTextNotEqualTo(String value) {
            addCriterion("liter_text <>", value, "literText");
            return (Criteria) this;
        }

        public Criteria andLiterTextGreaterThan(String value) {
            addCriterion("liter_text >", value, "literText");
            return (Criteria) this;
        }

        public Criteria andLiterTextGreaterThanOrEqualTo(String value) {
            addCriterion("liter_text >=", value, "literText");
            return (Criteria) this;
        }

        public Criteria andLiterTextLessThan(String value) {
            addCriterion("liter_text <", value, "literText");
            return (Criteria) this;
        }

        public Criteria andLiterTextLessThanOrEqualTo(String value) {
            addCriterion("liter_text <=", value, "literText");
            return (Criteria) this;
        }

        public Criteria andLiterTextLike(String value) {
            addCriterion("liter_text like", value, "literText");
            return (Criteria) this;
        }

        public Criteria andLiterTextNotLike(String value) {
            addCriterion("liter_text not like", value, "literText");
            return (Criteria) this;
        }

        public Criteria andLiterTextIn(List<String> values) {
            addCriterion("liter_text in", values, "literText");
            return (Criteria) this;
        }

        public Criteria andLiterTextNotIn(List<String> values) {
            addCriterion("liter_text not in", values, "literText");
            return (Criteria) this;
        }

        public Criteria andLiterTextBetween(String value1, String value2) {
            addCriterion("liter_text between", value1, value2, "literText");
            return (Criteria) this;
        }

        public Criteria andLiterTextNotBetween(String value1, String value2) {
            addCriterion("liter_text not between", value1, value2, "literText");
            return (Criteria) this;
        }
        
			
        public Criteria andCreationIdIsNull() {
            addCriterion("creation_id is null");
            return (Criteria) this;
        }

        public Criteria andCreationIdIsNotNull() {
            addCriterion("creation_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreationIdEqualTo(String value) {
            addCriterion("creation_id =", value, "creationId");
            return (Criteria) this;
        }

        public Criteria andCreationIdNotEqualTo(String value) {
            addCriterion("creation_id <>", value, "creationId");
            return (Criteria) this;
        }

        public Criteria andCreationIdGreaterThan(String value) {
            addCriterion("creation_id >", value, "creationId");
            return (Criteria) this;
        }

        public Criteria andCreationIdGreaterThanOrEqualTo(String value) {
            addCriterion("creation_id >=", value, "creationId");
            return (Criteria) this;
        }

        public Criteria andCreationIdLessThan(String value) {
            addCriterion("creation_id <", value, "creationId");
            return (Criteria) this;
        }

        public Criteria andCreationIdLessThanOrEqualTo(String value) {
            addCriterion("creation_id <=", value, "creationId");
            return (Criteria) this;
        }

        public Criteria andCreationIdLike(String value) {
            addCriterion("creation_id like", value, "creationId");
            return (Criteria) this;
        }

        public Criteria andCreationIdNotLike(String value) {
            addCriterion("creation_id not like", value, "creationId");
            return (Criteria) this;
        }

        public Criteria andCreationIdIn(List<String> values) {
            addCriterion("creation_id in", values, "creationId");
            return (Criteria) this;
        }

        public Criteria andCreationIdNotIn(List<String> values) {
            addCriterion("creation_id not in", values, "creationId");
            return (Criteria) this;
        }

        public Criteria andCreationIdBetween(String value1, String value2) {
            addCriterion("creation_id between", value1, value2, "creationId");
            return (Criteria) this;
        }

        public Criteria andCreationIdNotBetween(String value1, String value2) {
            addCriterion("creation_id not between", value1, value2, "creationId");
            return (Criteria) this;
        }
        
			
        public Criteria andCreationNmIsNull() {
            addCriterion("creation_nm is null");
            return (Criteria) this;
        }

        public Criteria andCreationNmIsNotNull() {
            addCriterion("creation_nm is not null");
            return (Criteria) this;
        }

        public Criteria andCreationNmEqualTo(String value) {
            addCriterion("creation_nm =", value, "creationNm");
            return (Criteria) this;
        }

        public Criteria andCreationNmNotEqualTo(String value) {
            addCriterion("creation_nm <>", value, "creationNm");
            return (Criteria) this;
        }

        public Criteria andCreationNmGreaterThan(String value) {
            addCriterion("creation_nm >", value, "creationNm");
            return (Criteria) this;
        }

        public Criteria andCreationNmGreaterThanOrEqualTo(String value) {
            addCriterion("creation_nm >=", value, "creationNm");
            return (Criteria) this;
        }

        public Criteria andCreationNmLessThan(String value) {
            addCriterion("creation_nm <", value, "creationNm");
            return (Criteria) this;
        }

        public Criteria andCreationNmLessThanOrEqualTo(String value) {
            addCriterion("creation_nm <=", value, "creationNm");
            return (Criteria) this;
        }

        public Criteria andCreationNmLike(String value) {
            addCriterion("creation_nm like", value, "creationNm");
            return (Criteria) this;
        }

        public Criteria andCreationNmNotLike(String value) {
            addCriterion("creation_nm not like", value, "creationNm");
            return (Criteria) this;
        }

        public Criteria andCreationNmIn(List<String> values) {
            addCriterion("creation_nm in", values, "creationNm");
            return (Criteria) this;
        }

        public Criteria andCreationNmNotIn(List<String> values) {
            addCriterion("creation_nm not in", values, "creationNm");
            return (Criteria) this;
        }

        public Criteria andCreationNmBetween(String value1, String value2) {
            addCriterion("creation_nm between", value1, value2, "creationNm");
            return (Criteria) this;
        }

        public Criteria andCreationNmNotBetween(String value1, String value2) {
            addCriterion("creation_nm not between", value1, value2, "creationNm");
            return (Criteria) this;
        }
        
			
        public Criteria andCharpNmIsNull() {
            addCriterion("charp_nm is null");
            return (Criteria) this;
        }

        public Criteria andCharpNmIsNotNull() {
            addCriterion("charp_nm is not null");
            return (Criteria) this;
        }

        public Criteria andCharpNmEqualTo(String value) {
            addCriterion("charp_nm =", value, "charpNm");
            return (Criteria) this;
        }

        public Criteria andCharpNmNotEqualTo(String value) {
            addCriterion("charp_nm <>", value, "charpNm");
            return (Criteria) this;
        }

        public Criteria andCharpNmGreaterThan(String value) {
            addCriterion("charp_nm >", value, "charpNm");
            return (Criteria) this;
        }

        public Criteria andCharpNmGreaterThanOrEqualTo(String value) {
            addCriterion("charp_nm >=", value, "charpNm");
            return (Criteria) this;
        }

        public Criteria andCharpNmLessThan(String value) {
            addCriterion("charp_nm <", value, "charpNm");
            return (Criteria) this;
        }

        public Criteria andCharpNmLessThanOrEqualTo(String value) {
            addCriterion("charp_nm <=", value, "charpNm");
            return (Criteria) this;
        }

        public Criteria andCharpNmLike(String value) {
            addCriterion("charp_nm like", value, "charpNm");
            return (Criteria) this;
        }

        public Criteria andCharpNmNotLike(String value) {
            addCriterion("charp_nm not like", value, "charpNm");
            return (Criteria) this;
        }

        public Criteria andCharpNmIn(List<String> values) {
            addCriterion("charp_nm in", values, "charpNm");
            return (Criteria) this;
        }

        public Criteria andCharpNmNotIn(List<String> values) {
            addCriterion("charp_nm not in", values, "charpNm");
            return (Criteria) this;
        }

        public Criteria andCharpNmBetween(String value1, String value2) {
            addCriterion("charp_nm between", value1, value2, "charpNm");
            return (Criteria) this;
        }

        public Criteria andCharpNmNotBetween(String value1, String value2) {
            addCriterion("charp_nm not between", value1, value2, "charpNm");
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
        
			
        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }
        
			
        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }
        
			
        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
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
        
		
		 public Criteria andLikeQuery(ProUserAdopt record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
        	
        				 if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		 }
						 if(record.getProNo()!=null&&StrUtil.isNotEmpty(record.getProNo().toString())) {
    			 list.add("ifnull(pro_no,'')");
    		 }
						 if(record.getTitle()!=null&&StrUtil.isNotEmpty(record.getTitle().toString())) {
    			 list.add("ifnull(title,'')");
    		 }
						 if(record.getContent()!=null&&StrUtil.isNotEmpty(record.getContent().toString())) {
    			 list.add("ifnull(content,'')");
    		 }
						 if(record.getPicture()!=null&&StrUtil.isNotEmpty(record.getPicture().toString())) {
    			 list.add("ifnull(picture,'')");
    		 }
						 if(record.getLiterText()!=null&&StrUtil.isNotEmpty(record.getLiterText().toString())) {
    			 list.add("ifnull(liter_text,'')");
    		 }
						 if(record.getCreationId()!=null&&StrUtil.isNotEmpty(record.getCreationId().toString())) {
    			 list.add("ifnull(creation_id,'')");
    		 }
						 if(record.getCreationNm()!=null&&StrUtil.isNotEmpty(record.getCreationNm().toString())) {
    			 list.add("ifnull(creation_nm,'')");
    		 }
						 if(record.getCharpNm()!=null&&StrUtil.isNotEmpty(record.getCharpNm().toString())) {
    			 list.add("ifnull(charp_nm,'')");
    		 }
						 if(record.getCharpId()!=null&&StrUtil.isNotEmpty(record.getCharpId().toString())) {
    			 list.add("ifnull(charp_id,'')");
    		 }
						 if(record.getContentId()!=null&&StrUtil.isNotEmpty(record.getContentId().toString())) {
    			 list.add("ifnull(content_id,'')");
    		 }
						 if(record.getTyp()!=null&&StrUtil.isNotEmpty(record.getTyp().toString())) {
    			 list.add("ifnull(typ,'')");
    		 }
						 if(record.getUserId()!=null&&StrUtil.isNotEmpty(record.getUserId().toString())) {
    			 list.add("ifnull(user_id,'')");
    		 }
						 if(record.getNickname()!=null&&StrUtil.isNotEmpty(record.getNickname().toString())) {
    			 list.add("ifnull(nickname,'')");
    		 }
						 if(record.getAvatar()!=null&&StrUtil.isNotEmpty(record.getAvatar().toString())) {
    			 list.add("ifnull(avatar,'')");
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
						 if(record.getSeter()!=null&&StrUtil.isNotEmpty(record.getSeter().toString())) {
    			 list.add("ifnull(seter,'')");
    		 }
										 if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
        			list2.add("'%"+record.getId()+"%'");
        		 }
							 if(record.getProNo()!=null&&StrUtil.isNotEmpty(record.getProNo().toString())) {
        			list2.add("'%"+record.getProNo()+"%'");
        		 }
							 if(record.getTitle()!=null&&StrUtil.isNotEmpty(record.getTitle().toString())) {
        			list2.add("'%"+record.getTitle()+"%'");
        		 }
							 if(record.getContent()!=null&&StrUtil.isNotEmpty(record.getContent().toString())) {
        			list2.add("'%"+record.getContent()+"%'");
        		 }
							 if(record.getPicture()!=null&&StrUtil.isNotEmpty(record.getPicture().toString())) {
        			list2.add("'%"+record.getPicture()+"%'");
        		 }
							 if(record.getLiterText()!=null&&StrUtil.isNotEmpty(record.getLiterText().toString())) {
        			list2.add("'%"+record.getLiterText()+"%'");
        		 }
							 if(record.getCreationId()!=null&&StrUtil.isNotEmpty(record.getCreationId().toString())) {
        			list2.add("'%"+record.getCreationId()+"%'");
        		 }
							 if(record.getCreationNm()!=null&&StrUtil.isNotEmpty(record.getCreationNm().toString())) {
        			list2.add("'%"+record.getCreationNm()+"%'");
        		 }
							 if(record.getCharpNm()!=null&&StrUtil.isNotEmpty(record.getCharpNm().toString())) {
        			list2.add("'%"+record.getCharpNm()+"%'");
        		 }
							 if(record.getCharpId()!=null&&StrUtil.isNotEmpty(record.getCharpId().toString())) {
        			list2.add("'%"+record.getCharpId()+"%'");
        		 }
							 if(record.getContentId()!=null&&StrUtil.isNotEmpty(record.getContentId().toString())) {
        			list2.add("'%"+record.getContentId()+"%'");
        		 }
							 if(record.getTyp()!=null&&StrUtil.isNotEmpty(record.getTyp().toString())) {
        			list2.add("'%"+record.getTyp()+"%'");
        		 }
							 if(record.getUserId()!=null&&StrUtil.isNotEmpty(record.getUserId().toString())) {
        			list2.add("'%"+record.getUserId()+"%'");
        		 }
							 if(record.getNickname()!=null&&StrUtil.isNotEmpty(record.getNickname().toString())) {
        			list2.add("'%"+record.getNickname()+"%'");
        		 }
							 if(record.getAvatar()!=null&&StrUtil.isNotEmpty(record.getAvatar().toString())) {
        			list2.add("'%"+record.getAvatar()+"%'");
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
							 if(record.getSeter()!=null&&StrUtil.isNotEmpty(record.getSeter().toString())) {
        			list2.add("'%"+record.getSeter()+"%'");
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