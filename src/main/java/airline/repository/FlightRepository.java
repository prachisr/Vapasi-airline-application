package airline.repository;


import airline.model.Flight;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class FlightRepository {

    List<Flight> listOfFlights;

    public FlightRepository() {
        Flight flightOne = new Flight("Pune", "Hyderabad", "FL123");
        Flight flightTwo = new Flight("Pune", "Mumbai", "FL124");
        Flight flightThree = new Flight("Hyderabad", "Pune", "FL126");
        Flight flightFour = new Flight("Hyderabad", "Mumbai", "FL127");
        Flight flightFive = new Flight("Mumbai", "Hyderabad", "FL130");
        Flight flightSix = new Flight("Mumbai", "Pune", "FL132");
        listOfFlights = new ArrayList<>(Arrays.asList(flightOne, flightTwo, flightThree, flightFour, flightFive, flightSix));
    }

    public List<Flight> getFlights() {
        return listOfFlights;
    }
}
