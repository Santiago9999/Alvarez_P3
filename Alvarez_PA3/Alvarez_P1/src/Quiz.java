import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double correct = 0;
        int exit = 'y';
        while (exit == 'y') {

            correct = 0;
            System.out.println("Difficulty Level?");
            int difficulty = input.nextInt();
            System.out.println("Type of math?");
            int typeofmath = input.nextInt();
            for (int i = 0; i < 10; i++) {
                double Qanswer = Question.GenQuestion(difficulty, typeofmath);
                double Uanswer = input.nextDouble();
                if ((Math.abs(Qanswer - Uanswer)) > .0001) {
                    Question.Response(0);
                } else {
                    Question.Response(1);
                    correct++;
                }
            }
            System.out.println("Number Correct: " + correct + "\nNumber Incorrect: " + (10 - correct) + "\nPercent:" + correct * 10 + "%");
            if (correct / 10.0 > .74) {
                System.out.println("Congratulations, you are ready to go to the next level!");
            } else {
                System.out.println("Please ask your teacher for extra help.");
            }
            System.out.print("New Session?(y/n)");
            exit = input.next().charAt(0);
        }

    }

}