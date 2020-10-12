package com.fc.test.service;

import java.util.List;
import java.util.Arrays;
import java.util.Map;

import com.fc.test.model.auto.ProCharpt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.ConvertUtil;
import com.fc.test.mapper.auto.ProLiterMapper;
import com.fc.test.model.auto.ProLiter;
import com.fc.test.model.auto.ProLiterExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;
import com.fc.test.util.StringUtils;

/**
 * 文学创作信息表 ProLiterService
 * @Title: ProLiterService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-10 23:23:09  
 **/
@Service
public class ProLiterService implements BaseService<ProLiter, ProLiterExample>{
	@Autowired
	private ProLiterMapper proLiterMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<ProLiter> list(Tablepar tablepar,ProLiter record){
	        ProLiterExample testExample=new ProLiterExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("uid ASC");
			if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<ProLiter> list= proLiterMapper.selectByExample(testExample);
	        PageInfo<ProLiter> pageInfo = new PageInfo<ProLiter>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			List<String> lista=ConvertUtil.toListStrArray(ids);
			ProLiterExample example=new ProLiterExample();
			example.createCriteria().andUidIn(lista);
			return proLiterMapper.deleteByExample(example);
			
				
	}
	
	
	@Override
	public ProLiter selectByPrimaryKey(String id) {
				
			return proLiterMapper.selectByPrimaryKey(id);
				
	}

	public Map<String,Object> selectFinChapterCount(ProLiter record) {

		return proLiterMapper.selectFinChapterCount(record);

	}
	
	@Override
	public int updateByPrimaryKeySelective(ProLiter record) {
		return proLiterMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(ProLiter record) {

			
				
		return proLiterMapper.insertSelective(record);
	}

	
	@Override
	public int updateByExampleSelective(ProLiter record, ProLiterExample example) {
		
		return proLiterMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(ProLiter record, ProLiterExample example) {
		
		return proLiterMapper.updateByExample(record, example);
	}

	@Override
	public List<ProLiter> selectByExample(ProLiterExample example) {
		
		return proLiterMapper.selectByExample(example);
	}

	@Override
	public long countByExample(ProLiterExample example) {
		
		return proLiterMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ProLiterExample example) {
		
		return proLiterMapper.deleteByExample(example);
	}

	public int deleteStsByKey(ProLiter proLiter) {

		return proLiterMapper.deleteStsByKey(proLiter);
	}

	/**
	 * 检查name
	 * @param ids
	 * @return
	 */
	public int deleteBatchByPrimaryKey(String ids){
		String[] strings = ConvertUtil.toStrArray(",", ids);
		List<String> stringB = Arrays.asList(strings);

		return proLiterMapper.deleteBatchByPrimaryKey(stringB);
	}
	
	/**
	 * 检查name
	 * @param proLiter
	 * @return
	 */
	public int checkNameUnique(ProLiter proLiter){
		ProLiterExample example=new ProLiterExample();
		example.createCriteria().andCreateByEqualTo(proLiter.getCreateBy());
		List<ProLiter> list=proLiterMapper.selectByExample(example);
		return list.size();
	}


}
