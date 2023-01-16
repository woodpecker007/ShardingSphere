package com.aurora.shardingsphere.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

@Data
@TableName("elephant")
@ToString
public class Elephant {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String uname;
}
