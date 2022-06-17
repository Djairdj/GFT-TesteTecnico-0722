package Testes;

import Modelos.Funcionario;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioTest {
    Date data = new Date();
    Funcionario f = new Funcionario("Eu", "122121", "111", 3500, data);

    public static void main(String[] args) {
        double salario = 1000;
        double aumento = 500;
        var agora = new Date();
        String nome = "Aspira";
        String cpf = "123123";
        String matricula = "321321";

        Funcionario f = new Funcionario(nome, cpf, matricula, salario, agora);

        System.out.println("Funcionário cadastrado:\n" + f);
        f.receberAumento(aumento);
        System.out.println("Funcionário com aumento:\n" + f);
        System.out.printf("Valor do aumento: %.2f.\n", aumento);
        System.out.printf("Valor do ganho bruto anual: %.2f.\n", f.calcularGanhoBrutoAnual());
        System.out.printf("Valor do ganho liquido anual: %.2f.\n", f.calcularGanhoLiquidoAnual());
        System.out.printf("Valor do ganho liquido mensal: %.2f.\n", f.calcularGanhoLiquidoMensal());
        System.out.printf("Valor do imposto anual: %.2f.\n", f.calcularImposto());
    }

    @Test
    public void TestRecebeAumento() {
        double atual = f.getSalario();
        double aumento = 20;
        double novo = atual + aumento;
        f.receberAumento(aumento);
        assertEquals(novo, f.getSalario());
    }

    @Test
    public void TestCalcularGanhoBrutoAnual() {
        f.setSalario(3500);
        double t = 42000;
        assertEquals(t, f.calcularGanhoBrutoAnual());
    }

    @Test
    public void TestCalcularGanhoLiquidoMensal() {
        f.setSalario(3500);
        double v = 2940; // valor de 3500 menos os impostos mensais
        assertEquals(v, f.calcularGanhoLiquidoMensal());
    }

    @Test
    public void TestCalcularGanhoLiquidoAnual() {
        f.setSalario(3500);
        double g = 35280;
        assertEquals(g, f.calcularGanhoLiquidoAnual());
    }

    @Test
    public void TestCalcularImposto() {
        double valor = 3500;
        double excedente = valor - 2500;
        f.setSalario(valor);
        double t = excedente * 0.175 * 12 + (valor * 0.11) * 12;
        assertEquals(t, f.calcularImposto());
    }
}