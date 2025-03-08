package aminHealthTracker;

import java.util.ArrayList;
import java.util.List;

// a subclass of person which has new attributes: patientID and medicalHistory
public class Patient extends Person {
    
    protected int patientID;
    protected List<String> medicalHistory;

    public Patient() {
        super();
        this.patientID = 0;
     // A list to store the patient's medical history
        this.medicalHistory = new ArrayList<>();
    }

    public Patient(String name, int age, String gender, int patientID, List<String> medicalHistory) {
        super(name, age, gender);
        this.patientID = patientID;
     // Ensures the medical history is not null and if it's null, initializes an empty list
        this.medicalHistory = (medicalHistory != null) ? medicalHistory : new ArrayList<>();
    }

    public int getPatientID() {
        return patientID;
    }

    public List<String> getMedicalHistory() {
        return medicalHistory;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public void setMedicalHistory(List<String> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
    /**
     * represents the patient by a string, including personal details,
     * patient ID, and medical history.
     * 
     * @return a formatted string with details.
     */
    @Override
    public String toString() {
        return "Patient's " + super.toString() + ", PatientID: " + patientID + ", Medical History: " + medicalHistory;
    }
    /**
     * checks if two Patient objects are equal based on their attributes
     * 
     * @param obj the object for comparison.
     * @return true if the patients are equal and false if not.
     */
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Patient)) return false;
        Patient patient = (Patient) obj;
        return patientID == patient.patientID && medicalHistory.equals(patient.medicalHistory);
    }
}
