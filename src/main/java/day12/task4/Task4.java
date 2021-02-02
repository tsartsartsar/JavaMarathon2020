package day12.task4;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Suck Suckov");
        members1.add("Fuck Fuckov");
        members1.add("Dick Dickov");
        MusicBand band1 = new MusicBand("Группа 1", 1990, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Shit Shitov");
        MusicBand band2 = new MusicBand("Группа 2", 2001, members2);

        System.out.println(band1);
        System.out.println(band2);
        MusicBand.transferMembers(band1, band2);
        System.out.println(band1);
        System.out.println(band2);
        band2.printMembers();
    }
}
