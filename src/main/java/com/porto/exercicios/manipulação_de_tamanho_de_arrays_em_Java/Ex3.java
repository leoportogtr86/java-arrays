package com.porto.exercicios.manipulação_de_tamanho_de_arrays_em_Java;

import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList<Integer> inteiros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            inteiros.add(i + 1);
        }

        System.out.println(inteiros);
    }
}
//3. **Uso de `ArrayList`**:
//        - Crie um `ArrayList` de inteiros, adicione os números de 1 a 10,
//        e depois imprima todos os elementos.
