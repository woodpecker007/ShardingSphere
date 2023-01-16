package com.aurora.shardingsphere;

import com.aurora.shardingsphere.dao.BusMapper;
import com.aurora.shardingsphere.dao.DriverMapper;
import com.aurora.shardingsphere.domain.Bus;
import com.aurora.shardingsphere.domain.Driver;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class VerticalTest {

    @Autowired
    private DriverMapper driverMapper;
    @Autowired
    private BusMapper busMapper;

    @Test
    public void testInsert() {
        Driver driver = new Driver();
        driver.setUserId(10086L);
        driver.setLicenceNo("no886");
        driverMapper.insert(driver);

        Bus bus = new Bus();
        bus.setLicencePlate("京A88888");
        busMapper.insert(bus);
    }

    @Test
    public void testQuery() {
        List<Driver> drivers = driverMapper.selectList(null);
        List<Bus> buses = busMapper.selectList(null);
    }
}
