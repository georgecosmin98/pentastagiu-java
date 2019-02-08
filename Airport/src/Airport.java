import java.util.Date;

public class Airport {
    public static void main(String[] args) {
        Flight f1=new Flight("F-123","Bucharest",new Date(2019,10,19),20,32, Flight.StatusEnum.SCHEDULED);
        Flight f2=new Flight("F-1213","Bucharest",new Date(2019,10,19),20,32, Flight.StatusEnum.SCHEDULED);

        FlightManager mainFlight = new FlightManager();
        mainFlight.addFlight(f1);
        mainFlight.readFlight();

        User user1 =new User("George","Ilinca",new Date(1998,07,03));
        User user2 =new User("Peter","Pann",new Date(1993,04,13));
        User user3 =new User("Emily","Lockwood",new Date(1986,10,19));
        User user4 =new User("Derek","Morgan",new Date(2000,01,23));

        mainFlight.addUser(user1);
        mainFlight.addUser(user2);
        mainFlight.addUser(user3);
        mainFlight.addUser(user4);
        mainFlight.addUser(user1);
        mainFlight.readUser();
        f1.addUserToFlight(user1);
        f1.addUserToFlight(user3);
        f1.readUserFromFlight();
    }
}
