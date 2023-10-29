/* 
    Código percorre todos os casos julgados e conta quantos foram os vereditos "inocente" e quantos foram "culpado"
*/
public class App {
    public static void main(String[] args) {

        int numeroDeCasos = 1000;
        int casoAtual = 1;
        int totalInocentes = 0;
        int totalCulpados = 0;
        while (casoAtual <= numeroDeCasos) {
            // código para imprimir o caso atual
            System.out.println("Caso " + casoAtual + ":");
            // Veredito: 1 para inocente e 2 para culpado
            // int veredito = (casoAtual % 2 == 0) ? 2 : 1;
            int veredito = (int) (Math.random() * 2);
            System.out.println(veredito);
            if (veredito == 1) {
                // código para imprimir o veredito
                System.out.println("Veredito: Inocente");
                totalInocentes++;
            } else {
                // código para imprimir o veredito
                System.out.println("Veredito: Culpado");
                totalCulpados++;
            }
            System.out.println(); // imprimir linha em branco para pular linha
            casoAtual++;
        }
        System.out.println();
        System.out.println("Total de inocentes: " + totalInocentes);
        System.out.println("Total de culpados: " + totalCulpados);

        double resultado = 10 + 5 * 4 / 2 - 1;
        System.out.println(resultado); // 10 + 10 - 1 // 19

        Boolean resultado2 = (true) && ((true) && true);
        Boolean resultado3 = (5 > 3) && ((10 < 20) && !(7 == 8));
        System.out.println(resultado3);

        double resultado4 = 12; // está double, logo não vai truncar
        int i = 1;
        // r, i: (12, 1), (6, 2), (3, 3), (1.5, 4)
        while (i <= resultado4) {
            resultado4 = resultado4 / 2;
            i++;
        }
        System.out.println(resultado4 + " " + i);
        
        int numero = 15;
        String resultado6;
        if (numero % 2 == 0) {
            if (numero > 10) {
                resultado6 = "Primeiro IF";
            } else {
                resultado6 = "Primeiro ELSE";
            }
        } else {
            if (numero <= 15) {
                resultado6 = "Segundo IF";
            } else {
                resultado6 = "Segundo ELSE";
            }
        }
        System.out.println(resultado6); // Segundo IF
    }
}
