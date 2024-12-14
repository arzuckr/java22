package Primitives.ArithmeticOperators;

public class Ex3 {

    public static void main(String[] args) {
        //company has 57 testers  and there are 8 teams in the company.
        // After assigning equal of testers for each team .How many testers
        // won't be assigned with a team?

        int totalTester=57;
        int totalTeam=8;
        int totalTestersInTeam=totalTester%totalTeam;
        System.out.println("Result:"+totalTestersInTeam);









    }
}
