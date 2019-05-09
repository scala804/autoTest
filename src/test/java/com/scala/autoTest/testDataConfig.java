package com.scala.autoTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AutoTestApplication.class,webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public class testDataConfig extends AbstractTestNGSpringContextTests {

  @Autowired
  /*private SysConfigMapper sysConfigMapper;*/

    @Test
    @org.testng.annotations.Test
    public void testMethods()
    {
    /*  sysConfigDao.selectByPrimaryKey("diagnostics.allow_i_s_tables");*/
    }
}