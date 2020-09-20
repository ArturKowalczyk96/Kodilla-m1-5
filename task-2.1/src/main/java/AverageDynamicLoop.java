public class AverageDynamicLoop {
    public static void main (String[] args) throws java.lang.Exception{
        int[] numbers = new int[20];
        numbers[0] = 4;
        numbers[1] = 42;
        numbers[2] = 52;
        numbers[3] = 1;
        numbers[4] = 44;
        numbers[5] = 75;
        numbers[6] = 8;
        numbers[7] = 13;
        numbers[8] = 20;
        numbers[9] = 42;
        numbers[10] = 78;
        numbers[11] = 78;
        numbers[12] = 38;
        numbers[13] = 24;
        numbers[14] = 48;
        numbers[15] = 85;
        numbers[16] = 75;
        numbers[17] = 99;
        numbers[18] = 49;
        numbers[19] = 75;
        for(int i=0; i < numbers.length; i++){
            System.out.println("The number of the elements of the array [" + i + "] = " + numbers[i]);
        };
        int sum =0;
        for(int a=0; a<numbers.length; a++){
            sum = sum + numbers[a];
        };
        double sum1 = sum;
        double length = numbers.length;
        double average = sum1 / length;
        System.out.println("Average of the numbers in array is: " + average + ". Sum of numbers is: "+ sum + ". And there is " + numbers.length + " numbers.");
    }
}
