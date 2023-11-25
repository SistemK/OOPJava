package gb_oop_java.sem5.hw;

import gb_oop_java.sem5.hw.controller.Controller;
import gb_oop_java.sem5.hw.model.StudeGroup;
import gb_oop_java.sem5.hw.model.Student;
import gb_oop_java.sem5.hw.model.Teacher;

public class Main {
    public static void main(String[] args) {
        Controller controller =  new Controller();
        Student student = controller.createStudent(new Student("Иван", "Иванов", 2001));
        Student student2 = controller.createStudent(new Student("Петр", "Петров", 2002));
        Student student3 = controller.createStudent(new Student("Василий", "Хрюнов", 2002));
        Student student4 = controller.createStudent(new Student("Алексей", "Хрюнов", 2001));
        Teacher teacher = controller.createTeacher(new Teacher("Михаил", "Цирков", 1984));
        Teacher teacher2 = controller.createTeacher(new Teacher("Максим", "Орлов", 1971));
        StudeGroup group123 = controller.createGroup(123, teacher, student, student2);
        StudeGroup group413 = controller.createGroup(413, teacher2, student3, student4);
        System.out.println(group123.toString());
        System.out.println(group413.toString());

//        controller.printStudents(student);
//        System.out.println(controller.returnStudents());
    }
}
