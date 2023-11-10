public class Advogado {
    String nome;
    String oab;
    int idade;
    boolean estadoCivil = true;
    
    public static void main(String[] args) {
        int [] vetorDeInteiros;
        int [][] matriz;
        byte byteVar = 127; // -128 a 127
        int idadeDoAdvogado = 1000;
        System.out.println("Ola" + byteVar + idadeDoAdvogado);
        
        System.out.println("Int MIN_VALUE: " + java.lang.Integer.MIN_VALUE);
        System.out.println("Int MAX_VALUE: " + java.lang.Integer.MAX_VALUE);
        
        System.out.println("Byte MIN_VALUE: " + java.lang.Byte.MIN_VALUE);
        System.out.println("Byte MAX_VALUE: " + java.lang.Byte.MAX_VALUE);

        System.out.println(byteVar);
        System.out.println(somar(1,2));

        int primeiroNumero = 10;
        int segundoNumero = 3;
        double resultado1 = primeiroNumero / segundoNumero; // continuar 3 (divisão de números inteiros)
        double resultado2 = (double) primeiroNumero / (double) segundoNumero; // casting
        // int resultado3 = (double) primeiroNumero / (double) segundoNumero; // nao pode converter de double para inteiro
        double resultado4 = (int) primeiroNumero / (double) segundoNumero; // fica double
        System.out.println("Resultado: " + resultado1);
        System.out.println("Resultado: " + resultado4);
        // int idade2;
        // System.out.println(idade2);

        int numero1 = 1;
        int res1 = numero1++; // pós incremento
        System.out.println("Numero: " + numero1 + ". Resultado: " + res1);

        int numero2 = 1;
        int res2 = ++numero2; // pré incremento
        System.out.println("Numero: " + numero2 + ". Resultado: " + res2);
        
        String nome = "Nome do advogado";
        System.out.println(nome.length());

    }
    
    /*
     * Neste comentário em bloco, explico a razão ou explicar o método somar.
     * 
     * Este método soma dois números inteiros.
     */
    public static int somar(int a, int b) {
        return a + b;
    }

}

