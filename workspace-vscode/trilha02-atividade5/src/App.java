import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma data no formato yyyy-MM-dd (exemplo: 2023-09-28): ");
        String data = scanner.nextLine();

        scanner.close();

        Caso caso = new Caso(data);

        System.out.println("Data do caso: " + caso.getDataAbertura() );
        System.out.println("Data do caso (formatada): " + caso.getDataFormatada() );
    }
}
