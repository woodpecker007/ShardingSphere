package com.aurora.shardingsphere.dao;

import com.aurora.shardingsphere.domain.Elephant;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ElephantMapper extends BaseMapper<Elephant> {
}
