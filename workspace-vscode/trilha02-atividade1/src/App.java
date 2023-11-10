/* 
    Código percorre todos os casos julgados e conta quantos foram os vereditos "inocente" e quantos foram "culpado"
*/

import java.util.Scanner;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        
        String continuarResposta;
        int numero;
        char decisao;
        String descricao;
        LocalDate dataAbertura;
        LocalDate dataEncerramento;

        Scanner sc = new Scanner(System.in);

        Reu reu0 = new Reu("Alpargatas", Reu.TipoPessoa.PESSOA_JURIDICA);
        Advogado advogado0 = new Advogado("PB1234", "Mike Ross");
        Juiz juiz0 = new Juiz("300401", "Rita de Cássia");
        
        Caso caso0 = new Caso(1, 'I', "Caso de partilha de bens", LocalDate.now().minusDays(1), LocalDate.now());
        caso0.setAdvogado(advogado0);
        caso0.setJuiz(juiz0);
        caso0.setReu(reu0);
        caso0.imprimir();
        System.out.println();

        do {
            
             System.out.print("Qual o número do caso? ");
            numero = Integer.parseInt(sc.nextLine());

            System.out.print("Qual a decisão do caso [A/C/I] ? ");
            decisao = sc.nextLine().charAt(0);

            System.out.print("Qual é a descrição do caso? ");
            descricao = sc.nextLine();
            
            System.out.print("Data de abertura (YYYY-MM-DD): ");
            dataAbertura = LocalDate.parse(sc.nextLine());

            System.out.print("Data de encerramento (YYYY-MM-DD): ");
            dataEncerramento = LocalDate.parse(sc.nextLine());

            if ( dataAbertura.isAfter(dataEncerramento) ) {
                System.out.println("Erro: a data de abertura não pode vir depois da data de encerramento");
                System.exit(1);
            }

            Caso caso = new Caso(numero, decisao, descricao, dataAbertura, dataEncerramento);
            caso.setAdvogado(advogado0);
            caso.setJuiz(juiz0);
            caso.setReu(reu0);
            caso.imprimir();

            do {
                System.out.println();
                System.out.print("Deseja continuar? [S/N] ");
                continuarResposta = sc.nextLine().toLowerCase();
            } while ( !continuarResposta.equals("s") && !continuarResposta.equals("n") );
            
            if ( continuarResposta.equals("n") ) break;

            caso = null;
            
        } while ( true );
        
        sc.close();
        System.out.println("Obrigado!");
        System.exit(0);
    }
}
