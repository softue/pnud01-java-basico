public class App {
    // pode cliar em Run ou Debug
    // Shif + Alt + F (formata todo o documento)
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        int idade = 10;
        boolean maiorDeIdade = false; // F2 renomear a variável
        System.out.println("ola");

        // estruta de controle condicional (if)
        // Pode selecionar a expressão (idade>=18) e pedir para
        // Evalute in Debug console (depois de executar o código no modo depuração)
        // if sem chaves, só executa a linha seguinte
        if (idade >= 18)
            maiorDeIdade = true;
        System.out.println("Maior de idade? " + maiorDeIdade);

        // Atribuição rápida

    }
}
