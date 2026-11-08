package EstudoPoo.celular;

public class Produto {
    private String valor;
    private Celular celular;

    public Produto(String valor, Celular celular){
        this.valor = valor;
        this.celular = celular;
    }

    public Produto(String valor){
        this(valor, new Celular());
    }

    public Produto(){
        this("", new Celular());
    }
}