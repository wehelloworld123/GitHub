package com.fc.test.mapper.auto;

import com.fc.test.model.auto.ProPaintContent;
import com.fc.test.model.auto.ProPaintContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 绘画创作内容 ProPaintContentMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-05 11:59:40
 */
public interface ProPaintContentMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(ProPaintContentExample example);

    int deleteByExample(ProPaintContentExample example);
		
    int deleteByPrimaryKey(String id);
		
    int insert(ProPaintContent record);

    int insertSelective(ProPaintContent record);

    List<ProPaintContent> selectByExample(ProPaintContentExample example);

    List<ProPaintContent> selectRecomContentByPartId(ProPaintContent record);

    List<ProPaintContent> selectAdoptContentByPartId(ProPaintContent record);
		
    ProPaintContent selectByPrimaryKey(String id);
		
    int updateByExampleSelective(@Param("record") ProPaintContent record, @Param("example") ProPaintContentExample example);

    int updateByExample(@Param("record") ProPaintContent record, @Param("example") ProPaintContentExample example); 
		
    int updateByPrimaryKeySelective(ProPaintContent record);

    int updateByPrimaryKey(ProPaintContent record);


    int selectAdoptCount(ProPaintContent record);

    int deleteStsByKey(ProPaintContent proCharpt);

    int deleteBatchByPrimaryKey(List<String> list);
}