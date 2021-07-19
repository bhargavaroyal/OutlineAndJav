package com.bhargavaroyal.javalib.multithreading.interthreadcommunication;

public class SynchronizedExample {
    public static class Sender{

        public void send(String msg){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        public static class Threadsend extends Thread{
            String message;
            Sender sender;
            private Thread t;

            public Threadsend(String msg, Sender obj) {
                this.message = msg;
                this.sender = obj;
            }

            @Override
            public void run() {
                synchronized(sender)
                {
                    // synchronizing the snd object
                    sender.send(message);
                }

            }

            public static void main(String[] args) {
                Sender s1 = new Sender();
                Threadsend t1 = new Threadsend("Hi",s1);
                Threadsend t2 = new Threadsend("Bye",s1);

                t1.start();
                t2.start();



            }
        }


    }
}
