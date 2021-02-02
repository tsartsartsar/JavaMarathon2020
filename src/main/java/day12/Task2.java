package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int count = 0;
        while (count <= 30){
            if (count % 2 == 0)
                numbers.add(count);
            count++;
        }
        count = 300;
        while (count <= 350){
            if (count % 2 == 0)
                numbers.add(count);
            count++;
        }
        System.out.println(numbers);
    }
}
