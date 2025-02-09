package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Comparator;

public class Form1 extends JFrame implements ActionListener {
    private JTextField airlineNameField, flightNumberField, flightOriginField, flightDestinationField,
            airfareField, departureTimeField, arrivalTimeField, flightDurationField, availableSeatsField, flightDistanceField;
    private JButton addButton, sortButton;
    private JTextArea displayArea;
    private Flight[] flights;//Array

    public Form1(Flight[] flights) {
        setTitle("Flight Management System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(11, 2));
        inputPanel.add(new JLabel("Airline Name:"));
        airlineNameField = new JTextField();
        inputPanel.add(airlineNameField);
        inputPanel.add(new JLabel("Flight Number:"));
        flightNumberField = new JTextField();
        inputPanel.add(flightNumberField);
        inputPanel.add(new JLabel("Origin:"));
        flightOriginField = new JTextField();
        inputPanel.add(flightOriginField);
        inputPanel.add(new JLabel("Destination:"));
        flightDestinationField = new JTextField();
        inputPanel.add(flightDestinationField);
        inputPanel.add(new JLabel("Airfare:"));
        airfareField = new JTextField();
        inputPanel.add(airfareField);
        inputPanel.add(new JLabel("Departure Time:"));
        departureTimeField = new JTextField();
        inputPanel.add(departureTimeField);
        inputPanel.add(new JLabel("Arrival Time:"));
        arrivalTimeField = new JTextField();
        inputPanel.add(arrivalTimeField);
        inputPanel.add(new JLabel("Flight Duration (minutes):"));
        flightDurationField = new JTextField();
        inputPanel.add(flightDurationField);
        inputPanel.add(new JLabel("Available Seats:"));
        availableSeatsField = new JTextField();
        inputPanel.add(availableSeatsField);
        inputPanel.add(new JLabel("Distance (miles):"));
        flightDistanceField = new JTextField();
        inputPanel.add(flightDistanceField);

        addButton = new JButton("Add Flight");
        addButton.addActionListener(this);
        inputPanel.add(addButton);

        sortButton = new JButton("Sort Flights");
        sortButton.addActionListener(this);
        inputPanel.add(sortButton);

        add(inputPanel, BorderLayout.NORTH);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        add(scrollPane, BorderLayout.CENTER);

        this.flights = flights; // Initialize flights array

        // Display pre-sorted flight information
        displayPreSortedFlights();

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            addFlight();
        } else if (e.getSource() == sortButton) {
            sortFlights();
        }
    }

    private void addFlight() {
        String airlineName = airlineNameField.getText();
        String flightNumber = flightNumberField.getText();
        String flightOrigin = flightOriginField.getText();
        String flightDestination = flightDestinationField.getText();
        double airfare;
        int flightDuration;
        int availableSeats;
        double flightDistance;
        LocalTime departureTime;
        LocalTime arrivalTime;

        // Perform input validation
        try {
            airfare = Double.parseDouble(airfareField.getText());
            flightDuration = Integer.parseInt(flightDurationField.getText());
            availableSeats = Integer.parseInt(availableSeatsField.getText());
            flightDistance = Double.parseDouble(flightDistanceField.getText());
            departureTime = LocalTime.parse(departureTimeField.getText());
            arrivalTime = LocalTime.parse(arrivalTimeField.getText());
        } catch (NumberFormatException | DateTimeParseException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input format. Please enter valid values.");
            return; // Exit method if input format is invalid
        }

        // Create a Flight object
        Flight flight = new Flight(airlineName, flightNumber, flightOrigin, flightDestination, airfare,
                departureTime, arrivalTime, flightDuration, availableSeats, flightDistance);

        // Resize flights array and add the new flight
        if (flights == null) {
            flights = new Flight[1];
            flights[0] = flight;
        } else {
            Flight[] newFlights = new Flight[flights.length + 1];
            System.arraycopy(flights, 0, newFlights, 0, flights.length);
            newFlights[flights.length] = flight;
            flights = newFlights;
        }

        // Append flight information to display area
        appendToDisplay("Flight added: " + flight.toString());
    }

    private void sortFlights() {
        if (flights != null) {
            Arrays.sort(flights, Comparator.comparing(Flight::getFlightNumber));
            StringBuilder sortedFlights = new StringBuilder();
            sortedFlights.append("Sorted Flight Information (based on flight number):\n");
            for (Flight flight : flights) {
                sortedFlights.append(flight.toString()).append("\n");
            }
            displayArea.setText(sortedFlights.toString());
        } else {
            JOptionPane.showMessageDialog(this, "No flights available to sort.");
        }
    }

    private void displayPreSortedFlights() {
        if (flights != null) {
            Arrays.sort(flights, Comparator.comparing(Flight::getFlightNumber));
            StringBuilder sortedFlights = new StringBuilder();
            sortedFlights.append("Pre-Sorted Flight Information (based on flight number):\n");
            for (Flight flight : flights) {
                sortedFlights.append(flight.toString()).append("\n");
            }
            displayArea.setText(sortedFlights.toString());
        } else {
            JOptionPane.showMessageDialog(this, "No flights available to display.");
        }
    }

    private void appendToDisplay(String text) {
        displayArea.append(text + "\n");
    }
}
