import javax.swing.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int recalcula = 0;

        while (recalcula != 1) {
            String valorEntrada = JOptionPane.showInputDialog(null, "Digite o valor");
            CalculaFatorial calculadora = new CalculaFatorial(Integer.parseInt(valorEntrada));

            long fatorial = calculadora.calcula(Integer.parseInt(valorEntrada));

            JOptionPane.showMessageDialog(null, "O fatorial de " + calculadora.getValor() + " é " + fatorial);
            recalcula = JOptionPane.showConfirmDialog(null, "Calcular outro valor?");
        }

    }
}
