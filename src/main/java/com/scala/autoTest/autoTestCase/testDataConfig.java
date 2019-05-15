package com.scala.autoTest.autoTestCase;


import com.scala.autoTest.AutoTestApplication;
import com.scala.autoTest.bean.sys.SysConfig;
import com.scala.autoTest.dao.sys.SysConfigMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;



@SpringBootTest(classes = { AutoTestApplication.class })
public class testDataConfig extends AbstractTestNGSpringContextTests {
  @Autowired
  private SysConfigMapper sysConfigMapper;

    @Test
    public void testSysConfigDaoMethods() {
        SysConfig sysConfig= sysConfigMapper.selectByPrimaryKey("diagnostics.allow_i_s_tables");
        System.out.println("getVariable___________________"+sysConfig.getVariable());
    }
}