public class WrapperCheck {
    public static void main (String[] args) throws java.lang.Exception{

        //assigning value to base type variable
        int n = 13;
        char c = 'e';
        boolean l = true;

        //assigning the same value to corresponding Wrappers
        Integer o = 13;
        Character d = 'e';
        Boolean m = true;

        //value comparison
        if (n==o) {
            System.out.println("Base variable int is the same as its Wrapper");
        } else {
            System.out.println("Base variable int is difrent then its Wrapper");
        }

        if (c==d) {
            System.out.println("Base variable char is the same as its Wrapper");
        } else {
            System.out.println("Base variable char is difrent then its Wrapper");
        }

        if (l==m) {
            System.out.println("Base variable boolean is the same as its Wrapper");
        } else {
            System.out.println("Base variable boolean is difrent then its Wrapper");
        }
    }
}
