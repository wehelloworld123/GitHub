package com.fc.test.mapper.auto;

import com.fc.test.model.auto.ProPaint;
import com.fc.test.model.auto.ProPaintExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
 * 绘画创作集 ProPaintMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-06-29 16:48:18
 */
public interface ProPaintMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(ProPaintExample example);

    int deleteByExample(ProPaintExample example);
		
    int deleteByPrimaryKey(String id);
		
    int insert(ProPaint record);

    int insertSelective(ProPaint record);


    List<ProPaint> selectByExample(ProPaintExample example);
		
    ProPaint selectByPrimaryKey(String id);
		
    int updateByExampleSelective(@Param("record") ProPaint record, @Param("example") ProPaintExample example);

    int updateByExample(@Param("record") ProPaint record, @Param("example") ProPaintExample example); 
		
    int updateByPrimaryKeySelective(ProPaint record);

    int updateByPrimaryKey(ProPaint record);

    Map<String,Object> selectFinPartCount(ProPaint record);

    int deleteStsByKey(ProPaint proCharpt);

    int deleteBatchByPrimaryKey(List<String> list);
}