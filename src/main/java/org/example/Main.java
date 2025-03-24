import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Підключення до бази даних
        String url = "jdbc:mysql://localhost:3306/universitydb";
        String user = "anna";  // користувач
        String password = "annann12032003";  // пароль

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть місяць для пошуку студентів (1-12): ");
        int month = scanner.nextInt();  // Вводимо номер місяця для пошуку

        // SQL-запит для вибору студентів, народжених у зазначений місяць
        String query = "SELECT * FROM Students WHERE MONTH(birth_date) = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(query)) {

            // Підставляємо номер місяця в запит
            statement.setInt(1, month);
            ResultSet resultSet = statement.executeQuery();

            // Виводимо результати
            boolean hasResults = false;
            System.out.println("Студенти, народжені в місяці " + month + ":");
            while (resultSet.next()) {
                hasResults = true;
                int id = resultSet.getInt("ID");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String middleName = resultSet.getString("middle_name");
                Date birthDate = resultSet.getDate("birth_date");
                String studentCardNumber = resultSet.getString("student_card_number");

                System.out.println("ID: " + id + ", Ім'я: " + firstName + " " + lastName + " " + middleName +
                        ", Дата народження: " + birthDate + ", Номер залікової книжки: " + studentCardNumber);
            }

            if (!hasResults) {
                System.out.println("Студентів, народжених у цьому місяці, не знайдено.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
