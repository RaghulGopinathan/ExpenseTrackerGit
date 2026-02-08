import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int id;
        String studentName;
        double marks;

        StudentManagementSystem studentManagementSystem = new StudentManagementSystem();

        while (true)
        {
            System.out.println("\nMenu:\n1.Add student\n2.View all students\n3.Search student by ID\n4.Exit\n");
            System.out.print("Enter your choice -> ");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                {
                    System.out.print("Enter student id: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter student Name: ");
                    studentName = sc.nextLine();
                    System.out.print("Enter marks: ");
                    marks = sc.nextDouble();
                    studentManagementSystem.addStudent(id,studentName,marks);
                    break;

                }
                case 2:
                {
                    studentManagementSystem.viewAllStudents();
                    break;
                }
                case 3:
                {
                    System.out.print("Enter the id: ");
                    studentManagementSystem.searchStudentById(sc.nextInt());
                    break;
                }
                case 4:
                {
                    return;
                }
            }
        }

    }
}