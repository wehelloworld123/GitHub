package com.fc.test.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;
/**
 * 标题信息表 DebTopicExample
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-10-12 10:26:06
 */
public class DebTopicExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DebTopicExample() {
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
        
			
        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }
        
			
        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(String value) {
            addCriterion("subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(String value) {
            addCriterion("subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(String value) {
            addCriterion("subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(String value) {
            addCriterion("subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(String value) {
            addCriterion("subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLike(String value) {
            addCriterion("subject_id like", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotLike(String value) {
            addCriterion("subject_id not like", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<String> values) {
            addCriterion("subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<String> values) {
            addCriterion("subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(String value1, String value2) {
            addCriterion("subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(String value1, String value2) {
            addCriterion("subject_id not between", value1, value2, "subjectId");
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
        
			
        public Criteria andLabel1IsNull() {
            addCriterion("label1 is null");
            return (Criteria) this;
        }

        public Criteria andLabel1IsNotNull() {
            addCriterion("label1 is not null");
            return (Criteria) this;
        }

        public Criteria andLabel1EqualTo(String value) {
            addCriterion("label1 =", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1NotEqualTo(String value) {
            addCriterion("label1 <>", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1GreaterThan(String value) {
            addCriterion("label1 >", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1GreaterThanOrEqualTo(String value) {
            addCriterion("label1 >=", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1LessThan(String value) {
            addCriterion("label1 <", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1LessThanOrEqualTo(String value) {
            addCriterion("label1 <=", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1Like(String value) {
            addCriterion("label1 like", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1NotLike(String value) {
            addCriterion("label1 not like", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1In(List<String> values) {
            addCriterion("label1 in", values, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1NotIn(List<String> values) {
            addCriterion("label1 not in", values, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1Between(String value1, String value2) {
            addCriterion("label1 between", value1, value2, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1NotBetween(String value1, String value2) {
            addCriterion("label1 not between", value1, value2, "label1");
            return (Criteria) this;
        }
        
			
        public Criteria andLabel2IsNull() {
            addCriterion("label2 is null");
            return (Criteria) this;
        }

        public Criteria andLabel2IsNotNull() {
            addCriterion("label2 is not null");
            return (Criteria) this;
        }

        public Criteria andLabel2EqualTo(String value) {
            addCriterion("label2 =", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2NotEqualTo(String value) {
            addCriterion("label2 <>", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2GreaterThan(String value) {
            addCriterion("label2 >", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2GreaterThanOrEqualTo(String value) {
            addCriterion("label2 >=", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2LessThan(String value) {
            addCriterion("label2 <", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2LessThanOrEqualTo(String value) {
            addCriterion("label2 <=", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2Like(String value) {
            addCriterion("label2 like", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2NotLike(String value) {
            addCriterion("label2 not like", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2In(List<String> values) {
            addCriterion("label2 in", values, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2NotIn(List<String> values) {
            addCriterion("label2 not in", values, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2Between(String value1, String value2) {
            addCriterion("label2 between", value1, value2, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2NotBetween(String value1, String value2) {
            addCriterion("label2 not between", value1, value2, "label2");
            return (Criteria) this;
        }
        
			
        public Criteria andLabel3IsNull() {
            addCriterion("label3 is null");
            return (Criteria) this;
        }

        public Criteria andLabel3IsNotNull() {
            addCriterion("label3 is not null");
            return (Criteria) this;
        }

        public Criteria andLabel3EqualTo(String value) {
            addCriterion("label3 =", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3NotEqualTo(String value) {
            addCriterion("label3 <>", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3GreaterThan(String value) {
            addCriterion("label3 >", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3GreaterThanOrEqualTo(String value) {
            addCriterion("label3 >=", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3LessThan(String value) {
            addCriterion("label3 <", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3LessThanOrEqualTo(String value) {
            addCriterion("label3 <=", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3Like(String value) {
            addCriterion("label3 like", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3NotLike(String value) {
            addCriterion("label3 not like", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3In(List<String> values) {
            addCriterion("label3 in", values, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3NotIn(List<String> values) {
            addCriterion("label3 not in", values, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3Between(String value1, String value2) {
            addCriterion("label3 between", value1, value2, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3NotBetween(String value1, String value2) {
            addCriterion("label3 not between", value1, value2, "label3");
            return (Criteria) this;
        }
        
			
        public Criteria andThinkingIsNull() {
            addCriterion("thinking is null");
            return (Criteria) this;
        }

        public Criteria andThinkingIsNotNull() {
            addCriterion("thinking is not null");
            return (Criteria) this;
        }

        public Criteria andThinkingEqualTo(Integer value) {
            addCriterion("thinking =", value, "thinking");
            return (Criteria) this;
        }

        public Criteria andThinkingNotEqualTo(Integer value) {
            addCriterion("thinking <>", value, "thinking");
            return (Criteria) this;
        }

        public Criteria andThinkingGreaterThan(Integer value) {
            addCriterion("thinking >", value, "thinking");
            return (Criteria) this;
        }

        public Criteria andThinkingGreaterThanOrEqualTo(Integer value) {
            addCriterion("thinking >=", value, "thinking");
            return (Criteria) this;
        }

        public Criteria andThinkingLessThan(Integer value) {
            addCriterion("thinking <", value, "thinking");
            return (Criteria) this;
        }

        public Criteria andThinkingLessThanOrEqualTo(Integer value) {
            addCriterion("thinking <=", value, "thinking");
            return (Criteria) this;
        }

        public Criteria andThinkingLike(Integer value) {
            addCriterion("thinking like", value, "thinking");
            return (Criteria) this;
        }

        public Criteria andThinkingNotLike(Integer value) {
            addCriterion("thinking not like", value, "thinking");
            return (Criteria) this;
        }

        public Criteria andThinkingIn(List<Integer> values) {
            addCriterion("thinking in", values, "thinking");
            return (Criteria) this;
        }

        public Criteria andThinkingNotIn(List<Integer> values) {
            addCriterion("thinking not in", values, "thinking");
            return (Criteria) this;
        }

        public Criteria andThinkingBetween(Integer value1, Integer value2) {
            addCriterion("thinking between", value1, value2, "thinking");
            return (Criteria) this;
        }

        public Criteria andThinkingNotBetween(Integer value1, Integer value2) {
            addCriterion("thinking not between", value1, value2, "thinking");
            return (Criteria) this;
        }
        
			
        public Criteria andFlexibilityIsNull() {
            addCriterion("flexibility is null");
            return (Criteria) this;
        }

        public Criteria andFlexibilityIsNotNull() {
            addCriterion("flexibility is not null");
            return (Criteria) this;
        }

        public Criteria andFlexibilityEqualTo(Integer value) {
            addCriterion("flexibility =", value, "flexibility");
            return (Criteria) this;
        }

        public Criteria andFlexibilityNotEqualTo(Integer value) {
            addCriterion("flexibility <>", value, "flexibility");
            return (Criteria) this;
        }

        public Criteria andFlexibilityGreaterThan(Integer value) {
            addCriterion("flexibility >", value, "flexibility");
            return (Criteria) this;
        }

        public Criteria andFlexibilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("flexibility >=", value, "flexibility");
            return (Criteria) this;
        }

        public Criteria andFlexibilityLessThan(Integer value) {
            addCriterion("flexibility <", value, "flexibility");
            return (Criteria) this;
        }

        public Criteria andFlexibilityLessThanOrEqualTo(Integer value) {
            addCriterion("flexibility <=", value, "flexibility");
            return (Criteria) this;
        }

        public Criteria andFlexibilityLike(Integer value) {
            addCriterion("flexibility like", value, "flexibility");
            return (Criteria) this;
        }

        public Criteria andFlexibilityNotLike(Integer value) {
            addCriterion("flexibility not like", value, "flexibility");
            return (Criteria) this;
        }

        public Criteria andFlexibilityIn(List<Integer> values) {
            addCriterion("flexibility in", values, "flexibility");
            return (Criteria) this;
        }

        public Criteria andFlexibilityNotIn(List<Integer> values) {
            addCriterion("flexibility not in", values, "flexibility");
            return (Criteria) this;
        }

        public Criteria andFlexibilityBetween(Integer value1, Integer value2) {
            addCriterion("flexibility between", value1, value2, "flexibility");
            return (Criteria) this;
        }

        public Criteria andFlexibilityNotBetween(Integer value1, Integer value2) {
            addCriterion("flexibility not between", value1, value2, "flexibility");
            return (Criteria) this;
        }
        
			
        public Criteria andLogicalityIsNull() {
            addCriterion("logicality is null");
            return (Criteria) this;
        }

        public Criteria andLogicalityIsNotNull() {
            addCriterion("logicality is not null");
            return (Criteria) this;
        }

        public Criteria andLogicalityEqualTo(Integer value) {
            addCriterion("logicality =", value, "logicality");
            return (Criteria) this;
        }

        public Criteria andLogicalityNotEqualTo(Integer value) {
            addCriterion("logicality <>", value, "logicality");
            return (Criteria) this;
        }

        public Criteria andLogicalityGreaterThan(Integer value) {
            addCriterion("logicality >", value, "logicality");
            return (Criteria) this;
        }

        public Criteria andLogicalityGreaterThanOrEqualTo(Integer value) {
            addCriterion("logicality >=", value, "logicality");
            return (Criteria) this;
        }

        public Criteria andLogicalityLessThan(Integer value) {
            addCriterion("logicality <", value, "logicality");
            return (Criteria) this;
        }

        public Criteria andLogicalityLessThanOrEqualTo(Integer value) {
            addCriterion("logicality <=", value, "logicality");
            return (Criteria) this;
        }

        public Criteria andLogicalityLike(Integer value) {
            addCriterion("logicality like", value, "logicality");
            return (Criteria) this;
        }

        public Criteria andLogicalityNotLike(Integer value) {
            addCriterion("logicality not like", value, "logicality");
            return (Criteria) this;
        }

        public Criteria andLogicalityIn(List<Integer> values) {
            addCriterion("logicality in", values, "logicality");
            return (Criteria) this;
        }

        public Criteria andLogicalityNotIn(List<Integer> values) {
            addCriterion("logicality not in", values, "logicality");
            return (Criteria) this;
        }

        public Criteria andLogicalityBetween(Integer value1, Integer value2) {
            addCriterion("logicality between", value1, value2, "logicality");
            return (Criteria) this;
        }

        public Criteria andLogicalityNotBetween(Integer value1, Integer value2) {
            addCriterion("logicality not between", value1, value2, "logicality");
            return (Criteria) this;
        }
        
			
        public Criteria andTotalDiffIsNull() {
            addCriterion("totalDiff is null");
            return (Criteria) this;
        }

        public Criteria andTotalDiffIsNotNull() {
            addCriterion("totalDiff is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDiffEqualTo(Integer value) {
            addCriterion("totalDiff =", value, "totalDiff");
            return (Criteria) this;
        }

        public Criteria andTotalDiffNotEqualTo(Integer value) {
            addCriterion("totalDiff <>", value, "totalDiff");
            return (Criteria) this;
        }

        public Criteria andTotalDiffGreaterThan(Integer value) {
            addCriterion("totalDiff >", value, "totalDiff");
            return (Criteria) this;
        }

        public Criteria andTotalDiffGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalDiff >=", value, "totalDiff");
            return (Criteria) this;
        }

        public Criteria andTotalDiffLessThan(Integer value) {
            addCriterion("totalDiff <", value, "totalDiff");
            return (Criteria) this;
        }

        public Criteria andTotalDiffLessThanOrEqualTo(Integer value) {
            addCriterion("totalDiff <=", value, "totalDiff");
            return (Criteria) this;
        }

        public Criteria andTotalDiffLike(Integer value) {
            addCriterion("totalDiff like", value, "totalDiff");
            return (Criteria) this;
        }

        public Criteria andTotalDiffNotLike(Integer value) {
            addCriterion("totalDiff not like", value, "totalDiff");
            return (Criteria) this;
        }

        public Criteria andTotalDiffIn(List<Integer> values) {
            addCriterion("totalDiff in", values, "totalDiff");
            return (Criteria) this;
        }

        public Criteria andTotalDiffNotIn(List<Integer> values) {
            addCriterion("totalDiff not in", values, "totalDiff");
            return (Criteria) this;
        }

        public Criteria andTotalDiffBetween(Integer value1, Integer value2) {
            addCriterion("totalDiff between", value1, value2, "totalDiff");
            return (Criteria) this;
        }

        public Criteria andTotalDiffNotBetween(Integer value1, Integer value2) {
            addCriterion("totalDiff not between", value1, value2, "totalDiff");
            return (Criteria) this;
        }
        
			
        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
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
        
			
        public Criteria andAnswersIsNull() {
            addCriterion("answers is null");
            return (Criteria) this;
        }

        public Criteria andAnswersIsNotNull() {
            addCriterion("answers is not null");
            return (Criteria) this;
        }

        public Criteria andAnswersEqualTo(Integer value) {
            addCriterion("answers =", value, "answers");
            return (Criteria) this;
        }

        public Criteria andAnswersNotEqualTo(Integer value) {
            addCriterion("answers <>", value, "answers");
            return (Criteria) this;
        }

        public Criteria andAnswersGreaterThan(Integer value) {
            addCriterion("answers >", value, "answers");
            return (Criteria) this;
        }

        public Criteria andAnswersGreaterThanOrEqualTo(Integer value) {
            addCriterion("answers >=", value, "answers");
            return (Criteria) this;
        }

        public Criteria andAnswersLessThan(Integer value) {
            addCriterion("answers <", value, "answers");
            return (Criteria) this;
        }

        public Criteria andAnswersLessThanOrEqualTo(Integer value) {
            addCriterion("answers <=", value, "answers");
            return (Criteria) this;
        }

        public Criteria andAnswersLike(Integer value) {
            addCriterion("answers like", value, "answers");
            return (Criteria) this;
        }

        public Criteria andAnswersNotLike(Integer value) {
            addCriterion("answers not like", value, "answers");
            return (Criteria) this;
        }

        public Criteria andAnswersIn(List<Integer> values) {
            addCriterion("answers in", values, "answers");
            return (Criteria) this;
        }

        public Criteria andAnswersNotIn(List<Integer> values) {
            addCriterion("answers not in", values, "answers");
            return (Criteria) this;
        }

        public Criteria andAnswersBetween(Integer value1, Integer value2) {
            addCriterion("answers between", value1, value2, "answers");
            return (Criteria) this;
        }

        public Criteria andAnswersNotBetween(Integer value1, Integer value2) {
            addCriterion("answers not between", value1, value2, "answers");
            return (Criteria) this;
        }
        
			
        public Criteria andBelongNmIsNull() {
            addCriterion("belong_nm is null");
            return (Criteria) this;
        }

        public Criteria andBelongNmIsNotNull() {
            addCriterion("belong_nm is not null");
            return (Criteria) this;
        }

        public Criteria andBelongNmEqualTo(String value) {
            addCriterion("belong_nm =", value, "belongNm");
            return (Criteria) this;
        }

        public Criteria andBelongNmNotEqualTo(String value) {
            addCriterion("belong_nm <>", value, "belongNm");
            return (Criteria) this;
        }

        public Criteria andBelongNmGreaterThan(String value) {
            addCriterion("belong_nm >", value, "belongNm");
            return (Criteria) this;
        }

        public Criteria andBelongNmGreaterThanOrEqualTo(String value) {
            addCriterion("belong_nm >=", value, "belongNm");
            return (Criteria) this;
        }

        public Criteria andBelongNmLessThan(String value) {
            addCriterion("belong_nm <", value, "belongNm");
            return (Criteria) this;
        }

        public Criteria andBelongNmLessThanOrEqualTo(String value) {
            addCriterion("belong_nm <=", value, "belongNm");
            return (Criteria) this;
        }

        public Criteria andBelongNmLike(String value) {
            addCriterion("belong_nm like", value, "belongNm");
            return (Criteria) this;
        }

        public Criteria andBelongNmNotLike(String value) {
            addCriterion("belong_nm not like", value, "belongNm");
            return (Criteria) this;
        }

        public Criteria andBelongNmIn(List<String> values) {
            addCriterion("belong_nm in", values, "belongNm");
            return (Criteria) this;
        }

        public Criteria andBelongNmNotIn(List<String> values) {
            addCriterion("belong_nm not in", values, "belongNm");
            return (Criteria) this;
        }

        public Criteria andBelongNmBetween(String value1, String value2) {
            addCriterion("belong_nm between", value1, value2, "belongNm");
            return (Criteria) this;
        }

        public Criteria andBelongNmNotBetween(String value1, String value2) {
            addCriterion("belong_nm not between", value1, value2, "belongNm");
            return (Criteria) this;
        }
        
			
        public Criteria andBelongIdIsNull() {
            addCriterion("belong_id is null");
            return (Criteria) this;
        }

        public Criteria andBelongIdIsNotNull() {
            addCriterion("belong_id is not null");
            return (Criteria) this;
        }

        public Criteria andBelongIdEqualTo(String value) {
            addCriterion("belong_id =", value, "belongId");
            return (Criteria) this;
        }

        public Criteria andBelongIdNotEqualTo(String value) {
            addCriterion("belong_id <>", value, "belongId");
            return (Criteria) this;
        }

        public Criteria andBelongIdGreaterThan(String value) {
            addCriterion("belong_id >", value, "belongId");
            return (Criteria) this;
        }

        public Criteria andBelongIdGreaterThanOrEqualTo(String value) {
            addCriterion("belong_id >=", value, "belongId");
            return (Criteria) this;
        }

        public Criteria andBelongIdLessThan(String value) {
            addCriterion("belong_id <", value, "belongId");
            return (Criteria) this;
        }

        public Criteria andBelongIdLessThanOrEqualTo(String value) {
            addCriterion("belong_id <=", value, "belongId");
            return (Criteria) this;
        }

        public Criteria andBelongIdLike(String value) {
            addCriterion("belong_id like", value, "belongId");
            return (Criteria) this;
        }

        public Criteria andBelongIdNotLike(String value) {
            addCriterion("belong_id not like", value, "belongId");
            return (Criteria) this;
        }

        public Criteria andBelongIdIn(List<String> values) {
            addCriterion("belong_id in", values, "belongId");
            return (Criteria) this;
        }

        public Criteria andBelongIdNotIn(List<String> values) {
            addCriterion("belong_id not in", values, "belongId");
            return (Criteria) this;
        }

        public Criteria andBelongIdBetween(String value1, String value2) {
            addCriterion("belong_id between", value1, value2, "belongId");
            return (Criteria) this;
        }

        public Criteria andBelongIdNotBetween(String value1, String value2) {
            addCriterion("belong_id not between", value1, value2, "belongId");
            return (Criteria) this;
        }
        
			
        public Criteria andMinLikeIsNull() {
            addCriterion("min_like is null");
            return (Criteria) this;
        }

        public Criteria andMinLikeIsNotNull() {
            addCriterion("min_like is not null");
            return (Criteria) this;
        }

        public Criteria andMinLikeEqualTo(Integer value) {
            addCriterion("min_like =", value, "minLike");
            return (Criteria) this;
        }

        public Criteria andMinLikeNotEqualTo(Integer value) {
            addCriterion("min_like <>", value, "minLike");
            return (Criteria) this;
        }

        public Criteria andMinLikeGreaterThan(Integer value) {
            addCriterion("min_like >", value, "minLike");
            return (Criteria) this;
        }

        public Criteria andMinLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_like >=", value, "minLike");
            return (Criteria) this;
        }

        public Criteria andMinLikeLessThan(Integer value) {
            addCriterion("min_like <", value, "minLike");
            return (Criteria) this;
        }

        public Criteria andMinLikeLessThanOrEqualTo(Integer value) {
            addCriterion("min_like <=", value, "minLike");
            return (Criteria) this;
        }

        public Criteria andMinLikeLike(Integer value) {
            addCriterion("min_like like", value, "minLike");
            return (Criteria) this;
        }

        public Criteria andMinLikeNotLike(Integer value) {
            addCriterion("min_like not like", value, "minLike");
            return (Criteria) this;
        }

        public Criteria andMinLikeIn(List<Integer> values) {
            addCriterion("min_like in", values, "minLike");
            return (Criteria) this;
        }

        public Criteria andMinLikeNotIn(List<Integer> values) {
            addCriterion("min_like not in", values, "minLike");
            return (Criteria) this;
        }

        public Criteria andMinLikeBetween(Integer value1, Integer value2) {
            addCriterion("min_like between", value1, value2, "minLike");
            return (Criteria) this;
        }

        public Criteria andMinLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("min_like not between", value1, value2, "minLike");
            return (Criteria) this;
        }
        
			
        public Criteria andMinRecomIsNull() {
            addCriterion("min_recom is null");
            return (Criteria) this;
        }

        public Criteria andMinRecomIsNotNull() {
            addCriterion("min_recom is not null");
            return (Criteria) this;
        }

        public Criteria andMinRecomEqualTo(Integer value) {
            addCriterion("min_recom =", value, "minRecom");
            return (Criteria) this;
        }

        public Criteria andMinRecomNotEqualTo(Integer value) {
            addCriterion("min_recom <>", value, "minRecom");
            return (Criteria) this;
        }

        public Criteria andMinRecomGreaterThan(Integer value) {
            addCriterion("min_recom >", value, "minRecom");
            return (Criteria) this;
        }

        public Criteria andMinRecomGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_recom >=", value, "minRecom");
            return (Criteria) this;
        }

        public Criteria andMinRecomLessThan(Integer value) {
            addCriterion("min_recom <", value, "minRecom");
            return (Criteria) this;
        }

        public Criteria andMinRecomLessThanOrEqualTo(Integer value) {
            addCriterion("min_recom <=", value, "minRecom");
            return (Criteria) this;
        }

        public Criteria andMinRecomLike(Integer value) {
            addCriterion("min_recom like", value, "minRecom");
            return (Criteria) this;
        }

        public Criteria andMinRecomNotLike(Integer value) {
            addCriterion("min_recom not like", value, "minRecom");
            return (Criteria) this;
        }

        public Criteria andMinRecomIn(List<Integer> values) {
            addCriterion("min_recom in", values, "minRecom");
            return (Criteria) this;
        }

        public Criteria andMinRecomNotIn(List<Integer> values) {
            addCriterion("min_recom not in", values, "minRecom");
            return (Criteria) this;
        }

        public Criteria andMinRecomBetween(Integer value1, Integer value2) {
            addCriterion("min_recom between", value1, value2, "minRecom");
            return (Criteria) this;
        }

        public Criteria andMinRecomNotBetween(Integer value1, Integer value2) {
            addCriterion("min_recom not between", value1, value2, "minRecom");
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
        
			
        public Criteria andPeriodIsNull() {
            addCriterion("period is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("period is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(Integer value) {
            addCriterion("period =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(Integer value) {
            addCriterion("period <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(Integer value) {
            addCriterion("period >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("period >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(Integer value) {
            addCriterion("period <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("period <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLike(Integer value) {
            addCriterion("period like", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotLike(Integer value) {
            addCriterion("period not like", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<Integer> values) {
            addCriterion("period in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<Integer> values) {
            addCriterion("period not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(Integer value1, Integer value2) {
            addCriterion("period between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("period not between", value1, value2, "period");
            return (Criteria) this;
        }
        
			
        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Character value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Character value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Character value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Character value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Character value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Character value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(Character value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(Character value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Character> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Character> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Character value1, Character value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Character value1, Character value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }
        
			
        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(Integer value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(Integer value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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
        
		
		 public Criteria andLikeQuery(DebTopic record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
        	
        				 if(record.getUid()!=null&&StrUtil.isNotEmpty(record.getUid().toString())) {
    			 list.add("ifnull(uid,'')");
    		 }
						 if(record.getSubject()!=null&&StrUtil.isNotEmpty(record.getSubject().toString())) {
    			 list.add("ifnull(subject,'')");
    		 }
						 if(record.getSubjectId()!=null&&StrUtil.isNotEmpty(record.getSubjectId().toString())) {
    			 list.add("ifnull(subject_id,'')");
    		 }
						 if(record.getTitle()!=null&&StrUtil.isNotEmpty(record.getTitle().toString())) {
    			 list.add("ifnull(title,'')");
    		 }
						 if(record.getContent()!=null&&StrUtil.isNotEmpty(record.getContent().toString())) {
    			 list.add("ifnull(content,'')");
    		 }
						 if(record.getLabel1()!=null&&StrUtil.isNotEmpty(record.getLabel1().toString())) {
    			 list.add("ifnull(label1,'')");
    		 }
						 if(record.getLabel2()!=null&&StrUtil.isNotEmpty(record.getLabel2().toString())) {
    			 list.add("ifnull(label2,'')");
    		 }
						 if(record.getLabel3()!=null&&StrUtil.isNotEmpty(record.getLabel3().toString())) {
    			 list.add("ifnull(label3,'')");
    		 }
						 if(record.getThinking()!=null&&StrUtil.isNotEmpty(record.getThinking().toString())) {
    			 list.add("ifnull(thinking,'')");
    		 }
						 if(record.getFlexibility()!=null&&StrUtil.isNotEmpty(record.getFlexibility().toString())) {
    			 list.add("ifnull(flexibility,'')");
    		 }
						 if(record.getLogicality()!=null&&StrUtil.isNotEmpty(record.getLogicality().toString())) {
    			 list.add("ifnull(logicality,'')");
    		 }
						 if(record.getTotalDiff()!=null&&StrUtil.isNotEmpty(record.getTotalDiff().toString())) {
    			 list.add("ifnull(totalDiff,'')");
    		 }
						 if(record.getKeyword()!=null&&StrUtil.isNotEmpty(record.getKeyword().toString())) {
    			 list.add("ifnull(keyword,'')");
    		 }
						 if(record.getViews()!=null&&StrUtil.isNotEmpty(record.getViews().toString())) {
    			 list.add("ifnull(views,'')");
    		 }
						 if(record.getAnswers()!=null&&StrUtil.isNotEmpty(record.getAnswers().toString())) {
    			 list.add("ifnull(answers,'')");
    		 }
						 if(record.getBelongNm()!=null&&StrUtil.isNotEmpty(record.getBelongNm().toString())) {
    			 list.add("ifnull(belong_nm,'')");
    		 }
						 if(record.getBelongId()!=null&&StrUtil.isNotEmpty(record.getBelongId().toString())) {
    			 list.add("ifnull(belong_id,'')");
    		 }
						 if(record.getMinLike()!=null&&StrUtil.isNotEmpty(record.getMinLike().toString())) {
    			 list.add("ifnull(min_like,'')");
    		 }
						 if(record.getMinRecom()!=null&&StrUtil.isNotEmpty(record.getMinRecom().toString())) {
    			 list.add("ifnull(min_recom,'')");
    		 }
						 if(record.getFinish()!=null&&StrUtil.isNotEmpty(record.getFinish().toString())) {
    			 list.add("ifnull(finish,'')");
    		 }
						 if(record.getPeriod()!=null&&StrUtil.isNotEmpty(record.getPeriod().toString())) {
    			 list.add("ifnull(period,'')");
    		 }
						 if(record.getYear()!=null&&StrUtil.isNotEmpty(record.getYear().toString())) {
    			 list.add("ifnull(year,'')");
    		 }
						 if(record.getStatus()!=null&&StrUtil.isNotEmpty(record.getStatus().toString())) {
    			 list.add("ifnull(status,'')");
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
							 if(record.getSubject()!=null&&StrUtil.isNotEmpty(record.getSubject().toString())) {
        			list2.add("'%"+record.getSubject()+"%'");
        		 }
							 if(record.getSubjectId()!=null&&StrUtil.isNotEmpty(record.getSubjectId().toString())) {
        			list2.add("'%"+record.getSubjectId()+"%'");
        		 }
							 if(record.getTitle()!=null&&StrUtil.isNotEmpty(record.getTitle().toString())) {
        			list2.add("'%"+record.getTitle()+"%'");
        		 }
							 if(record.getContent()!=null&&StrUtil.isNotEmpty(record.getContent().toString())) {
        			list2.add("'%"+record.getContent()+"%'");
        		 }
							 if(record.getLabel1()!=null&&StrUtil.isNotEmpty(record.getLabel1().toString())) {
        			list2.add("'%"+record.getLabel1()+"%'");
        		 }
							 if(record.getLabel2()!=null&&StrUtil.isNotEmpty(record.getLabel2().toString())) {
        			list2.add("'%"+record.getLabel2()+"%'");
        		 }
							 if(record.getLabel3()!=null&&StrUtil.isNotEmpty(record.getLabel3().toString())) {
        			list2.add("'%"+record.getLabel3()+"%'");
        		 }
							 if(record.getThinking()!=null&&StrUtil.isNotEmpty(record.getThinking().toString())) {
        			list2.add("'%"+record.getThinking()+"%'");
        		 }
							 if(record.getFlexibility()!=null&&StrUtil.isNotEmpty(record.getFlexibility().toString())) {
        			list2.add("'%"+record.getFlexibility()+"%'");
        		 }
							 if(record.getLogicality()!=null&&StrUtil.isNotEmpty(record.getLogicality().toString())) {
        			list2.add("'%"+record.getLogicality()+"%'");
        		 }
							 if(record.getTotalDiff()!=null&&StrUtil.isNotEmpty(record.getTotalDiff().toString())) {
        			list2.add("'%"+record.getTotalDiff()+"%'");
        		 }
							 if(record.getKeyword()!=null&&StrUtil.isNotEmpty(record.getKeyword().toString())) {
        			list2.add("'%"+record.getKeyword()+"%'");
        		 }
							 if(record.getViews()!=null&&StrUtil.isNotEmpty(record.getViews().toString())) {
        			list2.add("'%"+record.getViews()+"%'");
        		 }
							 if(record.getAnswers()!=null&&StrUtil.isNotEmpty(record.getAnswers().toString())) {
        			list2.add("'%"+record.getAnswers()+"%'");
        		 }
							 if(record.getBelongNm()!=null&&StrUtil.isNotEmpty(record.getBelongNm().toString())) {
        			list2.add("'%"+record.getBelongNm()+"%'");
        		 }
							 if(record.getBelongId()!=null&&StrUtil.isNotEmpty(record.getBelongId().toString())) {
        			list2.add("'%"+record.getBelongId()+"%'");
        		 }
							 if(record.getMinLike()!=null&&StrUtil.isNotEmpty(record.getMinLike().toString())) {
        			list2.add("'%"+record.getMinLike()+"%'");
        		 }
							 if(record.getMinRecom()!=null&&StrUtil.isNotEmpty(record.getMinRecom().toString())) {
        			list2.add("'%"+record.getMinRecom()+"%'");
        		 }
							 if(record.getFinish()!=null&&StrUtil.isNotEmpty(record.getFinish().toString())) {
        			list2.add("'%"+record.getFinish()+"%'");
        		 }
							 if(record.getPeriod()!=null&&StrUtil.isNotEmpty(record.getPeriod().toString())) {
        			list2.add("'%"+record.getPeriod()+"%'");
        		 }
							 if(record.getYear()!=null&&StrUtil.isNotEmpty(record.getYear().toString())) {
        			list2.add("'%"+record.getYear()+"%'");
        		 }
							 if(record.getStatus()!=null&&StrUtil.isNotEmpty(record.getStatus().toString())) {
        			list2.add("'%"+record.getStatus()+"%'");
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