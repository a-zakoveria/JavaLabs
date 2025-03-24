package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

// Клас для запуску програми
public class Run {
    public static void main(String[] args) {
        Run run = new Run();

        // Створення двох університетів
        University university1 = run.createTypicalUniversity();
        University university2 = run.createTypicalUniversity();

        // Виведення інформації про університети
        System.out.println(university1);
        System.out.println(university2);

        // Порівняння університетів
        System.out.println("Університети рівні: " + university1.equals(university2));
    }

    // Метод для створення типового університету
    public University createTypicalUniversity() {
        StudentCreator studentCreator = new StudentCreator();
        GroupCreator groupCreator = new GroupCreator();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        FacultyCreator facultyCreator = new FacultyCreator();
        UniversityCreator universityCreator = new UniversityCreator();

        // Створення різних людей для керівних посад
        Student rector = studentCreator.createStudent("John", "Smith", "Middle", Sex.MALE);
        Student dean = studentCreator.createStudent("Alice", "Brown", "Middle", Sex.FEMALE);
        Student departmentHead = studentCreator.createStudent("Michael", "Davis", "Middle", Sex.MALE);
        Student groupHead = studentCreator.createStudent("Sophia", "Wilson", "Middle", Sex.FEMALE);

        // Створення студентів
        Student student1 = studentCreator.createStudent("Tomas", "Jonson", "Middle", Sex.MALE);
        Student student2 = studentCreator.createStudent("Anna", "Zakoverya", "Middle", Sex.FEMALE);

        // Створення групи
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        Group group = groupCreator.createGroup("Group 122-21-3", groupHead, students);

        // Створення кафедри
        List<Group> groups = new ArrayList<>();
        groups.add(group);
        Department department = departmentCreator.createDepartment("Department1", departmentHead, groups);

        // Створення факультету
        List<Department> departments = new ArrayList<>();
        departments.add(department);
        Faculty faculty = facultyCreator.createFaculty("Faculty of Technology", dean, departments);

        // Створення університету
        List<Faculty> faculties = new ArrayList<>();
        faculties.add(faculty);
        return universityCreator.createUniversity("NTU DP", rector, faculties);
    }
}
