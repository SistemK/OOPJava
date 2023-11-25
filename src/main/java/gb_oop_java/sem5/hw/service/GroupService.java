package gb_oop_java.sem5.hw.service;

import gb_oop_java.sem5.hw.model.StudeGroup;
import gb_oop_java.sem5.hw.model.Student;
import gb_oop_java.sem5.hw.model.Teacher;

import java.util.ArrayList;


public class GroupService {

    public StudeGroup CreateGroup(Integer num, Teacher teacher, Student... students) {
        ArrayList<Student> listStudents = new ArrayList<>();
        for (Student student : students) {
            listStudents.add(student);
        }
        return new StudeGroup(num, teacher, listStudents);
    }
}
