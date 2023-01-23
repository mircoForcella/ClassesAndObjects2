package it.develhope.classesandobjects.entities;

public class Programmer {

    public String name;
    public String programmingLanguage;
    public int yearsOfExperience;


    public void printProgrammerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Years of Experience: " + yearsOfExperience);
    }
}
