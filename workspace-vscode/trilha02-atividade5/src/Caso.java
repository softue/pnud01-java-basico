import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Caso {
    private String dataAbertura;

    public Caso(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDataFormatada() {
        LocalDate dataFormatada = LocalDate.parse(this.dataAbertura); // correção
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataFormatada.format(formato);
    }


    int numero;
    String decisao;
    String descricao;

    


}
