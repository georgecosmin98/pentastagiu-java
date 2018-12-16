package Shop;

public class Basket {
    double totalPrice;
    Customer customer;

    public Basket(double totalPrice, Shop.Customer customer) {
        this.totalPrice = totalPrice;
        this.customer = customer;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Shop.Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Shop.Customer customer) {
        this.customer = customer;
    }

    public void addItemInBasket(double priceOfProduct,int quantity) {
        totalPrice += priceOfProduct;

    }
}
