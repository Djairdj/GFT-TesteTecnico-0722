import Testes.*;

import java.util.Scanner;

public class Rodar {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu(args);
    }

    private static void menu(String[] args) {
        String opt = " ";
        while (!opt.equals("0")) {
            System.out.println("\n\n############ MENU #############");
            System.out.println("Informe o número da questão:");
            System.out.println("0 - Sair;");
            System.out.println("1 - Contar letras da ultima palavra;");
            System.out.println("2 - Trabalhando com array;");
            System.out.println("3 - Renda do funcionario;");
            System.out.println("4 - Conta bancaria;");
            System.out.println("5 - Soma das letras;");
            System.out.println("6 - Operacoes basicas;");
            System.out.println("7 - Teste POO questao 1 - Caixa de Mercado;");
            System.out.println("8 - Teste POO questao 2 - Dez Numeros;");
            System.out.println("9 - Teste POO questao 3 - Calcular Impostos;");
            System.out.println("10 - Teste POO questao 4 - Numero Aleatorio;");
            opt = sc.nextLine();
            switch (opt) {
                case "0":
                    System.out.println("Programa finalizado");
                    break;
                case "1":
                    ContarLetrasUltimaPalavraTest.main(args);
                    menu(args);
                    break;
                case "2":
                    UsandoArrayTest.main(args);
                    menu(args);
                    break;
                case "3":
                    FuncionarioTest.main(args);
                    menu(args);
                    break;
                case "4":
                    ContaTest.main(args);
                    menu(args);
                    break;
                case "5":
                    SomaLetrasTest.main(args);
                    menu(args);
                    break;
                case "6":
                    OperationsTest.main(args);
                    menu(args);
                    break;
                case "7":
                    CaixaTest.main(args);
                    menu(args);
                    break;
                case "8":
                    DezNumerosTest.main(args);
                    menu(args);
                    break;
                case "9":
                    ImpostosTest.main(args);
                    menu(args);
                    break;
                case "10":
                    NumeroRandomDe0ate10Test.main(args);
                    menu(args);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}