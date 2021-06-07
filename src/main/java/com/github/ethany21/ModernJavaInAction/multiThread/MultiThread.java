package com.github.ethany21.ModernJavaInAction.multiThread;

public class MultiThread {

    public static void main(String[] args) {

        Thread thread = new Thread(new BlockingTask());

        thread.start();
        thread.interrupt();

    }

}
