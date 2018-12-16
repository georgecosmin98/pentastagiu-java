package Bank;

public class Bank {
    public static void main(String[] args) {
        Account steven = new Account();
        steven.deposit(1000);
        Account john = new Account(2500);
        john.withdraw(1000);
        System.out.println(john);
        System.out.println((steven));
    }
}
