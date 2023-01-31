package assignment.school;
import java.util.*;
import java.util.logging.*;
public class Student 
{
    String studentname;
    char gradelevel;
    float gpa;
    float updatedgpa;
    String response;
    Scanner sc = new Scanner(System.in);
    Scanner si = new Scanner(System.in);
    Logger log = Logger.getLogger("hi");

    Student() {
	try{
        log.info("Enter the Student Name");
        studentname = sc.nextLine();
        log.info("Enter the Grade level");
        gradelevel = sc.next().charAt(0);
        log.info("Enter your GPA out of 10");
        gpa = sc.nextFloat();
	}
	catch(InputMismatchException e)
	{
		log.info(String.valueOf(e));
		System.exit(0);
	}
	    
    }

    void update() {
        log.info("Do you need to update your GPA\nFor update type Yes");
        response = si.nextLine();
        switch (response) {
            case "Yes":
		try{	
                log.info("Enter updated GPA");
                updatedgpa = si.nextFloat();
                if ((GradeLevel == 'A') && (UpdatedGPA >= 9) && (UpdatedGPA <= 10)) {
                    gpa = updatedgpa;
                } else if ((GradeLevel == 'B') && (UpdatedGPA >= 7) && (UpdatedGPA <= 8)) {
                    gpa = updatedgpa;
                } else if ((GradeLevel == 'C') && (UpdatedGPA >= 5) && (UpdatedGPA <= 6)) {
                    gpa = updatedgpa;
                } else if ((GradeLevel == 'D') && (UpdatedGPA >= 3) && (UpdatedGPA <= 4)) {
                    gpa = updatedgpa;
                } else if ((GradeLevel == 'E') && (UpdatedGPA >= 1) && (UpdatedGPA <= 2)) {
                    gpa = updatedgpa;
                } else {
                    log.info("Cannot be updated");
                }
		}
		catch(InputMismatchException e)
		{
			log.info(String.valueOf(e);
			System.exit(0);
		}				
                break;
        }
    }

    void result() {
        log.fine("{} has a GPA Level of {}",studentname,gpa);
    }

    public static void main(String[] args) {
        Student in = new Student();
        in.update();
        in.result();
    }

}
