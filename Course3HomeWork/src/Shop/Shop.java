package Shop;

public class Shop {
    public static void main(String[] args) {
        Customer firstCustomer = new Customer(1, "Ionut", Customer.membership.Gold);
        Customer secondCustomer = new Customer(2, "Mariana", Customer.membership.Nomembership);
        Customer thirdPerson = new Customer(3, "Bianca", Customer.membership.Silver);

        Book firstBook=new Book(1,"Sun Tzu: The Art of Warfare",100,"Roger T. Ames");
        Book secondBook=new Book(2,"The Hunger Games",52,"Suzanne Collins");
        Book thirdBook=new Book(3,"The Lord of the Rings",74,"J.R.R. Tolkien");

        Candy firstCandy=new Candy(1,"Toblerone",12,120);
        Candy secondCandy=new Candy(2,"Mars",5,80);
        Candy thirdCandy=new Candy(3,"Raffaello",16,70);


    }
}
