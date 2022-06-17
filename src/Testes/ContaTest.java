package Testes;

import Modelos.Conta;
import Modelos.ContaCorrente;
import Modelos.ContaPoupanca;

class ContaTest {
  public static void main(String[] args) {
    Conta[] contas = new Conta[2];
    Conta poupanca = new ContaPoupanca("Poupanceiro");
    Conta corrente = new ContaCorrente("Correntista");
    contas[0] = poupanca;
    contas[1] = corrente;
    for (Conta conta : contas) {
      double valorMovimento = 200;
      System.out.printf("\n%s cadastrada: %s\n", conta.getClass().getSimpleName(), conta);
      System.out.printf("Depositando valor negativo: (%.2f): ", -valorMovimento);
      conta.depositar(-valorMovimento);
      System.out.printf("Depositando valor positivo (%.2f) e mostrando o estado da conta: ", valorMovimento);
      conta.depositar(valorMovimento);
      System.out.println(conta);
      System.out.printf("Sacando em excesso (%.2f): ", valorMovimento *= 2);
      conta.sacar(valorMovimento);
      System.out.printf("Sacando %.2f com saldo disponível e mostrando o estado da conta: ", valorMovimento /= 4);
      conta.sacar(valorMovimento);
      System.out.println(conta);
      System.out.println("Rendimento atual: " + conta.rendimento());
    }
  }
}