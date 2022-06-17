package Modelos;

public class Divisao implements Operations{
    @Override
    public double calcular(int a, int b) throws ArithmeticException{
        if (b == 0) {
            System.out.printf("Impossível divisão por zero.\n");
            throw new ArithmeticException();
        }
        else return (double) a / b;
    }
}