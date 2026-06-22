import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Quiz Started");

        System.out.println("\n1. Which language is used for Android?");
        System.out.println("A. Java");
        System.out.println("B. Python");
        System.out.println("C. C++");
        System.out.print("Answer: ");

        char ans1 = sc.next().charAt(0);

        if(ans1 == 'A' || ans1 == 'a') {
            score++;
        }


        System.out.println("\n2. Which keyword creates object in Java?");
        System.out.println("A. class");
        System.out.println("B. new");
        System.out.println("C. void");
        System.out.print("Answer: ");

        char ans2 = sc.next().charAt(0);

        if(ans2 == 'B' || ans2 == 'b') {
            score++;
        }


        System.out.println("\n3. Java is?");
        System.out.println("A. Platform Independent");
        System.out.println("B. Only Hardware");
        System.out.println("C. Database");

        System.out.print("Answer: ");

        char ans3 = sc.next().charAt(0);

        if(ans3 == 'A' || ans3 == 'a') {
            score++;
        }


        System.out.println("\nQuiz Completed");
        System.out.println("Your Score: " + score + "/3");

        sc.close();
    }
}