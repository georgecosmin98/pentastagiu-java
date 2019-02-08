import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Flight {
    private String name;
    private String destination;
    private Date departureDate;
    private int flightDuration;
    private int maxUserCapacity;
    private StatusEnum status;
    private List<User> userList=new ArrayList<>();

    enum StatusEnum {SCHEDULED, CANCELED, FINISHED;}


    public Flight(String name, String destination, Date departureDate, int flightDuration, int maxUserCapacity, StatusEnum status) {
        this.name = name;
        this.destination = destination;
        this.departureDate = departureDate;
        this.flightDuration = flightDuration * 3600;
        this.maxUserCapacity = maxUserCapacity;
        this.status = status;
    }

    public void addUserToFlight(User user) {
        if (userList.size() >= maxUserCapacity) {
            System.out.println("Sorry! The plane has reached it's maximum transport capacity!");
            return;
        }
        for (User u : userList) {
            if (u.getName().equals(user.getName())) {
                System.out.println("The user is already on the list!");
                return;
            }
        }

        userList.add(user);
    }

    public void deleteUserFromFlight(User user) {
        if (userList.size() == 0) {
            System.out.println("Error! \nUser list is empty!");
            return;
        }

        Iterator<User> userIterator = userList.iterator();
        while (userIterator.hasNext()) {
            User u = userIterator.next();
            if (u.getName().equals(user.getName())) {
                userIterator.remove();
                return;
            }
        }
    }

    public void readUserFromFlight()
    {
        for(User u : userList)
            System.out.println(u);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "name= '" + name + '\'' +
                ", destination= '" + destination + '\'' +
                ", departureDate= " + departureDate +
                ", flightDuration= " + flightDuration + " sec" +
                ", maxUserCapacity= " + maxUserCapacity +
                ", status= " + status +
                '}';
    }


}
