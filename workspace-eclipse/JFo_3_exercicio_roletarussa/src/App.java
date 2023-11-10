import java.util.Scanner;

public class App {

	int numeroRodadas = 0;
	int tamborPosicao = 0;
	double idadeUsuario = 0;
	String nomeUsuario;
	Scanner sc;

	public static void main(String[] args) {
		App jogo = new App();
		jogo.pegarDados();
		jogo.jogar();
	}

	public void pegarDados() {
		sc = new Scanner(System.in);
		System.out.println("Roleta Russa");
		System.out.print("Qual o seu nome, gente boa? ");
		this.nomeUsuario = sc.nextLine();
		System.out.println("Ola, " + this.nomeUsuario + ".");
		System.out.print("Qual a sua idade, macho? ");
		this.idadeUsuario = sc.nextDouble();
		conferirIdade();
	}

	public void conferirIdade() {
		if (this.idadeUsuario < 18) {
			System.out.println("Proibido para menores de 18 anos.");
			System.exit(0);
		}
	}

	public void fimDoJogo() {
		System.out.println("Você morreu, " + this.nomeUsuario);
	}

	public void jogar() {
		do {
			System.out.print("Quantas vezes você quer rodar o tambor? ");
			this.numeroRodadas = sc.nextInt();
			rodar();
		} while ( this.tamborPosicao != 0);
		fimDoJogo();
	}

	public void rodar() {
		for (int rodada=0; rodada<this.numeroRodadas; rodada++) {
			System.out.println("Rodando...");
			this.tamborPosicao = (int) (Math.random() * 6);
			//System.out.println(this.tamborPosicao);
		}
	}

}