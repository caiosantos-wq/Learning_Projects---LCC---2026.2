package EstudoPoo.celular;

public class EstoqueProdutos {
    private Produto[] produtos;
    public static final int MAX_PRODUTOS = 250;

    public EstoqueProdutos(){
        this.produtos = new Produto[MAX_PRODUTOS];
    }
}
