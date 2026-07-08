import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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
    
    if (average >= 90)
       System.out.println("Grade A");
    else if (average >= 75)
       System.out.println("Grade B");
    else if (average >= 50)
       System.out.println("Grade C");
    else
       System.out.println("Fail");
    }
}