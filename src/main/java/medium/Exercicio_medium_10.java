package medium;

public class Exercicio_medium_10 {

    public static void main(String[] args) {
        int[] fibonacci = new int[9];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i = 2; i < 9; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i -2];
            System.out.println(fibonacci[i]);
        }
    }
}
