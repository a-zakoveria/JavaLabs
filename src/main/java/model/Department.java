package model;

import java.util.List;
import java.util.Objects;

// Клас, що представляє кафедру
public class Department {
    private String name; // Назва кафедри
    private Human head; // Голова кафедри
    private List<Group> groups; // Список груп

    public Department(String name, Human head, List<Group> groups) {
        this.name = name;
        this.head = head;
        this.groups = groups;
    }

    // Геттери
    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    public List<Group> getGroups() {
        return groups;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Department that = (Department) obj;
        return name.equals(that.name) &&
                head.equals(that.head) &&
                groups.equals(that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head, groups);
    }
}
