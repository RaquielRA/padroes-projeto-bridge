package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagnetometroProtonsTest {

    @Test
    void deveRetornarCustoManutencaoMagnetometroProtonsComPavilhaoNaoMagnetico() {
        Ambiente ambiente = new PavilhaoNaoMagnetico();
        MagnetometroProtons magnetometro = new MagnetometroProtons(1000.0f);
        magnetometro.setAmbiente(ambiente);
        assertEquals(1000.0f, magnetometro.calcularCustoManutencao(), 0.01f);
    }

    @Test
    void deveRetornarCustoManutencaoMagnetometroProtonsComLaboratorio() {
        Ambiente ambiente = new Laboratorio();
        MagnetometroProtons magnetometro = new MagnetometroProtons(1000.0f);
        magnetometro.setAmbiente(ambiente);
        assertEquals(1000.0f, magnetometro.calcularCustoManutencao(), 0.01f);
    }

    @Test
    void deveRetornarCustoManutencaoMagnetometroProtonsComCampoAberto() {
        Ambiente ambiente = new CampoAberto();
        MagnetometroProtons magnetometro = new MagnetometroProtons(1000.0f);
        magnetometro.setAmbiente(ambiente);
        assertEquals(1000.0f, magnetometro.calcularCustoManutencao(), 0.01f);
    }

    @Test
    void deveRetornarCustoManutencaoMagnetometroProtonsComEstacaoCosteira() {
        Ambiente ambiente = new EstacaoCosteira();
        MagnetometroProtons magnetometro = new MagnetometroProtons(1000.0f);
        magnetometro.setAmbiente(ambiente);
        assertEquals(1000.0f, magnetometro.calcularCustoManutencao(), 0.01f);
    }
}