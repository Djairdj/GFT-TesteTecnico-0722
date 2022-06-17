package Modelos;

import java.util.Date;

public class Funcionario {
    private String nome;
    private String CPF;
    private String matricula;
    private double salario;
    private Date dataAdmissao;

    public Funcionario(String nome, String CPF, String matricula, double salario, Date data) {
        this(nome, CPF);
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = data;
    }

    public Funcionario(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void receberAumento(double aumento) {
        if (aumento > 0) this.salario += aumento;
    }

    public double calcularGanhoBrutoAnual() {
        return this.salario * 12;
    }

    public double calcularImposto() {
        double IR = 0, INSS = this.salario * (0.11);
        if (this.salario > 2500) IR = (this.salario - 2500) * (0.175);
        return (IR + INSS) * 12;
    }

    public double calcularGanhoLiquidoMensal() {
        return this.calcularGanhoLiquidoAnual() / 12;
    }

    public double calcularGanhoLiquidoAnual() {
        return this.salario * 12 - this.calcularImposto();
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", matricula='" + matricula + '\'' +
                ", salario=" + salario +
                ", dataAdmissao=" + dataAdmissao +
                '}';
    }
}