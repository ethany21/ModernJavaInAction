package com.github.ethany21.ModernJavaInAction.multiThread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiThread {

    public static void main(String[] args) throws InterruptedException {

        List<Long> inputNumbers = Arrays.asList(0L, 34L, 25L, 231L, 556L);

        List<FactorialThread> threads = new ArrayList<>();

        for(long inputNumber : inputNumbers){
            threads.add(new FactorialThread(inputNumber));
        }

        for (Thread thread : threads){
            thread.start();
        }

        for (Thread thread : threads){
            thread.join();
        }


        for (int i = 0; i < inputNumbers.size(); i++){

            FactorialThread factorialThread = threads.get(i);
            if(factorialThread.isFinished()){
                System.out.println("Factorial of " + inputNumbers.get(i) + " is " + factorialThread.getResult());
            } else {
                System.out.println("The calculation of " + inputNumbers.get(i) + " is still running");
            }

        }

    }

}
