public class Carta {
    private String nome;
    private TipoCarta tipo;
    private String rarita;

    public Carta(String nome, TipoCarta tipo, String rarita) {
        this.nome = nome;
        this.tipo = tipo;
        this.rarita = rarita;
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

    public String getRarita() {
        return rarita;
    }

    public void setRarita(String rarita) {
        this.rarita = rarita;
    }
}

enum TipoCarta {
    YU_GI_OH,
    MAGIC,
    POKEMON
}