import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o numero que deseja calcular o fatorial:");

        int fatorial = entrada.nextInt();
        int inicial = fatorial;
        long auxiliar = fatorial;

        while(fatorial > 1){
            auxiliar = auxiliar*(fatorial-1);
            fatorial--;
        }
        System.out.println("O fatorial de " + inicial + " eh: " + auxiliar);
    }
}