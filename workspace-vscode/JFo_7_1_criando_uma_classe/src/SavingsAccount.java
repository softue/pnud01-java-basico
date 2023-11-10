public class SavingsAccount {

    private String name;
    private double balance;

    public SavingsAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void withdraw(double value) {
        if ( value <=0 ) {
            System.out.println("O valor de retirada precisa ser positivo.");
            return;
        }

        if ( this.balance >= value) {
            this.balance -= value;
            System.out.println("Novo saldo da conta '"+this.name+"' é de " + this.balance);
            return;
        } 

        System.out.println("O saldo é muito baixo para fazer a retirada.");
    
    }

    public void displayCustomer() {
        System.out.println("Nome: " + this.name);
        System.out.println("Saldo: " + this.balance);
    }


    
}
