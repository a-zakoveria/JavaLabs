package manager;

import com.google.gson.Gson;
import model.University;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class JsonManager {

    // Метод для запису університету в файл у форматі JSON
    public void writeUniversityToJson(University university, String filename) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(filename)) {
            gson.toJson(university, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для зчитування університету з файлу JSON
    public University readUniversityFromJson(String filename) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(filename)) {
            return gson.fromJson(reader, University.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
