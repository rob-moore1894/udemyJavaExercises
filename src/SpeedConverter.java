public class SpeedConverter {

//    Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour. This method needs to return the rounded value of the calculation of type long.
    public static long toMilesPerHour(double kilometersPerHour) {
//    If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.
        if (kilometersPerHour >= 0) {
            return Math.round(kilometersPerHour/1.609);
//            Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion and rounding, check the notes in the text below.
        } else {
            return -1;
        }
    }
//    Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
//    This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
    public static void printConversion (double kilometersPerHour) {
        long mph = toMilesPerHour(kilometersPerHour);
//    Then it needs to print a message in the format "XX km/h = YY mi/h".
//    XX represents the original value kilometersPerHour.
//    YY represents the rounded milesPerHour from the kilometersPerHour parameter.
        if (mph != -1) {
            System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");
//    If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args) {
//    Examples of input/output:
        printConversion(1.609);
        printConversion(95.75);
        printConversion(0);
        printConversion(1);
    }

} // End of SpeedConverter

