import java.util.Scanner;

public class SwitchEx1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o mês [1-4]: ");
        int month = sc.nextInt();
        String monthName;
        switch ( month ) {
            case 1:
                monthName = "Janeiro";
                break;
            case 2:
                monthName = "Fevereiro";
                break;
            case 3:
                monthName = "Março";
                break;
            case 4:
                monthName = "Abril";
                break;
            default:
                monthName = "Mês inválido";
        }
        System.out.println(monthName);
        sc.close();
    }
}
