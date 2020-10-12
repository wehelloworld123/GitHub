package com.fc.test.mapper.auto;

import com.fc.test.model.auto.ProContent;
import com.fc.test.model.auto.ProContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 文学创作内容 ProContentMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-11 13:23:00
 */
public interface ProContentMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(ProContentExample example);

    int deleteByExample(ProContentExample example);
		
    int deleteByPrimaryKey(String id);
		
    int insert(ProContent record);

    int insertSelective(ProContent record);

    List<ProContent> selectByExample(ProContentExample example);


    List<ProContent> selectRecomContentByChapId(ProContent record);

    List<ProContent> selectAdoptContentByChapId(ProContent record);
		
    ProContent selectByPrimaryKey(String id);
		
    int updateByExampleSelective(@Param("record") ProContent record, @Param("example") ProContentExample example);

    int updateByExample(@Param("record") ProContent record, @Param("example") ProContentExample example); 
		
    int updateByPrimaryKeySelective(ProContent record);

    int updateByPrimaryKey(ProContent record);


    int selectAdoptCount(ProContent record);

    int deleteStsByKey(ProContent proCharpt);

    int deleteBatchByPrimaryKey(List<String> list);
}