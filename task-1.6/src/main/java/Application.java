public class Application {
    public static void main (String[] args) throws java.lang.Exception
    {

        StempColection stemp = new StempColection();
        StempColection stemp1 = new StempColection();
        int result = stemp.hashCode();
        int result1 = stemp1.hashCode();
        int result2 = stemp1.hashCode();

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
