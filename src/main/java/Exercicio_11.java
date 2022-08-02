import javax.swing.*;

public class Exercicio_11 {
    public static void main(String[] args) {

        int numeroRecebido, i = 1;

        numeroRecebido = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: "));
        System.out.println("Numero inserido: " + numeroRecebido);

        while (i <= 100) {
            numeroRecebido = numeroRecebido + 2;
            System.out.println("O resultado é: " + numeroRecebido);
            i++;
        }
    }
}
