package Shop;

public class Basket {
    double totalPrice;
    Customer customer;

    public Basket(double totalPrice, Customer customer) {
        this.totalPrice = totalPrice;
        this.customer = customer;
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

    public void addItemInBasket(double priceOfProduct,int quantity) {
        totalPrice += priceOfProduct;

    }
}
