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
import com.fc.test.mapper.auto.ProPoemsetMapper;
import com.fc.test.model.auto.ProPoemset;
import com.fc.test.model.auto.ProPoemsetExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;
import com.fc.test.util.StringUtils;

/**
 * 诗歌作品分集 ProPoemsetService
 * @Title: ProPoemsetService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-06 23:32:31  
 **/
@Service
public class ProPoemsetService implements BaseService<ProPoemset, ProPoemsetExample>{
	@Autowired
	private ProPoemsetMapper proPoemsetMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<ProPoemset> list(Tablepar tablepar,ProPoemset record){
	        ProPoemsetExample testExample=new ProPoemsetExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("root_ord ASC,ord ASC");
			if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<ProPoemset> list= proPoemsetMapper.selectByExample(testExample);
	        PageInfo<ProPoemset> pageInfo = new PageInfo<ProPoemset>(list);
	        return  pageInfo;
	 }

	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<ProPoemset> listByCreateBy(Tablepar tablepar,ProPoemset record){
		//   ProPaintPartExample testExample=new ProPaintPartExample();
	 /*       testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("id ASC");
			if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }*/
		PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
		List<ProPoemset> list= proPoemsetMapper.selectChaptByCreateBy(record);
		PageInfo<ProPoemset> pageInfo = new PageInfo<ProPoemset>(list);
		return  pageInfo;
	}

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			ProPoemsetExample example=new ProPoemsetExample();
			example.createCriteria().andIdIn(stringB);
			return proPoemsetMapper.deleteByExample(example);
		
				
	}

	public int deleteStsByKey(ProPoemset proPoemset) {

		return proPoemsetMapper.deleteStsByKey(proPoemset);
	}


	public Map<String,Object> queryProductInfoByChaptId(ProPoemset record) {

		return proPoemsetMapper.queryProductInfoByChaptId(record);
	}
	/**
	 * @param ids
	 * @return
	 */
	public int deleteBatchByPrimaryKey(String ids){
		Long[] longs = ConvertUtil.toLongArray(",", ids);
		List<Long> longsB = Arrays.asList(longs);

		return proPoemsetMapper.deleteBatchByPrimaryKey(longsB);
	}

	public PageInfo<ProPoemset> queryAdoptContentByProId(ProPoemset proPoemset,int startIndex,int pageSize){
		PageHelper.startPage(startIndex, pageSize);
		List<ProPoemset> list= proPoemsetMapper.queryAdoptContentByPoetryId(proPoemset);
		PageInfo<ProPoemset> pageInfo = new PageInfo<ProPoemset>(list);
		return  pageInfo;
	}

	@Override
	public ProPoemset selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return proPoemsetMapper.selectByPrimaryKey(id1);
			
				
	}

	public List<Map<String,Object>> queryRootInfo(ProPoemset record){
		return proPoemsetMapper.queryRootInfo(record);
	}

	public List<Map<String,Object>> queryNoRootChaptInfo(ProPoemset record){
		return proPoemsetMapper.queryNoRootChaptInfo(record);
	}
	@Override
	public int updateByPrimaryKeySelective(ProPoemset record) {
		return proPoemsetMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(ProPoemset record) {
				
		record.setId(null);
		
				
		return proPoemsetMapper.insertSelective(record);
	}

	/**
	 * 批量添加
	 */
	public int insertSelective(List<ProPoemset> record) {


		return proPoemsetMapper.insertBatch(record);
	}

	@Override
	public int updateByExampleSelective(ProPoemset record, ProPoemsetExample example) {
		
		return proPoemsetMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(ProPoemset record, ProPoemsetExample example) {
		
		return proPoemsetMapper.updateByExample(record, example);
	}

	@Override
	public List<ProPoemset> selectByExample(ProPoemsetExample example) {
		
		return proPoemsetMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(ProPoemsetExample example) {
		
		return proPoemsetMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ProPoemsetExample example) {
		
		return proPoemsetMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param proPoemset
	 * @return
	 */
	public int checkNameUnique(ProPoemset proPoemset){
		ProPoemsetExample example=new ProPoemsetExample();
		example.createCriteria().andCreateByEqualTo(proPoemset.getCreateBy());
		List<ProPoemset> list=proPoemsetMapper.selectByExample(example);
		return list.size();
	}


}
