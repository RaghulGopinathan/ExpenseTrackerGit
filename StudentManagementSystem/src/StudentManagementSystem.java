import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(int id, String studentName, double marks){
        studentList.add(new Student(id,studentName,marks));
    }

    public void viewAllStudents(){
        System.out.println(studentList.toString());
    }

    public void searchStudentById(int id){
        for (Student i: studentList)
        {
            if(i.getId()==id)
                System.out.println(i.toString());
            else
                System.out.println("Student not found!");
        }
    }
}
