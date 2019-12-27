import Exceptions.EmptyListException;

public class ed_02_main {

    public static void main(String[] args) throws EmptyListException {
        LinkedList<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.addFirst(4);
        a.addLast(4);
        a.print();

        System.out.println("-----------");
       a.addLast(4);
        a.print();
    }
}
