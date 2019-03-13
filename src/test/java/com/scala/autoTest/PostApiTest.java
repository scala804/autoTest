package com.scala.autoTest;

import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Logger;

import com.scala.autoTest.bean.Users;
import com.scala.autoTest.restClient.RestClient;
import com.scala.autoTest.base.TestBase;
import org.apache.commons.logging.Log;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.scala.autoTest.util.*;


import static org.testng.Assert.assertEquals;


public class PostApiTest extends TestBase {

    TestBase testBase;
    String host;
    String url;
    RestClient restClient;
    CloseableHttpResponse closeableHttpResponse;
/*

    final static Logger Log = Logger.getLogger(RestClient.class);

*/

    @BeforeClass
    public void setUp() {
        testBase = new TestBase();
        host = prop.getProperty("HOST");
        url = host + "/api/users";

    }

    @Test
    public void postApiTest() throws ClientProtocolException, IOException {
        restClient = new RestClient();
        //准备请求头信息
        HashMap<String,String> headermap = new HashMap<String,String>();
        headermap.put("Content-Type", "application/json"); //这个在postman中可以查询到

        //对象转换成Json字符串
        Users user = new Users("Anthony","tester");
        String userJsonString = JSON.toJSONString(user);
        //System.out.println(userJsonString);
        closeableHttpResponse = restClient.post(url, userJsonString, headermap);

        //验证状态码是不是200
        int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
        assertEquals(statusCode, RESPNSE_STATUS_CODE_201,"status code is not 201");

        //断言响应json内容中name和job是不是期待结果
        String responseString = EntityUtils.toString(closeableHttpResponse.getEntity());
        JSONObject responseJson = JSON.parseObject(responseString);
        //System.out.println(responseString);
        String name = TestJson.getValueByJPath(responseJson, "name");
        String job = TestJson.getValueByJPath(responseJson, "job");
        assertEquals(name, "Anthony","name is not same");
        assertEquals(job, "tester","job is not same");
    }
}
