package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();
//        Player player7 = new Player();

        System.out.println(player1.getStamina() + " " + player2.getStamina() + " " + player3.getStamina() + " " + player4.getStamina() + " " + player5.getStamina() + " " + player6.getStamina());
        Player.info();
        for (int i = 0; i < 100; i++) {
            player1.run();
            player2.run();
        }
        System.out.println(player1.getStamina() + " " + player2.getStamina() + " " + player3.getStamina() + " " + player4.getStamina() + " " + player5.getStamina() + " " + player6.getStamina());
        Player.info();
    }
}
