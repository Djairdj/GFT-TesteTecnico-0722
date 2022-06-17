package Modelos;

public class Cofins implements Imposto{
    @Override
    public double calculaImposto(double valor) {
        if (valor > 17000)return ajustaValor(valor * 0.08);
        else return 0;
    }
    private double ajustaValor(double valor){
        return Double.parseDouble(String.format("%.2f", valor).replace(",", "."));
    }
}