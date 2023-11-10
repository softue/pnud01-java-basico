public class Reu {
    
    private String nome;
    private TipoPessoa tipoPessoa;
    public enum TipoPessoa { PESSOA_FISICA, PESSOA_JURIDICA };

    public Reu(String nome, TipoPessoa tipoPessoa) {
        this.nome = nome;
        this.tipoPessoa = tipoPessoa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

}
