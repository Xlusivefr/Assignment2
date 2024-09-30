/**
 * Class: CMSC203 
 * Instructor: Dr. Grinberg
 * Description: Represents a medical procedure performed on a patient.
 * Due: 9/30/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * Print your Name here: Jedidiah Dawit 
 */

public class Procedure {
    // Fields
    private String procedureName;        // Name of the procedure
    private String date;                 // Date of the procedure (e.g., "06/12/2023")
    private String practitionerName;     // Name of the practitioner
    private double charges;              // Charges for the procedure

    // No-arg constructor
    public Procedure() {
        this.procedureName = "";
        this.date = "";
        this.practitionerName = "";
        this.charges = 0.0;
    }

    // Parametrized constructor for procedure name and date
    public Procedure(String procedureName, String date) {
        this.procedureName = procedureName;
        this.date = date;
        this.practitionerName = "";
        this.charges = 0.0;
    }

    // Parametrized constructor for all attributes
    public Procedure(String procedureName, String date, String practitionerName, double charges) {
        this.procedureName = procedureName;
        this.date = date;
        this.practitionerName = practitionerName;
        this.charges = charges;
    }

    // Accessors (getters)
    public String getProcedureName() {
        return procedureName;
    }

    public String getDate() {
        return date;
    }

    public String getPractitionerName() {
        return practitionerName;
    }

    public double getCharges() {
        return charges;
    }

    // Mutators (setters)
    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    // toString method
    @Override
    public String toString() {
        return "Procedure Name: " + procedureName + 
               ", Date: " + date + 
               ", Practitioner: " + practitionerName + 
               ", Charges: $" + String.format("%.2f", charges);
    }
}
