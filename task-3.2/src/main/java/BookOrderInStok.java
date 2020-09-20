import java.util.ArrayDeque;
import java.util.Deque;

public class BookOrderInStok {
    public static void main (String[] args) throws java.lang.Exception{

        //Create 5 sample books
        Book theBook1 = new Book("Kwadrant przepływu pieniądza", "Robert T. Kiyosaki", 2001);
        Book theBook2 = new Book("Inwestycyjny poradnik bogatego ojca", "Robert T. Kiyosaki", 2000);
        Book theBook3 = new Book("Krav Maga", "Gershon Ben Keren", 2017);
        Book theBook4 = new Book("Analiza formacji na wykresach giełdowych", "Thomas N. Bulkowski", 2011);
        Book theBook5 = new Book("Ekstremalne przywództwo", "Jacko Willink, Leif Babin", 2020);

        //Create the LIFO stock
        Deque<Book> theBooks = new ArrayDeque<>();
        System.out.println("LIFO stock is created. It's size is: " + theBooks.size());

        theBooks.push(theBook1);
        theBooks.push(theBook2);
        theBooks.push(theBook3);
        theBooks.push(theBook4);
        theBooks.push(theBook5);
        System.out.println("LIFO stock is filled. It's size is: " + theBooks.size());

        //get object from queue
        Book temporaryBook;
        temporaryBook = theBooks.pop();
        temporaryBook = theBooks.pop();
        temporaryBook = theBooks.pop();
        temporaryBook = theBooks.pop();
        temporaryBook = theBooks.pop();

        System.out.println("LIFO stock is empty. It's size is: " + theBooks.size());
        System.out.println("Last book removed is: " + temporaryBook);

    }
}
