package padroesestruturais.bridge;

public class Teodolito extends Equipamento {

    private int numMedicoes;

    public Teodolito(float custoBase) {
        super(custoBase);
    }

    public void setNumMedicoes(int numMedicoes) {
        this.numMedicoes = numMedicoes;
    }

    public float calcularCustoManutencao() {
        return this.custoBase * this.numMedicoes * (1 + this.ambiente.percentualDesgaste());
    }
}