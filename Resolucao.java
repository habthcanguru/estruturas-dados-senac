import java.util.Scanner;

public class Resolucao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] valores = new double[5];
        double soma = 0, maiorValor = 0, menorValor = 999999999, indiceMaior = 0, indiceMenor = 0, valorAdicionado;
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o valor da posição " + i + ": ");
            valorAdicionado = scan.nextDouble();
            valores[i] = valorAdicionado;
            soma += valores[i];

            if(valorAdicionado > maiorValor) {
                maiorValor = valorAdicionado;
                indiceMaior = i;
            }

            if(valorAdicionado < menorValor) {
                menorValor = valorAdicionado;
                indiceMenor = i;
            }
        }
        scan.close();

        for (int i = 0; i < valores.length ; i++) {
            System.out.println(valores[i]);
        }
        
        System.out.println(soma);
        System.out.println(maiorValor);
        System.out.println(menorValor);
        System.out.println(indiceMaior);
        System.out.println(indiceMenor);
    }
}