package com.home.faketests;

import org.testng.annotations.Test;

import java.util.Random;

/**
 * Created by Oleksandr_Danchenko on 21.09.2016.
 */
public class TestA extends Base {


    public void rand() {
        try {
            Thread.sleep(new Random().nextInt(10) * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test1() throws Exception {
        rand();
        throw new Exception("");
    }

    @Test
    public void test2() {
        rand();
    }

    @Test
    public void test3() {
        rand();
    }

    @Test
    public void test4() {
        rand();
    }

    @Test
    public void test5() {
        rand();
    }

}
