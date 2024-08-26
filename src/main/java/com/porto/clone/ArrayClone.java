package com.porto.clone;

import java.util.Arrays;

public class ArrayClone {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int[] clone = numeros.clone();
        String[] frutas = {"uva", "manga", "abacate", "açaí", "maçã", "abacaxi"};
        String[] frutasClone = Arrays.copyOf(frutas, frutas.length - 1);
        int[] pares = {0, 2, 4, 6, 8, 10};
        int[] paresClone = new int[pares.length - 2];

        System.arraycopy(pares, 2, paresClone, 0, pares.length - 2);

        clone[0] = 0;

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(clone));
        System.out.println(Arrays.toString(frutas));
        System.out.println(Arrays.toString(frutasClone));
        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(paresClone));
    }
}
