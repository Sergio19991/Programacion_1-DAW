package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio6_3_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("introduce el número");
        num = sc.nextInt();

        for (int i=0 ; i<=num ; i++) {
            if (i%3==0 && i%7==0) {
                System.out.println("El número "+ i + " es Múltiplo de 3 y 7.");
            }
        }
    }
}
