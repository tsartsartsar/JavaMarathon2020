package day6;

public class Car {
    private int year;
    private String color;
    private String model;

    public void info(){
        System.out.println("Это автомобиль");
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

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
