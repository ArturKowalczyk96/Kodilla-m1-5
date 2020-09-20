import java.util.HashSet;
import java.util.Set;

public class Kodilla {
    public static void main (String[] args) {

        Book book1 = new Book("asd", "we ew", 1234);
        Book book2 = new Book("wer", "tw wr", 1652);
        Book book3 = new Book("wey", "wr cv", 1978);
        Book book4 = new Book("wey", "wr cv", 1978);

        Set<Book> booksSet = new HashSet<>();
        System.out.println("\nSize of books set: " + booksSet.size());
        booksSet.add(book1);
        booksSet.add(book2);
        booksSet.add(book3);
        booksSet.add(book4);
        for (Book theBook: booksSet){
            System.out.println(theBook);
        }
        System.out.println("Size of books set: " + booksSet.size());



        Order order1 = new Order(book1, 1, 2020, 9, 1);
        Order order2 = new Order(book2, 2, 2020, 9, 1);
        Order order3 = new Order(book3, 3, 2020, 9, 2);
        Order order4 = new Order(book3, 3, 2020, 9, 2);
        Order order5 = new Order(book1, 4, 2020, 9, 2);

        Set<Order> ordersSet = new HashSet<>();
        System.out.println("\nSize of orders set: " + ordersSet.size());
        ordersSet.add(order1);
        ordersSet.add(order2);
        ordersSet.add(order3);
        ordersSet.add(order4);
        ordersSet.add(order5);
        for (Order theOrder: ordersSet){
            System.out.println("\n" + theOrder);
        }
        System.out.println("\nSize of orders set: " + ordersSet.size());
    }
}
