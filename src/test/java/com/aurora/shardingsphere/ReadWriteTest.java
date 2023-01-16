package com.aurora.shardingsphere;

import com.aurora.shardingsphere.dao.ElephantMapper;
import com.aurora.shardingsphere.domain.Elephant;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
public class ReadWriteTest {

    @Autowired
    private ElephantMapper elephantMapper;

    @Test
    public void testInsert(){
        Elephant elephant = new Elephant();
        elephant.setUname("xiaohei");
        elephantMapper.insert(elephant);
    }

    @Test
    public void testQuery() {
        List<Elephant> list = elephantMapper.selectList(new QueryWrapper<>());
        System.out.println(list);
    }

    @Transactional
    @Test
    public void testTrans() {
        Elephant elephant = new Elephant();
        elephant.setUname("transaction");
        elephantMapper.insert(elephant);
        elephantMapper.selectList(null);
    }

    @Test
    public void testBalancer() {
        elephantMapper.selectList(null);
        elephantMapper.selectList(null);
        elephantMapper.selectList(null);
        elephantMapper.selectList(null);
    }
}
