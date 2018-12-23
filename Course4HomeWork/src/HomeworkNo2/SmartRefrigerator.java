package HomeworkNo2;

public class SmartRefrigerator implements Connectable {
    String brand;
    int noOfDoors;
    boolean wineRack;
    double price;

    public SmartRefrigerator() {
    }

    public SmartRefrigerator(String brand, int noOfDoors, boolean wineRack, double price) {
        this.brand = brand;
        this.noOfDoors = noOfDoors;
        this.wineRack = wineRack;
        this.price = price;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress..." + "Smart-Refrigerator");
    }
}
