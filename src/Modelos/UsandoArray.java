package Modelos;

import java.util.ArrayList;

public class UsandoArray {
    private int[] array;
    private double mediana;
    private double media;
    private int somatorio;
    private int menor;
    private int maior;

    public UsandoArray(int... texto) {
        this.valorDeEntrada(texto);
    }

    public static int[] strToIntArray(String entrada) {
        String[] novaEntada = entrada.split(" ");
        ArrayList<Integer> v = new ArrayList<>();
        for (String s : novaEntada) {
            try {
                int inteiro = Integer.parseInt(s);
                v.add(inteiro);
            } catch (Exception d) {
                if (s != "")
                    System.out.println(s + " não é um número.");
            }
        }
        int[] array = new int[v.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = v.get(i);
        }
        return array;
    }

    public void valorDeEntrada(int... texto) {
        this.array = texto;
        if (array.length > 0) {
            this.mediana = this.calculaMediana(array);
            this.media = this.calculaMedia(array);
            this.somatorio = this.calculaSomatorio(array);
            this.maior = this.calculaMaior(array);
            this.menor = this.calculaMenor(array);
        }
    }

    public double calculaMediana(int... vetor) {
        selectionSortCrescente(vetor);
        int nItens = vetor.length;
        if (nItens % 2 == 1) {
            return vetor[nItens / 2];
        } else {
            return (double) (vetor[nItens / 2] + vetor[nItens / 2 - 1]) / 2;
        }
    }

    public double calculaMedia(int... vetor) {
        return (double) calculaSomatorio(vetor) / vetor.length;
    }

    public int calculaMaior(int... vetor) {
        selectionSortCrescente(vetor);
        return vetor[vetor.length - 1];
    }

    public int calculaMenor(int... vetor) {
        selectionSortCrescente(vetor);
        return vetor[0];
    }

    public int calculaSomatorio(int... vetor) {
        int soma = 0;
        for (int cadaValor : vetor) {
            soma += cadaValor;
        }
        return soma;
    }

    public double getMediana() {
        return this.mediana;
    }

    public double getMedia() {
        return this.media;
    }

    public int getSomatorio() {
        return this.somatorio;
    }

    public int getMaior() {
        return this.maior;
    }

    public int getMenor() {
        return this.menor;
    }

    public int[] getArray() {
        return this.array;
    }

    private void selectionSortCrescente(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int minnimo = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[minnimo]) {
                    minnimo = j;
                }
            }
            if (vetor[i] != vetor[minnimo]) {
                int auxiliar = vetor[i];
                vetor[i] = vetor[minnimo];
                vetor[minnimo] = auxiliar;
            }
        }
    }
}