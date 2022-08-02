import javax.swing.*;

public class Exercicio_03 {
    public static void main(String[] args) {

        int primeiroValor, segundoValor;

        primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor a ser digitado: "));
        System.out.println("Valor digitado: " + primeiroValor);
        segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Segundo valor a ser digitado: "));
        System.out.println("Valor digitado: " + segundoValor);
    }
}
