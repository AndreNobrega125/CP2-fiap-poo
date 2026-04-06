package br.com.fiapdelivery.model;

public abstract class Veiculo {
    
    private String placa;
    private double capacidade;

    public Veiculo(String placa, double capacidade) {
        this.placa = placa;
        this.setCapacidade(capacidade); 
    }

    public String getPlaca() {
        return this.placa;
    }

    public double getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(double capacidade) {
        if (capacidade > 0) {
            this.capacidade = capacidade;
        } else {
            System.out.println("Erro: A capacidade deve ser maior que zero! Ajustando para 0.");
            this.capacidade = 0;
        }
    }
}