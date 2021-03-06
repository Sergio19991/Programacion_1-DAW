package com.sergiobejaranoarroyo;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Actividad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> nombres = new LinkedHashSet<>();

        System.out.print("Introducir nombre (\"fin\" para terminar): ");
        String temp = sc.nextLine();

        while (!temp.equalsIgnoreCase("fin")) {
            nombres.add(temp);
            System.out.print("Introducir nombre: ");
            temp = sc.nextLine();
        }

        System.out.println("Lista de nombres sin repetidos:\n" + nombres);
    }
}