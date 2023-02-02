package com.example.jdk11.utils;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author by wangwei
 * @date 2023/2/2 12:08
 */
public class IOUtil {
    public static String convertToString(InputStream inputStream) throws IOException {
        System.out.println("IOUtil 使用java 9 版本");
        try (inputStream) {  //Java9版本的增强try-with-resources
            String str = new String(inputStream.readAllBytes());
            return str;
        }
    }
}