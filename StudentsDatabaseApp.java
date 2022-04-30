package studentsDatabaseApp;

import java.util.Scanner;

public class StudentsDatabaseApp {
    public static void main(String[] args) {

        //Ask how many student do you want to add to DB
        System.out.print("Enter number of new students to enroll :");
        Scanner in=new Scanner(System.in);
        int numOfStudents = in.nextInt();

        Student[] students = new Student[numOfStudents];


        // create n number of new students
        for (int n=0;n<numOfStudents;n++){

            students[n] =new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());

        }
        for (int n=0;n<numOfStudents;n++){
            System.out.println("+++++++++++++++++++++++");
            System.out.println(students[n].toString());

        }

    }
}
