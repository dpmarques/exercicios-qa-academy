import javax.swing.*;

public class Exercicio_04 {

    public static void main(String[] args) {

        int numeroDigitado, resultado;
        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: "));
        resultado = numeroDigitado * 2;
        System.out.println("O dobro do valor inserido é : " + resultado);

    }
}
