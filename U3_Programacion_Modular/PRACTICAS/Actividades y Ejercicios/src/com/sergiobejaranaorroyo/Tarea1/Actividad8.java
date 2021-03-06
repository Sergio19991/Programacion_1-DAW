package com.sergiobejaranaorroyo.Tarea1;

import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce el Número:");
        num = sc.nextInt();

        System.out.println(num + " tiene " + numDivisores(num) + " divisores.");
    }

    public static int numDivisores(int a) {
        int num_primos = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0 && esPrimo(i)) {
                num_primos++;
            }
        }
        return num_primos;
    }

    public static boolean esPrimo(int b) {
        for (int i = 2; i < b; i++) {
            if (b % i == 0) {
                return false;
            }
        }
        return true;
    }

}