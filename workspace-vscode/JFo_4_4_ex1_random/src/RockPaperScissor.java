import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
       Random rnd = new Random();
       int numeroSorteado;

       for (int i = 0; i <= 10; i++) {
            numeroSorteado = rnd.nextInt(3); // 0 (inclusive) até 4 (exclusive)
            switch (numeroSorteado) {
                case 0:
                    System.out.println("pedra");
                    break;

                case 1:
                    System.out.println("papel");
                    break;

                case 2:
                    System.out.println("tesoura");
                    break;

                default:
                    System.err.println("deu ruim");
            }
       }
        


    }
}
