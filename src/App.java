import grades.GradeManager;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        GradeManager gradeManager = new GradeManager();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\nMenu:");
            System.out.println("1. Add grade");
            System.out.println("2. View average grade");
            System.out.println("3. View number of passing grades");
            System.out.println("4. Exit");
            System.out.println("5. Remove grade");
            System.out.print("Choose an option: ");

            Integer choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter a grade: ");
                    Double grade = scanner.nextDouble();

                    gradeManager.addGrade(grade);
                    break;

                case 2:
                    System.out.println(
                        "Average grade: " + gradeManager.calculateAverage()
                    );
                    break;

                case 3:
                    System.out.println(
                        "Number of passing grades: "
                        + gradeManager.countPassingGrades()
                    );
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;

                case 5:
                    System.out.print("Enter the grade to remove: ");
                    Double gradeToRemove = scanner.nextDouble();

                    gradeManager.removeGrade(gradeToRemove);
                    System.out.println("Grade removed.");
                    break;

                default:
                    System.out.println(
                        "Invalid option. Please try again."
                    );
            }
        }
    }
}