package br.com.fiapdelivery.model;

public class Pacote {
    
    private String codigo;
    private double peso;
    private String status;

    public Pacote(String codigo, double peso) {
        this.codigo = codigo;
        this.peso = peso;
        this.status = "Pendente"; 
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public String getCodigo() { 
        return this.codigo; 
    }
    
    public double getPeso() { 
        return this.peso; 
    }
    
    public String getStatus() { 
        return this.status; 
    }
}