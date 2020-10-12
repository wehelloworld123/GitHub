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
import com.fc.test.mapper.auto.DebTopicMapper;
import com.fc.test.model.auto.DebTopic;
import com.fc.test.model.auto.DebTopicExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;
import com.fc.test.util.StringUtils;

/**
 * 标题信息表 DebTopicService
 * @Title: DebTopicService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-10-12 10:26:06  
 **/
@Service
public class DebTopicService implements BaseService<DebTopic, DebTopicExample>{
	@Autowired
	private DebTopicMapper debTopicMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<DebTopic> list(Tablepar tablepar,DebTopic record){
	        DebTopicExample testExample=new DebTopicExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("uid ASC");
			if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<DebTopic> list= debTopicMapper.selectByExample(testExample);
	        PageInfo<DebTopic> pageInfo = new PageInfo<DebTopic>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			List<String> lista=ConvertUtil.toListStrArray(ids);
			DebTopicExample example=new DebTopicExample();
			example.createCriteria().andUidIn(lista);
			return debTopicMapper.deleteByExample(example);
			
				
	}
	
	
	@Override
	public DebTopic selectByPrimaryKey(String id) {
				
			return debTopicMapper.selectByPrimaryKey(id);
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(DebTopic record) {
		return debTopicMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(DebTopic record) {
				
		//添加雪花主键id
		record.setUid(SnowflakeIdWorker.getUUID());
			
				
		return debTopicMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(DebTopic record, DebTopicExample example) {
		
		return debTopicMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(DebTopic record, DebTopicExample example) {
		
		return debTopicMapper.updateByExample(record, example);
	}

	@Override
	public List<DebTopic> selectByExample(DebTopicExample example) {
		
		return debTopicMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(DebTopicExample example) {
		
		return debTopicMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(DebTopicExample example) {
		
		return debTopicMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param debTopic
	 * @return
	 */
	public int checkNameUnique(DebTopic debTopic){
		DebTopicExample example=new DebTopicExample();
		example.createCriteria().andSubjectEqualTo(debTopic.getSubject());
		List<DebTopic> list=debTopicMapper.selectByExample(example);
		return list.size();
	}


}
