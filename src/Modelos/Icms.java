package Modelos;

public class Icms implements Imposto {
    @Override
    public double calculaImposto(double valor) {
        if (valor > 0) return ajustaValor(valor * 0.3);
        return 0;
    }
    private double ajustaValor(double valor){
        return Double.parseDouble(String.format("%.2f", valor).replace(",", "."));
    }
}