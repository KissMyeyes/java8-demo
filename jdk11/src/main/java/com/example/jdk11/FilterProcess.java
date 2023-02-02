package com.example.jdk11;

/**
 * @author by wangwei
 * @date 2023/2/1 18:10
 */
public interface FilterProcess<T> {

    //java 7 及以前 特性 全局常量 和抽象方法
    public static final String a = "22";

    boolean process(T t);

    //java 8 特性 静态方法和默认方法
    default void love() {
        System.out.println("methodA...");
        System.out.println("A....");
        System.out.println("B....");
        System.out.println("C....");

    }

    static void haha() {
        System.out.println("methodB...");
        System.out.println("A....");
        System.out.println("B....");
        System.out.println("C....");
    }

    //java 9 特性 支持私有方法
    //定一个私有的方法，把重复部分的代码抽离出来。然后在methodA与methodB方法内部去调 用。
    // 私有方法只能在本类中调用，这里包括接口的实现类也不能调用。
    private void java9() {
        System.out.println("A....");
        System.out.println("B....");
        System.out.println("C....");
    }

    /**
     * 按照最初的Java设计，接口只是用作对模型行为的抽象
     * 但是，不管是 default 还是 这次的 private  特性，貌似都是打破了这个约定
     *
     * 只能说有了default 和static 后，处理接口出现重复代码的问题
     *
     */
}


