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
import com.fc.test.mapper.auto.ProContentMapper;
import com.fc.test.model.auto.ProContent;
import com.fc.test.model.auto.ProContentExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;
import com.fc.test.util.StringUtils;

/**
 * 文学创作内容 ProContentService
 * @Title: ProContentService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-11 13:23:00  
 **/
@Service
public class ProContentService implements BaseService<ProContent, ProContentExample>{
	@Autowired
	private ProContentMapper proContentMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<ProContent> list(Tablepar tablepar,ProContent record){
	        ProContentExample testExample=new ProContentExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("no ASC");
			if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<ProContent> list= proContentMapper.selectByExample(testExample);
	        PageInfo<ProContent> pageInfo = new PageInfo<ProContent>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			List<String> lista=ConvertUtil.toListStrArray(ids);
			ProContentExample example=new ProContentExample();
			example.createCriteria().andNoIn(lista);
			return proContentMapper.deleteByExample(example);
			
				
	}

	public int deleteStsByKey(ProContent proContent) {

		return proContentMapper.deleteStsByKey(proContent);
	}

	/**
	 * 检查name
	 * @param ids
	 * @return
	 */
	public int deleteBatchByPrimaryKey(String ids){
		String[] strings = ConvertUtil.toStrArray(",", ids);
		List<String> stringB = Arrays.asList(strings);

		return proContentMapper.deleteBatchByPrimaryKey(stringB);
	}

	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<ProContent> queryRecomContentList(Tablepar tablepar,ProContent record){

		PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
		List<ProContent> list= proContentMapper.selectRecomContentByChapId(record);
		PageInfo<ProContent> pageInfo = new PageInfo<ProContent>(list);
		return  pageInfo;
	}

	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<ProContent> queryAdoptContentList(Tablepar tablepar,ProContent record){

		PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
		List<ProContent> list= proContentMapper.selectAdoptContentByChapId(record);
		PageInfo<ProContent> pageInfo = new PageInfo<ProContent>(list);
		return  pageInfo;
	}

	public int selectAdoptCount(ProContent record) {

		return proContentMapper.selectAdoptCount(record);

	}
	
	@Override
	public ProContent selectByPrimaryKey(String id) {
				
			return proContentMapper.selectByPrimaryKey(id);
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(ProContent record) {
		return proContentMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(ProContent record) {
				
		//添加雪花主键id
		record.setNo(SnowflakeIdWorker.getUUID());
			
				
		return proContentMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(ProContent record, ProContentExample example) {
		
		return proContentMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(ProContent record, ProContentExample example) {
		
		return proContentMapper.updateByExample(record, example);
	}

	@Override
	public List<ProContent> selectByExample(ProContentExample example) {
		
		return proContentMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(ProContentExample example) {
		
		return proContentMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ProContentExample example) {
		
		return proContentMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param proContent
	 * @return
	 */
	public int checkNameUnique(ProContent proContent){
		ProContentExample example=new ProContentExample();
		example.createCriteria().andCharpIdEqualTo(proContent.getCharpId());
		List<ProContent> list=proContentMapper.selectByExample(example);
		return list.size();
	}


}
