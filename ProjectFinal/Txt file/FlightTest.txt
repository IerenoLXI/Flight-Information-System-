package Project;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;


public class FlightTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of flights
        System.out.print("Enter the number of flights: ");
        int numFlights = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Create an array of Flight objects
        Flight[] flights = new Flight[numFlights];

        // Obtain flight information from the user and create Flight objects
        for (int i = 0; i < numFlights; i++) {
            // Prompt the user input for each Flight object
            System.out.println("Enter information for Flight " + (i + 1) + ":");
          
            String airlineName;
            do {
                System.out.print("Airline Name: ");
                airlineName = scanner.nextLine();
                if (airlineName.isEmpty()) {
                    System.out.println("Airline's Name cannot be empty. Please enter a valid Airline's Name.");
                }
            } while (airlineName.isEmpty());
            
            String flightNumber;
            do {
                System.out.print("Flight Number: ");
                flightNumber = scanner.nextLine();
                if (flightNumber.isEmpty()) {
                    System.out.println("Flight Number cannot be empty. Please enter a valid Flight Number.");
                }
            } while (flightNumber.isEmpty());

            String flightOrigin;
            do {
                System.out.print("Flight Origin: ");
                flightOrigin = scanner.nextLine();
                if (flightOrigin.isEmpty()) {
                    System.out.println("Flight Origin cannot be empty. Please enter a valid City.");
                }
            } while (flightOrigin.isEmpty());
            
            String flightDestination;
            do {
                System.out.print("Flight Destination: ");
                flightDestination = scanner.nextLine();
                if (flightDestination.isEmpty()) {
                    System.out.println("Flight Destination cannot be empty. Please enter a valid City.");
                }
            } while (flightDestination.isEmpty());
            
            double airfare;
            do {
                System.out.print("Airfare: ");
                String airfareString = scanner.nextLine();
                try {
                    airfare = Float.parseFloat(airfareString);
                    if (airfare <= 0) {
                        System.out.println("Airfare must be positive. Please enter a valid Airfare.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid format. Please enter a valid number.");
                    airfare = -1; // Set airfare to an invalid value to trigger the loop
                }
            } while (airfare <= 0);
          
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
            
            LocalTime departureTime;
            do {
                System.out.print("Departure Time (HH:mm): ");
                String departureTimeString = scanner.nextLine();
                try {
                    departureTime = LocalTime.parse(departureTimeString, formatter);
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid Departure Time format. Please enter a valid Time (HH:mm).");
                    departureTime = null; // Set departureTime to null to trigger the loop
                }
            } while (departureTime == null);

            LocalTime arrivalTime;
            do {
                System.out.print("Arrival Time (HH:mm): ");
                String arrivalTimeString = scanner.nextLine();
                try {
                    arrivalTime = LocalTime.parse(arrivalTimeString, formatter);
                    if (arrivalTime.isBefore(departureTime)) {
                        System.out.println("Arrival Time must be after Departure Time. Please enter a valid Arrival Time.");
                        arrivalTime = null; // Set arrivalTime to null to trigger the loop
                    }
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid Arrival Time format. Please enter a valid Arrival Time (HH:mm).");
                    arrivalTime = null; // Set arrivalTime to null to trigger the loop
                }
            } while (arrivalTime == null);
            
            float flightDuration;
            do {
                System.out.print("Flight Duration: ");
                String flightDurationString = scanner.nextLine();
                try {
                	flightDuration = Float.parseFloat(flightDurationString);
                    if (flightDuration <= 0) {
                        System.out.println("Flight Duration must be positive. Please enter a valid number.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    flightDuration = -1; // Set flightDuration to an invalid value to trigger the loop
                }
            } while (flightDuration <= 0);
            
            int availableSeats;
            do {
                System.out.print("Available Seats: ");
                String availableSeatsString = scanner.nextLine();
                try {
                	availableSeats = Integer.parseInt(availableSeatsString);
                    if (availableSeats <= 0) {
                        System.out.println("Number of seats must be positive. Please enter a valid number.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid format. Please enter a valid number of seats.");
                    availableSeats = -1; // Set maxPassengers to an invalid value to trigger the loop
                }
            } while (availableSeats <= 0);
            
            double flightDistance;
            do {
                System.out.print("Flight Distance: ");
                String flightDistanceString = scanner.nextLine();
                try {
                    flightDistance = Float.parseFloat(flightDistanceString);
                    if (flightDistance <= 0) {
                        System.out.println("Distance must be a positive number. Please enter a valid Distance.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Distance format. Please enter a valid Distance.");
                    flightDistance = -1; // Set distance to an invalid value to trigger the loop
                }
            } while (flightDistance <= 0); 
            // Create a new Flight object with the provided information and add it to the array
            flights[i] = new Flight(airlineName, flightNumber, flightOrigin, flightDestination,
                    airfare, departureTime, arrivalTime, flightDuration, availableSeats, flightDistance);
            
        }

        // Display the pre-sorted flight information
        System.out.println("Pre-Sorted Flight Information:");
        for (Flight flight : flights) {
            System.out.println(flight);
        }

        // Sort the flights based on flight number
        Arrays.sort(flights, Comparator.comparing(Flight::getFlightNumber));

        // Display the sorted flight information
        System.out.println("\nSorted Flight Information:");
        for (Flight flight : flights) {
            System.out.println(flight);
        }
        // Launch the GUI and pass the flights array
        new Form1(flights);
        // Close the scanner
        scanner.close();
    }
}
