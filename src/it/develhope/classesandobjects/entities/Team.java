package it.develhope.classesandobjects.entities;

public class Team {
    public String teamName;
    public Programmer p1;
    public Programmer p2;

    public void printTeamDetails(){
        System.out.println(teamName);
        p1.printProgrammerDetails();
        p2.printProgrammerDetails();
    }
}
