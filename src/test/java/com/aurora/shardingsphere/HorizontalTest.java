package com.aurora.shardingsphere;

import com.aurora.shardingsphere.dao.NewDriverMapper;
import com.aurora.shardingsphere.domain.NewDriver;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class HorizontalTest {

    @Autowired
    private NewDriverMapper newDriverMapper;

    @Test
    public void testSplitTable() {
        for (int i = 1; i < 3; i++) {
            NewDriver newDriver = new NewDriver();
            newDriver.setUserId(11L + i);
            newDriver.setLicenceNo("aabb10010" + i);
            newDriverMapper.insert(newDriver);
        }
    }

    @Test
    public void testQuery() {
        List<NewDriver> drivers = newDriverMapper.selectList(null);
        System.out.println(drivers);
    }

}
