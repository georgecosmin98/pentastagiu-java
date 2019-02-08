import java.util.Date;

public class Airport {
    public static void main(String[] args) {
        Flight f1 = new Flight("F-100", "Milano", new Date(2019, 10, 19, 17, 30), 13800, 32, Flight.StatusEnum.SCHEDULED);
        Flight f2 = new Flight("F-101", "New York", new Date(2019, 10, 19, 14, 45), 48000, 32, Flight.StatusEnum.SCHEDULED);
        Flight f3 = new Flight("F-112", "Munchen", new Date(2019, 10, 19, 9, 0), 12000, 32, Flight.StatusEnum.SCHEDULED);
        Flight f4 = new Flight("F-122", "Madrid", new Date(2019, 10, 20, 9, 50), 14800, 48, Flight.StatusEnum.SCHEDULED);
        Flight f5 = new Flight("P-901", "Paris", new Date(2019, 10, 20, 12, 20), 10800, 4, Flight.StatusEnum.SCHEDULED);

        FlightManager mainFlight = new FlightManager();
        mainFlight.addFlight(f1);
        mainFlight.addFlight(f2);
        mainFlight.addFlight(f3);
        mainFlight.addFlight(f4);
        mainFlight.addFlight(f5);
        mainFlight.readFlight();

        User user1 = new User("Jeff", "Williams", new Date(1998, 7, 3));
        User user2 = new User("Peter", "Moody", new Date(1993, 4, 13));
        User user3 = new User("Emily", "Lockwood", new Date(1986, 10, 19));
        User user4 = new User("Derek", "Morgan", new Date(2000, 1, 23));
        User user5 = new User("Aaron", "Frega", new Date(1981, 9, 14));
        User user6 = new User("Chloe", "Reid", new Date(1959, 7, 26));
        User user7 = new User("Oliver", "Gardiner", new Date(1961, 2, 16));


        mainFlight.addUser(user1);
        mainFlight.addUser(user2);
        mainFlight.addUser(user3);
        mainFlight.addUser(user4);
        mainFlight.addUser(user1);
        mainFlight.readUser();
        f1.addUserToFlight(user1);
        f1.addUserToFlight(user3);
        f2.addUserToFlight(user2);
        f2.addUserToFlight((user3));
        f3.addUserToFlight((user3));
        f3.addUserToFlight(user5);
        f4.addUserToFlight(user1);
        f4.addUserToFlight(user7);
        f4.addUserToFlight(user6);
        f5.addUserToFlight(user1);
        f5.addUserToFlight(user2);
        f5.addUserToFlight(user7);
        f5.addUserToFlight(user5);
        f5.addUserToFlight(user6);


        mainFlight.readFlightForUser(user3);
        mainFlight.readNumberOfFlightDidUser(user3);

        mainFlight.readDestinationVisitedByUser(user3);
        mainFlight.readNumberOfDestination(user3);

        mainFlight.readFlightScheduled();
        mainFlight.readNumberOfFlightScheduled();

        mainFlight.readNumberOfFlightLanded();
        mainFlight.readFlightLanded();

        mainFlight.updateFlightStatus(new Date(2019, 10, 20, 14, 00));
        mainFlight.readFlightLanded();
    }
}
