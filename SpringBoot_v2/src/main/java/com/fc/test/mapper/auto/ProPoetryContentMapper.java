package com.fc.test.mapper.auto;

import com.fc.test.model.auto.ProPoetryContent;
import com.fc.test.model.auto.ProPoetryContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 诗歌创作内容 ProPoetryContentMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-09 12:08:33
 */
public interface ProPoetryContentMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(ProPoetryContentExample example);

    int deleteByExample(ProPoetryContentExample example);
		
    int deleteByPrimaryKey(String id);
		
    int insert(ProPoetryContent record);

    int insertSelective(ProPoetryContent record);

    List<ProPoetryContent> selectByExample(ProPoetryContentExample example);

    List<ProPoetryContent> selectRecomContentByChaptId(ProPoetryContent record);

    List<ProPoetryContent> selectAdoptContentByChaptId(ProPoetryContent record);
		
    ProPoetryContent selectByPrimaryKey(String id);
		
    int updateByExampleSelective(@Param("record") ProPoetryContent record, @Param("example") ProPoetryContentExample example);

    int updateByExample(@Param("record") ProPoetryContent record, @Param("example") ProPoetryContentExample example); 
		
    int updateByPrimaryKeySelective(ProPoetryContent record);

    int updateByPrimaryKey(ProPoetryContent record);

    int selectAdoptCount(ProPoetryContent record);

    int deleteStsByKey(ProPoetryContent proCharpt);

    int deleteBatchByPrimaryKey(List<String> list);
}