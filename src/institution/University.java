package institution;

import person.Student;

import java.util.ArrayList;

public class University {

    private String name;
    private ArrayList<Student> students;

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void setStudents(ArrayList<Student> students){
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public double getAvarageMark(){
        double allKnowledge = 0;
        for (Student student : students) {
            allKnowledge += student.getKnowledge().getLevel();
        }
        return allKnowledge/students.size();
    }


    public String printStudents() {
        StringBuilder studentsList = new StringBuilder();
        for (Student student : this.students) {
            studentsList.append(student.toString()).append("\n");
        }
        return studentsList.toString();
    }

}
