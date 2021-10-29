package com.wei.test;

public class ThreadTest extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("开启线程的Run方法------------------" + i);
        }
    }

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习多线程CallableTest-------------------" + i);
        }
    }
}
