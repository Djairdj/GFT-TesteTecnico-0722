package Testes;

import Modelos.DezNumeros;

public class DezNumerosTest {

    public static void main(String[] args) {
        DezNumeros dez = new DezNumeros();
        dez.adicionarValores();
        System.out.printf("\nValores informados:\n%s\n\n", dez.getNumbers());
        System.out.printf("O maior number informado foi %.2f.\n", dez.getMaior());
        System.out.printf("O menor number informado foi %.2f.\n", dez.getMenor());
        System.out.printf("A media encontrada foi %.2f.\n", dez.getMedia());
        System.out.printf("Existem %d valores acima de 10.\n", dez.getQuantidadeAcimaDeDez());
        System.out.printf("Os valores acima de 10 são %s.\n", dez.acimaDeDez());
        System.out.printf("Existem %d valor(es) acima de 50.\n", dez.getQuantidadeAcimaDeCinquenta());
        System.out.printf("Os valores acima de 50 são %s.\n", dez.acimaDeCinquenta());
    }

}