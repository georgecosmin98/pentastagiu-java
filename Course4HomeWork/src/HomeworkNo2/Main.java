package HomeworkNo2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> arrList = new ArrayList<Object>();

        Student firstStudent = new Student("John", "202-555-0133");
        Car firstCar = new Car("Ford", "Ranger", "Pick-Up", 214, 40000);
        Phone firstPhone = new Phone("Samsung", "Galaxy S9", 128, 3000, 580);
        SmartRefrigerator firstRefrigerator = new SmartRefrigerator("Samsung", 4, true, 3500);

        arrList.add(firstStudent);
        arrList.add(firstCar);
        arrList.add(firstPhone);
        arrList.add(firstRefrigerator);

        for (Object o : arrList)
            if (o.getClass() == Phone.class)
                ((Phone) o).connectToBluetooth();
            else if (o.getClass() == Car.class)
                ((Car) o).connectToBluetooth();
            else if (o.getClass() == SmartRefrigerator.class)
                ((SmartRefrigerator) o).connectToBluetooth();


    }
}
