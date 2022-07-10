import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        System.out.println("Digite um numero qualquer: ");
        int num = sc.nextInt();
        boolean isEven = ((num % 2) == 0);
        if (isEven) {
            System.out.printf("O numero %d é par", num);
        }else {
            System.out.printf("O numero %d não é par", num);

        }

        sc.close();


    }
}
