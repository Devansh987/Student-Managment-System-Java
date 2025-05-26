package com.Javaproject.Studentmanagment;

public class Student {
    private int StudentId;
    private String Name;
    private String Gender;
    private long PhoneNumber;
    private String email;
    private String address;


    public Student(int studentId, String name, String gender, long phoneNumber, String email, String address) {
        StudentId = studentId;
        Name = name;
        Gender = gender;
        PhoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public int getStudentId() {
        return StudentId;
    }

    public String getName() {
        return Name;
    }

    public String getGender() {
        return Gender;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
