public class Main {

    public static void main(String[] args) {


        Restaurant vegetarianRestaurant = new Restaurant(Restaurant.TypeOfRestaurant.vegetarian);
        Restaurant fastFoodRestaurant = new Restaurant(Restaurant.TypeOfRestaurant.fastFood);

        vegetarianRestaurant.newGuestArrived();
        vegetarianRestaurant.newGuestArrived();
        vegetarianRestaurant.newGuestArrived();

        fastFoodRestaurant.newGuestArrived();
        fastFoodRestaurant.newGuestArrived();
        fastFoodRestaurant.newGuestArrived();

        vegetarianRestaurant.printIncomeAndTax();
        fastFoodRestaurant.printIncomeAndTax();
    }
}
