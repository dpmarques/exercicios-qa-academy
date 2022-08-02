import javax.swing.*;

public class Exercicio_05 {
    public static void main(String[] args) {

        int valor1, valor2, valor3, soma, subt, mult, media;

        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        System.out.println("Primeiro valor: " + valor1);
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        System.out.println("Segundo valor: " + valor2);
        valor3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        System.out.println("Terceiro valor: " + valor3);

        soma = valor1 + valor2 + valor3;
        subt = (valor3 - valor2) - valor1;
        mult = (valor3 * valor2) * valor1;
        media = soma / 3;

        System.out.println("Os resultados são: " + "\n Soma:" + soma +
                "\n Subtração: " + subt +
                "\n Multiplicação: " + mult +
                "\n Media: " + media);
    }
}
