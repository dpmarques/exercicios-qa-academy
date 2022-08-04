package medium;

import javax.swing.*;

public class Exercicio_medium_1 {

    static int i = 1; //numero

    public static void main(String[] args) {

        //numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: "));

        while (i <= 100) {

            if (i % 2 == 0) {
                System.out.println(i + " é um número é par");
            } else {
                System.out.println(i + " é um número é ímpar");
            }
            i++;
        }
    }
}
