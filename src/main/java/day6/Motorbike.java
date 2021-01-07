package day6;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public void info(){
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int randomYear){
        int count = 0;
        if (randomYear > year)
            count = randomYear - year;
        else if (year > randomYear)
            count = year - randomYear;
        return count;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
