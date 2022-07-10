import java.util.Scanner;

public class AnoBissexto2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano:");
        int ano = sc.nextInt();
        boolean bissexto = (ano % 4 == 0 || ano % 100 == 0 && ano % 400 == 0);
        if (bissexto && ano > 0) {
            System.out.printf("%d é bissexto", ano);
        }else {
            System.out.printf("%d não é bissexto", ano);
        }
        sc.close();
    }
}
