package Shop;

public class Shop {
    public static void main(String[] args) {
        Customer c=new Customer(1,"Ionut", Customer.membership.Gold);

        System.out.println(c.getMembership());
    }
}
