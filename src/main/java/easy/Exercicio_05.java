package easy;

import javax.swing.*;

public class Exercicio_05 {

    int valor1, valor2, valor3, soma, subt, mult, media;

        /* valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        System.out.println("Primeiro valor: " + valor1);
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        System.out.println("Segundo valor: " + valor2);
        valor3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        System.out.println("Terceiro valor: " + valor3); */

    public int somaResultado(int valor1, int valor2, int valor3) {
        int soma;
        soma = valor1 + valor2 + valor3;
        return soma;
    }

    public int subtResultado(int valor1, int valor2, int valor3) {
        int subt;
        subt = (valor3 - valor2) - valor1;
        return subt;
    }

    public int multResultado(int valor1, int valor2, int valor3) {
        int mult;
        mult = (valor3 * valor2) * valor1;
        return mult;
    }

    public int mediaResultado(int soma) {
        int media;
        media = soma / 3;
        return media;
    }

}
