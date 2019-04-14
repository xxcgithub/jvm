package com.luban.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {

        List<User> list = new ArrayList<>();
        Thread.sleep(5000);
        System.out.println( "Hello World!" );
        for (int i = 0; i < 2000; i++) {
            list.add(new User());
        }

    }
}
