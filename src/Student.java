import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {

    Map<String , Double> gradesOfClasses = new HashMap<>();

    public String className = null;
    public double grade;
    Scanner scanClass = new Scanner(System.in);
    Scanner scanGrade = new Scanner(System.in);


    public void addGradesOfClasses() {
        System.out.println("Enter the Name of the Class: ");
        className = scanClass.nextLine();

        System.out.println("Enter the Grade: ");
        grade = scanGrade.nextDouble();

        gradesOfClasses.put(className,grade);


    }



}

