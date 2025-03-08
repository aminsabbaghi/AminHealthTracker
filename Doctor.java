package aminHealthTracker;

import java.util.ArrayList;
import java.util.List;

/**
 * this class represents a doctor in the system.
 * it extends the Person class and includes specific attributes such as 
 * doctor ID, specialization, and a list of assigned patients.
 */
public class Doctor extends Person {
    
    protected int doctorID;
    protected String specialization;
    protected List<Patient> assignedPatients;

    public Doctor() {
        super();
        this.doctorID = 0;
        this.specialization = "Unknown";
     // a list of patients assigned to the doctor
        this.assignedPatients = new ArrayList<>();
    }

    public Doctor(String name, int age, String gender, int doctorID, String specialization, List<Patient> assignedPatients) {
        super(name, age, gender);
        this.doctorID = doctorID;
        this.specialization = "Unknown";  
        this.assignedPatients = (assignedPatients != null) ? assignedPatients : new ArrayList<>();
    }

    public int getDoctorID() {
        return doctorID;
    }

    public String getSpecialization() {
        return specialization;
    }

    public List<Patient> getAssignedPatients() {
        return assignedPatients;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setAssignedPatients(List<Patient> assignedPatients) {
        this.assignedPatients = assignedPatients;
    }

    public void assignPatient(Patient patient) {
        if (patient == null) {
            System.out.println("Invalid patient. Cannot assign!");
            return;
        }
        
        if (assignedPatients.contains(patient)) {
            System.out.println("Patient " + patient.getName() + " is already assigned to Dr. " + this.getName());
            return;
        }
        
        assignedPatients.add(patient);
        System.out.println("Patient " + patient.getPatientID() + " assigned to Dr. " + this.getName());
    }
}
