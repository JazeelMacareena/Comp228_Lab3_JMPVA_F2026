package com.jmpjva.week5.inheritance;

/**
 * @author jazeel
 * @since 2026-10-11
 *
 * What this code does:
 * This class represents a hospital nurse.
 * It extends Person, stores department and shift, assists patients,
 * and overrides performDuties().
 */

public class Nurse extends Person {
	
    private String department;
    private String shift;

    public Nurse(int personId, String name, int age, String department, String shift) {
    	
        super(personId, name, age);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment() { 
    	
    	return department; 
    }
    
    public String getShift() {
    	
    	return shift; 
    }

    public void assistPatient() {
    	
        System.out.println(getName() + " is assisting patients in " + department + ".");
    }

    @Override
    public void performDuties() {
    	
        System.out.println(getName() + " is monitoring patients and supporting the medical team.");
    }

    @Override
    public String toString() {
    	
        return super.toString() + "\nDepartment: " + department + "\nShift: " + shift;
    }
}
