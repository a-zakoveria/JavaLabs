package model;

import java.util.Objects;

// Клас, що представляє людину
public class Human {
    private String firstName;
    private String lastName;
    private String middleName;
    private Sex gender;

    // Конструктор
    public Human(String firstName, String lastName, String middleName, Sex gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.gender = gender;
    }

    // Геттери
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Sex getGender() {
        return gender;
    }

    // Методи equals і hashCode
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Human that = (Human) obj;
        return firstName.equals(that.firstName) &&
                lastName.equals(that.lastName) &&
                middleName.equals(that.middleName) &&
                gender == that.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName, gender);
    }
}
