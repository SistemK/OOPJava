package gb_oop_java.sem5.hw.controller;

import gb_oop_java.sem5.hw.model.StudeGroup;
import gb_oop_java.sem5.hw.model.Student;
import gb_oop_java.sem5.hw.model.Teacher;
import gb_oop_java.sem5.hw.model.User;
import gb_oop_java.sem5.hw.service.GroupService;
import gb_oop_java.sem5.hw.service.UserService;
import gb_oop_java.sem5.hw.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private UserService userService;
    private GroupService groupService;
    private StudentView studentView;

    public Controller() {
        this.userService = new UserService();
        this.studentView = new StudentView();
        this.groupService = new GroupService();
    }

    public Student createStudent(Student student) {
        return (Student) userService.create(student);
    }

    public Teacher createTeacher(Teacher teacher) {
        return (Teacher) userService.create(teacher);
    }

    public StudeGroup createGroup(Integer num, Teacher teacher, Student... students) {
        return groupService.CreateGroup(num, teacher, students);
    }

    public void printStudents(Student student) {
        studentView.printStudent(student);
    }

    public List<User> returnStudents() {
        return userService.read();
    }
}
