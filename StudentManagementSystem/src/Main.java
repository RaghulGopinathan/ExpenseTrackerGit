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
            System.out.println("\nMenu:\n1.Add student\n2.View all students\n3.Search student by ID\n4.Update Marks\n5.Delete student\n6.Exit");
            System.out.print("\nEnter your choice -> ");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                {
                    System.out.print("\nEnter student id: ");
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
                    if(studentManagementSystem.searchStudentById(sc.nextInt()))
                        System.out.println("Student found");
                    else
                        System.out.println("Student not found!");

                    break;
                }
                case 4:
                {
                    System.out.print("Enter the id: ");
                    int tempid = sc.nextInt();
                    System.out.print("Enter the Mark: ");
                    double newMark = sc.nextDouble();
                    if(studentManagementSystem.updateMarks(tempid,newMark))
                        System.out.println("Mark updated!");
                    else
                        System.out.println("Student not found!");
                    break;
                }
                case 5:
                {
                    System.out.print("Enter the id: ");
                    if(studentManagementSystem.deleteStudent(sc.nextInt()))
                        System.out.println("Entry deleted");
                    else
                        System.out.println("Student not found!");
                    break;
                }
                case 6:
                {
                    return;
                }

            }
        }

    }
}