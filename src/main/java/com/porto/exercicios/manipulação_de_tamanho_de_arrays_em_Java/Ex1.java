package com.porto.exercicios.manipulação_de_tamanho_de_arrays_em_Java;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] inteiros = new int[10];

        for (int i = 0; i < inteiros.length; i++) {
            inteiros[i] = i + 1;
        }

        System.out.println(Arrays.toString(inteiros));
    }
}

//1. **Declaração e Inicialização de Arrays**:
//        - Crie um array de inteiros com 10 elementos e inicialize-o com valores
//        de 1 a 10. Em seguida, imprima todos os elementos do array.
