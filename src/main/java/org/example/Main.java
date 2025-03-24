import java.util.Scanner; // Імпортуємо клас Scanner для зчитування даних з клавіатури
import java.util.Random;  // Імпортуємо клас Random для генерації випадкових чисел

public class Main {
    private static final int MAX_SIZE = 20; // Константа для обмеження розміру матриці
    private static final int MIN_VALUE = -100; // Мінімальне значення для випадкових чисел
    private static final int MAX_VALUE = 100;  // Максимальне значення для випадкових чисел

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Створюємо об'єкт Scanner для введення з клавіатури
        Random random = new Random(); // Створюємо об'єкт Random для випадкової генерації чисел

        // Введення розмірів матриці
        System.out.print("Введіть кількість рядків (не більше 20): ");
        int rows = scanner.nextInt(); // Зчитуємо кількість рядків
        System.out.print("Введіть кількість стовпців (не більше 20): ");
        int cols = scanner.nextInt(); // Зчитуємо кількість стовпців

        if (rows > MAX_SIZE || cols > MAX_SIZE || rows <= 0 || cols <= 0) {
            System.out.println("Неправильні розміри матриці. Завершення програми.");
            return; // Завершуємо програму, якщо розмір неправильний
        }

        int[][] matrix = new int[rows][cols]; // Оголошуємо двовимірний масив для матриці

        // Вибір способу заповнення матриці
        System.out.print("Оберіть спосіб заповнення матриці (1 - вручну, 2 - випадково): ");
        int choice = scanner.nextInt(); // Зчитуємо вибір користувача

        if (choice == 1) {
            fillMatrixManually(scanner, matrix); // Викликаємо метод заповнення вручну
        } else {
            fillMatrixRandomly(random, matrix); // Викликаємо метод випадкового заповнення
        }

        printMatrix(matrix); // Виводимо матрицю на екран

        int min = findMin(matrix); // Знаходимо мінімальний елемент
        int max = findMax(matrix); // Знаходимо максимальний елемент
        double average = calculateArithmeticMean(matrix); // Обчислюємо середнє арифметичне
        double geometricMean = calculateGeometricMean(matrix); // Обчислюємо середнє геометричне

        // Виводимо результати
        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
        System.out.println("Середнє арифметичне: " + average);
        System.out.println("Середнє геометричне: " + geometricMean);
    }

    // Метод для заповнення матриці вручну
    private static void fillMatrixManually(Scanner scanner, int[][] matrix) {
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt(); // Зчитуємо кожен елемент
            }
        }
    }

    // Метод для випадкового заповнення матриці
    private static void fillMatrixRandomly(Random random, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE; // Генеруємо випадкове число
            }
        }
    }

    // Метод для виведення матриці на екран
    private static void printMatrix(int[][] matrix) {
        System.out.println("Матриця:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " "); // Виводимо кожен елемент
            }
            System.out.println(); // Перехід на новий рядок
        }
    }

    // Метод для знаходження мінімального елемента
    private static int findMin(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num < min) {
                    min = num; // Оновлюємо мінімальне значення
                }
            }
        }
        return min;
    }

    // Метод для знаходження максимального елемента
    private static int findMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num > max) {
                    max = num; // Оновлюємо максимальне значення
                }
            }
        }
        return max;
    }

    // Метод для обчислення середнього арифметичного
    private static double calculateArithmeticMean(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num; // Додаємо елемент до суми
                count++; // Збільшуємо лічильник елементів
            }
        }
        return (double) sum / count; // Ділимо суму на кількість елементів
    }

    // Метод для обчислення середнього геометричного
    private static double calculateGeometricMean(int[][] matrix) {
        double product = 1.0;
        int count = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                product *= Math.abs(num) + 1; // Використовуємо модуль числа, щоб уникнути нуля або від'ємних значень
                count++;
            }
        }
        return Math.pow(product, 1.0 / count) - 1; // Обчислюємо корінь ступеня count
    }
}
