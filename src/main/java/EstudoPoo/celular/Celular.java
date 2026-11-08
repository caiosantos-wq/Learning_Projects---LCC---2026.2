package EstudoPoo.celular;

public class Celular {
    private String modelo;
    private String tela;
    private String armazenamento;
    private String camera;

    public Celular(String modelo, String tela, String armazenamento, String camera){
        this.modelo = modelo;
        this.tela = tela;
        this.armazenamento = armazenamento;
        this.camera = camera;
    }

    public Celular(){
        this("","","","");
    }

    public Celular(String modelo){
        this(modelo, "", "50 MP", " 128 GB");
    }

    public String getModelo(){
        return this.modelo;
    }

    public String ToString(){
        return this.modelo+","+this.tela+","+this.armazenamento+","+this.camera;
    }




}
