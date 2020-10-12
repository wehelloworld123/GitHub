package com.fc.test.mapper.auto;

import com.fc.test.model.auto.ProCopyright;
import com.fc.test.model.auto.ProCopyrightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 作品版权分配表 ProCopyrightMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-18 00:08:57
 */
public interface ProCopyrightMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(ProCopyrightExample example);

    int deleteByExample(ProCopyrightExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(ProCopyright record);

    int insertSelective(ProCopyright record);

    List<ProCopyright> selectByExample(ProCopyrightExample example);
		
    ProCopyright selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") ProCopyright record, @Param("example") ProCopyrightExample example);

    int updateByExample(@Param("record") ProCopyright record, @Param("example") ProCopyrightExample example); 
		
    int updateByPrimaryKeySelective(ProCopyright record);

    int updateByPrimaryKey(ProCopyright record);

    int deleteStsByKey(ProCopyright proCharpt);

    int deleteBatchByPrimaryKey(List<Long> list);
}