public class List {
    private Node head;
    private int size;
    private Node ptr;

    public List() {
        size = 0;
        head = null;
        reset();
    }

    public void prepend(Object o) {
        if (o instanceof Integer) {
            head = new Node((Integer) o, head);
            size++;
        }
    }

    public int getSize() {
        return size;
    }

    public Integer next() {
        if (ptr != null) {
            Integer result = ptr.data;
            ptr = ptr.next;
            return result;
        } else return null;
    }

    public void reset() {
        ptr = head;
    }

}
