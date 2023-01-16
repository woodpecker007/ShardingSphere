package com.aurora.shardingsphere.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("aurora_driver")
public class Driver {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long userId;
    private String licenceNo;
}
