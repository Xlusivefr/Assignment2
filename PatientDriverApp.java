import java.util.Scanner;

public class PatientDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of Patient with user input
        System.out.println("Enter patient's first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter patient's middle name: ");
        String middleName = scanner.nextLine();
        System.out.println("Enter patient's last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter patient's street address: ");
        String streetAddress = scanner.nextLine();
        System.out.println("Enter patient's city: ");
        String city = scanner.nextLine();
        System.out.println("Enter patient's state: ");
        String state = scanner.nextLine();
        System.out.println("Enter patient's ZIP code: ");
        String zipCode = scanner.nextLine();
        System.out.println("Enter patient's phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter emergency contact name: ");
        String emergencyContactName = scanner.nextLine();
        System.out.println("Enter emergency contact phone number: ");
        String emergencyContactPhone = scanner.nextLine();

        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode, phoneNumber, emergencyContactName, emergencyContactPhone);
        
        // Display patient information
        displayPatient(patient);

        // Create three instances of Procedure
        Procedure procedure1 = new Procedure("X-Ray", "06/12/2023", "Dr. Smith", 250.00);
        Procedure procedure2 = new Procedure("Blood Test", "06/15/2023", "Dr. Johnson", 150.50);
        Procedure procedure3 = new Procedure("Physical Exam", "06/20/2023", "Dr. Brown", 200.75);

        // Display procedure information
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate and display total charges
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("Total Charges: $%.2f%n", totalCharges);

        // Display the development message
        System.out.println("The program was developed by a Student: Jedidiah Dawit");
        System.out.println("Date: 09/30/2024");
        System.out.println("MC#: M21093392");
    }

    public static void displayPatient(Patient patient) {
        System.out.println("Patient Information:");
        System.out.println("Full Name: " + patient.buildFullName());
        System.out.println("Address: " + patient.buildAddress());
        System.out.println("Phone Number: " + patient.getPhoneNumber());
        System.out.println("Emergency Contact: " + patient.buildEmergencyContact());
    }

    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure);
    }

    public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
        return procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges();
    }
}

