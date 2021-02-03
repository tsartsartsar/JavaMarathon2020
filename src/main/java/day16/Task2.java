package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
//        createFiles();
//        fillingFile1();
//        fillingFile2();
        sumAverage();
    }

    public static void sumAverage() throws FileNotFoundException {
        File file2 = new File("file2.txt");
        Scanner scanner = new Scanner(file2);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        double sumAvg = 0.0d;
        for (String number : numbers) {
            sumAvg += Double.parseDouble(number);
        }
        System.out.println( (int) sumAvg);
    }

    public static void fillingFile2() throws FileNotFoundException {
        File file1 = new File("file1.txt");
        Scanner scanner = new Scanner(file1);
        File file2 = new File("file2.txt");
        PrintWriter pw = new PrintWriter(file2);

        int counter = 0;
        int sum = 0;
        while (scanner.hasNextLine()){
            sum += Integer.parseInt(scanner.nextLine());
            counter++;
            if (counter == 20){
                pw.print((sum / 20.0) + " ");
                counter = 0;
                sum = 0;
            }
        }
        pw.close();
    }

    public static void fillingFile1() throws FileNotFoundException {
        File file1 = new File("file1.txt");
        PrintWriter pw = new PrintWriter(file1);
        for (int i = 0; i < 100; i++) {
            int min = 0;
            int max = 100;
            int diff = max - min;
            Random random = new Random();
            int number = random.nextInt(diff + 1);
            number += min;
            pw.println(number);
        }
        pw.close();
    }

    public static void createFiles() throws IOException {
        File file1 = new File("file1.txt");
        file1.createNewFile();
        File file2 = new File("file2.txt");
        file2.createNewFile();
    }
}
