//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class PrisonTest {
    public static void main(String[] args){
        
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4, "Cela 53");
        bubba.display();
        bubba.openDoor("0000"); // modela um prisioneiro que está tentando abrir a porta
        bubba.openDoor("1234");
    }
}
