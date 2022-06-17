package Modelos;

public class ContaCorrente extends Conta{
    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public double rendimento() {
        return Double.parseDouble(String.format("%.2f",this.getSaldo() * 0.07).replace(",", ".")) ;
    }
}