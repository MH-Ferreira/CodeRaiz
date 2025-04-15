package arvore_binaria;

import java.util.Scanner;

public class ArvoreBinaria {

	public static final String RESET = "\u001B[0m";
	public static final String VERDE = "\u001B[32m";
	public static final String AMARELO = "\u001B[33m";

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Digite o valor da raiz (dígito entre 0 e 9): ");
		int raizValor = scn.nextInt();

		if (raizValor < 0 || raizValor > 9) {
			System.out.println("Valor inválido. A raiz deve ser um dígito entre 0 e 9.");
			return;
		}

		No raiz = new No(raizValor);

		raiz.esquerdo = inserirFilho(scn, "esquerdo", raizValor);
		raiz.direito = inserirFilho(scn, "direito", raizValor);

		System.out.println("\nAgora, digite os filhos dos nós abaixo:");

		if (raiz.esquerdo != null) {
			raiz.esquerdo.esquerdo = inserirFilho(scn, "esquerdo", raiz.esquerdo.valor);
			raiz.esquerdo.direito = inserirFilho(scn, "direito", raiz.esquerdo.valor);
		}

		if (raiz.direito != null) {
			raiz.direito.esquerdo = inserirFilho(scn, "esquerdo", raiz.direito.valor);
			raiz.direito.direito = inserirFilho(scn, "direito", raiz.direito.valor);
		}

		System.out.println(AMARELO + "\n==== ====" + RESET);

		int resultado = somarNumeros(raiz);
		System.out.println(VERDE + "\nResultado final: " + resultado + RESET);

		System.out.println(AMARELO + "\n=========================" + RESET);
		System.out.println("Fim da execução.");

		scn.close();
	}

	public static int somarNumeros(No no) {
		return dfs(no, 0);
	}

	public static int dfs(No no, int somaAtual) {
		if (no == null)
			return 0;

		somaAtual = somaAtual * 10 + no.valor;

		if (no.esquerdo == null && no.direito == null)
			return somaAtual;

		return dfs(no.esquerdo, somaAtual) + dfs(no.direito, somaAtual);
	}

	public static No inserirFilho(Scanner scanner, String lado, int valorPai) {
		System.out.print("Digite o valor do filho " + lado + " de " + valorPai + " (dígito entre 0 e 9): ");
		int valorFilho = scanner.nextInt();

		if (valorFilho < 0 || valorFilho > 9) {
			System.out.println("Valor inválido. O filho deve ser um dígito entre 0 e 9.");
			return null;
		}

		return new No(valorFilho);
	}

	static class No {
		int valor;
		No esquerdo, direito;

		No(int valor) {
			this.valor = valor;
		}
	}
}
