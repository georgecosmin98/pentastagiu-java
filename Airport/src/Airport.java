import java.util.Date;

public class Airport {
    public static void main(String[] args) {
        Flight f1=new Flight("F-123","Bucharest",new Date(2019,10,19),20,32, Flight.StatusEnum.SCHEDULED);
        FlightManager mainFlight = new FlightManager();
        mainFlight.add(f1);
        mainFlight.read();
    }
}
