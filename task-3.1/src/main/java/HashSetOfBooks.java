import java.util.HashSet;

public class HashSetOfBooks {
    public static void main (String[] args) throws java.lang.Exception{

        //creating smaple books
        Book book1 = new Book("Jak zdobyć bogactwo", "Felix Dennis", 2019);
        Book book2 = new Book("Zostań drapieżnikiem", "Marcin Osman & Rafał Mazur", 2019);
        Book book3 = new Book("Czy kapitalizm jest moralny", "Andre Comte-Sponville", 2012);
        Book book4 = new Book("Why Liberty", "Tom G. Palmer", 2013);
        Book book5 = new Book("Ekonomia w jednej lekcji", "Henry Hazlitt", 1979);
        Book book6 = new Book("Capitalism and Freedom", "Milton Friedman", 2002);
        Book book7 = new Book("Ekonomia dla normalnych ludzi", "Gane Callahan", 2002);
        Book book8 = new Book("Ekonomia dla normalnych ludzi", "Gane Callahan", 2002);

        //craeting HashSet of books and filling it with objects
        HashSet<Book> booksSet = new HashSet<Book>();
        booksSet.add(book1);
        booksSet.add(book2);
        booksSet.add(book3);
        booksSet.add(book4);
        booksSet.add(book5);
        booksSet.add(book6);
        booksSet.add(book7);
        booksSet.add(book8);

        //print out every book publish befire 2010 from the set
        for (Book theBook: booksSet){
            if (theBook.getYearOfPublishing() < 2010){
                System.out.println(theBook);
            }
        }
        System.out.println(booksSet.size());
    }
}
