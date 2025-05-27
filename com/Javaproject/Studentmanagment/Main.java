package com.Javaproject.Studentmanagment;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String studentName="";
        String gender="";
        String email="";
        String address="";
        long phoneNo=0;
        int studentId=0;
        String course="";
        int EnrollmentYear=0;

        try {
             studentName = sc.nextLine();
             gender = sc.nextLine();
            if(!(gender.equals("Male") || gender.equals("male") || gender.equals("Female") || gender.equals("female"))) throw new Exception("Invalid Gender");
             email = sc.nextLine();
             address = sc.nextLine();
             phoneNo = sc.nextLong();
            String numberString = String.valueOf(phoneNo);
            int Length = numberString.length();
            if(Length!=10) throw new Exception("Length should be 10-digits");
             studentId = sc.nextInt();
            sc.nextLine();
             course = sc.nextLine();
             EnrollmentYear = sc.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }

        StudentService service = new StudentService();
        service.addStudent(new Student(studentId,studentName,gender,phoneNo,email,address,course,EnrollmentYear));
        service.viewAll();





    }
}
