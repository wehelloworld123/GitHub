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
import com.fc.test.mapper.auto.ProUserAdoptMapper;
import com.fc.test.model.auto.ProUserAdopt;
import com.fc.test.model.auto.ProUserAdoptExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;
import com.fc.test.util.StringUtils;

/**
 * 用户创作采纳表 ProUserAdoptService
 * @Title: ProUserAdoptService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-30 23:53:45  
 **/
@Service
public class ProUserAdoptService implements BaseService<ProUserAdopt, ProUserAdoptExample>{
	@Autowired
	private ProUserAdoptMapper proUserAdoptMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<ProUserAdopt> list(Tablepar tablepar,ProUserAdopt record){
	        ProUserAdoptExample testExample=new ProUserAdoptExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("id ASC");
			if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<ProUserAdopt> list= proUserAdoptMapper.selectByExample(testExample);
	        PageInfo<ProUserAdopt> pageInfo = new PageInfo<ProUserAdopt>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			ProUserAdoptExample example=new ProUserAdoptExample();
			example.createCriteria().andIdIn(stringB);
			return proUserAdoptMapper.deleteByExample(example);
	}

	public int deleteStsByKey(ProUserAdopt proUserAdopt) {

		return proUserAdoptMapper.deleteStsByKey(proUserAdopt);
	}

	/**
	 * @param ids
	 * @return
	 */
	public int deleteBatchByPrimaryKey(String ids){
		Long[] longs = ConvertUtil.toLongArray(",", ids);
		List<Long> longsB = Arrays.asList(longs);
		return proUserAdoptMapper.deleteBatchByPrimaryKey(longsB);
	}



	@Override
	public ProUserAdopt selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return proUserAdoptMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(ProUserAdopt record) {
		return proUserAdoptMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(ProUserAdopt record) {
				
		record.setId(null);
		
				
		return proUserAdoptMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(ProUserAdopt record, ProUserAdoptExample example) {
		
		return proUserAdoptMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(ProUserAdopt record, ProUserAdoptExample example) {
		
		return proUserAdoptMapper.updateByExample(record, example);
	}

	@Override
	public List<ProUserAdopt> selectByExample(ProUserAdoptExample example) {
		
		return proUserAdoptMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(ProUserAdoptExample example) {
		
		return proUserAdoptMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ProUserAdoptExample example) {
		
		return proUserAdoptMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param proUserAdopt
	 * @return
	 */
	public int checkNameUnique(ProUserAdopt proUserAdopt){
		ProUserAdoptExample example=new ProUserAdoptExample();
		example.createCriteria().andProNoEqualTo(proUserAdopt.getProNo());
		List<ProUserAdopt> list=proUserAdoptMapper.selectByExample(example);
		return list.size();
	}


}
