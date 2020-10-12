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
import com.fc.test.mapper.auto.ProPaintContentMapper;
import com.fc.test.model.auto.ProPaintContent;
import com.fc.test.model.auto.ProPaintContentExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;
import com.fc.test.util.StringUtils;

/**
 * 绘画创作内容 ProPaintContentService
 * @Title: ProPaintContentService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-05 11:59:40  
 **/
@Service
public class ProPaintContentService implements BaseService<ProPaintContent, ProPaintContentExample>{
	@Autowired
	private ProPaintContentMapper proPaintContentMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<ProPaintContent> list(Tablepar tablepar,ProPaintContent record){
	        ProPaintContentExample testExample=new ProPaintContentExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("no ASC");
			if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<ProPaintContent> list= proPaintContentMapper.selectByExample(testExample);
	        PageInfo<ProPaintContent> pageInfo = new PageInfo<ProPaintContent>(list);
	        return  pageInfo;
	 }

	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<ProPaintContent> queryRecomContentList(Tablepar tablepar,ProPaintContent record){

		PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
		List<ProPaintContent> list= proPaintContentMapper.selectRecomContentByPartId(record);
		PageInfo<ProPaintContent> pageInfo = new PageInfo<ProPaintContent>(list);
		return  pageInfo;
	}

	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<ProPaintContent> queryAdoptContentList(Tablepar tablepar,ProPaintContent record){

		PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
		List<ProPaintContent> list= proPaintContentMapper.selectAdoptContentByPartId(record);
		PageInfo<ProPaintContent> pageInfo = new PageInfo<ProPaintContent>(list);
		return  pageInfo;
	}

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			List<String> lista=ConvertUtil.toListStrArray(ids);
			ProPaintContentExample example=new ProPaintContentExample();
			example.createCriteria().andNoIn(lista);
			return proPaintContentMapper.deleteByExample(example);
			
				
	}

	public int deleteStsByKey(ProPaintContent proPaintContent) {

		return proPaintContentMapper.deleteStsByKey(proPaintContent);
	}

	/**
	 * 检查name
	 * @param ids
	 * @return
	 */
	public int deleteBatchByPrimaryKey(String ids){
		String[] strings = ConvertUtil.toStrArray(",", ids);
		List<String> stringB = Arrays.asList(strings);

		return proPaintContentMapper.deleteBatchByPrimaryKey(stringB);
	}


	public int selectAdoptCount(ProPaintContent record) {

		return proPaintContentMapper.selectAdoptCount(record);

	}

	@Override
	public ProPaintContent selectByPrimaryKey(String id) {
				
			return proPaintContentMapper.selectByPrimaryKey(id);
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(ProPaintContent record) {
		return proPaintContentMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(ProPaintContent record) {
				
		//添加雪花主键id
		record.setNo(SnowflakeIdWorker.getUUID());
			
				
		return proPaintContentMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(ProPaintContent record, ProPaintContentExample example) {
		
		return proPaintContentMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(ProPaintContent record, ProPaintContentExample example) {
		
		return proPaintContentMapper.updateByExample(record, example);
	}

	@Override
	public List<ProPaintContent> selectByExample(ProPaintContentExample example) {
		
		return proPaintContentMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(ProPaintContentExample example) {
		
		return proPaintContentMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ProPaintContentExample example) {
		
		return proPaintContentMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param proPaintContent
	 * @return
	 */
	public int checkNameUnique(ProPaintContent proPaintContent){
		ProPaintContentExample example=new ProPaintContentExample();
		example.createCriteria().andPaintIdEqualTo(proPaintContent.getPaintId());
		List<ProPaintContent> list=proPaintContentMapper.selectByExample(example);
		return list.size();
	}


}
