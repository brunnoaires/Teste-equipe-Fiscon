import java.util.Random;

public class Codigo2 {

    public static void main(String[] args) {

        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);

        int[] resultados = somaEMultiplicacao(num1, num2);

        System.out.println("Números aleatórios gerados:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("A soma é: " + resultados[0]);
        System.out.println("A multiplicação é: " + resultados[1]);
    }

    public static int[] somaEMultiplicacao(int a, int b) {
        int soma = a + b;
        int multiplicacao = a * b;

        int[] resultados = {soma, multiplicacao};
        return resultados;
    }
}
//Escreva uma função do tipo inteiro que recebe como parâmetros dois números e cujo retorno seja a soma desses dois valores.
// Em seguida, faça uma alteração nessa função que permita que, de alguma forma, ela forneça também o resultado da multiplicação dos dois valores,
// além do valor da soma dos dois valores que ela já retornava.

