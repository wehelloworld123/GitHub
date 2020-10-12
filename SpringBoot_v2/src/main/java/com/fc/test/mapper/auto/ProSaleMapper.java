package com.fc.test.mapper.auto;

import com.fc.test.model.auto.ProSale;
import com.fc.test.model.auto.ProSaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 作品上架表 ProSaleMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-19 22:31:23
 */
public interface ProSaleMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(ProSaleExample example);

    int deleteByExample(ProSaleExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(ProSale record);

    int insertSelective(ProSale record);

    List<ProSale> selectByExample(ProSaleExample example);
		
    ProSale selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") ProSale record, @Param("example") ProSaleExample example);

    int updateByExample(@Param("record") ProSale record, @Param("example") ProSaleExample example); 
		
    int updateByPrimaryKeySelective(ProSale record);

    int updateByPrimaryKey(ProSale record);

    int deleteStsByKey(ProSale proCharpt);

    int deleteBatchByPrimaryKey(List<Long> list);
}