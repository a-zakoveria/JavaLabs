package model;

import java.util.List;
import java.util.Objects;

// Клас, що представляє факультет
public class Faculty {
    private String name; // Назва факультету
    private Human head; // Голова факультету
    private List<Department> departments; // Список кафедр

    public Faculty(String name, Human head, List<Department> departments) {
        this.name = name;
        this.head = head;
        this.departments = departments;
    }

    // Геттери
    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    public List<Department> getDepartments() {
        return departments;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Faculty that = (Faculty) obj;
        return name.equals(that.name) &&
                head.equals(that.head) &&
                departments.equals(that.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head, departments);
    }

}