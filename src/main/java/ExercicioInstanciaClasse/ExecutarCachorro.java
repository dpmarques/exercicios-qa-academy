package ExercicioInstanciaClasse;

public class ExecutarCachorro {

    public static void main(String[] args) {

        Cachorro objetoCachorro = new Cachorro();

        System.out.println(objetoCachorro.idadeCachorro);
        System.out.println(objetoCachorro.nomeCachorro);

        objetoCachorro.Latir();
        objetoCachorro.Pular();
        System.out.println(objetoCachorro.IdadeCachorro(10));
    }
}
