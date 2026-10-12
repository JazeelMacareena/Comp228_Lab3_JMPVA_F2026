package com.jmpjva.week5.inheritance;

/**
 * @author jazeel
 * @since 2026-10-11
 *
 * What this code does:
 * This class represents a person working in a hospital.
 * It stores the person's ID, name, and age and displays general duties.
 * Doctor and Nurse inherit from this parent class.
 */

public class Person {
	
    private int personId;
    private String name;
    private int age;

    public Person(int personId, String name, int age) {
    	
        this.personId = personId;
        this.name = name;
        this.age = age;
    }

    public int getPersonId() {
    	
    	return personId; 
    }
    
    public String getName() {
    	
    	return name; 
    }
    
    public int getAge() {
    	
    	return age; 
    }

    public void performDuties() {
    	
        System.out.println(name + " is performing general hospital duties.");
    }

    @Override
    public String toString() {
    	
        return "Person ID: " + personId + "\nName: " + name + "\nAge: " + age;
    }
}
