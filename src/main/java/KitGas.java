public class KitGas extends CarroDecorator {

    public KitGas(Carro carro) {
        super(carro);
    }

    public float getValorPeca() {
        return 3500;
    }

    public String getNomeCustomizacao() {
        return "Kit GNV Landirenzo 5a geração 16m³";
    }
}
