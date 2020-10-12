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
import com.fc.test.mapper.auto.ProCharptMapper;
import com.fc.test.model.auto.ProCharpt;
import com.fc.test.model.auto.ProCharptExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;
import com.fc.test.util.StringUtils;

/**
 * 文学作品章节 ProCharptService
 * @Title: ProCharptService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-06-30 16:41:40  
 **/
@Service
public class ProCharptService implements BaseService<ProCharpt, ProCharptExample>{
	@Autowired
	private ProCharptMapper proCharptMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<ProCharpt> list(Tablepar tablepar,ProCharpt record){
	        ProCharptExample testExample=new ProCharptExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("root_ord ASC,ord ASC");
			if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<ProCharpt> list= proCharptMapper.selectByExample(testExample);
	        PageInfo<ProCharpt> pageInfo = new PageInfo<ProCharpt>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {

			Long[] longs = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(longs);
			ProCharptExample example=new ProCharptExample();
			example.createCriteria().andIdIn(stringB);
			return proCharptMapper.deleteByExample(example);
			
				
	}
	
	
	@Override
	public ProCharpt selectByPrimaryKey(String id) {
				
			Integer id1 = Integer.valueOf(id);
			return proCharptMapper.selectByPrimaryKey(id1);
				
	}

	public Map<String,Object> queryProductInfoByChaptId(ProCharpt record) {

		return proCharptMapper.queryProductInfoByChaptId(record);
	}

	public PageInfo<ProCharpt> queryAdoptContentByProId(ProCharpt proCharpt,int startIndex,int pageSize){
		PageHelper.startPage(startIndex, pageSize);
		List<ProCharpt> list= proCharptMapper.queryAdoptContentByProId(proCharpt);
		PageInfo<ProCharpt> pageInfo = new PageInfo<ProCharpt>(list);
		return  pageInfo;
	}

	
	@Override
	public int updateByPrimaryKeySelective(ProCharpt record) {
		return proCharptMapper.updateByPrimaryKeySelective(record);
	}
	public List<Map<String,Object>> queryRootInfo(ProCharpt record){
		return proCharptMapper.queryRootInfo(record);
	}

	public List<Map<String,Object>> queryNoRootChaptInfo(ProCharpt record){
		return proCharptMapper.queryNoRootChaptInfo(record);
	}
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(ProCharpt record) {
				
		record.setId(null);
		
				
		return proCharptMapper.insertSelective(record);
	}
	/**
	 * 批量添加
	 */
	public int insertSelective(List<ProCharpt> record) {


		return proCharptMapper.insertBatch(record);
	}


	public Map<String,Object> selectChaptCountByBookId(ProCharpt record){
		return proCharptMapper.selectChaptCountByBookId(record);
	}

	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<ProCharpt> listByCreateBy(Tablepar tablepar,ProCharpt record){
		//   ProPaintPartExample testExample=new ProPaintPartExample();
	 /*       testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("id ASC");
			if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }*/
		PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
		List<ProCharpt> list= proCharptMapper.selectChaptByCreateBy(record);
		PageInfo<ProCharpt> pageInfo = new PageInfo<ProCharpt>(list);
		return  pageInfo;
	}

	@Override
	public int updateByExampleSelective(ProCharpt record, ProCharptExample example) {
		
		return proCharptMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(ProCharpt record, ProCharptExample example) {
		
		return proCharptMapper.updateByExample(record, example);
	}

	@Override
	public List<ProCharpt> selectByExample(ProCharptExample example) {
		
		return proCharptMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(ProCharptExample example) {
		
		return proCharptMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ProCharptExample example) {
		
		return proCharptMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param proCharpt
	 * @return
	 */
	public int checkNameUnique(ProCharpt proCharpt){
		ProCharptExample example=new ProCharptExample();
		example.createCriteria().andBookIdEqualTo(proCharpt.getBookId());
		List<ProCharpt> list=proCharptMapper.selectByExample(example);
		return list.size();
	}

	public int deleteStsByKey(ProCharpt proCharpt) {

		return proCharptMapper.deleteStsByKey(proCharpt);
	}

	/**
	 * 检查name
	 * @param ids
	 * @return
	 */
	public int deleteBatchByPrimaryKey(String ids){
		Long[] longs = ConvertUtil.toLongArray(",", ids);
		List<Long> stringB = Arrays.asList(longs);

		return proCharptMapper.deleteBatchByPrimaryKey(stringB);
	}

}
