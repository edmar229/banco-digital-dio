package cadastro;

import java.util.Scanner;

import banco.Cliente;
import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;

public class CriarConta {
  
  public Conta cadastrarCliente(EnumTipoConta tipoConta) {
    System.out.println("------CADASTRO EM ANDAMENTO------");
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    String nome = scanner.nextLine();
    System.out.println("Digite seu cpf: ");
    int cpf = scanner.nextInt();

    Cliente cliente = new Cliente();
    cliente.setNome(nome);
    cliente.setCpf(cpf);

    if (tipoConta.equals(EnumTipoConta.CORRENTE)) {
      ContaCorrente contaCorrente = new ContaCorrente(cliente);
      return contaCorrente;
    } else {
      ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);
      return contaPoupanca;
    }
  }
}
