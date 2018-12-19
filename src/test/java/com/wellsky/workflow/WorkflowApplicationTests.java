package com.wellsky.workflow;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkflowApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void contextLoads() {
        System.out.println(applicationContext.getApplicationName());
    }

    @Test
    public void fakeMethodTest(){
        String expected = "12";
        String result = WorkflowApplication.fakeMethod(Integer.valueOf(expected));
        Assert.assertEquals(expected, result);
    }
}
