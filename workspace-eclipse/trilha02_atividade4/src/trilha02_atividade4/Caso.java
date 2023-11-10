package trilha02_atividade4;

public class Caso {

	private int numero;
	private String decisao;
	private String descricao;
	
	public Caso(int numero, String decisao, String descricao) {
		this.numero = numero;
		this.decisao = decisao;
		this.descricao = descricao;
	}
	
	public String getDecisao() {
		return this.descricao;
	}
	
	public void setDecisao(String decisao) {
		// era: this.descricao = decisao;
		this.decisao = decisao;
	}
	
	public String getDescricao() {
		// era: return this.decisao;
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		// era: this.decisao = descricao;
		this.descricao = descricao;
	}
	
}
