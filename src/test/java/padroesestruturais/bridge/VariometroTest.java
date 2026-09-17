package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariometroTest {

    @Test
    void deveRetornarCustoManutencaoVariometroComPavilhaoNaoMagnetico() {
        Ambiente ambiente = new PavilhaoNaoMagnetico();
        Variometro variometro = new Variometro(2000.0f);
        variometro.setAmbiente(ambiente);
        assertEquals(2000.0f, variometro.calcularCustoManutencao(), 0.01f);
    }

    @Test
    void deveRetornarCustoManutencaoVariometroComLaboratorio() {
        Ambiente ambiente = new Laboratorio();
        Variometro variometro = new Variometro(2000.0f);
        variometro.setAmbiente(ambiente);
        assertEquals(2200.0f, variometro.calcularCustoManutencao(), 0.01f);
    }

    @Test
    void deveRetornarCustoManutencaoVariometroComCampoAberto() {
        Ambiente ambiente = new CampoAberto();
        Variometro variometro = new Variometro(2000.0f);
        variometro.setAmbiente(ambiente);
        assertEquals(2400.0f, variometro.calcularCustoManutencao(), 0.01f);
    }

    @Test
    void deveRetornarCustoManutencaoVariometroComEstacaoCosteira() {
        Ambiente ambiente = new EstacaoCosteira();
        Variometro variometro = new Variometro(2000.0f);
        variometro.setAmbiente(ambiente);
        assertEquals(2600.0f, variometro.calcularCustoManutencao(), 0.01f);
    }
}