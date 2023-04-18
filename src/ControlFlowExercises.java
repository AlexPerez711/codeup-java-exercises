import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int a = 5;
//        while (a <= 15) {
//            System.out.print(a);
//            a++;
//        }

//        int b = 0;
//        do {
//            System.out.println(b);
//            b += 2;
//        } while (b <= 100);

//        int b = 100;
//        do {
//            System.out.println(b);
//            b -= 5;
//        } while (b >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

//        for (int b = 100; b >= -10; b -= 5) {
//            System.out.println(b);
//        }
//
//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        Scanner input = new Scanner(System.in);
//        String choice = "y";
//
//        while (choice.equalsIgnoreCase("y")) {
//            System.out.print("Enter an integer: ");
//            int n = input.nextInt();
//
//            System.out.println("Number\tSquare\tCube");
//            for (int i = 1; i <= n; i++) {
//                int square = i * i;
//                int cube = i * i * i;
//                System.out.println(i + "\t" + square + "\t" + cube);
//            }
//
//            System.out.print("Do you want to continue? (y/n): ");
//            choice = input.next();
//
//        }

        Scanner input = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter a numerical grade (0-100): ");
            int grade = input.nextInt();

            String letterGrade;
            if (grade >= 88 && grade <= 100) {
                letterGrade = "A";
            } else if (grade >= 80 && grade <= 87) {
                letterGrade = "B";
            } else if (grade >= 67 && grade <= 79) {
                letterGrade = "C";
            } else if (grade >= 60 && grade <= 66) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }

            System.out.println("Letter grade: " + letterGrade);

            System.out.print("Do you want to continue? (y/n): ");
            choice = input.next();
        }
    }
}

