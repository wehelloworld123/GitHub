package com.fc.test.mapper.auto;

import com.fc.test.model.auto.DebTopic;
import com.fc.test.model.auto.DebTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 标题信息表 DebTopicMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-10-12 10:26:06
 */
public interface DebTopicMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(DebTopicExample example);

    int deleteByExample(DebTopicExample example);
		
    int deleteByPrimaryKey(String id);
		
    int insert(DebTopic record);

    int insertSelective(DebTopic record);

    List<DebTopic> selectByExample(DebTopicExample example);
		
    DebTopic selectByPrimaryKey(String id);
		
    int updateByExampleSelective(@Param("record") DebTopic record, @Param("example") DebTopicExample example);

    int updateByExample(@Param("record") DebTopic record, @Param("example") DebTopicExample example); 
		
    int updateByPrimaryKeySelective(DebTopic record);

    int updateByPrimaryKey(DebTopic record);
  	  	
}