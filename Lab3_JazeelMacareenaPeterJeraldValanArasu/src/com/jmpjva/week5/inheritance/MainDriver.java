package com.jmpjva.week5.inheritance;

/**
 * @author jazeel
 * @since 2026-10-11
 *
 * What this code does:
 * This class is the main driver for the Hospital Management System.
 * It creates Doctor, Nurse, Surgeon, and EmergencyDoctor objects, displays their details, calls specialized methods, and demonstrates overriding, interfaces, and runtime polymorphism using Person references.
 */

public class MainDriver {
	
    public static void main(String[] args) {
    	
        System.out.println("------------------------------------------------------------------");
        System.out.println("                  HOSPITAL MANAGEMENT SYSTEM");
        System.out.println("------------------------------------------------------------------");
        Doctor doctor = new Doctor(101, "AAAA", 40, "Cardiology", 150.00);
        Nurse nurse = new Nurse(102, "BBBB", 29, "Emergency", "Night");
        Surgeon surgeon = new Surgeon(103, "CCCC", 45, "General Surgery", 250.00, "Appendix", "Operating Room 2");
        EmergencyDoctor emergencyDoctor = new EmergencyDoctor( 104, "DDDD", 36, "Emergency Medicine", 200.00);
        System.out.println("\n-------------------------- DOCTOR ------------------------------");
        System.out.println(doctor);
        doctor.performDuties();
        doctor.diagnosePatient();
        System.out.println("\n--------------------------- NURSE ------------------------------");
        System.out.println(nurse);
        nurse.performDuties();
        nurse.assistPatient();
        System.out.println("\n-------------------------- SURGEON ------------------------------");
        System.out.println(surgeon);
        surgeon.performDuties();
        surgeon.performSurgery();
        System.out.println("\n---------------------- EMERGENCY DOCTOR -------------------------");
        System.out.println(emergencyDoctor);
        emergencyDoctor.performDuties();
        emergencyDoctor.handleEmergency();
        emergencyDoctor.prescribeMedication();
        emergencyDoctor.generateBill();
        System.out.println("\n------------- POLYMORPHISM USING PERSON REFERENCES --------------");
        Person person;
        person = doctor;
        person.performDuties();
        person = nurse;
        person.performDuties();
        person = surgeon;
        person.performDuties();
        person = emergencyDoctor;
        person.performDuties();
        System.out.println("\nAll hospital staff demonstrations completed.");
    }
}
