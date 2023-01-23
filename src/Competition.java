import it.develhope.classesandobjects.entities.CompetitionRules;
import it.develhope.classesandobjects.entities.Programmer;
import it.develhope.classesandobjects.entities.Team;

public class Competition {
    public static void main(String[] args) {

        CompetitionRules rules = CompetitionRules.getInstance();
        rules.printRules();
        System.out.println("--------------------------------");

        Team teamA = new Team();
        teamA.teamName = "Team A";
        teamA.p1 = new Programmer();
        teamA.p2 = new Programmer();
        teamA.p1.name = "Carlo";
        teamA.p1.programmingLanguage = "JavaScript";
        teamA.p1.yearsOfExperience = 5;
        teamA.p2.name = "Salvatore";
        teamA.p2.programmingLanguage = "SQL";
        teamA.p2.yearsOfExperience = 2;

        Team teamB = new Team();
        teamB.p1 = new Programmer();
        teamB.p2 = new Programmer();
        teamB.teamName = "Team B";
        teamB.p1.name = "Giovanni";
        teamB.p2.name = "Stefania";
        teamB.p1.programmingLanguage = "Java";
        teamB.p2.programmingLanguage = "Phyton";
        teamB.p1.yearsOfExperience = 4;
        teamB.p2.yearsOfExperience = 3;



        teamA.printTeamDetails();
        System.out.println("--------------------------------");
        teamB.printTeamDetails();
    }

}

