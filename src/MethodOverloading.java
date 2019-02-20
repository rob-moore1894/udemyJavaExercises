public class MethodOverloading{

//TODO Create a method called calcFeetAndInchesToCentimeters that takes in two parameters (feet and inches)
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
    //TODO Validate that the first parameter is >=0
        if (feet >= 0){
    //TODO Validate that the 2nd parameter (inches) is >=0 and <=12 return -1 if false for both
            if (inches >= 0 && inches <= 12){
    //TODO calculate the centimeters and return the value
                double ftToIn = feet * 12;
                ftToIn += inches;
                System.out.println(ftToIn + " = Total Inches");
                double inToCm = ftToIn * 2.54;
                System.out.println(feet + "ft " + inches + "in = " + inToCm + "cm" );
                return inToCm;
            } return -1;
        } return -1;
    }

    //TODO Create a 2nd method of the same name with only inches as the parameter
    public static double calcFeetAndInchesToCentimeters(double inches){
    //TODO Validate that its >=0
        if (inches >=0){
    //TODO Calculate how many feet and inches
            double ft = (int) inches / 12;
            double in = inches % 12;
    //TODO Pass new values into previous method and return the centimeters
            calcFeetAndInchesToCentimeters(ft, in);
        } return -1;
    }

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(0, 6);
        System.out.println();
        calcFeetAndInchesToCentimeters(17);
    }
}
