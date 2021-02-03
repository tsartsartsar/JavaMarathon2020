package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("loggy");
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            if (numbers.length != 10){
                throw new IllegalArgumentException();
            }
            printSumDigits(file);
        }
        catch (FileNotFoundException e){
            System.out.println("Файл чисел не найден.");
        }
        catch (IllegalArgumentException e){
            System.out.println("Неккоректный файл чисел.");
        }
    }

    public static void printSumDigits(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");

        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        System.out.println(sum);
    }
}
