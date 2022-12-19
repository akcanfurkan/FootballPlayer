public class FootballPLayer {

    int no;
    String name;
    int minutes;
    boolean inPlay;
    int numberOfGoals;


    void play(int minutesToPlay) {

        minutes = minutes + minutesToPlay;

    }

    void score() {

        numberOfGoals = numberOfGoals + 1; //numbersOfGoals++; olarak da yazabilirdik.

    }
}
