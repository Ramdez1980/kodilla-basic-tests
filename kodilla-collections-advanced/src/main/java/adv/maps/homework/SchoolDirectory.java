package adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {
        Map<School, Principal> schools = new HashMap<>();

        School first = new School("Szkola Podstawowa im. Konstantego Ildefonsa Galczynskiego ", "Balkonowa 4, 03-329 Warszawa ", Arrays.asList(15, 13, 16, 18, 19, 21));
        School second = new School("Szkola Podstawowa im. Elizy Orzeszkowej ", "Suwalska 29, 03-252 Warszawa ", Arrays.asList(17, 18, 19, 11, 12, 13));

        Principal jan = new Principal("Jan", "Nowak");
        Principal alicja = new Principal("Alicja", "Przytulska");

        schools.put(first, jan);
        schools.put(second, alicja);

        for (Map.Entry<School, Principal> school : schools.entrySet()) {
            String schoolDescription = school.getValue() + " -> " + school.getKey().getDescription();
            System.out.println(schoolDescription);
        }
    }
}
