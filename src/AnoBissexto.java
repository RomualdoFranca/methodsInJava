import java.util.Scanner;

public class AnoBissexto {

    /*  1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
        2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
        3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
        4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
        5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        System.out.println("Digite o ano:");
        int ano = sc.nextInt();
        boolean anoDivPor4 = ano % 4 == 0;
        boolean anoDivPor4E100 =  (anoDivPor4 || ano % 100 == 0);
        boolean anoDivPor4E100_400 =  (anoDivPor4E100 && ano % 400 == 0);


        if (anoDivPor4 || anoDivPor4E100 && anoDivPor4E100_400) {
            System.out.printf("%d é bissexto", ano);
        }else {
            System.out.printf("%d não é bissexto", ano);
        }
        sc.close();
    }
}
