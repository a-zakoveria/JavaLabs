package model;
import java.util.Objects;
import java.util.List;

// Клас, що представляє групу
public class Group {
    private String name; // Назва групи
    private Human head; // Голова групи
    private List<Student> students; // Список студентів

    public Group(String name, Human head, List<Student> students) {
        this.name = name;
        this.head = head;
        this.students = students;
    }

    // Геттери
    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    public List<Student> getStudents() {
        return students;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Group that = (Group) obj;
        return name.equals(that.name) &&
                head.equals(that.head) &&
                students.equals(that.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head, students);
    }

}