package metodosOrdenacao;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static long startTime;

    public static void main(String[] args) {
        CriacaoArrays arrays = new CriacaoArrays();
        Metodos metodos = new Metodos();
        final CriaGrafico criaGrafico = new CriaGrafico();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho da array: ");
        int tamanho = scanner.nextInt();
        int[] array = arrays.criarArray(tamanho);
        int[] array1 = arrays.copiarArray(array);
        int[] array2 = arrays.copiarArray(array);
        int[] array3 = arrays.copiarArray(array);

        //Bolha
        System.out.println("Antes de ordenar: " + Arrays.toString(array));
        startTime = System.currentTimeMillis();
        System.out.println("Método bolha: " + Arrays.toString(metodos.bubbleSort(array)));
        long tempo = System.currentTimeMillis() - startTime;
        System.out.println("Tempo de execução: " + tempo + " ms");

        //Inserção
        System.out.println("Antes de ordenar: " + Arrays.toString(array1));
        startTime = System.currentTimeMillis();
        System.out.println("Método inserção: " + Arrays.toString(metodos.insertionSort(array1)));
        long tempo1 = System.currentTimeMillis() - startTime;
        System.out.println("Tempo de execução: " + tempo1 + " ms");

        //Seleção
        System.out.println("Antes de ordenar: " + Arrays.toString(array2));
        startTime = System.currentTimeMillis();
        System.out.println("Método seleção: " + Arrays.toString(metodos.selectionSort(array2)));
        long tempo2 = System.currentTimeMillis() - startTime;
        System.out.println("Tempo de execução: " + tempo2 + " ms");

        //QuickSort
        System.out.println("Antes de ordenar: " + Arrays.toString(array3));
        startTime = System.currentTimeMillis();
        System.out.println("Método QuickSort: " + Arrays.toString(metodos.quickSort(array3,0,array.length-1)));
        long tempo3 = System.currentTimeMillis() - startTime;
        System.out.println("Tempo de execução: " + tempo3 + " ms");

        SwingUtilities.invokeLater(() -> {
            criaGrafico.GraficoTempos("Array de tamanho "+tamanho,tempo,tempo1,tempo2,tempo3,tamanho);
            criaGrafico.pack();
            criaGrafico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            criaGrafico.setVisible(true);
        });

    }
}
