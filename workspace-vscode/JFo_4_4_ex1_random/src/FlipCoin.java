import java.util.Random;

public class FlipCoin {

    public static void main(String[] args) {

        Random rand;
        double chance;
        int heads = 0;
        int tails = 0;

        // nextDouble
        for (int sorteio = 0; sorteio < 1000; sorteio++) {
            // 50% chance heads, 50% chance tails
            rand = new Random();
            chance = rand.nextDouble();
            if (chance < 0.5) heads++; else tails++;
            //System.out.println(chance);
        }
        System.out.println(heads);        
        System.out.println(tails);

        Random num = new Random();
        int randomnum = num.nextInt(20); // de 0 (inclusive) até 20 (exclusivo)
        System.out.println("Número Aleatório: " + randomnum);

    }

}

