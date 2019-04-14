package com.luban.jvm;

/**
 * Create by xxc on 2019/4/12 15:10
 */
public class TestClassLoader {
    public static void main(String[] args) {
        ClassLoader classLoader = TestClassLoader.class.getClassLoader();
        while (classLoader != null){
            System.out.println(classLoader);
            classLoader = classLoader.getParent();
        }
    }
}
