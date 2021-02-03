package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
//        createFixedFileShoes();
        writeMissingShoes();
    }

    public static void writeMissingShoes(){
        File originalShoes = new File("src/main/resources/shoes.csv");

        try{
            Scanner scanner = new Scanner(originalShoes);
            PrintWriter pw = new PrintWriter("src/main/resources/missing_shoes.txt");
            while (scanner.hasNextLine()){
                String[] shoesLine = scanner.nextLine().split(";");
                if (Integer.parseInt(shoesLine[2]) == 0){
                    pw.println(shoesLine[0] + ", " + shoesLine[1] + ", " + shoesLine[2]);
                }
            }
            pw.close();
            scanner.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Файл 'shoes.csv' не найден.\nКод ошибки: 1 (сообщите в поддержку для помощи: ***)");
        }
    }

    public static void createFixedFileShoes() throws IOException {
        File dir = new File("src/main/resources");
        dir.mkdirs();
        File tmp = new File(dir, "missing_shoes.txt");
        tmp.createNewFile();
    }
}
