package com.sergiobejaranoarroyo;

public class numeroAlreves {
    public static void main(String[] args) {

        int num = 12345;
        int destino = 0;
        int auxiliar = num;

        while (num > 0) {
            destino = destino * 10 + (num % 10);
            num = num / 10;
        }

        System.out.println(destino);
    }
}
