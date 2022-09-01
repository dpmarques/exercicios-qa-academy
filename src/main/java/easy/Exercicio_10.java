package easy;

import javax.swing.*;

public class Exercicio_10 {

    static double valorJuros, taxaJuros = 0.05, valorInvestimento, valorTotal;

    public static void main(String[] args) {

        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a ser investido: "));

        valorJuros = (10 * taxaJuros) * valorInvestimento;
        valorTotal =  valorJuros + valorInvestimento;
        System.out.println();

        System.out.println("Valor investido R$: " + valorInvestimento +
                "\n" + "Valor juros R$: " + valorJuros +
                "\n" + "Valor Total com juros R$: " + valorTotal);
    }
}
