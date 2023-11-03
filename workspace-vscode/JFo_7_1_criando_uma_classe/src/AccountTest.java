public class AccountTest {

    public static void main(String[] args) {
        SavingsAccount conta1 = new SavingsAccount("Kurt", 100);
        SavingsAccount conta2 = new SavingsAccount("Bryan", 250.99);

        conta1.displayCustomer();
        conta2.displayCustomer();

        conta1.withdraw(50);
        conta2.deposit(50);

        conta1.withdraw(100);
        conta1.withdraw(-100);

        conta1.displayCustomer();
        conta2.displayCustomer();
    }

}