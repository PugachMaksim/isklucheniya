package lesson2.iskl;

public class zadanie2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[]intArray = {1, 2, 45, 486, 4, 21, 47, 42, 74};
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
