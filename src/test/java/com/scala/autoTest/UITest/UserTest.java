package com.scala.autoTest.UITest;

import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) //name_ascending 是如果跑整个class 会根据方法名顺序跑
public class UserTest {
    @BeforeClass
    public static void setUp() {
        Configuration.timeout = 6000;
        Configuration.browser = "chrome"; //设置浏览器驱动，默认路径看下图 也可以不用默认路径

        //Configuration.reportsFolder = "test-result/reports"; selenide失败回自动保存快照  这是配置快照保存目录 默认也是这个

    }

    //自动化 访问百度
    @Test
    public void step00_test() {
        open("https://www.baidu.com");
        $("body").shouldHave(text("百度"));
        sleep(5000);
    }
}
