package com.scala.autoTest.autoTestCase;


import com.scala.autoTest.AutoTestApplication;
import com.scala.autoTest.bean.sys.SysConfig;
import com.scala.autoTest.dao.sys.SysConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest(classes = AutoTestApplication.class,webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
/*@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)*/
public class testDataConfig extends AbstractTestNGSpringContextTests {
  @Autowired
/*  private SysConfigDao sysConfigDao;*/
  private SysConfigMapper sysConfigMapper;

   /* @Test
    public void testsysConfigDaoMethods() {
     int i=sysConfigDao.selectByPrimaryKey("diagnostics.allow_i_s_tables");
      System.out.println("11111++++++"+i);
    }*/
    @Test
    public void testsysConfigDaoMethods() {
        SysConfig i= sysConfigMapper.selectByPrimaryKey("diagnostics.allow_i_s_tables");
        System.out.println("11111++++++"+i);
    }
}