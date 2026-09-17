package padroesestruturais.bridge;

public class MagnetometroProtons extends Equipamento {

    public MagnetometroProtons(float custoBase) {
        super(custoBase);
    }

    public float calcularCustoManutencao() {
        return this.custoBase;
    }
}