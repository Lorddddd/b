package com.company;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
      Object fruit = new Fruit();
      Object apple = (Apple)fruit;
    }
}

class Fruit{

}

class Apple extends Fruit{}