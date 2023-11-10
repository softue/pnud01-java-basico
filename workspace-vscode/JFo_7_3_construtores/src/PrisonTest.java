//Section 7, Lesson 3 Starter for Exercise 1 - Slide 6

public class PrisonTest {

    public static void main(String[] args) {
        /*
        Prisoner prisioneiro = new Prisoner();
        System.out.println(prisioneiro.name); // null

        Prisoner p01 = new Prisoner();
        Prisoner p02 = new Prisoner();
        p01.name = "Bubba";
        p01.height = 2.08;
        p01.sentence = 4;
        p02.name = "Twitch";
        p02.height = 1.73;
        p02.sentence = 3;
        */
        
        Prisoner p03 = new Prisoner("Bubba", 2.08, 4);
        Prisoner p04 = new Prisoner("Twitch", 1.73, 3);
        System.out.println(p03.name);
        System.out.println(p04.name);
                
    } 
}
