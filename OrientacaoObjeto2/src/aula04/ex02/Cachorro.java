package aula04.ex02;

public class Cachorro extends Mamifero {

    public Cachorro(String nome, String raca) {

        super(nome, raca);
    }

    public void emitirSom() {

        System.out.println(this.nome + " está latindo.");
    }
}
