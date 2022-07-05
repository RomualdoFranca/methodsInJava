public class DecimalComparator {
    public static void main(String[] args) {
        boolean equalNum = areEqualByThreeDecimalPlaces(3.1756, 3.1757);
        System.out.println(equalNum);
    }
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        //  Foi necessario criar duas possibilidadas pois nao ha como prever que o 1° n digitado sempre sera o maior
        if (number1 >= number2) {
            //  A forma encontrada de comparar dois numeros ate a terceira casa decimal foi atraves da subtracao
            //  O desafio exige que os numeros sejam iguais ate a 3° casa decimal
            //  A diferença entre dois n iguais ate a 3° casa decimal sempre da como resultado 0.000
            //  O numero da 4° casa em diante nao faz diferença
            //  O numero 0.0009 nao foi escolhido ao acaso. O valor maximo que o n da 4° casa decimal pode ter é o 9
            //  Caso seja um numero maior o numero da 3° casa decimal sera diferente
            if (number1 - number2 <= 0.0009) {
                return true;
            } else {
                return false;
            }
        } else {
            if (number2 - number1 <= 0.0009) {
                return true;
            } else {
                return false;
            }
        }
    }
}
