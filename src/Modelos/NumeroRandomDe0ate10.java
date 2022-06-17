package Modelos;

import java.util.Random;
import java.util.Scanner;

public class NumeroRandomDe0ate10 {
    Scanner key = new Scanner(System.in);
    private int aleatorio;

    public NumeroRandomDe0ate10() {
        this.aleatorio = this.novoAleatorio();
    }

    public int getAleatorio() {
        return this.aleatorio;
    }

    public void questionar() {
        System.out.print("Informe um número inteiro: ");
        int option = key.nextInt();
        while (option != this.aleatorio) {
            System.out.println("Você não acertou no número aleatorio que \"pensei\"...");
            System.out.print("Tente novamente: ");
            option = key.nextInt();
        }
        System.out.println("Parabens, acertou o numero!");
    }

    public int novoAleatorio() {
        return new Random().nextInt(10) + 1;
    }
}