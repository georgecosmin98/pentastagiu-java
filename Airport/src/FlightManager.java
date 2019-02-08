import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FlightManager {
    private List<Flight> flightList = new ArrayList();
    private List<User> userList = new ArrayList();

    // Flight Methods

    public void addFlight(Flight flight) {
        for (Flight f : flightList) {
            if (flight.getName().equals(f.getName())) {
                System.out.println("This flight already exists");
                return;
            }
        }
        flightList.add(flight);
    }

    public void deleteFlight(Flight flight) {
        if (flightList.size() == 0) {
            System.out.println("Error! \nFlight list is empty!");
            return;
        }
        Iterator<Flight> flightIterator = flightList.iterator();
        while (flightIterator.hasNext()) {
            Flight f = flightIterator.next();
            if (f.getName().equals(flight.getName())) {
                flightIterator.remove();
                System.out.println("Flight " + f.getName() + " has been deleted!");
                return;
            }
        }
        System.out.println("Flight: " + flight.getName() + " was not found in the list!");
    }

    public void readFlight() {
        for (Flight f : flightList)
            System.out.println(f);
    }

    //User methods

    public void addUser(User user) {
        for (User u : userList) {
            if (user.getName().equals(u.getName())) {
                System.out.println("The user is already on the list");
                return;
            }
        }
        userList.add(user);
    }

    public void readUser() {
        for (User u : userList)
            System.out.println(u);
    }
}