package org.example;
import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        double[] x = new double[n];
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            x[i] = rnd.nextInt(100) + 1;
        }
        System.out.println("Исходный: " + Arrays.toString(x));

        double max = x[0];
        for (int i = 1; i < n; i++) {
            if (x[i] > max) max = x[i];
        }
        System.out.println("Максимум: " + max);

        for (int i = 0; i < n; i++) {
            x[i] /= max;
        }
        System.out.println("Результат: " + Arrays.toString(x));
    }
}