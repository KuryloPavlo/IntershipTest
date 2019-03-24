package institution.interlink;

import person.Student;

import java.util.ArrayList;

public class Internship {

    private String name;
    private ArrayList<Student> students;

    public Internship(String name) {
        this.students = new ArrayList<>();
        this.name = name;
    }

    public void selectStudents(ArrayList<Student> students, double avarageMark){
        for (Student student : students) {
            if (student.getKnowledge().getLevel() > avarageMark) {
                this.students.add(student);
            }
        }
    }

    public String printStudents() {
        StringBuilder studentsList = new StringBuilder();
        for (Student student : this.students) {
            studentsList.append(student.toString()).append("\n");
        }
        return studentsList.toString();
    }
}
