import javax.swing.*;

public class Exercicio_09 {

    static int numeroDigitado, resultado, i = 1;

    public static void main(String[] args) {



        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        System.out.println("Numero digitado: " + numeroDigitado);

        while ( i <= 10){
            resultado = numeroDigitado * i;
            System.out.println(numeroDigitado + " x " + i + " = " + resultado);
            i++;
        }
    }
}
