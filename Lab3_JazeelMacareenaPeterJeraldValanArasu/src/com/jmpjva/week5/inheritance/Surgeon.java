package com.jmpjva.week5.inheritance;

/**
 * @author jazeel
 * @since 2026-10-11
 *
 * What this code does:
 * This class represents a surgeon.
 * It extends Doctor, adds surgery type and operating room details,
 * and demonstrates multilevel inheritance and method overriding.
 */

public class Surgeon extends Doctor {
	
    private String surgeryType;
    private String operatingRoom;

    public Surgeon(int personId, String name, int age, String specialization, double consultationFee, String surgeryType, String operatingRoom) {
    	
        super(personId, name, age, specialization, consultationFee);
        this.surgeryType = surgeryType;
        this.operatingRoom = operatingRoom;
    }

    public void performSurgery() {
    	
        System.out.println(getName() + " is performing " + surgeryType + " surgery in " + operatingRoom + ".");
    }

    @Override
    public void performDuties() {
    	
        System.out.println("Dr. " + getName() + " is preparing for surgery and caring for surgical patients.");
    }

    @Override
    public String toString() {
    	
        return super.toString() + "\nSurgery Type: " + surgeryType + "\nOperating Room: " + operatingRoom;
    }
}
