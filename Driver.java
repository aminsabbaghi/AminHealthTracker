package aminHealthTracker;

import java.time.LocalDate;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        
        Hospital hospital = new Hospital();

        
        Patient patient1 = new Patient("Amir Noori", 24, "Male", 111, new ArrayList<>());
        Patient patient2 = new Patient("Maya Wilson", 33, "Female", 222, new ArrayList<>());
        Patient patient3 = new Patient("Peter Max", 40, "Male", 333, new ArrayList<>());

       
        Doctor doctor1 = new Doctor("Dr.Rastin Sabbaghi", 45, "Male", 101, "Cardiologist", new ArrayList<>());
        Doctor doctor2 = new Doctor("Dr.Maya Poulad", 40, "Female", 102, "Neurologist", new ArrayList<>());

        // Adding patients and doctors to the hospital
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Assigning patients to doctors 
        doctor1.assignPatient(patient1);
        doctor2.assignPatient(patient2);

       
        MedicalRecord record1 = new MedicalRecord(1, "Flu", "Rest and Hydration", LocalDate.now());
        MedicalRecord record2 = new MedicalRecord(2, "Headache", "Pain Relievers", LocalDate.now());
        MedicalRecord record3 = new MedicalRecord(3, "Back Pain", "Physical Therapy", LocalDate.now());

        // Adding medical records to patients' histories
        patient1.getMedicalHistory().add(record1.toString());
        patient2.getMedicalHistory().add(record2.toString());
        patient3.getMedicalHistory().add(record3.toString());

        
        System.out.println("---- Hospital Details ----");
        System.out.println("Patients in the hospital: ");
        for (Patient patient : hospital.getPatients()) {
            System.out.println(patient);
        }

        System.out.println("\nDoctors in the hospital: ");
        for (Doctor doctor : hospital.getDoctors()) {
            System.out.println(doctor);
        }
        // Displaying assigned patients and their medical records
        System.out.println("\nAssigned Patients and their Medical Records:");
        for (Doctor doctor : hospital.getDoctors()) {
            System.out.println("\nDoctor: " + doctor.getName() + ", Specialization: " + doctor.getSpecialization());
            for (Patient assignedPatient : doctor.getAssignedPatients()) {
                System.out.println("Assigned Patient: " + assignedPatient.getName());
                System.out.println("Medical History: " + assignedPatient.getMedicalHistory());
            }
        }
    }
}
