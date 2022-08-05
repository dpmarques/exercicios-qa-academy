package medium;

import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio_medium_2 {

    static double numeroAnos, valorCapital, taxaJuros = 0.05, montante, valorJuros;
    static int i;
    static DecimalFormat df = new DecimalFormat("##,###.##");

    public static void main(String[] args) {

        valorCapital = Double.parseDouble(JOptionPane.showInputDialog("Insira seu capital: "));
        numeroAnos = Double.parseDouble(JOptionPane.showInputDialog("Insira o número de anos: "));

        for (i = 1 ; i <= numeroAnos ; i++){
            valorJuros = valorCapital * taxaJuros;
            valorCapital += valorJuros;
            System.out.println("o Valor do investimento em " + i + " ano(s) é de: " + df.format(valorCapital));
        }
    }
}
