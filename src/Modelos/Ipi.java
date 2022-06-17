package Modelos;

public class Ipi implements Imposto{
    @Override
    public double calculaImposto(double valor) {
        if (valor >= 25000) return valor * 0.1;
        else if (valor > 0) return ajustaValor(valor * 0.05);
        else return 0;
    }
    private double ajustaValor(double valor){
        return Double.parseDouble(String.format("%.2f", valor).replace(",", "."));
    }
}