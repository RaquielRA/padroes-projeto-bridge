package padroesestruturais.bridge;

public abstract class Equipamento {

    protected Ambiente ambiente;

    protected float custoBase;

    public Equipamento(float custoBase) {
        this.custoBase = custoBase;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public void setCustoBase(float custoBase) {
        this.custoBase = custoBase;
    }

    public abstract float calcularCustoManutencao();
}