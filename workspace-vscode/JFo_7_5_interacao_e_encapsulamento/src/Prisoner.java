//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class Prisoner {
    //Fields 
    private String name;
    private double height;
    private int sentence;
    private Cell cell;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSentence() {
        return sentence;
    }

    public void setSentence(int sentence) {
        this.sentence = sentence;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    //Constructor
    public Prisoner(String name, double height, int sentence, String cellName){
 	    this.name = name;
 	    this.height = height;
 	    this.sentence = sentence;
        this.cell = new Cell(cellName, false);
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }

    public void openDoor(String securityCode) {
        //this.cell.doorIsOpen = !this.cell.doorIsOpen;
        if ( this.cell.setIsOpen(!this.cell.getIsOpen(), securityCode) ) {
            if ( this.cell.getIsOpen() ) {
                System.out.println("a porta da cela " + this.cell.getName() + " abriu.");
            } else {
                System.out.println("a porta da cela " + this.cell.getName() + " fechou");
            }
        } else {
            System.out.println("a porta continua " + ( this.cell.getIsOpen() ? "aberta" : "fechada" ) );
        }
    }
    
    public void display(){
        System.out.println("Name: " +name);
        System.out.println("Height: " +height);
        System.out.println("Sentence: " +sentence);
        System.out.println("A porta da cela " + this.cell.getName() + " está " + ( (this.cell.getIsOpen()) ? "aberta" : "fechada"));
    }
    
}
