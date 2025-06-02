package com.Javaproject.Studentmanagment;

public class Student {
    private int StudentId;
    private String Name;
    private String Gender;
    private long PhoneNumber;
    private String email;
    private String address;
    private String Course;
    private int enrollmentYear;


    public Student(int studentId, String name, String gender, long phoneNumber, String email, String address,String course,int year) {
        StudentId = studentId;
        Name = name;
        Gender = gender;
        PhoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        Course = course;
        enrollmentYear = year;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public void setEnrollmentYear(int enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
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

    public String getCourse() {
        return Course;
    }

    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    public String getAddress() {
        return address;
    }
}
