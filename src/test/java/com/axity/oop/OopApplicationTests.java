package com.axity.oop;

import com.axity.oop.spring.SimpleComponent;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.time.Month;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OopApplicationTests {

    @Autowired
    private SimpleComponent simpleComponent;

    @Test
    public void contextLoads() {
        LocalDateTime fechaInicio = simpleComponent.getFechaInicio();

        Assert.assertNotNull(fechaInicio);
        Assert.assertEquals(2019, fechaInicio.getYear());
        Assert.assertEquals(Month.OCTOBER, fechaInicio.getMonth());
        Assert.assertEquals(11, fechaInicio.getDayOfMonth());
    }
}
