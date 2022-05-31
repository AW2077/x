public class Main {
    public static void main(String[] args) {
        List list = new List();

        list.prepend(4);
        list.prepend(3);
        list.prepend(7);
        list.prepend(2);
        list.prepend(3);
        list.prepend(4);
        list.prepend(7);

        list.reset();
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.next());
        }
    }
}
