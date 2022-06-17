package Modelos;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular) {
        super(titular);
    }

    @Override
    public double rendimento() { return this.getSaldo() * 0.05; }
}