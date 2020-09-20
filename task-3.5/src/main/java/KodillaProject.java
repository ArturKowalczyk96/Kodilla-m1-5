import java.util.*;

public class KodillaProject {
    public static void main(String[] args) throws java.lang.Exception{

        System.out.println("\nPart 1\n");
        List<Book> linkedList = new LinkedList<>();

        for (int n=0; n<200000; n++){
            Random randomT = new Random();
            Random randomA = new Random();
            linkedList.add(new Book(randomT.nextInt(400), randomA.nextInt(1000)));
        }
        System.out.println("Size of list: " + linkedList.size());

        long begin = System.nanoTime();
        linkedList.remove(linkedList.size()-1);
        long end = System.nanoTime();
        // Displaying time of the delete last element operation
        System.out.println("Removing last element has taken: " + (end - begin) + "ns");

        begin = System.nanoTime();
        linkedList.remove(0);
        end = System.nanoTime();
        // Displaying time of the delete first element operation
        System.out.println("Removing first element has taken: " + (end - begin) + "ns");

        begin = System.nanoTime();
        linkedList.add(linkedList.size(), new Book(1,2));
        end = System.nanoTime();
        // Displaying time of the adding last element operation
        System.out.println("Adding last element has taken: " + (end - begin) + "ns");

        begin = System.nanoTime();
        linkedList.add(0, new Book(2,3));
        end = System.nanoTime();
        // Displaying time of the adding first element operation
        System.out.println("Adding first element has taken: " + (end - begin) + "ns");
        System.out.println("Size of list: " + linkedList.size());

        //Part 2
        System.out.println("\nPart 2\n");
        Map<Key, Book> bookMap = new HashMap<>();
        for (int n=0; n<86650; n++){
            Random randomT = new Random();
            Random randomA = new Random();
            Random randomK = new Random();
            bookMap.put(new Key(randomK.nextInt(400)), new Book(randomT.nextInt(500), randomA.nextInt(200)));
        }
        System.out.println("Size map: " + bookMap.size());

        begin = System.nanoTime();
        Random randomK = new Random();
        bookMap.get(new Key(randomK.nextInt(400)));
        end = System.nanoTime();
        // Displaying time of the getting element operation
        System.out.println("Getting random element has taken: " + (end - begin) + "ns");

        begin = System.nanoTime();
        bookMap.remove(new Key(randomK.nextInt(400)));
        end = System.nanoTime();
        // Displaying time of the delete element operation
        System.out.println("Rmoving random element has taken: " + (end - begin) + "ns");

        begin = System.nanoTime();
        Random randomT = new Random();
        Random randomA = new Random();
        bookMap.put(new Key(randomK.nextInt(400)), new Book(randomT.nextInt(500), randomA.nextInt(200)));
        end = System.nanoTime();
        // Displaying time of the adding element operation
        System.out.println("Adding element has taken: " + (end - begin) + "ns");
        System.out.println("\n Size of map: " + bookMap.size());
        /*
        begin = System.nanoTime();
        bookMap.clear();
        end = System.nanoTime();
        // Displaying time of the clearing operation
        System.out.println("Clearing map has taken: " + (end - begin) + "ns");
        System.out.println("Size of map: " + bookMap.size());
        */
    }
}
