package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeodolitoTest {

    @Test
    void deveRetornarCustoManutencaoTeodolitoComPavilhaoNaoMagnetico() {
        Ambiente ambiente = new PavilhaoNaoMagnetico();
        Teodolito teodolito = new Teodolito(50.0f);
        teodolito.setAmbiente(ambiente);
        teodolito.setNumMedicoes(2);
        assertEquals(100.0f, teodolito.calcularCustoManutencao(), 0.01f);
    }

    @Test
    void deveRetornarCustoManutencaoTeodolitoComLaboratorio() {
        Ambiente ambiente = new Laboratorio();
        Teodolito teodolito = new Teodolito(50.0f);
        teodolito.setAmbiente(ambiente);
        teodolito.setNumMedicoes(2);
        assertEquals(110.0f, teodolito.calcularCustoManutencao(), 0.01f);
    }

    @Test
    void deveRetornarCustoManutencaoTeodolitoComCampoAberto() {
        Ambiente ambiente = new CampoAberto();
        Teodolito teodolito = new Teodolito(50.0f);
        teodolito.setAmbiente(ambiente);
        teodolito.setNumMedicoes(2);
        assertEquals(120.0f, teodolito.calcularCustoManutencao(), 0.01f);
    }

    @Test
    void deveRetornarCustoManutencaoTeodolitoComEstacaoCosteira() {
        Ambiente ambiente = new EstacaoCosteira();
        Teodolito teodolito = new Teodolito(50.0f);
        teodolito.setAmbiente(ambiente);
        teodolito.setNumMedicoes(2);
        assertEquals(130.0f, teodolito.calcularCustoManutencao(), 0.01f);
    }
}