
public class Precedencia {

	public static void main (String[] args) {
		int x = 25 - 5 * 4 / 2 - 10 + 4;
		System.out.println(x); // imprime 9 em vez de 34
		
		int y = (((25 - ((5 * 4) / 2 )) - 10) + 4);
		System.out.println(y); // imprime 9
		
		int age = 20;
		System.out.println("Valor da idade: " +age);
		age = 5 + 3;
		System.out.println("Valor da idade: " +age);
		age = age + 1;
		age++;
		System.out.println("Valor da idade: " +age);		
	}
	
}
