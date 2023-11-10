//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16

public class Prisoner {
    // Fields
    private String name;
    private double height;
    private int sentence;
    private Cell cell;
    private static int prisonerCount = 0;
    int bookingNumber = prisonerCount;

    // Constructor
    public Prisoner(String name, double height, int sentence, Cell cell) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.cell = cell;
        prisonerCount++;
    }

    // Methods
    public static int getPrisonerCount() {
        return prisonerCount;
    }

    public void think() {
        System.out.println("I'll have my revenge.");
    }

    public void display() {
        System.out.println("Name: " + getName()); // se o método fosse estático: Cannot make a static reference to the non-static method getName() from the type PrisonerJava(603979977)
        System.out.println("Height: " + getHeight() + "m");
        System.out.println("Sentence: " + getSentence() + " yrs");
        System.out.println("Cell: " + getCell().getName());
        System.out.println("prisonerCount: " + prisonerCount);
        System.out.println("bookingNumber: " + bookingNumber);
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public int getSentence() {
        return sentence;
    }

    public Cell getCell() {
        return cell;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSentence(int sentence) {
        this.sentence = sentence;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
