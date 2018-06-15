package com.company;

import java.util.Random;

public class Main {
    public static final int COUNT = 10;

    public static void main(String[] args) {
        IntList list = new IntArrayList();

        Random random = new Random();
        for (int i = 0; i < COUNT; i++) {
            list.add(random.nextInt(100));
        }

        for (int i = 0; i < list.size(); i++) {

            System.out.print(+list.get(i) + "   ");
        }

    }
}
