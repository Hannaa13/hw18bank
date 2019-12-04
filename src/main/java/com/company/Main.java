package com.company;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadOne threadOne = new ThreadOne("поток 1");
        ThreadOne threadTwo = new ThreadOne("поток 2");
        ThreadOne threadThree = new ThreadOne("поток 3");


        threadOne.start();


        threadTwo.start();


        threadThree.start();
    }
}
