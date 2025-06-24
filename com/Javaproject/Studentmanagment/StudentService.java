package com.Javaproject.Studentmanagment;


import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> record = new ArrayList<>();

    void addStudent(Student student){
        record.add(student);
        System.out.println(student.getName()+"Sucessfully added");
    }

    void viewAllStudent(){
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
                s.setEnrollmentYear(updated.getEnrollmentYear());
                System.out.println("Students details updated");
                return true;
            }
        }
        System.out.println("Student with Id "+id+" not found");
        return false;

    }

    public void searchByName(String name){
        boolean found = false;
        for(Student s : record){
            if(s.getName().equalsIgnoreCase(name)){
                System.out.println(s);
                found = true;
            }

        }
        if(!found) System.out.print("No Student Found with given name");
    }

    public void searchByCourse(String Course){
        boolean found = false;
        for(Student s : record){
            if(s.getCourse().equalsIgnoreCase(Course)){
                System.out.println(s);
                found = true;
            }

        }
        if(!found) System.out.print("No Student Found with given name");

    }

    void sortByName(){
        record.sort((s1,s2)-> s1.getName().compareToIgnoreCase(s2.getName()));
        System.out.println("Sorted by Name (A–Z):");
        viewAllStudent();
    }

    void sortById(){
        record.sort((s1,s2)-> Integer.compare(s1.getStudentId(), s2.getStudentId()));
        System.out.print("Sort by Student Id");

    }




}
