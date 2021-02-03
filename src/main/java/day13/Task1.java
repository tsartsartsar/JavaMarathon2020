package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Bob");
        User user2 = new User("Robin");
        User user3 = new User("Marry");

        user1.sendMessage(user2, "hello Robin!");
        user2.sendMessage(user1, "hi");
        user1.sendMessage(user2, "what you doing?");
        user2.sendMessage(user1, "i read.");

        user1.sendMessage(user3, "hi, Robin is reading");
        user3.sendMessage(user1, "okay, i'm starting to spam");

        user3.sendMessage(user2, "OLOLOLOLOLLOLOLOLOLOOLOOLOLLOLOLOLOL");
        user2.sendMessage(user3, "please, stop!");

        MessageDatabase.showDialog(user1, user2);
        System.out.println();
//        System.out.println(MessageDatabase.getMessages());
        System.out.println(user1.getSubscriptions());
        System.out.println(user1.isSubscribed(user2));
        user1.subscribe(user2);
        System.out.println(user1.getSubscriptions());
        System.out.println(user1.isSubscribed(user2));
        System.out.println(user1.isFriend(user2));
        user2.subscribe(user1);
        System.out.println(user1.isFriend(user2));
    }
}
