package br.edu.ifba.inf011.model.builder;

public enum CloudPrice {
    CPU_GHZ_BASE(15.00),
    CPU_MEMORY_OPTIMIZED_MULTIPLIER(1.20), // 20% de acréscimo

    RAM_GB_BASE(2.50),
    RAM_GB_ECC(5.00),

    STORAGE_GB_HDD(0.10),
    STORAGE_GB_SSD(0.25),
    STORAGE_GB_NVME(0.40),
    STORAGE_IOPS_UNIT(0.001);

    private final double valor;

    CloudPrice(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
