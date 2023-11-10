import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int[] notas = new int[5];
        
        for ( int i=0; i<notas.length; i++){
            System.out.print("Insira a nota do teste " + (i + 1) + ": ");
            notas[i] = sc.nextInt();
        }

        double media = 0;
        for (int nota : notas) {
            media += nota;
        }
        media /= notas.length;

        System.out.println(media);
        sc.close();
        
    }

}
