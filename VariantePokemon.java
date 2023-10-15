public class VariantePokemon {
    private boolean primaEdizione;
    private boolean holo;
    private boolean normale;
    private boolean reverse;
    private boolean wPromo;

    public VariantePokemon(boolean primaEdizione, boolean holo, boolean normale, boolean reverse, boolean wPromo) {
        this.primaEdizione = primaEdizione;
        this.holo = holo;
        this.normale = normale;
        this.reverse = reverse;
        this.wPromo = wPromo;
    }

    // Getters and setters for the attributes

    public boolean isPrimaEdizione() {
        return primaEdizione;
    }

    public void setPrimaEdizione(boolean primaEdizione) {
        this.primaEdizione = primaEdizione;
    }

    public boolean isHolo() {
        return holo;
    }

    public void setHolo(boolean holo) {
        this.holo = holo;
    }

    public boolean isNormale() {
        return normale;
    }

    public void setNormale(boolean normale) {
        this.normale = normale;
    }

    public boolean isReverse() {
        return reverse;
    }

    public void setReverse(boolean reverse) {
        this.reverse = reverse;
    }

    public boolean isWPromo() {
        return wPromo;
    }

    public void setWPromo(boolean wPromo) {
        this.wPromo = wPromo;
    }
}
