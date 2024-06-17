public class codigo3 {

    public static void main(String[] args) {
        int soma = 0;
        for (int num = 100; num <= 200; num++) {

            if (num % 2 != 0) {
                soma += num;
            }
        }
        System.out.println("A soma dos números ímpares entre 100 e 200 é: " + soma);
    }
}
//Faça um programa que calcule a soma dos números ímpares entre 100 e 200.
//
//Obs.: Supor a existência do comando “mod”, que retorna o resto da divisão entre dois números.