package medium;

public class Exercicio_medium_4 {

    public static void main(String[] args) {

        int i = 1, multi = 1;

        while(i <= 1000){
            multi = multi * i;
            System.out.println("o valor da soma: " + multi);
            System.out.println("o valor do i: " + i);
            i++;
            if(multi >= 1000){
                multi = 1;
            }
        }
    }
}
