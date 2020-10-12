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
import com.fc.test.mapper.auto.ProCopyrightMapper;
import com.fc.test.model.auto.ProCopyright;
import com.fc.test.model.auto.ProCopyrightExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;
import com.fc.test.util.StringUtils;

/**
 * 作品版权分配表 ProCopyrightService
 * @Title: ProCopyrightService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-18 00:08:57  
 **/
@Service
public class ProCopyrightService implements BaseService<ProCopyright, ProCopyrightExample>{
	@Autowired
	private ProCopyrightMapper proCopyrightMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<ProCopyright> list(Tablepar tablepar,ProCopyright record){
	        ProCopyrightExample testExample=new ProCopyrightExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("id ASC");
			if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<ProCopyright> list= proCopyrightMapper.selectByExample(testExample);
	        PageInfo<ProCopyright> pageInfo = new PageInfo<ProCopyright>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			ProCopyrightExample example=new ProCopyrightExample();
			example.createCriteria().andIdIn(stringB);
			return proCopyrightMapper.deleteByExample(example);
	}

	public int deleteStsByKey(ProCopyright proCopyright) {

		return proCopyrightMapper.deleteStsByKey(proCopyright);
	}

	/**
	 * 检查name
	 * @param ids
	 * @return
	 */
	public int deleteBatchByPrimaryKey(String ids){
		Long[] longs = ConvertUtil.toLongArray(",", ids);
		List<Long> longsB = Arrays.asList(longs);

		return proCopyrightMapper.deleteBatchByPrimaryKey(longsB);
	}
	
	
	@Override
	public ProCopyright selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return proCopyrightMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(ProCopyright record) {
		return proCopyrightMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(ProCopyright record) {
				
		record.setId(null);
		
				
		return proCopyrightMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(ProCopyright record, ProCopyrightExample example) {
		
		return proCopyrightMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(ProCopyright record, ProCopyrightExample example) {
		
		return proCopyrightMapper.updateByExample(record, example);
	}

	@Override
	public List<ProCopyright> selectByExample(ProCopyrightExample example) {
		
		return proCopyrightMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(ProCopyrightExample example) {
		
		return proCopyrightMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ProCopyrightExample example) {
		
		return proCopyrightMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param proCopyright
	 * @return
	 */
	public int checkNameUnique(ProCopyright proCopyright){
		ProCopyrightExample example=new ProCopyrightExample();
		example.createCriteria().andAuthorIdEqualTo(proCopyright.getAuthorId());
		List<ProCopyright> list=proCopyrightMapper.selectByExample(example);
		return list.size();
	}


}
