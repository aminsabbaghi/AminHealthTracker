package aminHealthTracker;

import java.util.ArrayList;
import java.util.List;

/**
 * this class represents a hospital in the system.
 * and manages a list of patients and doctors.
 */
public class Hospital {

	protected List<Patient> patients;
	protected List<Doctor> doctors;
	
	public Hospital() {
		this.patients = new ArrayList<>();
		this.doctors = new ArrayList<>();
		}
	
	 /**
     * parameterized constructor to initialize a hospital with specific patients and doctors.
     * if null values are provided, empty lists are assigned instead.
     *
     * @param patients a list of patients in the hospital.
     * @param doctors  a list of doctors  in the hospital.
     */
	public Hospital(List<Patient>patients, List<Doctor>doctors) {
		this.patients = (patients != null)? patients : new ArrayList<>();
		this.doctors = (doctors!=null)? doctors : new ArrayList<>();
	}
	
	public List<Patient> getPatients(){
		return patients;
	}
	public List<Doctor> getDoctors(){
		return doctors;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	public void setDoctors(List<Doctor>doctors) {
		this.doctors = doctors;
	}
	
    /**
     * adds a patient to the hospital's list if they are not already present.
     *
     * @param patient The patient to be added.
     * checks for null input and avoids duplicate entries.
     */

	public void addPatient(Patient patient) {
		if (patient == null) {
	        System.out.println("Cannot add the patient!");
	        return;
	    }
		if (patients.contains(patient)) {
	        System.out.println("Patient " + patient.getName() + ", With ID " + patient.getPatientID() + " already exists.");
	        return;
	    }
		patients.add(patient);
        System.out.println("Patient added: " + patient.getName());
    }
	
	/**
     * adds a doctor to the hospital's list if they are not already present.
     *
     * @param doctor The doctor to be added.
     * checks for null input and avoids duplicate entries.
     */
	public void addDoctor(Doctor doctor) {
		if (doctor == null) {
			System.out.println("Cannot add the doctor!");
			return;
		}
		if(doctors.contains(doctor)) {
			System.out.println("Doctor " + doctor.getName() + ", With ID " + doctor.getDoctorID() + " already exsists.");
			return;
			}
		doctors.add(doctor);
		System.out.println("Doctor added: " + doctor.getName());
	}
	
}

