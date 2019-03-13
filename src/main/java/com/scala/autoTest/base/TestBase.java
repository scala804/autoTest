package com.scala.autoTest.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {


    public Properties prop;
    public int RESPNSE_STATUS_CODE_200 = 200;
    public int RESPNSE_STATUS_CODE_201 = 201;
    public int RESPNSE_STATUS_CODE_404 = 404;
    public int RESPNSE_STATUS_CODE_500 = 500;


    //写一个构造函数
    public TestBase() {

        try{
            prop= new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+
                    File.separator+"src"+File.separator+"main"+File.separator+"java"
                    +File.separator+"com"+File.separator+"scala"+File.separator+"autotest"
                    +File.separator+"confige"+File.separator+"getAPiTest.properties");
            prop.load(fis);

        }catch (FileNotFoundException e) {
            e.printStackTrace();

        }catch (IOException e) {
            e.printStackTrace();

        }

    }
}
