import java.util.Scanner;

public class Question {

    public static double GenQuestion(int difficulty, int typeofmath) {
        Scanner input = new Scanner(System.in);
        int firstnumber;
        int secondnumber;
        double Qanswer;
        switch (difficulty) {
            case 1:
                firstnumber = GenNum.RandomInt(9);
                secondnumber = GenNum.RandomInt(9);
                break;
            case 2:
                firstnumber = GenNum.RandomInt(99);
                secondnumber = GenNum.RandomInt(99);
                break;
            case 3:
                firstnumber = GenNum.RandomInt(999);
                secondnumber = GenNum.RandomInt(999);
                break;
            case 4:
                firstnumber = GenNum.RandomInt(9999);
                secondnumber = GenNum.RandomInt(9999);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + difficulty);
        }
        switch (typeofmath) {
            case 1:
                System.out.println("How much is " + firstnumber + " + " + secondnumber + "?");
                Qanswer = firstnumber + secondnumber;
                break;
            case 2:
                System.out.println("How much is " + firstnumber + " * " + secondnumber + "?");
                Qanswer = firstnumber * secondnumber;
                break;
            case 3:
                System.out.println("How much is " + firstnumber + " - " + secondnumber + "?");
                Qanswer = firstnumber - secondnumber;
                break;
            case 4:
                System.out.println("How much is " + firstnumber + " / " + secondnumber + "?");
                Qanswer = (double) firstnumber / (double) secondnumber;
                break;
            case 5:
                typeofmath = GenNum.RandomInt(4);
                return GenQuestion(difficulty, typeofmath);

            default:
                throw new IllegalStateException("Unexpected value: " + typeofmath);
        }
        return Qanswer;
    }


    public static void Response(int z) {
        if (z == 0) {
            int response = GenNum.RandomInt(4);
            switch (response) {
                case 1:
                    System.out.println("No, Please try again.");
                    break;
                case 2:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 3:
                    System.out.println("Don’t give up!");
                    break;
                case 4:
                    System.out.println("No. Keep trying");
                    break;
            }
        }
        if (z == 1) {
            int response = GenNum.RandomInt(4);
            switch (response) {
                case 1:
                    System.out.println("Very good!");
                    break;
                case 2:
                    System.out.println("Excellent!");
                    break;
                case 3:
                    System.out.println("Nice work!");
                    break;
                case 4:
                    System.out.println("Keep up the good work!");
            }
        }
    }

}