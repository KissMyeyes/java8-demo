package com.example.jdk8.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @author by wangwei
 * @date 2023/2/2 12:08
 */
public class IOUtil {
    public static String convertToString(InputStream inputStream) throws IOException {
        System.out.println("IOUtil 使用java 8 版本");
        Scanner scanner = new Scanner(inputStream, "UTF-8");
        String str = scanner.useDelimiter("\\A").next();
        scanner.close();
        return str;
    }
}