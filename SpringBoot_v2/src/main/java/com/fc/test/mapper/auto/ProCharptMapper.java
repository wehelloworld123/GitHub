package com.fc.test.mapper.auto;

import com.fc.test.model.auto.ProCharpt;
import com.fc.test.model.auto.ProCharptExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
 * 文学作品章节 ProCharptMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-06-30 16:41:40
 */
public interface ProCharptMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(ProCharptExample example);

    int deleteByExample(ProCharptExample example);
		
    int deleteByPrimaryKey(Integer id);
		
    int insert(ProCharpt record);

    int insertSelective(ProCharpt record);

    int insertBatch(List<ProCharpt> list);

    List<ProCharpt> selectChaptByCreateBy(ProCharpt record);

    List<ProCharpt> selectByExample(ProCharptExample example);
		
    ProCharpt selectByPrimaryKey(Integer id);
		
    int updateByExampleSelective(@Param("record") ProCharpt record, @Param("example") ProCharptExample example);

    int updateByExample(@Param("record") ProCharpt record, @Param("example") ProCharptExample example); 
		
    int updateByPrimaryKeySelective(ProCharpt record);

    int updateByPrimaryKey(ProCharpt record);

    Map<String,Object> selectChaptCountByBookId(ProCharpt record);

    Map<String,Object> queryProductInfoByChaptId(ProCharpt record);

    List<Map<String,Object>> queryRootInfo(ProCharpt record);

    List<Map<String,Object>> queryNoRootChaptInfo(ProCharpt record);

    List<ProCharpt> queryAdoptContentByProId(ProCharpt proCharpt);


    int deleteStsByKey(ProCharpt proCharpt);

    int deleteBatchByPrimaryKey(List<Long> list);
}