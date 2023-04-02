public class Lancer implements Carro {
    private final float valor;

    public Lancer(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public String getCustomizacoes() {
        return "Câmbio manual";
    }
}
