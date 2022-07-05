public class BarkingDog {

    public static void main(String[] args) {
        boolean wakeUp = shouldWakeUp(true, -1);
        System.out.println(wakeUp);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfday) {
        if (hourOfday < 0 || hourOfday > 23) {
            return false;
        } else if (barking && hourOfday < 8 || hourOfday > 22) { // primeiramente escrevi barking==true, mas a IDE simplificou
            return true;
        } else {
            return false;
        }
    }
}
