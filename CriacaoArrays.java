package metodosOrdenacao;

import java.util.Random;

public class CriacaoArrays {
    public static int[] criarArray(int tamanho) {
        int[] array = new int[tamanho];
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(tamanho+1); // Gera números aleatórios positivos
        }

        return array;
    }

    public static int[] copiarArray(int[] origem) {
        int[] copia = new int[origem.length];
        for (int i = 0; i < origem.length; i++) {
            copia[i] = origem[i];
        }
        return copia;
    }

}

