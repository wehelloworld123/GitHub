package com.fc.test.model.auto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;
/**
 * 作品版权分配表 ProCopyrightExample
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-18 00:08:57
 */
public class ProCopyrightExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProCopyrightExample() {
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
        
			
        public Criteria andCreateTypIsNull() {
            addCriterion("createTyp is null");
            return (Criteria) this;
        }

        public Criteria andCreateTypIsNotNull() {
            addCriterion("createTyp is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTypEqualTo(Integer value) {
            addCriterion("createTyp =", value, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypNotEqualTo(Integer value) {
            addCriterion("createTyp <>", value, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypGreaterThan(Integer value) {
            addCriterion("createTyp >", value, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypGreaterThanOrEqualTo(Integer value) {
            addCriterion("createTyp >=", value, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypLessThan(Integer value) {
            addCriterion("createTyp <", value, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypLessThanOrEqualTo(Integer value) {
            addCriterion("createTyp <=", value, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypLike(Integer value) {
            addCriterion("createTyp like", value, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypNotLike(Integer value) {
            addCriterion("createTyp not like", value, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypIn(List<Integer> values) {
            addCriterion("createTyp in", values, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypNotIn(List<Integer> values) {
            addCriterion("createTyp not in", values, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypBetween(Integer value1, Integer value2) {
            addCriterion("createTyp between", value1, value2, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypNotBetween(Integer value1, Integer value2) {
            addCriterion("createTyp not between", value1, value2, "createTyp");
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

        public Criteria andCopyrightEqualTo(BigDecimal value) {
            addCriterion("copyright =", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotEqualTo(BigDecimal value) {
            addCriterion("copyright <>", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThan(BigDecimal value) {
            addCriterion("copyright >", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("copyright >=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThan(BigDecimal value) {
            addCriterion("copyright <", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("copyright <=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLike(BigDecimal value) {
            addCriterion("copyright like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotLike(BigDecimal value) {
            addCriterion("copyright not like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightIn(List<BigDecimal> values) {
            addCriterion("copyright in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotIn(List<BigDecimal> values) {
            addCriterion("copyright not in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("copyright between", value1, value2, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("copyright not between", value1, value2, "copyright");
            return (Criteria) this;
        }
        
			
        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }
        
			
        public Criteria andAuthorIdIsNull() {
            addCriterion("author_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNotNull() {
            addCriterion("author_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdEqualTo(String value) {
            addCriterion("author_id =", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotEqualTo(String value) {
            addCriterion("author_id <>", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThan(String value) {
            addCriterion("author_id >", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThanOrEqualTo(String value) {
            addCriterion("author_id >=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThan(String value) {
            addCriterion("author_id <", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThanOrEqualTo(String value) {
            addCriterion("author_id <=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLike(String value) {
            addCriterion("author_id like", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotLike(String value) {
            addCriterion("author_id not like", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIn(List<String> values) {
            addCriterion("author_id in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotIn(List<String> values) {
            addCriterion("author_id not in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdBetween(String value1, String value2) {
            addCriterion("author_id between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotBetween(String value1, String value2) {
            addCriterion("author_id not between", value1, value2, "authorId");
            return (Criteria) this;
        }
        
			
        public Criteria andFileStrIsNull() {
            addCriterion("file_str is null");
            return (Criteria) this;
        }

        public Criteria andFileStrIsNotNull() {
            addCriterion("file_str is not null");
            return (Criteria) this;
        }

        public Criteria andFileStrEqualTo(String value) {
            addCriterion("file_str =", value, "fileStr");
            return (Criteria) this;
        }

        public Criteria andFileStrNotEqualTo(String value) {
            addCriterion("file_str <>", value, "fileStr");
            return (Criteria) this;
        }

        public Criteria andFileStrGreaterThan(String value) {
            addCriterion("file_str >", value, "fileStr");
            return (Criteria) this;
        }

        public Criteria andFileStrGreaterThanOrEqualTo(String value) {
            addCriterion("file_str >=", value, "fileStr");
            return (Criteria) this;
        }

        public Criteria andFileStrLessThan(String value) {
            addCriterion("file_str <", value, "fileStr");
            return (Criteria) this;
        }

        public Criteria andFileStrLessThanOrEqualTo(String value) {
            addCriterion("file_str <=", value, "fileStr");
            return (Criteria) this;
        }

        public Criteria andFileStrLike(String value) {
            addCriterion("file_str like", value, "fileStr");
            return (Criteria) this;
        }

        public Criteria andFileStrNotLike(String value) {
            addCriterion("file_str not like", value, "fileStr");
            return (Criteria) this;
        }

        public Criteria andFileStrIn(List<String> values) {
            addCriterion("file_str in", values, "fileStr");
            return (Criteria) this;
        }

        public Criteria andFileStrNotIn(List<String> values) {
            addCriterion("file_str not in", values, "fileStr");
            return (Criteria) this;
        }

        public Criteria andFileStrBetween(String value1, String value2) {
            addCriterion("file_str between", value1, value2, "fileStr");
            return (Criteria) this;
        }

        public Criteria andFileStrNotBetween(String value1, String value2) {
            addCriterion("file_str not between", value1, value2, "fileStr");
            return (Criteria) this;
        }
        
			
        public Criteria andAllotTypeIsNull() {
            addCriterion("allotType is null");
            return (Criteria) this;
        }

        public Criteria andAllotTypeIsNotNull() {
            addCriterion("allotType is not null");
            return (Criteria) this;
        }

        public Criteria andAllotTypeEqualTo(String value) {
            addCriterion("allotType =", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeNotEqualTo(String value) {
            addCriterion("allotType <>", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeGreaterThan(String value) {
            addCriterion("allotType >", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeGreaterThanOrEqualTo(String value) {
            addCriterion("allotType >=", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeLessThan(String value) {
            addCriterion("allotType <", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeLessThanOrEqualTo(String value) {
            addCriterion("allotType <=", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeLike(String value) {
            addCriterion("allotType like", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeNotLike(String value) {
            addCriterion("allotType not like", value, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeIn(List<String> values) {
            addCriterion("allotType in", values, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeNotIn(List<String> values) {
            addCriterion("allotType not in", values, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeBetween(String value1, String value2) {
            addCriterion("allotType between", value1, value2, "allotType");
            return (Criteria) this;
        }

        public Criteria andAllotTypeNotBetween(String value1, String value2) {
            addCriterion("allotType not between", value1, value2, "allotType");
            return (Criteria) this;
        }
        
			
        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("role like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("role not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("role not between", value1, value2, "role");
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
        
		
		 public Criteria andLikeQuery(ProCopyright record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
        	
        				 if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		 }
						 if(record.getProNo()!=null&&StrUtil.isNotEmpty(record.getProNo().toString())) {
    			 list.add("ifnull(pro_no,'')");
    		 }
						 if(record.getCreationId()!=null&&StrUtil.isNotEmpty(record.getCreationId().toString())) {
    			 list.add("ifnull(creation_id,'')");
    		 }
						 if(record.getCreateTyp()!=null&&StrUtil.isNotEmpty(record.getCreateTyp().toString())) {
    			 list.add("ifnull(createTyp,'')");
    		 }
						 if(record.getCopyright()!=null&&StrUtil.isNotEmpty(record.getCopyright().toString())) {
    			 list.add("ifnull(copyright,'')");
    		 }
						 if(record.getAuthor()!=null&&StrUtil.isNotEmpty(record.getAuthor().toString())) {
    			 list.add("ifnull(author,'')");
    		 }
						 if(record.getAuthorId()!=null&&StrUtil.isNotEmpty(record.getAuthorId().toString())) {
    			 list.add("ifnull(author_id,'')");
    		 }
						 if(record.getFileStr()!=null&&StrUtil.isNotEmpty(record.getFileStr().toString())) {
    			 list.add("ifnull(file_str,'')");
    		 }
						 if(record.getAllotType()!=null&&StrUtil.isNotEmpty(record.getAllotType().toString())) {
    			 list.add("ifnull(allotType,'')");
    		 }
						 if(record.getRole()!=null&&StrUtil.isNotEmpty(record.getRole().toString())) {
    			 list.add("ifnull(role,'')");
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
							 if(record.getProNo()!=null&&StrUtil.isNotEmpty(record.getProNo().toString())) {
        			list2.add("'%"+record.getProNo()+"%'");
        		 }
							 if(record.getCreationId()!=null&&StrUtil.isNotEmpty(record.getCreationId().toString())) {
        			list2.add("'%"+record.getCreationId()+"%'");
        		 }
							 if(record.getCreateTyp()!=null&&StrUtil.isNotEmpty(record.getCreateTyp().toString())) {
        			list2.add("'%"+record.getCreateTyp()+"%'");
        		 }
							 if(record.getCopyright()!=null&&StrUtil.isNotEmpty(record.getCopyright().toString())) {
        			list2.add("'%"+record.getCopyright()+"%'");
        		 }
							 if(record.getAuthor()!=null&&StrUtil.isNotEmpty(record.getAuthor().toString())) {
        			list2.add("'%"+record.getAuthor()+"%'");
        		 }
							 if(record.getAuthorId()!=null&&StrUtil.isNotEmpty(record.getAuthorId().toString())) {
        			list2.add("'%"+record.getAuthorId()+"%'");
        		 }
							 if(record.getFileStr()!=null&&StrUtil.isNotEmpty(record.getFileStr().toString())) {
        			list2.add("'%"+record.getFileStr()+"%'");
        		 }
							 if(record.getAllotType()!=null&&StrUtil.isNotEmpty(record.getAllotType().toString())) {
        			list2.add("'%"+record.getAllotType()+"%'");
        		 }
							 if(record.getRole()!=null&&StrUtil.isNotEmpty(record.getRole().toString())) {
        			list2.add("'%"+record.getRole()+"%'");
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