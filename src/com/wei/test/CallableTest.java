package com.wei.test;

import java.util.concurrent.*;

public class CallableTest implements Callable {
    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("开启线程的call方法------------------" + i);
        }
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableTest callableTest = new CallableTest();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<Boolean> future1 = executorService.submit(callableTest);
        boolean r1 = future1.get();
        executorService.shutdown();
        for (int i = 0; i < 2000; i++) {
            System.out.println("我在学习多线程CallableTest-------------------" + i);
        }
        System.out.println("r1=" + r1);
    }
}
