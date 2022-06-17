package Modelos;

public abstract class Conta {
    private static long sequencia = 9999;
    private static short digit = 0;
    {
        Conta.sequencia++;
        Conta.digit =  (short) ((Conta.digit+1) % 10);
    }

    protected String numero;
    protected String titular;
    private double saldo = 0;

    public Conta( String titular) {
        this.numero = Conta.sequencia + " - " + digit;
        this.titular = titular;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "numero='" + numero + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo="+String.format("%.2f",saldo) +
                '}';
    }
    public abstract double rendimento();
    public String getNumero() {
        return numero;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void depositar(double valor){
        if (valor >= 0) this.saldo+=valor;else System.out.println("Valor não pode ser negativo");
    }
    public double sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return valor;
        }else {
            System.out.println("Saldo insuficiente!");
            return 0;
        }
    }
}