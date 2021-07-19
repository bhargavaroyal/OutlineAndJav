package com.bhargavaroyal.javalib.multithreading;

/*The main thread is created automatically when our program is started. To control it we must obtain a reference to it.
 This can be done by calling the method currentThread( ) which is present in Thread class.
 This method returns a reference to the thread on which it is called. The default priority of Main thread is 5
and for all remaining user threads priority will be inherited from parent to child.*/
public class MainThreadControl extends Thread {
    public static void main(String[] args) {
        // getting reference to Main thread
        Thread t = Thread.currentThread();

        // getting name of Main thread
        System.out.println("Current thread: " + t.getName());

        // changing the name of Main thread
        t.setName("Geeks");
        System.out.println("After name change: " + t.getName());

        // getting priority of Main thread
        System.out.println("Main thread priority: " + t.getPriority());

        // setting priority of Main thread to MAX(10)
        t.setPriority(MAX_PRIORITY);

        System.out.println("Main thread new priority: " + t.getPriority());


        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread");
        }

        // Main thread creating a child thread
        ChildThread ct = new ChildThread();

        // getting priority of child thread
        // which will be inherited from Main thread
        // as it is created by Main thread
        System.out.println("Child thread priority: " + ct.getPriority());

        // setting priority of Main thread to MIN(1)
        ct.setPriority(MIN_PRIORITY);

        System.out.println("Child thread new priority: " + ct.getPriority());

        // starting child thread
        ct.start();
    }
}

// Child Thread class
class ChildThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child thread");
        }
    }
}

