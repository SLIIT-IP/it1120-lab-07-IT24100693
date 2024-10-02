import java.util.Scanner;

public class IT24100693Lab7Q1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalMarks = 0;
        int subjects = 4;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        double average = totalMarks / subjects;
        System.out.println("Average Marks: " + average);

        if (average >= 75 && average <= 100) {
            System.out.println("Grade: Distinction");
        } else if (average >= 50 && average < 75) {
            System.out.println("Grade: Credit");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
