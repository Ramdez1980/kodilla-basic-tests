package adv.maps.homework;


import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {
        Map<School, Principal> school = new HashMap<>();

        School first = new School("Szkola Podstawowa im. Konstantego Ildefonsa Galczynskiego \n", "Balkonowa 4, 03-329 Warszawa \n", 15,13,16,18,19,21);
        School second = new School("Szkola Podstawowa im. Elizy Orzeszkowej \n",  "Suwalska 29, 03-252 Warszawa \n",17,18,19,11,12,13);

        Principal jan = new Principal ("Jan", "Nowak");
        Principal alicja = new Principal ("Alicja", "Przytulska");


        school.put(first,jan);
        school.put(second,alicja);

        for (Map.Entry<School, Principal> schoolEntryEntry : school.entrySet())
            System.out.println(schoolEntryEntry.getKey().getSchoolName()
                    + schoolEntryEntry.getKey().getSchoolAdress()
                    + "Całkowita liczba uczniów w szkole: "
                    + schoolEntryEntry.getKey().getsum()
                    + "\n" + "Dyrektorem szkoły jest: "
                    + schoolEntryEntry.getValue().getFirstName()
                    + " " + schoolEntryEntry.getValue().getLastName()
                    + "\n ________________________");

    }
}
