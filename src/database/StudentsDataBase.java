package database;

import person.Student;

import java.util.ArrayList;

public interface StudentsDataBase {
    ArrayList<Student> fetchStudents();
}
