package com.sergiobejaranaorroyo.ESTUDIO_Entregable;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8};
        int[] resultado = new int[a.length + b.length];

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(resultado));

        System.out.println(Arrays.toString(mezcla(a, b)));
    }

    public static int[] mezcla(int[] a, int[] b) {
        int[] aux = new int[a.length + b.length];
        int contA = 0, contB = 0;

        for (int i = 0; i < aux.length; i++) {
            if (contA < a.length && contB < b.length) {
                aux[i] = a[contA];
                i++;
                contA++;
                aux[i] = b[contB];
                contB++;
            } else if (contA < b.length) {
                aux[i] = b[contB];
                contB++;
            }
        }

        return aux;
    }

}