package com.porto.exercicios.lista1;

public class Ex3 {
    public static void main(String[] args) {
        double[] notas = {4.5, 7.8, 10.0, 8.9, 6.8};
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        System.out.println(soma);
    }
}

//- **Descrição:** Crie um array de 5 elementos do tipo `double` e preencha-o com
// valores de sua escolha. Em seguida, calcule e imprima a soma de todos os elementos do array.
//- **Dica:** Use um loop `for` para percorrer o array e acumular a soma.
