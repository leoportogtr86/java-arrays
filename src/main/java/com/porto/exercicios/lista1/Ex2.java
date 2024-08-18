package com.porto.exercicios.lista1;

public class Ex2 {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 10};
        int primeiro = numeros[0];
        int ultimo = numeros[numeros.length - 1];

        System.out.println(primeiro);
        System.out.println(ultimo);
    }
}

//- **Descrição:** Dado um array de 5 elementos `int[] numeros = {2, 4, 6, 8, 10};`,
// imprima o primeiro e o último elemento do array.
//- **Dica:** Lembre-se de que o índice do primeiro
// elemento é `0` e o do último é `array.length - 1`.
