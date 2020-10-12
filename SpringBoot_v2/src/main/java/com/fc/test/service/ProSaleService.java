package com.fc.test.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.ConvertUtil;
import com.fc.test.mapper.auto.ProSaleMapper;
import com.fc.test.model.auto.ProSale;
import com.fc.test.model.auto.ProSaleExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;
import com.fc.test.util.StringUtils;

/**
 * 作品上架表 ProSaleService
 * @Title: ProSaleService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-19 22:31:23  
 **/
@Service
public class ProSaleService implements BaseService<ProSale, ProSaleExample>{
	@Autowired
	private ProSaleMapper proSaleMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<ProSale> list(Tablepar tablepar,ProSale record){
	        ProSaleExample testExample=new ProSaleExample();
	        testExample.createCriteria().andCreateByEqualTo(record.getCreateBy());
	        testExample.setOrderByClause("id desc");
			if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<ProSale> list= proSaleMapper.selectByExample(testExample);
	        PageInfo<ProSale> pageInfo = new PageInfo<ProSale>(list);
	        return  pageInfo;
	 }

	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<ProSale> listByExample(Tablepar tablepar,ProSale record){

		ProSaleExample testExample=new ProSaleExample();
		testExample.createCriteria().equals(record.getSaleStatus());
		testExample.setOrderByClause("create_dat ASC");
		if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
			testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
		}
		PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
		List<ProSale> list= proSaleMapper.selectByExample(testExample);
		PageInfo<ProSale> pageInfo = new PageInfo<ProSale>(list);
		return  pageInfo;
	}


	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			ProSaleExample example=new ProSaleExample();
			example.createCriteria().andIdIn(stringB);
			return proSaleMapper.deleteByExample(example);
	}

	public int deleteStsByKey(ProSale proSale) {

		return proSaleMapper.deleteStsByKey(proSale);
	}

	/**
	 * @param ids
	 * @return
	 */
	public int deleteBatchByPrimaryKey(String ids){
		Long[] longs = ConvertUtil.toLongArray(",", ids);
		List<Long> longsB = Arrays.asList(longs);
		return proSaleMapper.deleteBatchByPrimaryKey(longsB);
	}



	@Override
	public ProSale selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return proSaleMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(ProSale record) {
		return proSaleMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(ProSale record) {
				
		record.setId(null);
		
				
		return proSaleMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(ProSale record, ProSaleExample example) {
		
		return proSaleMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(ProSale record, ProSaleExample example) {
		
		return proSaleMapper.updateByExample(record, example);
	}

	@Override
	public List<ProSale> selectByExample(ProSaleExample example) {
		
		return proSaleMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(ProSaleExample example) {
		
		return proSaleMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ProSaleExample example) {
		
		return proSaleMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param proSale
	 * @return
	 */
	public int checkNameUnique(ProSale proSale){
		ProSaleExample example=new ProSaleExample();
		example.createCriteria().andCreateByEqualTo(proSale.getCreateBy());
		List<ProSale> list=proSaleMapper.selectByExample(example);
		return list.size();
	}


}
