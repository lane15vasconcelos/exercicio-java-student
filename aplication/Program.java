package aplication;
import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: ");
        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        if (student.finalClass() >= 60 ) {
            System.out.printf("Final Grade: %.2f% ", student.finalClass());
            System.out.print("Pass");
        }
        else {
            System.out.printf("Final Grade: %.2f%n", student.finalClass());
            System.out.println("Failed");
            System.out.printf("Mission %.2f points%n", student.missingPoint());
        }
    }   
}
