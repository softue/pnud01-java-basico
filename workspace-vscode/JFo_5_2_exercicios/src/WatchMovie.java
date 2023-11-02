import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
        double moviePrice;
        int movieScore;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the movie ticket price: ");
        moviePrice = sc.nextInt();

        System.out.print("Enter the movie score: ");
        movieScore = sc.nextInt();

        System.out.println(moviePrice);
        System.out.println(movieScore);

        if ( moviePrice >= 12 && movieScore == 5) {
            System.out.println("Estou interessado em assistir ao filme.");
        } else {
            System.out.println("Não esotu interessado em assistir ao filme.");
        }

        sc.close();
    }
}
