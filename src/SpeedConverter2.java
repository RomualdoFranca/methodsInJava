public class SpeedConverter2 {
    public static void main(String[] args) {

        System.out.println(toMilesPerHour(25.42));
        printConversion(25.42);

    }
    public static long toMilesPerHour(double kilometerPerHour) {
        if (kilometerPerHour >= 0) {
            return Math.round(kilometerPerHour / 1.609);
        } else {
            return -1;
        }
    }

    public static void printConversion(double kilometerPerHour) {

        if (toMilesPerHour(kilometerPerHour) >= 0) {
            System.out.println(kilometerPerHour + " km/h = " + toMilesPerHour(kilometerPerHour) + " mi/h");
        }else {
            System.out.println("Invalid value");
        }
    }
}

