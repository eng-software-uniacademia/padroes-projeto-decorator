public class Intake extends CarroDecorator {
    public Intake(Carro carro) {
        super(carro);
    }

    public float getValorPeca() {
        return 600;
    }

    public String getNomeCustomizacao() {
        return "Intake NOX";
    }
}
