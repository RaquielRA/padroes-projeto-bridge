# Manutenção de Equipamentos Geomagnéticos — Padrão Bridge

Implementação do padrão estrutural **Bridge** em Java para cálculo de custos de manutenção em um observatório magnético, desacoplando o tipo de **Equipamento** (abstração) do **Ambiente** de operação (implementação).

---

## Estrutura do Padrão

* **Abstração (`Equipamento`):** Classe abstrata que mantém a referência para `Ambiente` e define o contrato `calcularCustoManutencao()`.
  * `MagnetometroProtons`: Custo fixo (não sofre alteração ambiental).
  * `Variometro`: Custo base acrescido do percentual de desgaste do ambiente.
  * `Teodolito`: Custo proporcional ao número de medições (`numMedicoes`) e ao desgaste ambiental.

* **Implementação (`Ambiente`):** Interface que fornece o percentual de desgaste através de `percentualDesgaste()`.
  * `PavilhaoNaoMagnetico`: 0% de acréscimo.
  * `Laboratorio`: 10% de acréscimo.
  * `CampoAberto`: 20% de acréscimo.
  * `EstacaoCosteira`: 30% de acréscimo.

---

## Estrutura de Arquivos

```text
src/
├── main/java/padroesestruturais/bridge/
│   ├── Equipamento.java
│   ├── MagnetometroProtons.java
│   ├── Variometro.java
│   ├── Teodolito.java
│   ├── Ambiente.java
│   ├── PavilhaoNaoMagnetico.java
│   ├── Laboratorio.java
│   ├── CampoAberto.java
│   └── EstacaoCosteira.java
└── test/java/padroesestruturais/bridge/
    ├── MagnetometroProtonsTest.java
    ├── VariometroTest.java
    └── TeodolitoTest.java