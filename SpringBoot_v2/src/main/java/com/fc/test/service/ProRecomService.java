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
import com.fc.test.mapper.auto.ProRecomMapper;
import com.fc.test.model.auto.ProRecom;
import com.fc.test.model.auto.ProRecomExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;
import com.fc.test.util.StringUtils;

/**
 * 创作推荐表 ProRecomService
 * @Title: ProRecomService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-12 17:17:42  
 **/
@Service
public class ProRecomService implements BaseService<ProRecom, ProRecomExample>{
	@Autowired
	private ProRecomMapper proRecomMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<ProRecom> list(Tablepar tablepar,ProRecom record){
	        ProRecomExample testExample=new ProRecomExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("id ASC");
			if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<ProRecom> list= proRecomMapper.selectByExample(testExample);
	        PageInfo<ProRecom> pageInfo = new PageInfo<ProRecom>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {

			Long[] longs = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(longs);
			ProRecomExample example=new ProRecomExample();
			example.createCriteria().andIdIn(stringB);
			return proRecomMapper.deleteByExample(example);
	}

	public int deleteStsByKey(ProRecom proRecom) {

		return proRecomMapper.deleteStsByKey(proRecom);
	}

	/**
	 * @param ids
	 * @return
	 */
	public int deleteBatchByPrimaryKey(String ids){
		Long[] longs = ConvertUtil.toLongArray(",", ids);
		List<Long> longsB = Arrays.asList(longs);
		return proRecomMapper.deleteBatchByPrimaryKey(longsB);
	}
	
	@Override
	public ProRecom selectByPrimaryKey(String id) {
				
			Integer id1 = Integer.valueOf(id);
			return proRecomMapper.selectByPrimaryKey(id1);
				
	}

	public List<ProRecom> queryRecomList(String no,int startIndex,int pageSize){
		PageHelper.startPage(startIndex, pageSize);
		List<ProRecom> list= proRecomMapper.select(no);
		PageInfo<ProRecom> pageInfo = new PageInfo<ProRecom>(list);
		return pageInfo.getList();
	}
	
	@Override
	public int updateByPrimaryKeySelective(ProRecom record) {
		return proRecomMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(ProRecom record) {
				
		record.setId(null);
		
				
		return proRecomMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(ProRecom record, ProRecomExample example) {
		
		return proRecomMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(ProRecom record, ProRecomExample example) {
		
		return proRecomMapper.updateByExample(record, example);
	}

	@Override
	public List<ProRecom> selectByExample(ProRecomExample example) {
		
		return proRecomMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(ProRecomExample example) {
		
		return proRecomMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ProRecomExample example) {
		
		return proRecomMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param proRecom
	 * @return
	 */
	public int checkNameUnique(ProRecom proRecom){
		ProRecomExample example=new ProRecomExample();
		example.createCriteria().andContentIdEqualTo(proRecom.getContentId());
		List<ProRecom> list=proRecomMapper.selectByExample(example);
		return list.size();
	}


}
