public class PrisonTest {
    public static void main(String[] args) throws Exception {
        
        Prisoner bubba = new Prisoner();
        bubba.setNome("Buba");
        bubba.setAltura(2.08);
        bubba.setSentenca(4);

        Prisoner twitch = new Prisoner();
        twitch.setNome("Twitch");
        twitch.setAltura(1.73);
        twitch.setSentenca(3);

        System.out.println("Ola");

        System.out.println(bubba == twitch);

        Prisoner bubba2 = new Prisoner();
        bubba2.setNome("Buba");
        bubba2.setAltura(2.08);
        bubba2.setSentenca(4);

        Prisoner twitch2 = new Prisoner();
        twitch2.setNome("Bubba");
        twitch2.setAltura(2.08);
        twitch2.setSentenca(4);

        System.out.println(bubba == twitch);
        System.out.println(bubba.getNome() == twitch.getNome());

        String s1 = new String("java");
        String s2 = new String("java");
        System.out.println(s1 == s2);

        String s3 = "java";
        String s4 = "java";
        System.out.println(s3 == s4);
    }
}
