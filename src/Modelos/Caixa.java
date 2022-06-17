package Modelos;

import java.util.ArrayList;
import java.util.List;

public class Caixa {
    private List<Produto> produtos;
    private double totalParaPagamento;

    public Caixa(){
        this.produtos = new ArrayList<>();
        this.totalParaPagamento = 0;
    }
    public double calculaValorFinal(Produto produto, int quantidade){
        int tipo = produto.getTipo();
        switch (tipo){
            case 1:
                produto.setDesconto(produto.getValor() * 0.1 * quantidade);
                return produto.getValor() * quantidade - produto.getDesconto();
            case 2:
                produto.setDesconto(produto.getValor() * 0.2 * quantidade);
                return produto.getValor() * quantidade - produto.getDesconto();
            case 3:
                if (quantidade > 5){
                    produto.setDesconto(produto.getValor() * 0.10 * quantidade);
                    return produto.getValor() * quantidade - produto.getDesconto();
                }
                return produto.getValor() * quantidade;
            default:
                return produto.getValor();
        }
    }

    public void addProduto(Produto produto, int quantidade){
        produto.setValor(this.calculaValorFinal(produto, quantidade));
        this.produtos.add(produto);
    }
    public double getTotalParaPagamento(){
        this.totalParaPagamento = 0;
        for (Produto prod: this.produtos) {
            this.totalParaPagamento += (prod.getValor());
        }
        return this.totalParaPagamento;
    }
}