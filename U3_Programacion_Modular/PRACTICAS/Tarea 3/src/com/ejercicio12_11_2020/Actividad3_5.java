package com.ejercicio12_11_2020;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class Actividad3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TAM = 6;
        int a[] = new int[TAM];

        System.out.println("Escriba la primera serie de números: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Introduzca número: ");
            a[i] = sc.nextInt();
            ;
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int b[] = new int[TAM];
        System.out.println("Escriba la segunda serie de números: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print("Introduzca número: ");
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        int c[] = new int[2 * TAM];

        int indA = 0, indB = 0, indC = 0;

        while (indA < TAM && indB < TAM) {
            if (a[indA] < b[indB]) {
                c[indC] = a[indA];
                indA++;
            } else {
                c[indC] = b[indB];
                indB++;
            }
            indC++;
        }

        if (indA == TAM) {
            while (indB < TAM) {
                c[indC] = b[indB];
                indB++;
                indC++;
            }
        } else {
            while (indA < TAM) {
                c[indC] = a[indA];
                indA++;
                indC++;
            }
        }

        System.out.println("Mostramos todos los datos: ");
        System.out.println(Arrays.toString(c));
    }
}