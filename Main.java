public class Main {
    public static void main(String[] args) {
        RBTree <Integer> tree = new RBTree<>();
        System.out.println(tree.add(1));
        System.out.println(tree.add(4));
        System.out.println(tree.add(8));
        System.out.println(tree.add(6));
        System.out.println(tree.add(6));
        System.out.println(tree.add(15));
        System.out.println(tree.add(100));
        System.out.println(tree.add(19));
        System.out.println("Всего нод в дереве = " + tree.counter());
    }
}