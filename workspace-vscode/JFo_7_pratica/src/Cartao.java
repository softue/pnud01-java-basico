public class Cartao {
    
    private static int numeroDeCartoes = 1;
    private int numero = numeroDeCartoes;

    private int saldo = 0;
    private int tickets = 0;

    Cartao() {
        this.saldo = 0;
        this.tickets = 0;
        numeroDeCartoes++;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

}