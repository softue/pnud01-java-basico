public class App {
    public static void main(String[] args) throws Exception {

        Terminal terminal = new Terminal();
        Jogo jogo1 = new Jogo();
        Cartao cartao1 = new Cartao();
        Cartao cartao2 = new Cartao();
        Cartao cartao3 = new Cartao();
        
        terminal.recarregarCartao(cartao1, 100);
        terminal.consultarSaldoCartao(cartao1);

        terminal.recarregarCartao(cartao2, 200);
        terminal.consultarSaldoCartao(cartao2);

        terminal.recarregarCartao(cartao3, 50);
        terminal.consultarSaldoCartao(cartao3);


        jogo1.jogar(cartao1);
        jogo1.jogar(cartao1);
        terminal.consultarSaldoCartao(cartao1);

        jogo1.jogar(cartao2);
        terminal.consultarSaldoCartao(cartao2);


    }
}
