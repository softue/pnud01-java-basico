package trilha01;

public class App {

	public static void main(String[] args) {
		int numeroDeCasos = 1000;
		int casoAtual = 1;
		int totalInocentes = 0;
		int totalCulpados = 0;
		while (casoAtual <= numeroDeCasos) {
			// código para imprimir o caso atual
			System.out.println("Caso " + casoAtual + ":");
			// Veredito: 1 para inocente e 2 para culpado
			int veredito = (int) (Math.random()*2);
			if (veredito == 1) {
				// código para imprimir o veredito
				System.out.println("Veredito: Inocente");
				totalInocentes++;
			} else {
			// 	código para imprimir o veredito
				System.out.println("Veredito: Culpado");
				totalCulpados++;
			}
			System.out.println(); // imprimir linha em branco para pular linha
			casoAtual++;
		}
		System.out.println(); // imprimir linha em branco para pular linha
		System.out.println("Total de casos inocentes: " + totalInocentes);
		System.out.println("Total de casos culpados: " + totalCulpados);
	}

}
