public class App {
    public static void main(String[] args) throws Exception {
        String greeting = "Java Worldaaaa";
        
        String firstString = "Java";
        firstString = firstString.concat("World");
        System.out.println(firstString);

        String w = greeting.replace("a", "A");
        System.out.println(w);
        System.out.println("Hello, World!");
    }
}
