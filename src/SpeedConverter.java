public class SpeedConverter {
    public static void main(String[] args) {


    }
    public static long toMilesPerHour(double kilometersPerHour) {
        long longKilometer = (long)Math.round(kilometersPerHour * 0.621371);
        return longKilometer;
    }
}
