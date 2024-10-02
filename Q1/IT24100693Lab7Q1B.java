import java.util.Scanner;

public class IT24100693Lab7Q1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.print("Enter marks for 4 subjects (separated by space) for Student " + student + ": ");
            int totalMarks = 0;
            for (int i = 0; i < 4; i++) {
                totalMarks += sc.nextInt();
            }

            double average = totalMarks / 4;
            System.out.println("Student " + student + " - Average Marks: " + average);

            if (average >= 75 && average <= 100) {
                System.out.println("Grade: Distinction");
            } else if (average >= 50 && average < 75) {
                System.out.println("Grade: Credit");
            } else {
                System.out.println("Grade: Fail");
            }
        }
    }
}
