import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListEx2 {
    public static void main(String args[]) {
        ArrayList <Integer> numeros = new ArrayList<>();

        // Preencher com 100 números
        for (int i=0; i<100; i++) {
            numeros.add(i);
        }

        // Remover os pares
        Iterator <Integer> it = numeros.iterator();
        while (it.hasNext()) {
            int itValor = it.next();
            if ( itValor % 2 == 0 ) it.remove();
        }     
        
        // Exibir o ArrayList com for-each
        for (Integer i : numeros) {
            System.out.print(i+",");
        }  
    }
}
