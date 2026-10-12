package com.jmpjva.week5.inheritance;

/**
 * @author jazeel
 * @since 2026-10-11
 *
 * What this code does:
 * This class represents a doctor who handles emergencies.
 * It extends Doctor and implements MedicalProfessional and Billable.
 * It demonstrates multiple inheritance of type through interfaces.
 */

public class EmergencyDoctor extends Doctor implements MedicalProfessional, Billable {
	
    public EmergencyDoctor(int personId, String name, int age, String specialization, double consultationFee) {
    	
        super(personId, name, age, specialization, consultationFee);
    }

    public void handleEmergency() {
    	
        System.out.println("Dr. " + getName() + " is responding to a medical emergency.");
    }

    @Override
    public void prescribeMedication() {
    	
        System.out.println("Dr. " + getName() + " is prescribing emergency medication.");
    }

    @Override
    public void generateBill() {
    	
        System.out.printf("Emergency consultation bill: $%.2f%n", getConsultationFee());
    }

    @Override
    public void performDuties() {
    	
        System.out.println("Dr. " + getName() + " is providing urgent emergency care.");
    }

    @Override
    public String toString() {
    	
        return super.toString() + "\nRole: Emergency Doctor";
    }
}
