package com.fc.test.mapper.auto;

import com.fc.test.model.auto.ProRecom;
import com.fc.test.model.auto.ProRecomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 创作推荐表 ProRecomMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-12 17:17:42
 */
public interface ProRecomMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(ProRecomExample example);

    int deleteByExample(ProRecomExample example);
		
    int deleteByPrimaryKey(Integer id);
		
    int insert(ProRecom record);

    int insertSelective(ProRecom record);

    List<ProRecom> selectByExample(ProRecomExample example);

    List<ProRecom> select(@Param("no") String no);
		
    ProRecom selectByPrimaryKey(Integer id);
		
    int updateByExampleSelective(@Param("record") ProRecom record, @Param("example") ProRecomExample example);

    int updateByExample(@Param("record") ProRecom record, @Param("example") ProRecomExample example); 
		
    int updateByPrimaryKeySelective(ProRecom record);

    int updateByPrimaryKey(ProRecom record);

    int deleteStsByKey(ProRecom proCharpt);

    int deleteBatchByPrimaryKey(List<Long> list);
}