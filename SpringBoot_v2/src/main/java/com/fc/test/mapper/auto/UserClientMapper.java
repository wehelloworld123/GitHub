package com.fc.test.mapper.auto;

import com.fc.test.model.auto.UserClient;
import com.fc.test.model.auto.UserClientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 用户设备表 UserClientMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-19 11:34:21
 */
public interface UserClientMapper {
      	   	      	      	      	      	      	      	      	      	      	      
    long countByExample(UserClientExample example);

    int deleteByExample(UserClientExample example);
		
    int deleteByPrimaryKey(String id);
		
    int insert(UserClient record);

    int insertSelective(UserClient record);

    List<UserClient> selectByExample(UserClientExample example);
		
    UserClient selectByPrimaryKey(String id);
		
    int updateByExampleSelective(@Param("record") UserClient record, @Param("example") UserClientExample example);

    int updateByExample(@Param("record") UserClient record, @Param("example") UserClientExample example); 
		
    int updateByPrimaryKeySelective(UserClient record);

    int updateByPrimaryKey(UserClient record);

    int deleteStsByKey(UserClient proCharpt);

    int deleteBatchByPrimaryKey(List<String> list);
}