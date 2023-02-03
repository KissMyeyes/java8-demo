JDK 9  
1 Java9 新特性之目录结构  

2 Java9 新特性之 JShell 工具

    /bin/jshell.exe
    主要是免得开一个IDEA ，create class ， 写一个main 来编译
    初学者的玩具
    
3 Java9 新特性之模块化  

    17之中已经弃用，实际在Web开发上面，包依赖的方式会更复杂，
    声明式依赖会无法落地
    因为不知道哪些第三方包依赖了哪些jar


4 Java9 新特性之多版本兼容 Jar 包 
    
    在META-INF 目录下创建多版本兼容class
    目前觉得除非纯utils 这种依赖较少的类，不然建立完全一套兼容业务代码复杂度较高

5 Java9 新特性之接口 Interface 的升级
    
    新增 private 方法，详见 FilterProcess.java

248：使 G1 成为默认垃圾回收器  
295：提前编译  
291：弃用并发标记扫描 （CMS） 垃圾回收器

jdk9开始不允许_作为标识符

String底层结构的变化