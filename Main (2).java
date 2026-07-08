import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int[] marks = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += marks[i];
        }

        double average = sum / 3.0;

        int highest = marks[0];
        for (int i = 1; i < 3; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }

        int lowest = marks[0];
        for (int i = 1; i < 3; i++) {
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        String grade;

        if (average >= 90)
            grade = "A";
        else if (average >= 75)
            grade = "B";
        else if (average >= 50)
            grade = "C";
        else
            grade = "Fail";

        System.out.println("\n----- STUDENT REPORT -----");
        System.out.println("Name = " + name);
        System.out.println("Average = " + average);
        System.out.println("Highest Mark = " + highest);
        System.out.println("Lowest Mark = " + lowest);
        System.out.println("Grade = " + grade);
    }
}