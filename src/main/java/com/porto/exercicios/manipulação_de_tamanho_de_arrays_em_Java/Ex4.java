package com.porto.exercicios.manipulação_de_tamanho_de_arrays_em_Java;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        String[] nomes = {"João", "Maria", "José"};
        ArrayList<String> coresList = new ArrayList<>(Arrays.asList(nomes));

        coresList.add("Ana");

        System.out.println(coresList);
    }
}

//4. **Conversão de Array para `ArrayList`**:
//        - Dado um array de strings com os nomes "João", "Maria" e "José",
//        converta-o para um `ArrayList` e adicione o nome "Ana". Imprima o `ArrayList` resultante.
