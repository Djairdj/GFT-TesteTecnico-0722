package Modelos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class DezNumeros {
    private static Scanner scan = new Scanner(System.in);
    private int quantidade;
    private SortedSet<Double> numbers;

    private double maior;
    private double menor;
    private double media;
    private int acimaDeDez;
    private int acimaDeCinquenta;

    public DezNumeros() {
        this(10);
    }

    public DezNumeros(int quantidadeValores) {
        this.quantidade = 10;
        this.numbers = new TreeSet<>();
        this.acimaDeDez = 0;
        this.acimaDeCinquenta = 0;
    }

    public void adicionarValores() {
        double n;
        for (int i = 1; i <= this.quantidade; ) {
            System.out.printf("Informe o %dº number: ", i);
            n = scan.nextDouble();
            if (!this.numbers.contains(n)) {
                if (i == 1) {
                    this.maior = n;
                    this.menor = n;
                }
                this.numbers.add(n);
                if (n > 50) this.acimaDeCinquenta++;
                if (n > 10) this.acimaDeDez++;
                if (n > this.maior) this.maior = n;
                if (n < this.menor) this.menor = n;
                i++;
            } else System.out.println("Esse valor consta no rol dos numeros informados anteriormente.");
        }
        this.media = this.numbers.stream().reduce(0d, (b, a) -> a + b) / this.numbers.size();
    }

    public double getMaior() {
        return maior;
    }

    public double getMenor() {
        return menor;
    }

    public double getMedia() {
        return media;
    }

    public int getQuantidadeAcimaDeDez() {
        return acimaDeDez;
    }

    public int getQuantidadeAcimaDeCinquenta() {
        return acimaDeCinquenta;
    }

    public SortedSet<Double> getNumbers() {
        return numbers;
    }

    public String acimaDeDez() {
        return this.numbers.stream().filter(item -> item > 10).toList().toString();
    }

    public String acimaDeCinquenta() {
        ArrayList<Double> list = new ArrayList<>();
        for (var n : this.numbers) {
            if (n > 50) list.add(n);
        }
        return list.toString();
    }

}