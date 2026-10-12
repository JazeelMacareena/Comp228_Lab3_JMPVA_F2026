package com.jmpjva.week5.inheritance;

/**
 * @author jazeel
 * @since 2026-10-11
 *
 * What this code does:
 * This class represents a hospital doctor.
 * It extends Person, stores specialization and consultation fee, diagnoses patients, and overrides performDuties().
 */

public class Doctor extends Person {
	
    private String specialization;
    private double consultationFee;

    public Doctor(int personId, String name, int age, String specialization, double consultationFee) {
    	
        super(personId, name, age);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    public String getSpecialization() {
    	
    	return specialization; 
    }
    
    public double getConsultationFee() { 
    	
    	return consultationFee; 
    }

    public void diagnosePatient() {
    	
        System.out.println(getName() + " is diagnosing a patient.");
    }

    @Override
    public void performDuties() {
    	
        System.out.println("Dr. " + getName()
                + " is examining patients and providing medical care.");
    }

    @Override
    public String toString() {
    	
        return super.toString() + "\nSpecialization: " + specialization + String.format("\nConsultation Fee: $%.2f", consultationFee);
    }
}
