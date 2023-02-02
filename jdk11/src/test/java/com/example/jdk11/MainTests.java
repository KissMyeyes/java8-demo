package com.example.jdk11;

import com.example.jdk11.utils.IOUtil;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
//import com.demo.utils.DemoUtil;

/**
 * @author by wangwei
 * @date 2023/2/2 11:42
 */
public class MainTests {
    //这里引用了外部类
//    User user = new User();

//    DemoUtil demoUtil=new DemoUtil();


    public static void main(String[] args) throws IOException {
        InputStream inputStream = new ByteArrayInputStream("测试字符串".getBytes());
        String result = IOUtil.convertToString(inputStream);
        System.out.println(result);
    }
}
