package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Группа 1", 1950);
        MusicBand band2 = new MusicBand("Группа 2", 1960);
        MusicBand band3 = new MusicBand("Группа 3", 1970);
        MusicBand band4 = new MusicBand("Группа 4", 1980);
        MusicBand band5 = new MusicBand("Группа 5", 1990);
        MusicBand band6 = new MusicBand("Группа 6", 2000);
        MusicBand band7 = new MusicBand("Группа 7", 2010);
        MusicBand band8 = new MusicBand("Группа 8", 2020);
        MusicBand band9 = new MusicBand("Группа 9", 2021);
        MusicBand band10 = new MusicBand("Группа 10", 2021);

        List<MusicBand> bands = new ArrayList<>();
        bands.add(band1);
        bands.add(band2);
        bands.add(band3);
        bands.add(band4);
        bands.add(band5);
        bands.add(band6);
        bands.add(band7);
        bands.add(band8);
        bands.add(band9);
        bands.add(band10);

        Collections.shuffle(bands);

        System.out.println(bands);

        System.out.println(groupsAfter2000(bands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> bandsNew = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000)
                bandsNew.add(band);
        }
        return bandsNew;
    }
}
