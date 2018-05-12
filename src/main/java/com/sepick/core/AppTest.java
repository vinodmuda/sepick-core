package com.sepick.core;

import java.io.IOException;

/**
 * Created by Vinod on 3/1/2018.
 */

public class AppTest {
    public static void main(String[] args) throws IOException {
        HelloWorld helloWorld = (HelloWorld) SepickCoreUtils.getApplicationContext().getBean("helloWorld");
        helloWorld.printHello();
        System.out.println(SepickCoreUtils.getPropertyValue(SepickCoreConstants.NSE_URL));
    }
}
