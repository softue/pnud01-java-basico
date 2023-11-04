//Section 7, Lesson 3 Starter for Exercise 1 - Slide 6

public class Prisoner {

    //Fields 
    public String name;
    public double height;
    public int sentence;
    
    //Constructor
    public Prisoner(String nameIn, double heightIn, int sentenceIn) {
        System.out.println("Construindo o objeto Prisoner...");
        name = nameIn;
        height = heightIn;
        sentence = sentenceIn;
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }   

}
