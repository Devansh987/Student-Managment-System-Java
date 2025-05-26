package com.Javaproject.Studentmanagment;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        try {
            String studentName = sc.nextLine();
            String gender = sc.nextLine();
            if(!(gender.equals("Male") || gender.equals("male") || gender.equals("Female") || gender.equals("female"))) throw new Exception("Invalid Gender");
            String email = sc.nextLine();
            String address = sc.nextLine();
            long phoneNo = sc.nextLong();
            String numberString = String.valueOf(phoneNo);
            int Length = numberString.length();
            if(Length!=10) throw new Exception("Length should be 10-digits");
            int studentId = sc.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }





    }
}
