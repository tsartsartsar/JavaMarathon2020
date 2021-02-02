package day10;

public class Main {
    public static void main(String[] args) {
        BinTree binTree = new BinTree();
        binTree.add(20);
        binTree.add(14);
        binTree.add(23);
        binTree.add(11);
        binTree.add(16);
        binTree.add(22);
        binTree.add(27);
        binTree.add(5);
        binTree.add(15);
        binTree.add(18);
        binTree.add(24);
        binTree.add(150);
        binTree.add(8);
        System.out.println(binTree.getSize());
    }
}
