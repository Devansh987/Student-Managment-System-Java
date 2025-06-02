package com.Javaproject.Studentmanagment;
import java.util.*;

    public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                StudentService service = new StudentService();
                while (true) {
                    System.out.println("\n====== Student Management System ======");
                    System.out.println("1. Add Student");
                    System.out.println("2. View All Students");
                    System.out.println("3. Delete Student by ID");
                    System.out.println("4. Update Student");
                    System.out.println("5. Search by Name");
                    System.out.println("6. Search by Course");
                    System.out.println("7. Exit");
                    System.out.print("Enter your choice: ");

                    String choice = sc.nextLine();

                    switch (choice) {
                        case "1":
                            System.out.print("Enter Name: ");
                            String name = sc.nextLine();

                            System.out.print("Enter Gender: ");
                            String gender = sc.nextLine();

                            System.out.print("Enter Email: ");
                            String email = sc.nextLine();

                            System.out.print("Enter Address: ");
                            String address = sc.nextLine();

                            System.out.print("Enter Course: ");
                            String course = sc.nextLine();

                            System.out.print("Enter Age: ");
                            int age = Integer.parseInt(sc.nextLine());

                            System.out.print("Enter Student ID: ");
                            int id = Integer.parseInt(sc.nextLine());

                            System.out.print("Enter Phone Number: ");
                            long phoneNo = Long.parseLong(sc.nextLine());

                            Student s = new Student(id, name, gender, phoneNo, email, address, course, age);
                            service.addStudent(s);
                            break;

                        case "2":
                            service.viewAllStudent();
                            break;

                        case "3":
                            System.out.print("Enter ID to delete: ");
                            int deleteId = Integer.parseInt(sc.nextLine());
                            service.deleteStudentById(deleteId);
                            break;

                        case "4":
                            System.out.print("Enter ID to update: ");
                            int updateId = Integer.parseInt(sc.nextLine());

                            System.out.print("Enter New Name: ");
                            String newName = sc.nextLine();

                            System.out.print("Enter New Course: ");
                            String newCourse = sc.nextLine();

                            System.out.print("Enter New Age: ");
                            int newAge = Integer.parseInt(sc.nextLine());

                            Student updatedStudent = new Student(updateId, newName, null, 0, null, null, newCourse, newAge);

                            service.updateStudent(updateId, updatedStudent);
                            break;

                        case "5":
                            System.out.print("Enter Name to search: ");
                            String searchName = sc.nextLine();
                            service.searchByName(searchName);
                            break;

                        case "6":
                            System.out.print("Enter Course to search: ");
                            String searchCourse = sc.nextLine();
                            service.searchByCourse(searchCourse);
                            break;

                        case "7":
                            System.out.println("Exiting program. Goodbye!");
                            sc.close();
                            return;

                        default:
                            System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                    }
                }
            }
        }








