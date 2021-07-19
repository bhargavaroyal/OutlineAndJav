package com.bhargavaroyal.javalib.multithreading.interthreadcommunication;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableSample implements Callable {
    @Override
    public Object call() throws Exception {
        // Create random number generator
        Random generator = new Random();

        Integer randomNumber = generator.nextInt(5);

        // To simulate a heavy computation,
        // we delay the thread for some random time
        Thread.sleep(randomNumber * 1000);

        return randomNumber;

    }
}