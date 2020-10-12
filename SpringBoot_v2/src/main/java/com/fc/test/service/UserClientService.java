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
import com.fc.test.mapper.auto.UserClientMapper;
import com.fc.test.model.auto.UserClient;
import com.fc.test.model.auto.UserClientExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;
import com.fc.test.util.StringUtils;

/**
 * 用户设备表 UserClientService
 * @Title: UserClientService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-19 11:34:21  
 **/
@Service
public class UserClientService implements BaseService<UserClient, UserClientExample>{
	@Autowired
	private UserClientMapper userClientMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<UserClient> list(Tablepar tablepar,UserClient record){
	        UserClientExample testExample=new UserClientExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("id ASC");
			if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<UserClient> list= userClientMapper.selectByExample(testExample);
	        PageInfo<UserClient> pageInfo = new PageInfo<UserClient>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			List<String> lista=ConvertUtil.toListStrArray(ids);
			UserClientExample example=new UserClientExample();
			example.createCriteria().andIdIn(lista);
			return userClientMapper.deleteByExample(example);
	}

	public int deleteStsByKey(UserClient userClient) {

		return userClientMapper.deleteStsByKey(userClient);
	}

	/**
	 * @param ids
	 * @return
	 */
	public int deleteBatchByPrimaryKey(String ids){
		String[] strings = ConvertUtil.toStrArray(",", ids);
		List<String> stringsB = Arrays.asList(strings);
		return userClientMapper.deleteBatchByPrimaryKey(stringsB);
	}
	
	
	@Override
	public UserClient selectByPrimaryKey(String id) {
				
			return userClientMapper.selectByPrimaryKey(id);
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(UserClient record) {
		return userClientMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(UserClient record) {
				
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
			
				
		return userClientMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(UserClient record, UserClientExample example) {
		
		return userClientMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(UserClient record, UserClientExample example) {
		
		return userClientMapper.updateByExample(record, example);
	}

	@Override
	public List<UserClient> selectByExample(UserClientExample example) {
		
		return userClientMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(UserClientExample example) {
		
		return userClientMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(UserClientExample example) {
		
		return userClientMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param userClient
	 * @return
	 */
	public int checkNameUnique(UserClient userClient){
		UserClientExample example=new UserClientExample();
		example.createCriteria().andUserIdEqualTo(userClient.getUserId());
		List<UserClient> list=userClientMapper.selectByExample(example);
		return list.size();
	}


}
