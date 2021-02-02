package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> artists1 = new ArrayList<>();
        artists1.add(new MusicArtist("Gay_Lord", 30));
        artists1.add(new MusicArtist("Don_Donni", 21));

        MusicBand band1 = new MusicBand("Gangsters", 1994, artists1);

        List<MusicArtist> artists2 = new ArrayList<>();
        artists2.add(new MusicArtist("Loco_Loco", 30));

        MusicBand band2 = new MusicBand("OG", 2003, artists2);

        System.out.println(band1);
        System.out.println(band2);

        MusicBand.transferMembers(band1, band2);

        System.out.println(band1);
        System.out.println(band2);
        band2.printMembers();
    }
}
