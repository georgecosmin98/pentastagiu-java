package HomeworkNo2;

public class Phone implements Connectable {
    String brand;
    String model;
    int internalMemory;
    int batteryCapacity;
    double price;

    public Phone(String brand, String model, int internalMemory, int batteryCapacity, double price) {
        this.brand = brand;
        this.model = model;
        this.internalMemory = internalMemory;
        this.batteryCapacity = batteryCapacity;
        this.price = price;
    }

    public Phone() {
    }


    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress..." + "Phone");
    }
}
