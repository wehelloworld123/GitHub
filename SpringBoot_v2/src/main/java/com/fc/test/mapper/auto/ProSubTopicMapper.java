package com.fc.test.mapper.auto;

import com.fc.test.model.auto.ProSubTopic;
import com.fc.test.model.auto.ProSubTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 专题表 ProSubTopicMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-10-11 23:31:49
 */
public interface ProSubTopicMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(ProSubTopicExample example);

    int deleteByExample(ProSubTopicExample example);
		
    int deleteByPrimaryKey(String id);
		
    int insert(ProSubTopic record);

    int insertSelective(ProSubTopic record);

    List<ProSubTopic> selectByExample(ProSubTopicExample example);
		
    ProSubTopic selectByPrimaryKey(String id);
		
    int updateByExampleSelective(@Param("record") ProSubTopic record, @Param("example") ProSubTopicExample example);

    int updateByExample(@Param("record") ProSubTopic record, @Param("example") ProSubTopicExample example); 
		
    int updateByPrimaryKeySelective(ProSubTopic record);

    int updateByPrimaryKey(ProSubTopic record);
  	  	
}