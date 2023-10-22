public class Person {
	public static void main(String[] args){
		int ageYears = 90;
		int ageDays = ageYears * 365;
		long ageSecondsWrong = ageYears * 365 * 24 * 60 * 60; // estouro da variável int, mesmo sendo long
		long ageSecondsOk = ageYears * 365 * 24L * 60 * 60; // forçar um dos elementos para long
		System.out.println("Você já tem " + ageDays
				+ " dias de idade.");
		System.out.println("Você já tem " + ageSecondsOk
				+ " segundos de idade.");
		System.out.println();
		System.out.println("ageSecondsWrong: " + ageSecondsWrong);
		System.out.println("ageSecondsOk   : " + ageSecondsOk);
	}//fim do método main
}//fim da classe Person