import java.util.Scanner;

public class ProcessName {

    public static void main(String[] args) {
        String fullName;
        String firstName;
        String lastName;

        Scanner console = new Scanner(System.in);

        System.out.print("Enter your name: ");
        fullName = console.nextLine();

        // your code goes here
        firstName = fullName.substring(0, fullName.indexOf(" "));
        lastName = fullName.substring(fullName.lastIndexOf(" ") + 1, fullName.length());

        // System.out.println(firstName);
        // System.out.println(lastName);
        System.out.println(lastName + ", " + firstName.charAt(0) + ".");

        console.close();
    }
}