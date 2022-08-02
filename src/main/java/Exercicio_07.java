import javax.swing.*;

public class Exercicio_07 {
    public static void main(String[] args) {

        double salario, inss;

        salario = Integer.parseInt(JOptionPane.showInputDialog("Inserir salario: "));
        System.out.println("Salario inserido: " + salario);

        if (salario <= 1045){
            inss = salario * 0.075;
        } else if (salario >= 1045 && salario <= 2089.60) {
            inss = salario * 0.09;
        } else if (salario >= 2089.61 && salario <= 3134.40) {
            inss = salario * 0.12;
        } else if (salario >= 3134.41 && salario <= 6101.06) {
            inss = salario * 0.14;
        } else {
            inss = salario * 0.14;
        }

        System.out.println("O valor a ser pago de INSS é: " + inss);
    }
}
