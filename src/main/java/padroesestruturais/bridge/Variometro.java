package padroesestruturais.bridge;

public class Variometro extends Equipamento {

    public Variometro(float custoBase) {
        super(custoBase);
    }

    public float calcularCustoManutencao() {
        return this.custoBase * (1 + this.ambiente.percentualDesgaste());
    }
}