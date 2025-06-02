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

    boolean deleteStudentById(int id){
            for(Student s : record){
                if(id==s.getStudentId()){
                    record.remove(s);
                    System.out.print("Student with id "+id+"is removed.");
                    return true;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
        return false;
    }

    public boolean updateStudent(int id,Student updated){
        for(Student s : record){
            if(s.getStudentId()==id){
                s.setName(updated.getName());
                s.setStudentId(updated.getStudentId());
                s.setGender(updated.getGender());
                s.setPhoneNumber(updated.getPhoneNumber());
                s.setEmail(updated.getEmail());
                s.setAddress(updated.getAddress());
                s.setEnrollmentYear(updated.setEnrollmentYear());
                System.out.println("Students details updated");
                return true;
            }
        }
        System.out.println("Student with Id "+id+" not found");
        return false;

    }


}
