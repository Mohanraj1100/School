package assignment.school;
import java.io.*;
import java.lang.*;
import java.util.*;
public class Student 
{
	String StudentName;
    char GradeLevel;
    float GPA;
    float UpdatedGPA;
    String Response;
    Scanner sc = new Scanner(System.in);
    Scanner si = new Scanner(System.in);

    Student() {
        System.out.println("Enter the Student Name");
        StudentName = sc.nextLine();
        System.out.println("Enter the Grade level");
        GradeLevel = sc.next().charAt(0);
        System.out.println("Enter your GPA out of 10");
        GPA = sc.nextFloat();
    }

    void Update() {
        System.out.println("Do you need to update your GPA\nFor update type Yes");
        Response = si.nextLine();
        switch (Response) {
            case "Yes":
                System.out.println("Enter updated GPA");
                UpdatedGPA = si.nextFloat();
                if ((GradeLevel == 'A') && (UpdatedGPA >= 9) && (UpdatedGPA <= 10)) {
                    GPA = UpdatedGPA;
                } else if ((GradeLevel == 'B') && (UpdatedGPA >= 7) && (UpdatedGPA <= 8)) {
                    GPA = UpdatedGPA;
                } else if ((GradeLevel == 'C') && (UpdatedGPA >= 5) && (UpdatedGPA <= 6)) {
                    GPA = UpdatedGPA;
                } else if ((GradeLevel == 'D') && (UpdatedGPA >= 3) && (UpdatedGPA <= 4)) {
                    GPA = UpdatedGPA;
                } else if ((GradeLevel == 'E') && (UpdatedGPA >= 1) && (UpdatedGPA <= 2)) {
                    GPA = UpdatedGPA;
                } else {
                    System.out.println("Cannot be updated");
                }
                break;
        }
    }

    void Result() {
        System.out.println(StudentName + " has a GPA Level of" + GPA);
    }

    public static void main(String[] args) {
        Student in = new Student();
        in.Update();
        in.Result();
    }

}
