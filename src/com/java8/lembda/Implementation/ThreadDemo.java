package com.java8.lembda.Implementation;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for(int i=0;i<10;i++)
            {
                System.out.println("Child Thread");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        for(int i=0;i<10;i++){
            System.out.println("Main thread");
        }
    }
}
