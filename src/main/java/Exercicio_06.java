import javax.swing.*;
import java.sql.SQLOutput;

public class Exercicio_06 {
    public static void main(String[] args) {

        int primeiraNota, segundaNota, media;

        primeiraNota = Integer.parseInt(JOptionPane.showInputDialog("Insira a primeira nota: "));
        System.out.println("Primeira nota é: " + primeiraNota);
        segundaNota = Integer.parseInt(JOptionPane.showInputDialog("Insira a segunda nota: "));
        System.out.println("Segunda nota é: " + segundaNota);

        media = (primeiraNota + segundaNota) / 2;
        System.out.println("Sua media ficou em: " + media);
        if ( media > 6 ){
            System.out.println("Aprovado!");
        } else if ( media < 5) {
            System.out.println("Reprovado!");
        } else {
            System.out.println("Ficou para exame!");
        }
        System.out.println();
    }
}
