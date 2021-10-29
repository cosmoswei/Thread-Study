package com.wei.test;

public class RunableTest implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("开启线程的Run方法-----------------------" + i);
        }
    }

    public static void main(String[] args) {

        Runnable runnable = new RunableTest();
        new Thread(runnable).start();
        for (int i = 0; i < 2000; i++) {
            System.out.println("我在学习多线程RunableTest-------------------" + i);
        }
    }
}
