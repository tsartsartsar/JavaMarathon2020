package day8;

public class Task1 {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.print(i + " ");
        }
        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;
        System.out.println();
        System.out.println(timeConsumedMillis1);

        System.out.println();

        long start2 = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            builder.append(i + " ");
        }
        System.out.println(builder.toString());
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;
        System.out.println(timeConsumedMillis2);
    }
}
