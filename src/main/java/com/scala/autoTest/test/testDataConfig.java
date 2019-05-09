package com.scala.autoTest.test;


import com.scala.autoTest.AutoTestApplication;
import com.scala.autoTest.dao.sys.SysConfigDao;
import com.scala.autoTest.dao.sys.SysConfigMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest(classes = AutoTestApplication.class,webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public class testDataConfig extends AbstractTestNGSpringContextTests {
  @Autowired
  private SysConfigDao sysConfigDao;

    @Test
    public void testMethods()
    {
     int i=sysConfigDao.selectByPrimaryKey("diagnostics.allow_i_s_tables");
      System.out.println("11111++++++"+i);
    }
}