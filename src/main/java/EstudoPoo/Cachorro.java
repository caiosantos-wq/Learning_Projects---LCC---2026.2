package EstudoPoo;

public class Cachorro implements Animal {

    @Override
    public void Barulho() {
        System.out.println("O cachorro está latindo");
    }

    @Override
    public void Andar() {
        System.out.println("O cachorro está andando");
    }
}
