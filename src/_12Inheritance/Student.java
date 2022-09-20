package Inheritance;

public class Student extends Person{

    private int[] testScores;
    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public String calculate() {
        double average;
        int sum = 0;

        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }

        average = sum / (testScores.length);

        if (average < 40) {
            return "T";
        } else if (average >= 40 && average < 55) {
            return "D";
        } else if (average >= 55 && average < 70) {
            return "P";
        } else if (average >= 70 && average < 80) {
            return "A";
        } else if (average >= 80 && average < 90) {
            return "E";
        }
        return "O";
    }
}
