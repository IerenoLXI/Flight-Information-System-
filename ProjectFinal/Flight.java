package Project;

import java.time.LocalTime;
// Flight class represents a flight with various attributes
public class Flight {
    // Private attributes of a flight
    private String airlineName; // Name of the airline
    private String flightNumber; // Flight number
    private String flightOrigin; // Departure airport
    private String flightDestination; // Destination airport
    private double airfare; // Cost of the flight
    private LocalTime departureTime; // Departure time
    private LocalTime arrivalTime; // Arrival time
    private float flightDuration; // Duration of the flight in minutes
    private int availableSeats; // Number of available seats
    private double flightDistance; // Distance of the flight in miles

    // Constructor to initialize the Flight object with provided values
    public Flight(String airlineName, String flightNumber, String flightOrigin, String flightDestination,
                  double airfare, LocalTime departureTime, LocalTime arrivalTime, float flightDuration,
                  int availableSeats, double flightDistance) {
        this.airlineName = airlineName;
        this.flightNumber = flightNumber;
        this.flightOrigin = flightOrigin;
        this.flightDestination = flightDestination;
        this.airfare = airfare;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.flightDuration = flightDuration;
        this.availableSeats = availableSeats;
        this.flightDistance = flightDistance;
    }

 // Getter method for retrieving the airline name
    public String getAirlineName() {
        return airlineName;
    }

    // Getter method for retrieving the flight number
    public String getFlightNumber() {
        return flightNumber;
    }	

    // Getter method for retrieving the flight origin
    public String getFlightOrigin() {
        return flightOrigin;
    }   

    // Getter method for retrieving the flight destination
    public String getFlightDestination() {
        return flightDestination;
    }

    // Getter method for retrieving the airfare
    public double getAirfare() {
        return airfare;
    }

    // Getter method for retrieving the departure time
    public LocalTime getDepartureTime() {
        return departureTime;
    }

    // Getter method for retrieving the arrival time
    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    // Getter method for retrieving the flight duration
    public float getFlightDuration() {
        return flightDuration;
    }

    // Getter method for retrieving the available seats
    public int getAvailableSeats() {
        return availableSeats;
    }

    // Getter method for retrieving the distance of the flight
    public double getFlightDistance() {
        return flightDistance;
    }

 // Setter method for airlineName
    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    // Setter method for flightNumber
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    // Setter method for flightOrigin
    public void setFlightOrigin(String flightOrigin) {
        this.flightOrigin = flightOrigin;
    }

    // Setter method for flightDestination
    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }

    // Setter method for airfare
    public void setAirfare(double airfare) {
        this.airfare = airfare;
    }

    // Setter method for departureTime
    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    // Setter method for arrivalTime
    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    // Setter method for flightDuration
    public void setFlightDuration(float flightDuration) {
        this.flightDuration = flightDuration;
    }

    // Setter method for availableSeats
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    // Setter method for distance
    public void setFlightDistance(double distance) {
        this.flightDistance = distance;
    }

    // toString method to represent the Flight object as a String
  
    public String toString() {
        // Constructing a string representation of the Flight object
        return "Airline Name: " + airlineName + ", " +
                "Flight Number: " + flightNumber + ", " +
                "Flight Origin: " + flightOrigin + ", " +
                "Flight Destination: " + flightDestination + ", " +
                "Airfare: $" + airfare + ", " +
                "Departure Time: " + departureTime + ", " +
                "Arrival Time: " + arrivalTime + ", " +
                "Flight Duration (minutes): " + flightDuration + ", " +
                "Available Seats: " + availableSeats + ", " +
                "Distance (miles): " + flightDistance;
    }
}
