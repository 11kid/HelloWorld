package com.example.demo.service.impl;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CreateCallable implements Callable {
    /*
     1.创建Callable的实现类，实现call方法，call方法就是线程执行体。
     2.创建实现类的实例，使用FutrueTask来包装Callable对象，FutrueTask的get()方法用来获取Callable的返回值。
     3.以FutrueTask对象作为Thread的target来创建Thread对象，此Thread对象才是真正的线程对象。调用start方法来启动该线程。
     4.使用FutrueTask中的get()方法来获取返回值。
     */
    @Override
        public Object call() throws Exception {
            return "Hello jey!";
    }

    public static void main(String[] args) {
        CreateCallable cc = new CreateCallable();
        FutureTask ft = new FutureTask(cc);
        Thread thread = new Thread(ft);
        thread.start();
        try {
            System.out.println("thread:" + ft.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
