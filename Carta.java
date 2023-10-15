public class Carta {
    private String nome;
    private TipoCarta tipo;

    public Carta(String nome, TipoCarta tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    // Getters and setters for the attributes

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCarta getTipo() {
        return tipo;
    }

    public void setTipo(TipoCarta tipo) {
        this.tipo = tipo;
    }
}

enum TipoCarta {
    YU_GI_OH,
    MAGIC,
    POKEMON
}
