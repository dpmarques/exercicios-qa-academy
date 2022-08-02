import javax.swing.*;

public class Exercicio_08 {
    public static void main(String[] args) {

        double salario, salarioLiquido, impostoRenda;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o salario: "));
        System.out.println("Seu salario é: " + salario);

        if (salario >= 0 && salario <= 1903.98){
            impostoRenda = 0;
            salarioLiquido = salario - impostoRenda;
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            impostoRenda = (salario * 0.075) - 142.80;
            salarioLiquido = salario - impostoRenda;
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            impostoRenda = (salario * 0.15) - 354.80;
            salarioLiquido = salario - impostoRenda;
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            impostoRenda = (salario * 0.225) - 636.12;
            salarioLiquido = salario - impostoRenda;
        } else {
            impostoRenda = (salario * 0.275) - 869.36;
            salarioLiquido = salario - impostoRenda;
        }

        System.out.println("Seu salario BRUTO sera: R$: " + salario + "\n" + "Seu salario LIQUIDO sera: R$: " + salarioLiquido + "\n" + "O valor a ser pago de IR sera: R$: " + impostoRenda);
    }
}
