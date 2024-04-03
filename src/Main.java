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

        SortByName sortByName = new SortByName();
        TreeSet<City> cityTreeSet = new TreeSet<>(sortByName);
        cityTreeSet.addAll(records);

        //Сортировка списка городов по наименованию в алфавитном порядке
        for (City city: cityTreeSet){
            System.out.println(city.toString());
        }
        SortByDistric sortByDistric = new SortByDistric();
        TreeSet<City>  cityTreeSet1 = new TreeSet<>(sortByDistric);
        cityTreeSet1.addAll(records);
        //Сортировка списка городов по федеральному округу и наименованию города
        for(City city: cityTreeSet1){
            System.out.println(city.toString());
        }

    }
}
