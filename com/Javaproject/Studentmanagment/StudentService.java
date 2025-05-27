package com.Javaproject.Studentmanagment;


import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> record = new ArrayList<>();

    void addStudent(Student student){
        record.add(student);
        System.out.println(student.getName()+"Sucessfully added");
    }

    void viewAll(){
        if(record.size()==0) System.out.println("No Record available");
        else{
            for(Student s : record){
                System.out.println(s.getStudentId()+": "+s.getName());
            }
        }
    }



}
