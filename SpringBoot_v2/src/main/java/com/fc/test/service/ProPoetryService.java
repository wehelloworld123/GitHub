package com.fc.test.service;

import java.util.List;
import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.ConvertUtil;
import com.fc.test.mapper.auto.ProPoetryMapper;
import com.fc.test.model.auto.ProPoetry;
import com.fc.test.model.auto.ProPoetryExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;
import com.fc.test.util.StringUtils;

/**
 * 诗歌创作集 ProPoetryService
 * @Title: ProPoetryService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-06-29 17:39:28  
 **/
@Service
public class ProPoetryService implements BaseService<ProPoetry, ProPoetryExample>{
	@Autowired
	private ProPoetryMapper proPoetryMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<ProPoetry> list(Tablepar tablepar,ProPoetry record){
	        ProPoetryExample testExample=new ProPoetryExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("uid ASC");
			if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<ProPoetry> list= proPoetryMapper.selectByExample(testExample);
	        PageInfo<ProPoetry> pageInfo = new PageInfo<ProPoetry>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			List<String> lista=ConvertUtil.toListStrArray(ids);
			ProPoetryExample example=new ProPoetryExample();
			example.createCriteria().andUidIn(lista);
			return proPoetryMapper.deleteByExample(example);
	}

	public int deleteStsByKey(ProPoetry proPoetry) {

		return proPoetryMapper.deleteStsByKey(proPoetry);
	}

	/**
	 * @param ids
	 * @return
	 */
	public int deleteBatchByPrimaryKey(String ids){
		String[] strings = ConvertUtil.toStrArray(",", ids);
		List<String> stringB = Arrays.asList(strings);

		return proPoetryMapper.deleteBatchByPrimaryKey(stringB);
	}

	public Map<String,Object> selectFinChaptCount(ProPoetry record) {

		return proPoetryMapper.selectFinChaptCount(record);

	}
	@Override
	public ProPoetry selectByPrimaryKey(String id) {
				
			return proPoetryMapper.selectByPrimaryKey(id);
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(ProPoetry record) {
		return proPoetryMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(ProPoetry record) {
				
		//添加雪花主键id
/*		record.setUid(SnowflakeIdWorker.getUUID());*/
			
				
		return proPoetryMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(ProPoetry record, ProPoetryExample example) {
		
		return proPoetryMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(ProPoetry record, ProPoetryExample example) {
		
		return proPoetryMapper.updateByExample(record, example);
	}

	@Override
	public List<ProPoetry> selectByExample(ProPoetryExample example) {
		
		return proPoetryMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(ProPoetryExample example) {
		
		return proPoetryMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ProPoetryExample example) {
		
		return proPoetryMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param proPoetry
	 * @return
	 */
	public int checkNameUnique(ProPoetry proPoetry){
		ProPoetryExample example=new ProPoetryExample();
		example.createCriteria().andCreateByEqualTo(proPoetry.getCreateBy());
		List<ProPoetry> list=proPoetryMapper.selectByExample(example);
		return list.size();
	}


}
