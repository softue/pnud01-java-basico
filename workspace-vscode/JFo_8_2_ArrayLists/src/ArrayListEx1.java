import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx1 {

    public static void main(String[] args) {

        /*
            ArrayLists
            −Criar uma ArrayList
            −Manipular uma ArrayList usando seus métodos
            −Percorrer uma ArrayList usando iteradores e loops for-each
            −Usar classes wrapper e o Autoboxing para adicionar tipos de dados primitivos a uma ArrayList
         */
        
        // ArrayList pode armazenar somente objetos, e não primitivas
        // Não pode: ArrayList<int> list = new ArrayList<int>();
        // Pode (com classes wrapper): ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> estudantes = new ArrayList<>();
                
        estudantes.add("Amy");
        estudantes.add("Bob");
        estudantes.add("Cindy");
        estudantes.add("David");
        
        System.out.println(estudantes.toString());
        System.out.println(estudantes.size());

        estudantes.add(0, "Nick"); // Nick, Amy, Bob, Cindy, David
        estudantes.add(1, "Mike"); // Nick, Mike, Amy, Bob, Cindy, David
        estudantes.remove(3); // Nick, Mike, Amy, Cindy, David
        
        System.out.println(estudantes);
        System.out.println(estudantes.size());

        // Percorrendo com o for-each
        for ( String estudante : estudantes ) {
            System.out.println("O nome é " + estudante);
        }

        // Percorrendo com o iterator
        // - Só é usado para percorrer para frente
        // - import java.util.Iterator
        Iterator<String> iterator = estudantes.iterator(); // 1) Chame o método iterator( ) da coleção.
        while (iterator.hasNext()) { // 2) loop que faça uma chamada para hasNext( ).
            System.out.println("O nome com Iterator é " + iterator.next()); // 3) obtenha cada elemento chamando next( )
        }

        // ListIterator
        // - percorra a ArrayList nas duas direções
        // - não contém o método de remoção
        // - import java.util.ListIterator
        ListIterator<String> listIterator = estudantes.listIterator();
        System.out.println("Percorrendo com ListIterator para frente .next()");
        while (listIterator.hasNext()) {
            System.out.println("O nome com ListIterator é " + listIterator.next());
        }
        System.err.println("Percorrendo com ListIterator para trás .previous()");
        while (listIterator.hasPrevious()) {
            System.out.println("O nome com ListIterator é " + listIterator.previous());
        }

        // Classes Wrapper
        // - encapsulam, ou incorporam, os tipos primitivos dentro de um objeto
        // - Os oito tipos de classes wrapper (para cada tipo de dados primitivo)
        // byte, short, int, long, float, double, char, boolean
        // Byte, Short, Integer*, Long, Float, Double, Character*, Boolean

        /*
         * AutoBoxing e ao Unboxing
         * -------------------------
         * 
         * Conversão automática de tipos de dados primitivos para classes wrapper e vice-versa
         * Permite que você escreva um código mais claro e direto, o que facilita a leitura
         * Autoboxing: Tipos de dados primitivos para classes Wrapper. Ex: Double score = 18.58; (primitivo para Double)
         * Unboxing: Classes Wrapper para Tipos de dados primitivos. Ex: double goal = score; (Wrapper para primitivo)
         */
        ArrayList <Integer> numeros = new ArrayList<>();
        // AutoBoxing: int é convertido para Integer e adicionado à ArrayList sem chamar explicitamente a classe wrapper, Integer
        for (int i=0; i<50; i++) {
            numeros.add(i); // autoboxing: inserindo int na Wrapper Integer
        }
        // UnBoxing: o objeto Integer é convertido para o primitivo int sem chamar um método para faze a conversão.
        for (Integer i : numeros) {
            int nos = i; // unboxing: salvando em int um objeto da classe Wrapper Integer
            System.out.println(nos);
        }

    }
    
}
