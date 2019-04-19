package com.scala.autoTest.base;

import java.io.IOException;
import java.util.Properties;

public class BrowserKiller {
    public void chromeBrowserKiller() throws IOException{
        Runtime runTime=Runtime.getRuntime();
        if(isOSLinux()==true){
            runTime.exec("killall -9 chrome");
        }else {
            runTime.exec("TASKKILL /F /IM  chrome.exe");
        }
    }

    public static boolean isOSLinux(){
        Properties prop=System.getProperties();
        String os=prop.getProperty("os.name");
        if(os!=null&&os.toLowerCase().indexOf("linux")>-1){
            return true;
        }else {return false;}
    }
}
