import java.util.Random;

public class WhileLoopSumsRace {
    public static void main (String[] args) {

        //sumA and sumB
        int sumA = 100;
        int sumB = 0;
        //Try counter
        int tryCounter = 0;
        //check if sumA > sumB
        boolean checkAB = false;
        //random generators
        Random randomForA = new Random();
        Random randomForB = new Random();
        while (!checkAB){
            tryCounter++;
            System.out.println("Checking if SumA is biger than SumB [attempt # " + tryCounter + "]");
            System.out.println("SumA = " + sumA + " and SumB = " + sumB);
            int a = randomForA.nextInt(10);
            sumA = sumA + a;
            int b = randomForB.nextInt(50);
            sumB = sumB + b;
            System.out.println("Random no. for SumA: +" + a);
            System.out.println("Random no. for SumB: +" + b);
            System.out.println("SumA = " + sumA + " and SumB = " + sumB);

            if (sumA < sumB){
                checkAB = true;
            }
        }
        System.out.println();
        System.out.println("SumA = " + sumA + " is no longer biger then SumB = " + sumB);
    }
}
