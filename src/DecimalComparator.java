import java.text.DecimalFormat;

public class DecimalComparator {
//    Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber) {
        int numberA = (int) (firstNumber * 1000);
        int numberB = (int) (secondNumber * 1000);
        return numberA == numberB;
    }
//    The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
//
public static void main(String[] args) {
//    EXAMPLES OF INPUT/OUTPUT:
    System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
// should return true since numbers are equal up to 3 decimal places.
    System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
// should return false since numbers are not equal up to 3 decimal places
    System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
// should return true since numbers are equal up to 3 decimal places.
    System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
// should return false since numbers are not equal up to 3 decimal places

}
}
