import java.util.Scanner;

public class NameMaker {
    
    public static void main(String args[])
    {
        String firstName;
        String middleName;
        String lastName;
        String fullName;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite seu primeiro nome: ");
        firstName = sc.nextLine();

        System.out.print("Digite seu nome do meio: ");
        middleName = sc.nextLine();        

        System.out.print("Digite seu sobrenome: ");
        lastName = sc.nextLine();

        fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);

        sc.close();
    }
    
}
