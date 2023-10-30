import java.util.Scanner;

public class ComputeBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double IMC;
        double peso;
        double altura;
        
        System.out.print("Informe o peso em libras: ");
        peso = sc.nextDouble();
        
        System.out.print("Informe a altura em polegadas: ");
        altura = sc.nextDouble();

        IMC = Math.round(peso / Math.pow(altura, 2) * 703);
        System.out.println(IMC);

        sc.close();
    }   
}
