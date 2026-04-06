package br.com.fiapdelivery.model;

public class Rota {
    
    private Pacote pacote;
    private Veiculo veiculoDesignado; 

    public Rota(Pacote pacote, Veiculo veiculoDesignado) {
        this.pacote = pacote;
        this.veiculoDesignado = veiculoDesignado;
    }

    public void iniciarRota() {
        System.out.println("📦 Logística FiapDelivery:");
        System.out.println("Levando pacote [" + this.pacote.getCodigo() + "] no veículo de placa [" + this.veiculoDesignado.getPlaca() + "]");
    }
}