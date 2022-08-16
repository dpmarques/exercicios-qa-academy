package medium;

import javax.swing.*;

public class Exercicio_medium_5 {


    public static void main(String[] args) {

        int numero1, numero2, numero3, aux = 0;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número: "));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro número: "));

        if ((numero1 < numero2) && (numero1 < numero3)){
            aux = numero1;
        } else if ((numero2 < numero1) && (numero1 < numero3)) {
            aux = numero2;
        } else if ((numero3 < numero1) && (numero3 < numero2)) {
            aux = numero3;
        }

        System.out.println("O menor número é: " + aux);
    }
}
