package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> member) {
        this.name = name;
        this.year = year;
        this.members = member;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> member) {
        this.members = member;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2){
        for (MusicArtist member : musicBand1.getMembers()) {
            musicBand2.getMembers().add(member);
        }
        musicBand1.getMembers().clear();
    }

    public void printMembers(){
        System.out.println(this.members);
    }

    @Override
    public String toString() {
        return  name + ", " + year + ", " + members;
    }
}
