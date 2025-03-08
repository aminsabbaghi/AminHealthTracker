package aminHealthTracker;

import java.time.LocalDate;

/**
 * this class represents a patient's medical record.
 * it contains information about diagnosis, treatment, and the date of the record.
 * Not an extention from Person's class
 */
public class MedicalRecord {

	protected int recordID;
	protected String diagnosis;
	protected String treatment;
	protected LocalDate date;


public MedicalRecord() {
	this.recordID = 0;
	this.diagnosis = "Unknown";
	this.treatment = "Unknown";
	this.date = LocalDate.now();
}

public MedicalRecord(int recordID, String diagnosis, String treatment, LocalDate date) {
	this.recordID = recordID;
	this.diagnosis = diagnosis;
	this.treatment = treatment;
	this.date = date;
}

public int getRecordID() {
	return recordID;
}
public String getDiagnosis() {
	return diagnosis;
}
public String getTreatment() {
	return treatment;
}
public LocalDate getDate() {
	return date;
}
public void setRecordID(int recordID) {
	this.recordID = recordID;
}
public void setDiagnosis(String diagnosis) {
	this.diagnosis = diagnosis;
}
public void setTreatment(String treatment) {
	this.treatment = treatment;
}
public void setDate(LocalDate date) {
	this.date = date;
}

@Override
public String toString() {
	return "Record ID: " + recordID + ", Diagnosis: " + diagnosis + ", Treatment: " + treatment + ", Date: " + date;
	
}
/**
 * checks if two MedicalRecord objects are equal based on their attributes.
 *
 * @param obj The object for comparison.
 * @return true if both objects have the same values, false otherwise.
 */
@Override
public boolean equals(Object obj) {
	if (this==obj) return true;
	if (obj==null|| getClass()!=obj.getClass()) return false;
	MedicalRecord medicalRecord = (MedicalRecord) obj;
	return recordID==medicalRecord.recordID && diagnosis.equals(medicalRecord.diagnosis) 
			&& treatment.equals(medicalRecord.treatment)
			&& date.equals(medicalRecord.date);

}
}
