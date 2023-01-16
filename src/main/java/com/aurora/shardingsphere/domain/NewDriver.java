package com.aurora.shardingsphere.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@TableName("new_driver_")
public class NewDriver {
    // 此处要使用分布式ID，不能使用数据库主键自增ID，这里用的是mybatis-plus内置的snowflake。
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private Long userId;
    private String licenceNo;
}
