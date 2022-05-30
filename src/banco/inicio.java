package banco;

import java.util.Locale;
import java.util.Scanner;

import solicita.informacoes;

public class inicio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valor = 0.0;

		System.out.print("Enter account number: ");
		int conta = sc.nextInt();
		System.out.print("Enter acconut holder: ");
		String nome = sc.next();
		System.out.print("Is there na initial deposit (y/n)? ");
		String opcao = sc.next();
		if ("y".equals(opcao)) {
			System.out.print("Enter initial deposit value: ");
			valor = sc.nextDouble();
		}

		else {
			valor = 0.0;
		}

		informacoes informacoes = new informacoes(conta, nome, valor);

		System.out.println("Accout data: ");
		System.out.print("Account: " + informacoes.getConta() + ", Holder: " + informacoes.getNome() + " balance: $ "
				+ informacoes.getValor());

		System.out.println();
		System.out.printf("Enter a deposit value:");
		valor = sc.nextDouble();
		informacoes.addinheiro(valor);
		System.out.print("Account: " + informacoes.getConta() + ", Holder: " + informacoes.getNome() + " balance: $ "
				+ informacoes.getValor());

		System.out.println();
		System.out.printf("Enter a Withdraw value:");
		valor = sc.nextDouble();
		informacoes.removedinheiro(valor);
		System.out.print("Account: " + informacoes.getConta() + ", Holder: " + informacoes.getNome() + " balance: $ "
				+ informacoes.getValor());

		sc.close();
	}

}
