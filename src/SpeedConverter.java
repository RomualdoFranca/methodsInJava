public class SpeedConverter {
    public static void main(String[] args) {
       long milesPerHour = toMilesPerHour(280);
        System.out.println(milesPerHour);

    }
    public static long toMilesPerHour(double kilometersPerHour) {
        // converte o double em long e arredonda o valor para cima
        return (long)Math.round(kilometersPerHour * 0.621371);
    }
}
