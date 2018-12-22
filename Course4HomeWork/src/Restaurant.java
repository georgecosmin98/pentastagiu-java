public class Restaurant {
    int noOfGuests = 0;
    double income = 0;
    static double priceForMenu = 12.50;
    double localTax;
    TypeOfRestaurant typeOfRestaurant;

    enum TypeOfRestaurant {
        vegetarian, fastFood;
    }

    public Restaurant(TypeOfRestaurant typeOfRestaurant) {
        this.typeOfRestaurant = typeOfRestaurant;
    }

    void newGuestArrived() {
        noOfGuests++;
        income += priceForMenu;
    }

    void taxCalculator() {
        localTax = income * 0.2;
        switch (typeOfRestaurant) {
            case vegetarian:
                localTax *= 0.7;

            case fastFood:
        }
    }

    void printIncomeAndTax() {
        taxCalculator();
        System.out.println("Income: " + income + " and you have to pay: " + localTax);
    }
}
