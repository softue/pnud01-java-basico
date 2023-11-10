import java.time.LocalDate;

public class Caso {

    private int numero;
    private char decisao;
    private String descricao;
    private Estado estado;
    private LocalDate dataAbertura;
    private LocalDate dataEncerramento;

    private Reu reu;
    private Juiz juiz;
    private Advogado advogado;
    private Sentenca sentenca;

    enum Sentenca {
        INOCENTE, CULPADO
    };

    enum Estado {
        ABERTO, 
        EM_ANDAMENTO, 
        CONCLUIDO, 
        ARQUIVADO
    }

    public Caso(int numero, char decisao, String descricao, LocalDate dataAbertura, LocalDate dataEncerramento) { // não tem o void
        this.numero = numero;
        this.setDecisao(decisao);
        this.descricao = descricao;
        this.dataAbertura = dataAbertura;
        this.dataEncerramento = dataEncerramento;
        this.estado = Estado.ABERTO;
    }

    public void imprimir() {
        System.out.println();
        System.out.printf("Caso %d\n", this.numero);
        System.out.println("Decisao: " + this.decisao);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Data de abertura: " + this.dataAbertura);
        System.out.println("Data de encerramento: " + this.dataEncerramento);
        System.out.printf("Advogado: %s (%s)\n", this.advogado.getNome(), this.advogado.getOab());
        System.out.printf("Juiz: %s (%s)", this.juiz.getNome(), this.juiz.getMatricula());
        System.out.println();
    }

    public void setDecisao(char decisao) {
        if ( decisao == 'A' || decisao == 'I' || decisao == 'C' ) this.decisao = decisao;
    }

    public char getDecisao() {
        return this.decisao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Reu getReu() {
        return reu;
    }

    public Juiz getJuiz() {
        return juiz;
    }

    public Advogado getAdvogado() {
        return advogado;
    }

    public void setAdvogado(Advogado advogado) {
        this.advogado = advogado;
    }

    public Sentenca getSentenca() {
        return sentenca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setAvogado(Advogado advogado) {
        this.advogado = advogado;
    }

    public void setJuiz(Juiz juiz) {
        this.juiz = juiz;
    }

    public void setReu(Reu reu) {
        this.reu = reu;
    }

    public void setSentenca(Sentenca sentenca) {
        this.sentenca = sentenca;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDate getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(LocalDate dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

}
