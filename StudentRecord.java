package com.tw;

import java.util.ArrayList;
import java.util.List;

public class StudentRecord {

    private List<Student> students;

    StudentRecord() {
        students = new ArrayList<>();
    }

    void addNewStudent(String name, int rollNo) {
        Student newStudent = new Student(name, rollNo);
        students.add(newStudent);
    }

    void deleteByRollNo(int rollNo) {
        for (Student student : students) {
            if (student.getRollNo() == rollNo) {
                students.remove(student);
                    break;
            }
        }
    }

    void deleteByName(String name){
        for(Student student : students){
            if(student.getName().equals("name")){
                students.remove(student);
               break;
            }
        }
    }

    public Student getByRollNo(int rollNo) {
        for (Student student : students) {
            if (student.getRollNo() == rollNo) {
                return student;
            }
        }
        return null;
    }

    public Student getByName(String name){
        for(Student student : students){
            if(student.getName().equals("name")){
                return student;
            }
        }
        return null;
    }

    void updateByRollNo(int rollNo, String name) {
        for (Student student : students) {
            if (student.getRollNo() == rollNo) {
                student.setName(name);
                break;
            }
        }
    }

    public void showAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
