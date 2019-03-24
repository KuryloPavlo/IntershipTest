package database;

import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;

public class StudentsDatabaseHardcode implements StudentsDataBase{
    @Override
    public ArrayList<Student> fetchStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Andrew Kostenko",new Knowledge(2)));
        students.add(new Student("Julia Veselkina",new Knowledge(3)));
        students.add(new Student("Maria Perechrest",new Knowledge(2)));
        students.add(new Student("Maria Hanzo",new Knowledge(5)));
        students.add(new Student("Pablo Renji",new Knowledge(1)));
        return students;
    }
}
