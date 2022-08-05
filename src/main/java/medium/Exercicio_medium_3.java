package medium;

public class Exercicio_medium_3 {

    public static void main(String[] args) {

        int i = 1, soma = 0;

        while(i <= 1000){
            soma = soma + i;
            System.out.println("o valor da soma é: " + soma);
            i++;
            if(soma >= 1500){
                break;
            }
        }
    }
}
