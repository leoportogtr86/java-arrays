package com.porto.exercicios.lista1;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int[] numeros = {10, 4, 56, 10, 200, 300};
        int[] invertido = new int[numeros.length];

        for (int i = numeros.length - 1; i >= 0; i--) {
            invertido[i] = numeros[numeros.length - i - 1];
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(invertido));
    }
}

//
//- **Descrição:** Crie um array de 6 elementos do tipo `int` e preencha-o com
// valores de sua escolha. Escreva um programa que inverta a ordem dos elementos
// do array e imprima o resultado. **Dica:** Você pode criar um array auxiliar ou
// fazer a inversão diretamente no array original.
