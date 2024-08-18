package com.porto.exercicios.lista1;

public class Ex1 {
    public static void main(String[] args) {
        int[] inteiros = new int[10];

        for (int i = 0; i < 10; i++) {
            inteiros[i] = i + 1;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(inteiros[i] + " ");
        }
    }
}

//- **Descrição:** Crie um array de 10 elementos do tipo `int` e inicialize-o com valores de
// 1 a 10. Em seguida, imprima todos os elementos do array.
//- **Dica:** Use um loop `for` para preencher e outro para
// imprimir os valores do array.
