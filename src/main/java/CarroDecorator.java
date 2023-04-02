public abstract class CarroDecorator implements Carro {
    private Carro carro;
    public String customizacoes;

    public CarroDecorator(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public abstract float getValorPeca();

    public float getValor() {
        return this.carro.getValor() + this.getValorPeca();
    }

    public abstract String getNomeCustomizacao();

    public String getCustomizacoes() {
        return this.carro.getCustomizacoes() + ", " + this.getNomeCustomizacao();
    }

    public void setCustomizacoes(String customizacoes) {
        this.customizacoes = customizacoes;
    }
}
