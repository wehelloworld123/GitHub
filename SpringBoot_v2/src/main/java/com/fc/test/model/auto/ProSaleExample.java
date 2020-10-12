package com.fc.test.model.auto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;
/**
 * 作品上架表 ProSaleExample
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-19 22:31:23
 */
public class ProSaleExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProSaleExample() {
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
        
			
        public Criteria andCreateTypIsNull() {
            addCriterion("create_typ is null");
            return (Criteria) this;
        }

        public Criteria andCreateTypIsNotNull() {
            addCriterion("create_typ is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTypEqualTo(String value) {
            addCriterion("create_typ =", value, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypNotEqualTo(String value) {
            addCriterion("create_typ <>", value, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypGreaterThan(String value) {
            addCriterion("create_typ >", value, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypGreaterThanOrEqualTo(String value) {
            addCriterion("create_typ >=", value, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypLessThan(String value) {
            addCriterion("create_typ <", value, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypLessThanOrEqualTo(String value) {
            addCriterion("create_typ <=", value, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypLike(String value) {
            addCriterion("create_typ like", value, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypNotLike(String value) {
            addCriterion("create_typ not like", value, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypIn(List<String> values) {
            addCriterion("create_typ in", values, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypNotIn(List<String> values) {
            addCriterion("create_typ not in", values, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypBetween(String value1, String value2) {
            addCriterion("create_typ between", value1, value2, "createTyp");
            return (Criteria) this;
        }

        public Criteria andCreateTypNotBetween(String value1, String value2) {
            addCriterion("create_typ not between", value1, value2, "createTyp");
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
        
			
        public Criteria andSaleAmtIsNull() {
            addCriterion("sale_amt is null");
            return (Criteria) this;
        }

        public Criteria andSaleAmtIsNotNull() {
            addCriterion("sale_amt is not null");
            return (Criteria) this;
        }

        public Criteria andSaleAmtEqualTo(BigDecimal value) {
            addCriterion("sale_amt =", value, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtNotEqualTo(BigDecimal value) {
            addCriterion("sale_amt <>", value, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtGreaterThan(BigDecimal value) {
            addCriterion("sale_amt >", value, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_amt >=", value, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtLessThan(BigDecimal value) {
            addCriterion("sale_amt <", value, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_amt <=", value, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtLike(BigDecimal value) {
            addCriterion("sale_amt like", value, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtNotLike(BigDecimal value) {
            addCriterion("sale_amt not like", value, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtIn(List<BigDecimal> values) {
            addCriterion("sale_amt in", values, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtNotIn(List<BigDecimal> values) {
            addCriterion("sale_amt not in", values, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_amt between", value1, value2, "saleAmt");
            return (Criteria) this;
        }

        public Criteria andSaleAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_amt not between", value1, value2, "saleAmt");
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
        
			
        public Criteria andSaleStatusIsNull() {
            addCriterion("sale_status is null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIsNotNull() {
            addCriterion("sale_status is not null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusEqualTo(String value) {
            addCriterion("sale_status =", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotEqualTo(String value) {
            addCriterion("sale_status <>", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThan(String value) {
            addCriterion("sale_status >", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("sale_status >=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThan(String value) {
            addCriterion("sale_status <", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThanOrEqualTo(String value) {
            addCriterion("sale_status <=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLike(String value) {
            addCriterion("sale_status like", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotLike(String value) {
            addCriterion("sale_status not like", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIn(List<String> values) {
            addCriterion("sale_status in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotIn(List<String> values) {
            addCriterion("sale_status not in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusBetween(String value1, String value2) {
            addCriterion("sale_status between", value1, value2, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotBetween(String value1, String value2) {
            addCriterion("sale_status not between", value1, value2, "saleStatus");
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
        
		
		 public Criteria andLikeQuery(ProSale record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
        	
        				 if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		 }
						 if(record.getProNo()!=null&&StrUtil.isNotEmpty(record.getProNo().toString())) {
    			 list.add("ifnull(pro_no,'')");
    		 }
						 if(record.getTyp()!=null&&StrUtil.isNotEmpty(record.getTyp().toString())) {
    			 list.add("ifnull(typ,'')");
    		 }
						 if(record.getCreateTyp()!=null&&StrUtil.isNotEmpty(record.getCreateTyp().toString())) {
    			 list.add("ifnull(create_typ,'')");
    		 }
						 if(record.getTitle()!=null&&StrUtil.isNotEmpty(record.getTitle().toString())) {
    			 list.add("ifnull(title,'')");
    		 }
						 if(record.getSeter()!=null&&StrUtil.isNotEmpty(record.getSeter().toString())) {
    			 list.add("ifnull(seter,'')");
    		 }
						 if(record.getCover()!=null&&StrUtil.isNotEmpty(record.getCover().toString())) {
    			 list.add("ifnull(cover,'')");
    		 }
						 if(record.getExhibition()!=null&&StrUtil.isNotEmpty(record.getExhibition().toString())) {
    			 list.add("ifnull(exhibition,'')");
    		 }
						 if(record.getLabel()!=null&&StrUtil.isNotEmpty(record.getLabel().toString())) {
    			 list.add("ifnull(label,'')");
    		 }
						 if(record.getDescription()!=null&&StrUtil.isNotEmpty(record.getDescription().toString())) {
    			 list.add("ifnull(description,'')");
    		 }
						 if(record.getSaleAmt()!=null&&StrUtil.isNotEmpty(record.getSaleAmt().toString())) {
    			 list.add("ifnull(sale_amt,'')");
    		 }
						 if(record.getSaleStatus()!=null&&StrUtil.isNotEmpty(record.getSaleStatus().toString())) {
    			 list.add("ifnull(sale_status,'')");
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
							 if(record.getTyp()!=null&&StrUtil.isNotEmpty(record.getTyp().toString())) {
        			list2.add("'%"+record.getTyp()+"%'");
        		 }
							 if(record.getCreateTyp()!=null&&StrUtil.isNotEmpty(record.getCreateTyp().toString())) {
        			list2.add("'%"+record.getCreateTyp()+"%'");
        		 }
							 if(record.getTitle()!=null&&StrUtil.isNotEmpty(record.getTitle().toString())) {
        			list2.add("'%"+record.getTitle()+"%'");
        		 }
							 if(record.getSeter()!=null&&StrUtil.isNotEmpty(record.getSeter().toString())) {
        			list2.add("'%"+record.getSeter()+"%'");
        		 }
							 if(record.getCover()!=null&&StrUtil.isNotEmpty(record.getCover().toString())) {
        			list2.add("'%"+record.getCover()+"%'");
        		 }
							 if(record.getExhibition()!=null&&StrUtil.isNotEmpty(record.getExhibition().toString())) {
        			list2.add("'%"+record.getExhibition()+"%'");
        		 }
							 if(record.getLabel()!=null&&StrUtil.isNotEmpty(record.getLabel().toString())) {
        			list2.add("'%"+record.getLabel()+"%'");
        		 }
							 if(record.getDescription()!=null&&StrUtil.isNotEmpty(record.getDescription().toString())) {
        			list2.add("'%"+record.getDescription()+"%'");
        		 }
							 if(record.getSaleAmt()!=null&&StrUtil.isNotEmpty(record.getSaleAmt().toString())) {
        			list2.add("'%"+record.getSaleAmt()+"%'");
        		 }
							 if(record.getSaleStatus()!=null&&StrUtil.isNotEmpty(record.getSaleStatus().toString())) {
        			list2.add("'%"+record.getSaleStatus()+"%'");
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