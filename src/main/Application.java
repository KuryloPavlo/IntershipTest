package main;

import database.StudentsDataBase;
import database.StudentsDatabaseHardcode;
import institution.University;
import institution.interlink.Internship;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        StudentsDataBase db = new StudentsDatabaseHardcode();
        university.setStudents(db.fetchStudents());
        Internship internship = new Internship("Interlink");
        internship.selectStudents(university.getStudents(), university.getAvarageMark());

        System.out.println("List of University students");
        System.out.println(university.printStudents());
        System.out.println("======================");

        System.out.println("List of internship's students:");
        System.out.println(internship.printStudents());
        System.out.println("=====================");
    }
}
