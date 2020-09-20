import java.util.ArrayDeque;
import java.util.ArrayList;

public class ArrayLenghtTester {
    ArrayList<String> evenArray = new ArrayList<String>();
    ArrayList<String> oddArray = new ArrayList<String>();

    //langth check
    public void printing(ArrayDeque<String> dqListA){
        int dl = dqListA.size();
        for (int n=0; n < dl; n++){
            String l = dqListA.poll();
            if (l.length() % 2 == 0){
                evenArray.add(l);
                System.out.println("This is even. It has: " + l.length() + " elements of a: "+ l);
            } else {
                oddArray.add(l);
                System.out.println("This is odd. It has: " + l.length() + " elements of a: " + l);
            }
        }

        System.out.println();
        System.out.println("Odd list contains: " + oddArray.size() + " elements");
        for (String oddA: oddArray){
            System.out.println("Odd elements are: " + oddA);
        }

        System.out.println();
        System.out.println("Even list contains: " + evenArray.size() + " elements");
        for (String evenA: evenArray){
            System.out.println("Even elements are: " + evenA);
        }
    }
}
