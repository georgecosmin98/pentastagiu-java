package Shop;

public class Basket {
    double totalPrice;
    Customer customer;

    public Basket(double totalPrice, Customer customer) {
        this.totalPrice = totalPrice;
        this.customer = customer;
    }

    public Basket(Customer customer) {
        this.customer = customer;
        totalPrice = 0;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void addBookInBasket(Book book) {
        totalPrice += book.getPrice();
        System.out.println("Total: " + totalPrice);
    }

    public void addCandyInBasket(Candy candy, int quantity) {
        if (quantity <= candy.getQuantity()) {
            totalPrice += candy.getPrice() * quantity;
            candy.setQuantity(candy.getQuantity() - quantity);
            System.out.println("Total: " + totalPrice);
        } else
            System.out.println("Sorry! We have just " + candy.getQuantity() + " pcs!");
    }

    public void cashOut() {
        if (customer.getMembership() == Customer.membership.Gold) {
            System.out.println("The price you have to pay is: " + totalPrice * 0.8);
            System.out.println("You saved: " + totalPrice * 0.2);
        } else if (customer.getMembership() == Customer.membership.Silver) {
            System.out.println("The price you have to pay is: " + totalPrice * 0.9);
            System.out.println("You saved: " + totalPrice * 0.10);
        } else
            System.out.println("The price you have to pay is: " + totalPrice);
        totalPrice = 0;
    }

    public void totalPricePrinter() {
        if (customer.getMembership() == Customer.membership.Gold) {
            System.out.println("The price you have to pay is: " + totalPrice * 0.8);
        } else if (customer.getMembership() == Customer.membership.Silver) {
            System.out.println("The price you have to pay is: " + totalPrice * 0.9);
        } else
            System.out.println("The price you have to pay is: " + totalPrice);

    }
}
