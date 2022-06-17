package Testes;

import Modelos.Cofins;
import Modelos.Icms;
import Modelos.Imposto;
import Modelos.Ipi;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImpostosTest {
    static Scanner scanner = new Scanner(System.in);
    double[] valores = {-100, 1_000d, 17_000, 24_999d, 25_000d, 100_000d};
    double[] respostasIPI = {0d, 50d, 850d, 1_249.95d, 2_500d, 10_000d};
    double[] respostasICMS = {0d, 300d, 5_100d, 7_499.7d, 7_500d, 30_000d};
    double[] respostasCOFINS = {0d, 0d, 0d, 1_999.92d, 2_000, 8_000d};

    public static void main(String[] args) {

        Icms icms = new Icms();
        Ipi ipi = new Ipi();
        Cofins cofins = new Cofins();
        System.out.print("Quantos valores haveis de testar? ");
        int n = Integer.parseInt(scanner.nextLine());
        double soma;
        for (int i = 1; i <= n; i++) {
            System.out.printf("\nDigite o %dº valor: ", i);
            double valor = Double.parseDouble(scanner.nextLine());
            double ic = calcularImpostos(icms, valor);
            double ip = calcularImpostos(ipi, valor);
            double cof = calcularImpostos(cofins, valor);
            soma = valor + ic + ip + cof;
            System.out.println("ICMS: " + ic);
            System.out.println("IPI: " + ip);
            System.out.println("COFINS: " + cof);
            System.out.println("Valor final: " + soma);
        }
    }

    private static double calcularImpostos(Imposto imposto, double value) {
        return imposto.calculaImposto(value);
    }

    @Test
    void calculaIpi() {
        Ipi ipi = new Ipi();
        for (int i = 0; i < valores.length; i++) {
            assertEquals(respostasIPI[i], ipi.calculaImposto(valores[i]));
        }
    }

    @Test
    void calculaIcms() {
        Icms ic = new Icms();
        for (int i = 0; i < valores.length; i++) {
            assertEquals(respostasICMS[i], ic.calculaImposto(valores[i]));
        }
    }

    @Test
    void calculaCofins() {
        Cofins cof = new Cofins();
        for (int i = 0; i < valores.length; i++) {
            assertEquals(respostasCOFINS[i], cof.calculaImposto(valores[i]));
        }
    }

    @Test
    void impostosTestAll() {
        Icms ic = new Icms();
        Ipi ip = new Ipi();
        Cofins cof = new Cofins();
        Imposto[] impostos = {ic, ip, cof};
        double[][] respostas = {respostasICMS, respostasIPI, respostasCOFINS};
        for (int imp = 0; imp < impostos.length; imp++) {
            for (int i = 0; i < respostas[imp].length; i++) {
                double impostoEsperado = respostas[imp][i];
                double impostoRecebido = impostos[imp].calculaImposto(valores[i]);
                if (impostoEsperado != impostoRecebido) {
                    System.out.printf("Testando %s incidente em %.2f gerando %.2f em imposto.",
                            impostos[imp].getClass().getSimpleName().toUpperCase(), valores[i], impostoRecebido);
                }
                assertEquals(impostoEsperado, impostoRecebido);
            }
        }
    }
}