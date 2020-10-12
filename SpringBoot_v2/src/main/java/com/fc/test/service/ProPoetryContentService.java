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
import com.fc.test.mapper.auto.ProPoetryContentMapper;
import com.fc.test.model.auto.ProPoetryContent;
import com.fc.test.model.auto.ProPoetryContentExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;
import com.fc.test.util.StringUtils;

/**
 * 诗歌创作内容 ProPoetryContentService
 * @Title: ProPoetryContentService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-09 12:08:33  
 **/
@Service
public class ProPoetryContentService implements BaseService<ProPoetryContent, ProPoetryContentExample>{
	@Autowired
	private ProPoetryContentMapper proPoetryContentMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<ProPoetryContent> list(Tablepar tablepar,ProPoetryContent record){
	        ProPoetryContentExample testExample=new ProPoetryContentExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("no ASC");
			if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<ProPoetryContent> list= proPoetryContentMapper.selectByExample(testExample);
	        PageInfo<ProPoetryContent> pageInfo = new PageInfo<ProPoetryContent>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			List<String> lista=ConvertUtil.toListStrArray(ids);
			ProPoetryContentExample example=new ProPoetryContentExample();
			example.createCriteria().andNoIn(lista);
			return proPoetryContentMapper.deleteByExample(example);
	}

	public int deleteStsByKey(ProPoetryContent proPoetryContent) {

		return proPoetryContentMapper.deleteStsByKey(proPoetryContent);
	}

	/**
	 * @param ids
	 * @return
	 */
	public int deleteBatchByPrimaryKey(String ids){
		String[] strings = ConvertUtil.toStrArray(",", ids);
		List<String> stringB = Arrays.asList(strings);

		return proPoetryContentMapper.deleteBatchByPrimaryKey(stringB);
	}

	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<ProPoetryContent> queryRecomContentList(Tablepar tablepar,ProPoetryContent record){

		PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
		List<ProPoetryContent> list= proPoetryContentMapper.selectRecomContentByChaptId(record);
		PageInfo<ProPoetryContent> pageInfo = new PageInfo<ProPoetryContent>(list);
		return  pageInfo;
	}

	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<ProPoetryContent> queryAdoptContentList(Tablepar tablepar,ProPoetryContent record){

		PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
		List<ProPoetryContent> list= proPoetryContentMapper.selectAdoptContentByChaptId(record);
		PageInfo<ProPoetryContent> pageInfo = new PageInfo<ProPoetryContent>(list);
		return  pageInfo;
	}
	
	@Override
	public ProPoetryContent selectByPrimaryKey(String id) {
				
			return proPoetryContentMapper.selectByPrimaryKey(id);
				
	}

	public int selectAdoptCount(ProPoetryContent record) {

		return proPoetryContentMapper.selectAdoptCount(record);

	}
	
	@Override
	public int updateByPrimaryKeySelective(ProPoetryContent record) {
		return proPoetryContentMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(ProPoetryContent record) {
				
		//添加雪花主键id
		record.setNo(SnowflakeIdWorker.getUUID());
			
				
		return proPoetryContentMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(ProPoetryContent record, ProPoetryContentExample example) {
		
		return proPoetryContentMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(ProPoetryContent record, ProPoetryContentExample example) {
		
		return proPoetryContentMapper.updateByExample(record, example);
	}

	@Override
	public List<ProPoetryContent> selectByExample(ProPoetryContentExample example) {
		
		return proPoetryContentMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(ProPoetryContentExample example) {
		
		return proPoetryContentMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ProPoetryContentExample example) {
		
		return proPoetryContentMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param proPoetryContent
	 * @return
	 */
	public int checkNameUnique(ProPoetryContent proPoetryContent){
		ProPoetryContentExample example=new ProPoetryContentExample();
		example.createCriteria().andCharpIdEqualTo(proPoetryContent.getCharpId());
		List<ProPoetryContent> list=proPoetryContentMapper.selectByExample(example);
		return list.size();
	}


}
