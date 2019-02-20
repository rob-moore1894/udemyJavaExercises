public class TeenNumberChecker {
//    Write a method named hasTeen with 3 parameters of type int.
//    The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
    public static boolean hasTeen (int a, int b, int c) {
//        if (a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19){
//            return true;
//        }
//        return false;
        if (isTeen(a) || isTeen(b) || isTeen(c)){
            return true;
        }
        return false;
    }

//    Write another method named isTeen with 1 parameter of type int.
//    The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
    public static boolean isTeen(int a) {
        if (a >= 13 && a <= 19) {
            return true;
        }
        return false;
    }

//    EXAMPLES OF INPUT/OUTPUT:
    public static void main(String[] args) {
        System.out.println("hasTeen");
        System.out.println(hasTeen(9, 99, 19));  // should return true since 19 is in range 13 - 19
        System.out.println(hasTeen(23, 15, 42));  // should return true since 15 is in range 13 - 19
        System.out.println(hasTeen(22, 23, 34));  // should return false since numbers 22, 23, 34 are not in range 13-19


//    EXAMPLES OF INPUT/OUTPUT:
        System.out.println();
        System.out.println("isTeen");
        System.out.println(isTeen(9));  // should return false since 9 is in not range 13 - 19
        System.out.println(isTeen(13));  // should return true since 13 is in range 13 - 19
    }
}
