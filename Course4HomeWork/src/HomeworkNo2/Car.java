package HomeworkNo2;

public class Car implements Connectable {
    String brand;
    String model;
    String type;
    int power;
    double price;

    public Car() {
    }

    public Car(String brand, String model, String type, int power, double price) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.power = power;
        this.price = price;
    }


    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress..." + "Car");
    }
}
