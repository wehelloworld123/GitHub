package com.fc.test.mapper.auto;

import com.fc.test.model.auto.ProPoetry;
import com.fc.test.model.auto.ProPoetryExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
 * 诗歌创作集 ProPoetryMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-06-29 17:39:28
 */
public interface ProPoetryMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(ProPoetryExample example);

    int deleteByExample(ProPoetryExample example);
		
    int deleteByPrimaryKey(String id);
		
    int insert(ProPoetry record);

    int insertSelective(ProPoetry record);

    List<ProPoetry> selectByExample(ProPoetryExample example);
		
    ProPoetry selectByPrimaryKey(String id);
		
    int updateByExampleSelective(@Param("record") ProPoetry record, @Param("example") ProPoetryExample example);

    int updateByExample(@Param("record") ProPoetry record, @Param("example") ProPoetryExample example); 
		
    int updateByPrimaryKeySelective(ProPoetry record);

    int updateByPrimaryKey(ProPoetry record);

    Map<String,Object> selectFinChaptCount(ProPoetry record);

    int deleteStsByKey(ProPoetry proCharpt);

    int deleteBatchByPrimaryKey(List<String> list);
}