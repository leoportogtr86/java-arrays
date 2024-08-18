package com.porto.exercicios.lista1;

import java.util.Arrays;
import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] aleatorios = new int[8];

        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = random.nextInt(100);
        }

        int menor = aleatorios[0];
        int maior = aleatorios[0];

        for (int aleatorio : aleatorios) {
            if (aleatorio < menor) {
                menor = aleatorio;
            }
        }

        for (int aleatorio : aleatorios) {
            if (aleatorio > maior) {
                maior = aleatorio;
            }
        }

        System.out.println(Arrays.toString(aleatorios));
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
    }
}


//- **Descrição:** Crie um array de 8 elementos do tipo `int` e preencha-o com valores aleatórios.
// Escreva um programa para encontrar e imprimir o maior e o menor elemento do array.
//- **Dica:** Inicialize duas variáveis, uma para o maior e outra para o menor valor, e
// atualize-as conforme percorre o array.
