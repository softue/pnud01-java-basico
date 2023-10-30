public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Math.PI);
        System.out.println(Math.sqrt(4));
        System.out.println("Hello, World!");

        // Exercício 2
        System.out.println(Math.abs(-1.23)); // 1.23
        System.out.println(Math.pow(3, 2)); // 3^2 = 9
        System.out.println(Math.sqrt(121.0) - Math.sqrt(256.0)); // 11 - 16 = -5
        System.out.println(Math.abs(Math.min(-3, -5))); // 5

        // Exercício 3
        // Considere uma variável inteira denominada age
        int age = 41;
        // Que expressão substituiria idades negativas por 0?
        age = Math.max(0, age);
        System.out.println(age);

        // Que expressão limitaria a idade máxima a 40?
        age = Math.min(40, age);
        System.out.println(age);
        
        System.out.println(calcularAreaCirculo(7.5));

    }

    public static double calcularAreaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / Math.pow(altura, 2);
    }

}
