package com.porto.exercicios.manipulação_de_tamanho_de_arrays_em_Java;

import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        int[] inteiros = {10, 20, 30};
        int[] clone = Arrays.copyOf(inteiros, 6);

        clone[3] = 40;
        clone[4] = 50;
        clone[5] = 60;

        System.out.println(Arrays.toString(inteiros));
        System.out.println(Arrays.toString(clone));
    }
}

//6. **Redimensionamento Manual**:
//- Crie um array de 3 inteiros, inicialize-o com valores de sua escolha,
//e depois redimensione-o para 6 elementos,
//mantendo os valores originais e adicionando novos valores.
