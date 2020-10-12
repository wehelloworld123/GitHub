package com.fc.test.mapper.auto;

import com.fc.test.model.auto.ProUserAdopt;
import com.fc.test.model.auto.ProUserAdoptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 用户创作采纳表 ProUserAdoptMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-30 23:53:45
 */
public interface ProUserAdoptMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(ProUserAdoptExample example);

    int deleteByExample(ProUserAdoptExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(ProUserAdopt record);

    int insertSelective(ProUserAdopt record);

    List<ProUserAdopt> selectByExample(ProUserAdoptExample example);
		
    ProUserAdopt selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") ProUserAdopt record, @Param("example") ProUserAdoptExample example);

    int updateByExample(@Param("record") ProUserAdopt record, @Param("example") ProUserAdoptExample example); 
		
    int updateByPrimaryKeySelective(ProUserAdopt record);

    int updateByPrimaryKey(ProUserAdopt record);

    int deleteStsByKey(ProUserAdopt proCharpt);

    int deleteBatchByPrimaryKey(List<Long> list);
}