import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Date;

public class Airport {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\AirportMaven\\src\\main\\resources\\airport-application-context.xml");

        User user = context.getBean(User.class);
        System.out.println(user.getInfo());

        Flight flight = context.getBean((Flight.class));
        System.out.println(flight.toString());

        FlightManager flightManager = context.getBean(FlightManager.class);

        flightManager.readFlight();
    }
}
