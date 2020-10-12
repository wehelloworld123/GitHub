package com.fc.test.mapper.auto;

import com.fc.test.model.auto.ProLiter;
import com.fc.test.model.auto.ProLiterExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
 * 文学创作信息表 ProLiterMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-10 23:23:09
 */
public interface ProLiterMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(ProLiterExample example);

    int deleteByExample(ProLiterExample example);
		
    int deleteByPrimaryKey(String id);
		
    int insert(ProLiter record);

    int insertSelective(ProLiter record);

    List<ProLiter> selectByExample(ProLiterExample example);
		
    ProLiter selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProLiter record, @Param("example") ProLiterExample example);

    int updateByExample(@Param("record") ProLiter record, @Param("example") ProLiterExample example); 
		
    int updateByPrimaryKeySelective(ProLiter record);

    int updateByPrimaryKey(ProLiter record);

    Map<String,Object> selectFinChapterCount(ProLiter record);

    int deleteStsByKey(ProLiter proCharpt);

    int deleteBatchByPrimaryKey(List<String> list);
}