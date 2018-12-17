package Shop;

public class Shop {
    public static void main(String[] args) {
        //Create a customer
        Customer firstCustomer = new Customer(1, "Ionut", Customer.membership.Gold);

        //Create products
        Book firstBook = new Book(1, "Sun Tzu: The Art of Warfare", 100, "Roger T. Ames");
        Book secondBook = new Book(2, "The Hunger Games", 52, "Suzanne Collins");
        Book thirdBook = new Book(3, "The Lord of the Rings", 74, "J.R.R. Tolkien");

        Candy firstCandy = new Candy(1, "Toblerone", 12, 120);
        Candy secondCandy = new Candy(2, "Mars", 5, 80);
        Candy thirdCandy = new Candy(3, "Raffaello", 16, 70);

        //Create basket
        Basket firstBasket = new Basket(firstCustomer);

        //Add products to the basket
        firstBasket.addBookInBasket(firstBook);
        firstBasket.addCandyInBasket(secondCandy, 50);

        //Get info about the discounted price
        firstBasket.totalPricePrinter();

        //Chenge the membership
        firstCustomer.setMembership(Customer.membership.Silver);

        //Print new discounted price
        firstBasket.cashOut();
    }
}
