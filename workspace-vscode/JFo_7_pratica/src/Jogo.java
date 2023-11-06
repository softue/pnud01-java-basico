import java.util.Random;

public class Jogo {
    
    public void jogar(Cartao cartao) {
        Random rnd = new Random();
        if ( cartao.getSaldo() >= 100) {
            cartao.setSaldo(cartao.getSaldo()-100);
            cartao.setTickets(cartao.getTickets() + rnd.nextInt(10));
        } else {
            System.out.printf("O cartão %s não possui créditos suficientes!\n", cartao.getNumero() );
        }
    }
}
