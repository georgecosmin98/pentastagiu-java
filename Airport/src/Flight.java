import java.util.Date;

public class Flight {
   private String name;
   private String destination;
   private Date departureDate;
   private int flightDuration;
   private  int maxUserCapacity;
   private StatusEnum status;
    enum StatusEnum {SCHEDULED, CANCELED, FINISHED;}


    public Flight(String name, String destination, Date departureDate, int flightDuration, int maxUserCapacity, StatusEnum status) {
        this.name = name;
        this.destination = destination;
        this.departureDate = departureDate;
        this.flightDuration = flightDuration*3600;
        this.maxUserCapacity = maxUserCapacity;
        this.status = status;
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
                ", flightDuration= " + flightDuration + " sec"+
                ", maxUserCapacity= " + maxUserCapacity +
                ", status= " + status +
                '}';
    }


}
