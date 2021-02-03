package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList());
    }

    public static List<String> parseFileToStringList() {
        File file = new File("people");
        List<String> list = new ArrayList<>();

        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] peopleAge = line.split(" ");
                if (Integer.parseInt(peopleAge[1]) < 0){
                    throw new IllegalArgumentException();
                }
                list.add(line);
            }
            return list;
        }
        catch (FileNotFoundException e){
            System.out.println("Файл 'people' не найден.\nКод ошибки: 1 (сообщите в поддержку для помощи: ***)");
        }
        catch (IllegalArgumentException e){
            System.out.println("Некорректное содержимое файла 'people'.\nКод ошибки: 2 (сообщите в поддержку для помощи: ***)");
        }
        return null;
    }
}
