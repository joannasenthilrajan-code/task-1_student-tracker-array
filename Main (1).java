import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter mark 3: ");
        int m3 = sc.nextInt();

        double average = (m1 + m2 + m3) / 3.0;
        System.out.println("Average = " + average);

        int highest = m1;

        if (m2 > highest) {
            highest = m2;
        }

        if (m3 > highest) {
            highest = m3;
        }

        System.out.println("Highest Mark = " + highest);
    
    int lowest = m1;

    if (m2 < lowest) {
       lowest = m2;
    }

    if (m3 < lowest) {
        lowest = m3;
    }

    System.out.println("Lowest Mark = " + lowest);
    
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