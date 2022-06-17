package Modelos;

public class Produto {
    private String nome;
    private double valor;
    private int tipo;
    private double desconto;

    public Produto(String nome, double valor, int tipo){
        this.tipo = tipo;
        this.nome = nome;
        this.valor = Math.abs(valor);
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = Double.parseDouble(String.format("%.2f", desconto).replace(",", "."));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}