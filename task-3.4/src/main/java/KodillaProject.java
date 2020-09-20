import java.util.ArrayDeque;
import java.util.Random;

public class KodillaProject {
    public static void main (String[] args) throws java.lang.Exception{

        //prat 1
        //random number betwin 1 and 50 of "a" string generator
        ArrayDeque<String> dqListA = new ArrayDeque<String>();
        ArrayLenghtTester arrayTester = new ArrayLenghtTester();
        for (int t=0; t<50; t++){
            String createA = "";
            Random randomAGen = new Random();
            int r = randomAGen.nextInt(50) + 1;
            System.out.println("Number of repetition of \"a\": " + r);
            for (int k=0; k < r; k++){
                createA = createA.concat("a");
            }
            System.out.println(createA);
            System.out.println("!\t Length of \"a\" string is: " + createA.length());
            dqListA.add(createA);
        }
        System.out.println();
        System.out.println("Size of stock is: " + dqListA.size());
        System.out.println();
        System.out.println();
        arrayTester.printing(dqListA);
        System.out.println("Size of stock is: " + dqListA.size());
    }
}
