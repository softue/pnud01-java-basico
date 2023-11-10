import java.util.ArrayList; // importar de java.util

public class App {

    enum Cores { VERDE, BRANCO };

    public static void main(String[] args) throws Exception {
        
        /* 
            ArrayList armazena apenas Objetos
            - Não armazena primitivas
            - Pode ter objetos do tipo String, Pessoa, Carro...
        */

        // <String> = Parâmetro de Tipo
        // new ArrayList<>() = podemos especificar o tamanho inicial entre ()
        ArrayList<String> nomes = new ArrayList<>();
        
        nomes.add("C#");
        nomes.add("Java");
        nomes.add("JavaScript");
        System.out.println(nomes.toString()); // [C#, Java, JavaScript]

        nomes.add(1, "C++"); // adiciona imediatamente antes do índice 1
        System.out.println(nomes.toString()); // [C#, C++, Java, JavaScript]

        System.out.println(nomes.get(3)); // JavaScript
        System.out.println(nomes.size()); // 4

        nomes.remove(0);
        System.out.println(nomes); // [C++, Java, JavaScript]
        
        // Remove o último elemento
        System.out.println(nomes.remove(nomes.size()-1) + " foi removido " + nomes.toString()); // Retorna JavaScript, nomes = [C++, Java]
        
        nomes.remove("Java");
        System.out.println(nomes.toString()); // [C++]


 

    }
}
