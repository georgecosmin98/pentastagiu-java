import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    private List<User> userList = new ArrayList<>();

    enum StatusEnum {SCHEDULED, CANCELED, FINISHED;}

    Format formatData = new SimpleDateFormat("yyyy/MM/dd HH:mm");

    public Flight(String name, String destination, Date departureDate, int flightDuration, int maxUserCapacity) {
        this.name = name;
        this.destination = destination;
        this.departureDate = departureDate;
        this.flightDuration = flightDuration;
        this.maxUserCapacity = maxUserCapacity;
        this.status=StatusEnum.SCHEDULED;
    }

    public void setDate(String date){
        try{
            this.departureDate = (Date) formatData.parseObject(date);
        }catch (ParseException e){
            System.out.println("Date invalid: " + e.getStackTrace());
        }
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

    public void readUserFromFlight() {
        for (User u : userList)
            System.out.println(u);
    }

    public boolean checkUserList(User user) {
        for (User u : userList) {
            if (u.getName().equals(user.getName()))
                return true;

        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getDestination() {
        return destination;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public int getMaxUserCapacity() {
        return maxUserCapacity;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Date getArrivalDate() {
        Date d = new Date(this.departureDate.getTime() + flightDuration * 1000);
        return new Date(this.departureDate.getTime() + flightDuration * 1000);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "name= '" + name + '\'' +
                ", destination= '" + destination + '\'' +
                ", departureDate= " + formatData.format(departureDate) +
                ", flightDuration= " + flightDuration + " sec" +
                ", maxUserCapacity= " + maxUserCapacity +
                ", status= " + status +
                '}';
    }


}
