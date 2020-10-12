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
import com.fc.test.mapper.auto.ProPaintMapper;
import com.fc.test.model.auto.ProPaint;
import com.fc.test.model.auto.ProPaintExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;
import com.fc.test.util.StringUtils;

/**
 * 绘画创作集 ProPaintService
 * @Title: ProPaintService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-06-29 16:48:18  
 **/
@Service
public class ProPaintService implements BaseService<ProPaint, ProPaintExample>{
	@Autowired
	private ProPaintMapper proPaintMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<ProPaint> list(Tablepar tablepar,ProPaint record){
	        ProPaintExample testExample=new ProPaintExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("uid ASC");

			if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<ProPaint> list= proPaintMapper.selectByExample(testExample);
	        PageInfo<ProPaint> pageInfo = new PageInfo<ProPaint>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			List<String> lista=ConvertUtil.toListStrArray(ids);
			ProPaintExample example=new ProPaintExample();
			example.createCriteria().andUidIn(lista);
			return proPaintMapper.deleteByExample(example);
			
				
	}

	public int deleteStsByKey(ProPaint proPaint) {

		return proPaintMapper.deleteStsByKey(proPaint);
	}

	/**
	 * @param ids
	 * @return
	 */
	public int deleteBatchByPrimaryKey(String ids){
		String[] strings = ConvertUtil.toStrArray(",", ids);
		List<String> stringB = Arrays.asList(strings);

		return proPaintMapper.deleteBatchByPrimaryKey(stringB);
	}

	@Override
	public ProPaint selectByPrimaryKey(String id) {
				
			return proPaintMapper.selectByPrimaryKey(id);
				
	}

	public Map<String,Object> selectFinPartCount(ProPaint record) {

		return proPaintMapper.selectFinPartCount(record);

	}
	
	@Override
	public int updateByPrimaryKeySelective(ProPaint record) {
		return proPaintMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(ProPaint record) {
		return proPaintMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(ProPaint record, ProPaintExample example) {
		
		return proPaintMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(ProPaint record, ProPaintExample example) {
		
		return proPaintMapper.updateByExample(record, example);
	}

	@Override
	public List<ProPaint> selectByExample(ProPaintExample example) {
		
		return proPaintMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(ProPaintExample example) {
		
		return proPaintMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ProPaintExample example) {
		
		return proPaintMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param proPaint
	 * @return
	 */
	public int checkNameUnique(ProPaint proPaint){
		ProPaintExample example=new ProPaintExample();
		example.createCriteria().andCreateByEqualTo(proPaint.getCreateBy());
		List<ProPaint> list=proPaintMapper.selectByExample(example);
		return list.size();
	}


}
