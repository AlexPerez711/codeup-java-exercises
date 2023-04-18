import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.", pi);

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number" );
        int number = scanner.nextInt();
        System.out.println("The number you entered is: " + number);

        System.out.print("Enter word 1: ");
        String word1 = scanner.next();
        System.out.print("Enter word 2: ");
        String word2 = scanner.next();
        System.out.print("Enter word 3: ");
        String word3 = scanner.next();

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

//        System.out.print("Enter a sentence: ");
//        String sentence = scanner.next();
//
//        System.out.println("You entered: " + sentence);
//
//        System.out.print("Enter a sentence: ");
//        String sentence = scanner.nextLine();
//
//        System.out.println("You entered: " + sentence);
//
//        System.out.print("Enter the length of the classroom: ");
//        String lengthString = scanner.nextLine();
//
//        System.out.print("Enter the width of the classroom: ");
//        String widthString = scanner.nextLine();
//
//        double length = Double.parseDouble(lengthString);
//        double width = Double.parseDouble(widthString);
//
//        double area = length * width;

//        System.out.println("The area of the classroom is " + area + " square units.");

        System.out.print("Enter the length of the classroom: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the classroom: ");
        double width = scanner.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("The area of the classroom is " + area + " square units.");
        System.out.println("The perimeter of the classroom is " + perimeter + " units.");

    }
}
