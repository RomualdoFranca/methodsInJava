public class SpeedConverter2 {
    public static void main(String[] args) {

        System.out.println(toMilesPerHour(345.50));

    }
    public static long toMilesPerHour(double kilometerPerHour) {
        if (kilometerPerHour >= 0) {
            return Math.round(kilometerPerHour / 1.609);
        } else {
            return -1;
        }
//        public static void printConversion(double kilometerPerHour) {
//            double milesPerHour = kilometerPerHour * 1.609;
//            System.out.println(kilometerPerHour + "km/h = " );
//        }
    }

}

