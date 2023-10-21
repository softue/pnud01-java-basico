public class Chickens01 {
    public static void main(String[] args) {
        printTotalEggs(5, 3);
        printTotalEggs(4, 8);
    }
    
    public static int printTotalEggs(int eggsPerChicken, int chickenCount) {
        int totalEggs = 0;
        System.out.println("Começando com " + chickenCount + " galinhas " + eggsPerChicken);
        // segunda
        totalEggs += chickenCount * eggsPerChicken;
        System.out.println("Segunda: " + chickenCount + " galinhas.");
        
        // terça
        chickenCount++;
        totalEggs += chickenCount * eggsPerChicken;
        System.out.println("Terça: " + chickenCount + " galinhas.");
        
        // quarta
        chickenCount /= 2;
        totalEggs += chickenCount * eggsPerChicken;
        System.out.println("Quarta: " + chickenCount + " galinhas.");
        
        System.out.println(totalEggs);
        return totalEggs;
    }
}
