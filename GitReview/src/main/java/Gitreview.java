/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liya
 */

 import java.util.Scanner;
 
public class GitReview {
 
    public static void main(String[] args) {
           
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[3];
    
    for (int i = 0; i < students.length; i++) {
    System.out.println("Enter the student name");
    String name = input.next();
    
    System.out.println("Enter the student age");
    int age = input.nextInt();
    
    Student student = new Student(name, age);
    students[i] = student;    
    System.out.print(student.getName());
     System.out.print(student.getAge());
    } 
 }
}

