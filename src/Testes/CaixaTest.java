package Testes;

import Modelos.Caixa;
import Modelos.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CaixaTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Produto Banana = new Produto("Banana", 0.99, 2);
        Produto Energetico = new Produto("Energy", 5.49, 3);
        Produto Arroz = new Produto("Arroz", 20, 1);
        Produto Chocolate = new Produto("Chocol", 4.5, 1);
        Produto Leite = new Produto("Leite", 3.73, 3);
        Produto Abacaxi = new Produto("Abacaxi", 2.4, 2);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(Banana);
        produtos.add(Energetico);
        produtos.add(Arroz);
        produtos.add(Chocolate);
        produtos.add(Leite);
        produtos.add(Abacaxi);

        Caixa caixa = new Caixa();
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("Nome Produto\tValor \tTipo \tQuantidade \tDesconto \tValor Total \t Valor Final\n");
        sbuilder.append("-------------------------------------------------------------------------------------");
        for (Produto item: produtos) {
            System.out.printf("Produto '%s' valor R$%.2f com tipo %d. Informe a quantidade: ",
                    item.getNome(), item.getValor(), item.getTipo());
            int quantidade = Integer.parseInt(scan.nextLine());
            double valorSemDesconto = Double.parseDouble(String.format("%.2f", item.getValor() * quantidade).replace(",", "."));
            double valorFinal = Double.parseDouble(String.format("%.2f", caixa.calculaValorFinal(item, quantidade)).replace(",", "."));
            sbuilder.append(String.format("\n%s\t\tR$ %.2f \t\t%d\t\t%d\t\tR$ %.2f\t\tR$ %.2f \t\t\t R$ %.2f",
                    item.getNome(),item.getValor(), item.getTipo(), quantidade, item.getDesconto(), valorSemDesconto, valorFinal));
//            sbuilder.append("\n"+item.getNome()+ "\t\t\tR$ "+ item.getValor() +
//                    "\t\t"+ item.getTipo() + "\t\t"+ quantidade + "\t\tR$ "+ item.getDesconto() + "\t\tR$ "+ valorSemDesconto + "\t\t \t" + String.format("%s", "R$ "+valorFinal));
            caixa.addProduto(item, quantidade);
        }
        sbuilder.append("\n-------------------------------------------------------------------------------------");
        System.out.println("\n"+sbuilder);
        System.out.printf("Total a pagar: R$ %.2f.\n", caixa.getTotalParaPagamento());
    }
}