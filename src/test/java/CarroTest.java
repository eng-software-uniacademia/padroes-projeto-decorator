import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarroTest {
    @Test
    void deveRetornarPrecoCarro() {
        var carro = new Lancer(60_000);
        assertEquals(60_000, carro.getValor());
    }

    @Test
    void deveRetornarPrecoComKitGas() {
        var carro = new Lancer(60_000);
        var carroKitGas = new KitGas(carro);

        assertEquals(63_500, carroKitGas.getValor());
    }

    @Test
    void deveRetornarPrecoComIntake() {
        var carro = new Lancer(60_000);
        var carroIntake = new Intake(carro);

        assertEquals(60_600, carroIntake.getValor());
    }

    @Test
    void deveRetornarPrecoComFiltro() {
        var carro = new Lancer(60_000);
        var carroFiltro = new FiltroEsportivo(carro);

        assertEquals(60_300, carroFiltro.getValor());
    }

    @Test
    void deveRetornarPrecoComFiltroIntake() {
        var carro = new Lancer(60_000);
        var carroFiltro = new FiltroEsportivo(carro);
        var carroFiltroIntake = new Intake(carroFiltro);

        assertEquals(60_900, carroFiltroIntake.getValor());
    }

    @Test
    void deveRetornarPrecoComFiltroKitGas() {
        var carro = new Lancer(60_000);
        var carroFiltro = new FiltroEsportivo(carro);
        var carroFiltroKitGas = new KitGas(carroFiltro);

        assertEquals(63_800, carroFiltroKitGas.getValor());
    }

    @Test
    void deveRetornarPrecoComIntakeKitGas() {
        var carro = new Lancer(60_000);
        var carroIntake = new Intake(carro);
        var carroIntakeKitGas = new KitGas(carroIntake);

        assertEquals(64_100, carroIntakeKitGas.getValor());
    }

    @Test
    void deveRetornarPrecoComFiltroIntakeKitGas() {
        var carro = new Lancer(60_000);
        var carroFiltro = new FiltroEsportivo(carro);
        var carroFiltroIntake = new Intake(carroFiltro);
        var carroFiltroIntakeKitGas = new KitGas(carroFiltroIntake);

        assertEquals(64_400, carroFiltroIntakeKitGas.getValor());
    }

    @Test
    void deveRetornarCustomizacoes() {
        var carro = new Lancer(60_000);
        assertEquals("Câmbio manual", carro.getCustomizacoes());
    }

    @Test
    void deveRetornarCustomizacoesComKitGas() {
        var carro = new Lancer(60_000);
        var carroKitGas = new KitGas(carro);

        assertEquals("Câmbio manual, Kit GNV Landirenzo 5a geração 16m³", carroKitGas.getCustomizacoes());
    }

    @Test
    void deveRetornarCustomizacoesComIntake() {
        var carro = new Lancer(60_000);
        var carroIntake = new Intake(carro);

        assertEquals("Câmbio manual, Intake NOX", carroIntake.getCustomizacoes());
    }

    @Test
    void deveRetornarCustomizacoesComFiltro() {
        var carro = new Lancer(60_000);
        var carroFiltro = new FiltroEsportivo(carro);

        assertEquals("Câmbio manual, Filtro RS cônico", carroFiltro.getCustomizacoes());
    }

    @Test
    void deveRetornarCustomizacoesComFiltroIntake() {
        var carro = new Lancer(60_000);
        var carroFiltro = new FiltroEsportivo(carro);
        var carroFiltroIntake = new Intake(carroFiltro);

        assertEquals("Câmbio manual, Filtro RS cônico, Intake NOX", carroFiltroIntake.getCustomizacoes());
    }

    @Test
    void deveRetornarCustomizacoesComFiltroKitGas() {
        var carro = new Lancer(60_000);
        var carroFiltro = new FiltroEsportivo(carro);
        var carroFiltroKitGas = new KitGas(carroFiltro);

        assertEquals("Câmbio manual, Filtro RS cônico, Kit GNV Landirenzo 5a geração 16m³", carroFiltroKitGas.getCustomizacoes());
    }

    @Test
    void deveRetornarCustomizacoesComIntakeKitGas() {
        var carro = new Lancer(60_000);
        var carroIntake = new Intake(carro);
        var carroIntakeKitGas = new KitGas(carroIntake);

        assertEquals("Câmbio manual, Intake NOX, Kit GNV Landirenzo 5a geração 16m³", carroIntakeKitGas.getCustomizacoes());
    }

    @Test
    void deveRetornarCustomizacoesComFiltroIntakeKitGas() {
        var carro = new Lancer(60_000);
        var carroFiltro = new FiltroEsportivo(carro);
        var carroFiltroIntake = new Intake(carroFiltro);
        var carroFiltroIntakeKitGas = new KitGas(carroFiltroIntake);

        assertEquals("Câmbio manual, Filtro RS cônico, Intake NOX, Kit GNV Landirenzo 5a geração 16m³", carroFiltroIntakeKitGas.getCustomizacoes());
    }
}
