public class Euklides {
    public static void main (String[] args) {

        int a = 5625;
        int b = 465;
        int nWD = 1;

        while (nWD != 0){
            nWD = a % b;
            if ( nWD != 0){
                System.out.println("New a: " + a + " new b: " + b);
                nWD = a % b;
                System.out.println("Rest from division: " + nWD);
                a = b;
                b = nWD;
            } else {
                System.out.println("Last a: " + a + " last b: " + b);
                System.out.println("Rest from division: " + nWD);
            }
        }
        System.out.println("Bigest common divider is: " + b);
    }
}
