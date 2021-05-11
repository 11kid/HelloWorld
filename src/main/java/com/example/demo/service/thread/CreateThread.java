package com.example.demo.service.thread;

public class CreateThread implements Runnable{
    public static void main(String[] args) {
        CreateThread ct = new CreateThread();
        Thread thread = new Thread(ct);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Hello World!");
    }
}
