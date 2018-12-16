package Bank;

public class Account {
    private double ballance;

    public Account(double ballance) {
        this.ballance = ballance;
    }

    public Account() {
        this.ballance = 0.00;
    }

    public void deposit(double amount) {
        this.ballance += amount;
        System.out.println("Money has been successfully deposited!");
    }

    public void withdraw(double amount) {
        if (ballance >= amount) {
            this.ballance -= amount;
            System.out.println("Money has been successfully withdrawed!");
        } else
            System.out.println("You dont have enought money on this account!");
    }

    @Override
    public String toString() {
        return "ballance= " + ballance;
    }
}
