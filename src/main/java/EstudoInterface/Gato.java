package EstudoInterface;

public class Gato implements Animal{
    @Override
    public void Barulho() {
        System.out.println("O gato está miando");
    }

    @Override
    public void Andar() {
        System.out.println("O gato não faz nada");
    }
}
