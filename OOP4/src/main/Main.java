package main;

import box.Box;
import test.Man;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Иван", 27);
        System.out.println(man.getAge());
        Box box = new Box();
    }
}
