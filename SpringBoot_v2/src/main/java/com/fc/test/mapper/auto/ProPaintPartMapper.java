package com.fc.test.mapper.auto;

import com.fc.test.model.auto.ProPaintPart;
import com.fc.test.model.auto.ProPaintPartExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
 * 绘画作品分集 ProPaintPartMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-06-30 18:43:45
 */
public interface ProPaintPartMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(ProPaintPartExample example);

    int deleteByExample(ProPaintPartExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(ProPaintPart record);

    int insertBatch(List<ProPaintPart> list);

    int insertSelective(ProPaintPart record);

    List<ProPaintPart> selectByExample(ProPaintPartExample example);

    List<ProPaintPart> selectPartByCreateBy(ProPaintPart record);
		
    ProPaintPart selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") ProPaintPart record, @Param("example") ProPaintPartExample example);

    int updateByExample(@Param("record") ProPaintPart record, @Param("example") ProPaintPartExample example); 
		
    int updateByPrimaryKeySelective(ProPaintPart record);

    int updateByPrimaryKey(ProPaintPart record);

    Map<String,Object> selectPartCountByPaintId(ProPaintPart record);

    Map<String,Object> queryProductInfoByChaptId(ProPaintPart record);

    List<Map<String,Object>> queryRootInfo(ProPaintPart record);

    List<Map<String,Object>> queryNoRootChaptInfo(ProPaintPart record);

    List<ProPaintPart> queryAdoptContentByPaintId(ProPaintPart proCharpt);

    int deleteStsByKey(ProPaintPart proCharpt);

    int deleteBatchByPrimaryKey(List<Long> list);
}