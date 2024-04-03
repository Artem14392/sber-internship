package src;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/Задача ВС Java Сбер.csv");
        List<City> records = new ArrayList<>();
        int count = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String cityStr = scanner.nextLine();
                String[] words = cityStr.split(";");
                count++;
                records.add(new City(words[1], words[2], words[3], Integer.parseInt(words[4]), words[5]));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + count);
        }

        for (City city: records){
            System.out.println(city.toString());
        }



    }
}
