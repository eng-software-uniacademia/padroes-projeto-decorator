public class FiltroEsportivo extends CarroDecorator {
    public FiltroEsportivo(Carro carro) {
        super(carro);
    }

    public float getValorPeca() {
        return 300;
    }

    public String getNomeCustomizacao() {
        return "Filtro RS cônico";
    }
}
