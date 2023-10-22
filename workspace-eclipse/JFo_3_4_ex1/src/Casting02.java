public class Casting02 {
    public static void main(String[] args) {
                
        //World population today
        //long currentWorldPop = 7_000_000_000;
    	// A partir do Java SE7, você pode incluir sublinhados ao atribuir valores numéricos
    	// Os sublinhados ajudam a tornar os números grandes mais legíveis
    	// Os sublinhados não afetam o valor de uma variável
        long currentWorldPop = 7_000_000_000L;
        System.out.println("Current World Population: " +currentWorldPop);
        
        //World population in 1950,  Source: United Nations Population Division
        //2.52 Billion
        int africaPop   =   221_000_000;
        int asiaPop     = 1_402_000_000;
        int europePop   =   547_000_000;
        int americasPop =   339_000_000;
        int oceanaPop   =    13_000_000;
        
        // Java concatenou
        // Saída: 221000000140200000054700000033900000013000000
        System.out.println("World Population in 1950: " 
                +africaPop +asiaPop +europePop +americasPop +oceanaPop);
        
        // Java promoveu a expressão para int, separou memória para receber o resultado int
        // o valor estourou o espaço em memória e não adiantou usar o cast
        // Saída: -1772967296
        System.out.println("World Population in 1950: " 
                + (long) (africaPop +asiaPop +europePop +americasPop +oceanaPop));
        
        // Java promoveu a expressão para int, separou memória para receber o resultado int
        // o valor estourou o espaço em memória e não adiantou usar o cast
        // Saída: 2522000000
        System.out.println("World Population in 1950: " 
                + ( (long) africaPop +asiaPop +europePop +americasPop +oceanaPop));
        
        //The current population of Asia is an estimated 60% of the world population
        double percentAsia = 0.6;
        
        // long * double: expressão promovida para double
        // double não cabe em long...
        // long currentAsiaPop = currentWorldPop * percentAsia;
        double currentAsiaPop1 = currentWorldPop * percentAsia;
        long   currentAsiaPop2 = (long) (currentWorldPop * percentAsia);
        
        System.out.println("Current Asia Population: " +currentAsiaPop1); // 4.2E9
        System.out.println("Current Asia Population: " +currentAsiaPop2); // 4200000000
       
    }  
}
