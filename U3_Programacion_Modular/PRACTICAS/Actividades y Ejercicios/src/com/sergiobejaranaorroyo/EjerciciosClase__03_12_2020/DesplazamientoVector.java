package com.sergiobejaranaorroyo.EjerciciosClase__03_12_2020;

import java.util.Arrays;
import java.util.Scanner;

public class DesplazamientoVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros;
        int tam, rotacion;
        int[] destino;

        System.out.println("Introduce el Tamaño:");
        tam = sc.nextInt();

        numeros = new int[tam];
        destino = new int[tam];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 11);
        }

        System.out.println("Introduce el Desplazamiento:");
        rotacion = sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            destino[(i + rotacion) % numeros.length] = numeros[i];
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(destino));
    }
}