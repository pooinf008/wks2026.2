package br.edu.ifba.inf011.model.azure;

import br.edu.ifba.inf011.model.CPU;
import br.edu.ifba.inf011.model.TipoCPU;

public class AzureCPU implements CPU {
    private TipoCPU tipo;
    private double clockSpeedGhz;
    
    // Atributo específico da família Azure
    private String vmSize; 

    public AzureCPU(TipoCPU tipo, double clockSpeedGhz) {
        this.tipo = tipo;
        this.clockSpeedGhz = clockSpeedGhz;
        this.vmSize = "Standard_D" + (int)(clockSpeedGhz * 2) + "s_v3"; // Gera nome típico de VM da Azure
    }

    @Override 
    public TipoCPU getCPU() { return this.tipo; }
    
    @Override 
    public double getClockSpeedGhz() { return this.clockSpeedGhz; }

    @Override
    public void start() {
        System.out.println(String.format(
            "AZURE VM [%s]: Instância iniciada com sucesso. Arquitetura: %s (%.1f GHz)", 
            this.vmSize, this.tipo.name(), this.clockSpeedGhz
        ));
    }
}