package br.com.fiapdelivery.model;

public class Rota {

    private Pacote pacote;
    private Veiculo veiculoDesignado;

    public Rota(Pacote pacote, Veiculo veiculoDesignado) {
        this.pacote = pacote;
        this.veiculoDesignado = veiculoDesignado;
    }

    public void iniciarRota() {
        System.out.println("=== FIAP DELIVERY ===");
        System.out.println("Pacote: " + this.pacote.getCodigo());
        System.out.println("Peso: " + this.pacote.getPeso() + " kg");
        System.out.println("Status: " + this.pacote.getStatus());
        System.out.println("Veiculo designado: " + this.veiculoDesignado.getPlaca());
        System.out.println("Capacidade: " + this.veiculoDesignado.getCapacidade() + " kg");
    }
}
