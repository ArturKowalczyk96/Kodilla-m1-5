import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Program {
    public static void main (String[] args) {

        List<Cannon> cannons = new LinkedList<>();
        cannons.add(new Cannon(false));
        cannons.add(new Cannon(false));
        cannons.add(new Cannon(false));
        cannons.add(new Cannon(false));
        cannons.add(new Cannon(false));
        cannons.add(new Cannon(false));
        cannons.add(new Cannon(false));
        cannons.add(new Cannon(false));
        System.out.println("Number of cannons: " + cannons.size());

        for (Cannon load: cannons){
            System.out.println("Checking cannon");
            load.fire();
        }
    }
}
