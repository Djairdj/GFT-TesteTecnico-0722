package Testes;

import Modelos.UsandoArray;
import org.junit.jupiter.api.Test;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UsandoArrayTest {
    int[][] testes = {
            {11, 4, 8, 10, 2},
            {9, 3, 6, 1, 13, 4},
            {}
    };
    int[] somas = {35, 36, 0};
    int[] maiores = {11, 13, 0};
    int[] menores = {2, 1, 0};
    double[] medias = {7d, 6d, 0d};
    double[] medianas = {8d, 5d, 0d};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe os valores inteiros que queres usar separados por um espaço." +
                "\nCaso não queira informar algo, apenas digite 'Enter': ");
        int[] vetorEntrada = UsandoArray.strToIntArray(scan.nextLine());
        if (vetorEntrada.length == 0) System.out.println("Array vazio!");
        else {
            UsandoArray us = new UsandoArray(vetorEntrada);
            System.out.println("A soma de todos os numbers deu " + us.getSomatorio());
            System.out.println("O maior foi " + us.getMaior());
            System.out.println("O menor foi " + us.getMenor());
            System.out.println("A media foi " + us.getMedia());
            System.out.println("A mediana foi " + us.getMediana());
        }
    }

    @Test
    void somaTest() {
        for (int index = 0; index < testes.length; index++) {
            assertEquals(somas[index], new UsandoArray(testes[index]).getSomatorio());
        }
    }

    @Test
    void maiorTest() {
        for (int index = 0; index < testes.length; index++) {
            assertEquals(maiores[index], new UsandoArray(testes[index]).getMaior());
        }
    }

    @Test
    void menorTest() {
        for (int index = 0; index < testes.length; index++) {
            assertEquals(menores[index], new UsandoArray(testes[index]).getMenor());
        }
    }

    @Test
    void medianaTest() {
        for (int index = 0; index < testes.length; index++) {
            assertEquals(medianas[index], new UsandoArray(testes[index]).getMediana());
        }
    }

    @Test
    void mediaTest() {
        for (int index = 0; index < testes.length; index++) {
            assertEquals(medias[index], new UsandoArray(testes[index]).getMedia());
        }
    }
}