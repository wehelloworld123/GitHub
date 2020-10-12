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
import com.fc.test.mapper.auto.ProPaintPartMapper;
import com.fc.test.model.auto.ProPaintPart;
import com.fc.test.model.auto.ProPaintPartExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;
import com.fc.test.util.StringUtils;

/**
 * 绘画作品分集 ProPaintPartService
 * @Title: ProPaintPartService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-06-30 18:43:45  
 **/
@Service
public class ProPaintPartService implements BaseService<ProPaintPart, ProPaintPartExample>{
	@Autowired
	private ProPaintPartMapper proPaintPartMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<ProPaintPart> list(Tablepar tablepar,ProPaintPart record){
	        ProPaintPartExample testExample=new ProPaintPartExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("root_ord ASC,ord ASC");
			if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<ProPaintPart> list= proPaintPartMapper.selectByExample(testExample);
	        PageInfo<ProPaintPart> pageInfo = new PageInfo<ProPaintPart>(list);
	        return  pageInfo;
	 }

	 public Map<String,Object> selectPartCountByPaintId(ProPaintPart record){
	 	return proPaintPartMapper.selectPartCountByPaintId(record);
	 }
	public List<Map<String,Object>> queryRootInfo(ProPaintPart record){
		return proPaintPartMapper.queryRootInfo(record);
	}

	public List<Map<String,Object>> queryNoRootChaptInfo(ProPaintPart record){
		return proPaintPartMapper.queryNoRootChaptInfo(record);
	}

	public PageInfo<ProPaintPart> queryAdoptContentByProId(ProPaintPart proCharpt,int startIndex,int pageSize){
		PageHelper.startPage(startIndex, pageSize);
		List<ProPaintPart> list= proPaintPartMapper.queryAdoptContentByPaintId(proCharpt);
		PageInfo<ProPaintPart> pageInfo = new PageInfo<ProPaintPart>(list);
		return  pageInfo;
	}

	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<ProPaintPart> listByCreateBy(Tablepar tablepar,ProPaintPart record){
		//   ProPaintPartExample testExample=new ProPaintPartExample();
	 /*       testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("id ASC");
			if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }*/
		PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
		List<ProPaintPart> list= proPaintPartMapper.selectPartByCreateBy(record);
		PageInfo<ProPaintPart> pageInfo = new PageInfo<ProPaintPart>(list);
		return  pageInfo;
	}

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			ProPaintPartExample example=new ProPaintPartExample();
			example.createCriteria().andIdIn(stringB);
			return proPaintPartMapper.deleteByExample(example);
		
				
	}

	public int deleteStsByKey(ProPaintPart proPaintPart) {

		return proPaintPartMapper.deleteStsByKey(proPaintPart);
	}

	public Map<String,Object> queryProductInfoByChaptId(ProPaintPart record) {

		return proPaintPartMapper.queryProductInfoByChaptId(record);
	}
	/**
	 * 检查name
	 * @param ids
	 * @return
	 */
	public int deleteBatchByPrimaryKey(String ids){
		Long[] longs = ConvertUtil.toLongArray(",", ids);
		List<Long> longsB = Arrays.asList(longs);

		return proPaintPartMapper.deleteBatchByPrimaryKey(longsB);
	}
	
	
	@Override
	public ProPaintPart selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return proPaintPartMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(ProPaintPart record) {
		return proPaintPartMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(ProPaintPart record) {
		return proPaintPartMapper.insertSelective(record);
	}

	/**
	 * 批量添加
	 */
	public int insertSelective(List<ProPaintPart> record) {


		return proPaintPartMapper.insertBatch(record);
	}
	@Override
	public int updateByExampleSelective(ProPaintPart record, ProPaintPartExample example) {
		
		return proPaintPartMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(ProPaintPart record, ProPaintPartExample example) {
		
		return proPaintPartMapper.updateByExample(record, example);
	}

	@Override
	public List<ProPaintPart> selectByExample(ProPaintPartExample example) {
		
		return proPaintPartMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(ProPaintPartExample example) {
		
		return proPaintPartMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ProPaintPartExample example) {
		
		return proPaintPartMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param proPaintPart
	 * @return
	 */
	public int checkNameUnique(ProPaintPart proPaintPart){
		ProPaintPartExample example=new ProPaintPartExample();
		example.createCriteria().andSubjectEqualTo(proPaintPart.getSubject());
		List<ProPaintPart> list=proPaintPartMapper.selectByExample(example);
		return list.size();
	}


}
