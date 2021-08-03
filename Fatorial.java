import javax.swing.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {

        int a = 0;

        String entrada = JOptionPane.showInputDialog("Digite o numero que deseja calcular o fatorial:");

        long fatorial = Integer.parseInt(entrada.toString());
        long auxiliar = fatorial;

        while(fatorial > 1){
            auxiliar = auxiliar*(fatorial-1);
            fatorial--;
            System.out.println(auxiliar);
        }
        JOptionPane.showMessageDialog(null,"O fatorial de " + entrada + " é " + auxiliar);
    }
}
