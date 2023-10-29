public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Como você poderia usar o método
         * substring para reescrever o seguinte?
         */
        String str = "Susan";
        System.out.println(str.charAt(0)); //S
        System.out.println(str.charAt(3)); //a
        // Resposta
        System.out.println(str.substring(0, 1));
        System.out.println(str.substring(3, 4));
    }
}
