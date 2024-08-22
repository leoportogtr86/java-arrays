package com.porto.exercicios.manipulação_de_tamanho_de_arrays_em_Java;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("uva");
        frutas.add("maçã");
        frutas.add("melão");
        frutas.add("melancia");
        frutas.add("limão");

        String[] frutasArr = new String[frutas.size()];

        frutasArr = frutas.toArray(frutasArr);

        System.out.println(Arrays.toString(frutasArr));
    }
}

//5. **Conversão de `ArrayList` para Array**:
//- Crie um `ArrayList` de strings, adicione 5 nomes de frutas, e
//depois converta-o para um array. Imprima o array
//resultante.
