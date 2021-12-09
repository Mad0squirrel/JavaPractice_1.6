package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Генерация случайных чисел c с помощью метода random() класса Math
	int[] randomMas = new int[10];
    for (int i = 0; i < randomMas.length; i++) {
        randomMas[i] = (int)(Math.random() * 100);
        System.out.print(randomMas[i] + ", ");
    }

    System.out.println();

        Arrays.sort(randomMas);
        System.out.println(Arrays.toString(randomMas));

    System.out.println();
        // Генерация случайных чисел с помощью класса Random
    Random num = new Random();
    for (int i = 0; i < randomMas.length; i++) {
        randomMas[i] = num.nextInt(100);
        System.out.print(randomMas[i] + ", ");
    }
        System.out.println();

        Arrays.sort(randomMas);
        System.out.println(Arrays.toString(randomMas));
    }
}
