public class DecimalComparator {
    public static void main(String[] args) {
        boolean equalNum = areEqualByThreeDecimalPlaces(-3.1756, -3.1757);
        System.out.println(equalNum);
    }
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {

        if (number1 >= number2) {

            if (number1 - number2 <= 0.0009 || number1 - number2 <= -0.0009) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
