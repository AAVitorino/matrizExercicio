package contaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class ContaBancariaPp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int resposta;

		System.out.println("Numero da conta: ");
		int numero = sc.nextInt();
		System.out.println("Titular da conta:");
		String nome = sc.next();
		Conta conta = new Conta(numero, nome);
		System.out.println("Saldo inicial: ");
		conta.setInicial(sc.nextDouble());

		System.out.println("Alterar nome? 0/1");
		resposta = sc.nextInt();
		if (resposta == 0) {
			System.out.println("Novo nome: ");
			nome = sc.next();
			conta.setName(nome);

			System.out.println("Informações da conta: ");
			System.out.println(conta.toString());
		} else {
			if (resposta == 1) {
				conta.setName(nome);
				System.out.println("Informações da conta: ");
				System.out.println(conta.toString());

			}
		}

		System.out.println("Informe o valor do deposito: ");
		conta.setDeposito(sc.nextDouble());
		System.out.println(conta.toString());

		System.out.println("Informe o valor do saque: ");
		conta.setSaque(sc.nextDouble());

		System.out.println(conta.toString());

	}

}
