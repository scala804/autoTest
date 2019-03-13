package com.scala.autoTest;

import java.io.IOException;

import com.scala.autoTest.restClient.RestClient;
import com.scala.autoTest.base.TestBase;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.apache.log4j.Logger;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.scala.autoTest.util.*;

public class GetApiTest extends TestBase {
    TestBase testBase;
    String host;
    String url;
    RestClient restClient;
    CloseableHttpResponse closeableHttpResponse;


    final static Logger Log = Logger.getLogger(GetApiTest.class);
    @BeforeClass
    public void setUp() {
        testBase = new TestBase();
        host = prop.getProperty("HOST");
        url = host + "/api/users?page=2";
    }

    @Test
    public void getAPITest() throws ClientProtocolException, IOException {
        restClient = new RestClient();
        Log.info("URL="+url);
        closeableHttpResponse = restClient.get(url);


        //断言状态码是不是200
        int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
        Assert.assertEquals(statusCode, RESPNSE_STATUS_CODE_200, "response status code is not 200");

        //把响应内容存储在字符串对象
        String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(),"UTF-8");
        Log.info("responseString="+responseString);
        //创建Json对象，把上面字符串序列化成Json对象
        JSONObject responseJson = JSON.parseObject(responseString);
        //System.out.println("respon json from API-->" + responseJson);

        //json内容解析
        String s =TestJson.getValueByJPath(responseJson,"data[0]/first_name");
        System.out.println(s);
        Assert.assertEquals(s, "Eve","first name is not Eve");
    }
}

