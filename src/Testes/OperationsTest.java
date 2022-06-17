package Testes;

import Modelos.Divisao;
import Modelos.Multiplicacao;
import Modelos.Soma;
import Modelos.Subtracao;

public class OperationsTest {

    public static void main(String[] args) {
        Soma sum = new Soma();
        Subtracao sub = new Subtracao();
        Divisao div = new Divisao();
        Multiplicacao m = new Multiplicacao();

        var entrada = new int[][]{
                {20, 10},
                {198, 99},
                {11549, 9284},
                {99999, 9},
                {800, 0}
        };
        for (var valores : entrada){
            int a = valores[0];
            int b = valores[1];
            System.out.printf("Somando %d com %d dah %.2f.\n", a, b, sum.calcular(a, b));
            System.out.printf("Subtraindo %d de %d dah %.2f.\n", b, a, sub.calcular(a, b));
            System.out.printf("Multiplicando %d com %d dah %.2f.\n", a, b, m.calcular(a, b));
            try {
                System.out.printf("Dividindo %d por %d dah %.2f.\n", a, b, div.calcular(a, b));
            } catch (ArithmeticException ignored) {
            }
        }
    }
}