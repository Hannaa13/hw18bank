package com.company;

public class ThreadOne extends Thread {

    private static int amount = 100;

    public ThreadOne(String name) {
        super(name);
    }


    @Override
    public void run() {
        synchronized (ThreadOne.class) {
            for (int i = 0; i < 3; i++) {

                System.out.println(getName() + " >>> снятие >>> " + withdraw(10 * i));

                System.out.println(getName() + " >>> пополнение >>> " + replenishment(50 + i));
            }
        }
    }


    private static int withdraw(int money) {

        amount = amount - money;
        return amount;
    }


    private static int replenishment(int money) {
        amount = amount + money;
        return amount;
    }

}
