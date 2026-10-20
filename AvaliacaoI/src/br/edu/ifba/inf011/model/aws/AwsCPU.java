package br.edu.ifba.inf011.model.aws;

import br.edu.ifba.inf011.model.CPU;
import br.edu.ifba.inf011.model.TipoCPU;

public class AwsCPU implements CPU {
    
    private TipoCPU tipo;
    private double clockSpeed;
    private String instanceId; 

    public AwsCPU(TipoCPU tipo, double clockSpeed) {
        this.tipo = tipo;
        this.clockSpeed = clockSpeed;
        this.instanceId = "i-" + (int)(Math.random() * 100000000); // Gera um ID fictício da AWS
    }

    @Override
    public TipoCPU getCPU() {
        return this.tipo;
    }

    @Override
    public double getClockSpeedGhz() {
        return this.clockSpeed;
    }

    @Override
    public void start() {
        System.out.println(String.format(
            "AWS EC2 [%s]: Instância iniciada com sucesso. Arquitetura: %s (%.1f GHz)", 
            this.instanceId, this.tipo.getDescricao(), this.clockSpeed
        ));
    }
}