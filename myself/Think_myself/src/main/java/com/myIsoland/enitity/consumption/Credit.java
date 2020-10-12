package com.myIsoland.enitity.personal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.myIsoland.common.base.BaseEntity;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("t_per_credit")
public class Credit extends BaseEntity implements Serializable{
    @TableId(value = "flow_no",type = IdType.UUID)
    private String  flowNo;

    private int kind;

    private String describe;

    private int eventId;

    private int score;

    private int total;
}
