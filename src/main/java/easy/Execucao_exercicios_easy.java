package easy;

import javax.swing.*;

public class Execucao_exercicios_easy {

    public static void main(String[] args) {

        int selecionaExercicio;

        selecionaExercicio = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: "));

        if (selecionaExercicio == 4){

            Exercicio_04 exe4_easy = new Exercicio_04();
            int numeroDigitado = 12;
            int dobroCalculado = exe4_easy.dobroCalculado(numeroDigitado);
            System.out.println("O dobro calculado é " + dobroCalculado);
        }

        if (selecionaExercicio == 5){

            Exercicio_05 exe5_easy = new Exercicio_05();
            // int valor1 = 2;
            // int valor2 = 5;
            // int valor3 = 8;
            int soma = exe5_easy.somaResultado(2,5,8);
            int subt = exe5_easy.subtResultado(2,5,8);
            int mult = exe5_easy.multResultado(2,5,8);
            int media = exe5_easy.mediaResultado(soma);

            System.out.println("Soma dos valores: " + soma);
            System.out.println("Subtracao dos valores: " + subt);
            System.out.println("Multiplicacao dos valores: " + mult);
            System.out.println("Media dos valores: " + media);
        }
    }
}
