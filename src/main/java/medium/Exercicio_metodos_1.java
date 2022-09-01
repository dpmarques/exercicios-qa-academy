package medium;

import javax.swing.*;

public class Exercicio_metodos_1 {

    public static void metodoTeste(){
        System.out.println("Número 1 é Galinha");
    }

    public static void metodoTeste2(){
        System.out.println("Número 2 é Cachorro");
    }

    public static void main(String[] args) {

        int numeroAnimal;

        numeroAnimal = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));

        if (numeroAnimal == 2) {
            metodoTeste2();
        } else if (numeroAnimal == 1) {
            metodoTeste();
        } else {
            System.out.println("Não é animal!");
        }

    }

}
