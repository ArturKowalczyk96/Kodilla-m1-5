import java.util.*;

public class Program {
    public static void main (String[] args) throws java.lang.Exception{

        Clock clock1 = new Clock(17, 12);
        Clock clock2 = new Clock(17, 45);
        Clock clock3 = new Clock(12, 12);
        Clock clock4 = new Clock(03, 42);
        Clock clock5 = new Clock(12, 57);
        Clock clock6 = new Clock(02, 59);

        List<Clock> clocks = new LinkedList<>();
        clocks.add(clock1);
        clocks.add(clock2);
        clocks.add(clock3);
        clocks.add(clock4);
        clocks.add(clock5);
        clocks.add(clock6);

        for (Clock clockSet: clocks){
            System.out.println(clockSet);
        }
        System.out.println();
        for (int k=0; k < clocks.size(); k++){
            clocks.get(k).addOneMinute();
        }
    }
}
