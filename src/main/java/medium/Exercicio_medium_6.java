package medium;

import javax.swing.*;

public class Exercicio_medium_6 {
    public static void main(String[] args) {

        int i, numero, f = 0, total = 1;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));

        for (i=0 ; i < numero ; i++){
            f = numero * ( numero - i);
            total = total * f;
            total++;
        }

        System.out.println("Valor total: " + total);
    }
}
