package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File nameFile = new File("numbers");
        printResult(nameFile);
    }

    public static void printResult(File nameFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(nameFile);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");

        double average = 0d;
        for (String number : numbers) {
            average += Double.parseDouble(number);
        }
        average = average/numbers.length;
        String formattedAverage = new DecimalFormat("#0.000").format(average);
        System.out.println(average + " --> " + formattedAverage);
    }
}

