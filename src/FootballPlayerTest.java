public class FootballPlayerTest {


    public static void main(String[] args) {
        FootballPLayer alex = new FootballPLayer();
        alex.no = 10;
        alex.name = "Alex De Souza";
        alex.minutes = 0;
        alex.inPlay = true;
        alex.numberOfGoals = 0;

        alex.play(90);
        alex.score();
        alex.score();

        System.out.println("Number of goals Alex scored: " + alex.numberOfGoals);
        System.out.println("Alex played totally " + alex.minutes + " minutes so far.");

        System.out.println("*************************************");

        FootballPLayer arda = new FootballPLayer();
        arda.no = 10;
        arda.name = "Arda Güler";
        arda.minutes = 0;
        arda.inPlay = true;
        arda.numberOfGoals = 0;

        arda.play(90);
        arda.score();
        arda.score();
        arda.score();

        System.out.println("Number of goals Arda scored: " + arda.numberOfGoals);
        System.out.println("Arda played totally " + arda.minutes + " minutes so far.");





    }
}