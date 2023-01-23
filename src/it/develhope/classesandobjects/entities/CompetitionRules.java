package it.develhope.classesandobjects.entities;

public class CompetitionRules {

    private static CompetitionRules competitionRules = new CompetitionRules();
    private CompetitionRules(){}

    public  static CompetitionRules getInstance(){
        return competitionRules;
    }

    private String competitionRule1 = "Do not Copy and paste from StackOverflow!";
    private String competitionRule2 = "Learn every day!";
    private String competitionRule3 = "Be the best Team";

    public void printRules(){
        System.out.println(competitionRule1);
        System.out.println(competitionRule2);
        System.out.println(competitionRule3);
    }
}
