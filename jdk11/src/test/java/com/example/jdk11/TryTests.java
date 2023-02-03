package com.example.jdk11;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

/**
 * @author by wangwei
 * @date 2023/2/2 11:42
 */
@SpringBootTest
public class TryTests {

    //java7及以前写法 每一个流打开的时候都要关闭
    @Test
    public void testBefore7() {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(System.in);
            reader.read();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //

    /**
     * java7和8及 每一个流打开的时候都要关闭,但是在try的括号中来进行关闭
     * <p>
     * public interface Closeable extends AutoCloseable {
     * public void close() throws IOException;
     * }
     * 实现了
     * @see AutoCloseable
     * @see Closeable
     * 接口的类可以自动的进行资源关闭
     */
    @Test
    public void test7() {
        try (InputStreamReader reader = new InputStreamReader(System.in)) {
            reader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * java9及 每一个流打开的时候都要关闭,但是在try的括号中来进行关闭，
     * 在java8的基础上进一步升级 直接在try括号中直接写入 变量就好，如果有多个流，就用分号隔开
     */
    @Test
    void testJava9Try() throws IOException {
        String fileName = "D:\\data\\test\\testStream.txt";

        FileOutputStream fos = new FileOutputStream(fileName);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        try (bw; osw; fos) {  //注意这里：尝试去回收这三个对象对应的资源，和上文中的java 7代码对比
            bw.write("Java9-可以被自动调用close()方法");
            bw.flush();
        }
    }

}
