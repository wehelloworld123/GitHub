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
import com.fc.test.mapper.auto.ProSubTopicMapper;
import com.fc.test.model.auto.ProSubTopic;
import com.fc.test.model.auto.ProSubTopicExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;
import com.fc.test.util.StringUtils;

/**
 * 专题表 ProSubTopicService
 * @Title: ProSubTopicService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-10-11 23:31:49  
 **/
@Service
public class ProSubTopicService implements BaseService<ProSubTopic, ProSubTopicExample>{
	@Autowired
	private ProSubTopicMapper proSubTopicMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<ProSubTopic> list(Tablepar tablepar,ProSubTopic record){
	        ProSubTopicExample testExample=new ProSubTopicExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("topic_id ASC");
			if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<ProSubTopic> list= proSubTopicMapper.selectByExample(testExample);
	        PageInfo<ProSubTopic> pageInfo = new PageInfo<ProSubTopic>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			List<String> lista=ConvertUtil.toListStrArray(ids);
			ProSubTopicExample example=new ProSubTopicExample();
			example.createCriteria().andTopicIdIn(lista);
			return proSubTopicMapper.deleteByExample(example);
			
				
	}
	
	
	@Override
	public ProSubTopic selectByPrimaryKey(String id) {
				
			return proSubTopicMapper.selectByPrimaryKey(id);
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(ProSubTopic record) {
		return proSubTopicMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(ProSubTopic record) {
				
		//添加雪花主键id
		record.setTopicId(SnowflakeIdWorker.getUUID());
			
				
		return proSubTopicMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(ProSubTopic record, ProSubTopicExample example) {
		
		return proSubTopicMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(ProSubTopic record, ProSubTopicExample example) {
		
		return proSubTopicMapper.updateByExample(record, example);
	}

	@Override
	public List<ProSubTopic> selectByExample(ProSubTopicExample example) {
		
		return proSubTopicMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(ProSubTopicExample example) {
		
		return proSubTopicMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ProSubTopicExample example) {
		
		return proSubTopicMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param proSubTopic
	 * @return
	 */
	public int checkNameUnique(ProSubTopic proSubTopic){
		ProSubTopicExample example=new ProSubTopicExample();
		example.createCriteria().andTopicEqualTo(proSubTopic.getTopic());
		List<ProSubTopic> list=proSubTopicMapper.selectByExample(example);
		return list.size();
	}


}
